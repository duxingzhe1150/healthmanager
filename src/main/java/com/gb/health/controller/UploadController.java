package com.gb.health.controller;


import com.gb.health.dao.TbHealthExaminationMapper;
import com.gb.health.dao.TbHealthRecordMapper;
import com.gb.health.domain.CiMing;
import com.gb.health.domain.TbHealthExamination;
import com.gb.health.domain.TbHealthRecord;
import com.gb.health.init.Const;
import com.gb.health.op.Company;
import com.gb.health.op.Hospital;
import com.gb.health.rqf.CimingServiceR;
import com.gb.health.rqf.DataHeader;
import com.gb.health.service.i.SystemInImpl;
import com.gb.health.service.i.SystemOutImpl;
import com.gb.health.utils.*;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *控制 文件，数据上传类
 * @author lx
 *
 */

@Controller
public class UploadController {
	//private static Logger log = Logger.getLogger(UploadController.class);
	LogRecordInf lr = new LogRecordInf (UploadController.class);
	
	@Autowired
	SystemInImpl tbm;
	@Autowired
	SystemOutImpl sout;
	@Autowired
	TbHealthRecordMapper record;
	/**
	 * 后台登录
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	/*@RequestMapping(value = "/login", method={RequestMethod.POST,RequestMethod.GET})
	public String login(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println(3232);  
		String login=request.getParameter("login");

		request.getSession().setAttribute("login", login);
		System.out.println(login+"oo");

		if(!"123".equals(login)){
			System.out.println("密码错误!!!");
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}		 

		return "ad/administrator";
	}*/
	/**
	 * 跳转上传页面
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/ad/uploadBefore", method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView uploadBefore(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		System.out.println(1212);

		request.setCharacterEncoding("utf-8");

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		ReadXml R=new ReadXml();
		LinkedHashMap<Object, String>ma=R.getHospital();
		List<Hospital> listhospital=new ArrayList<>();
		ModelAndView mo =new ModelAndView();
		for (Object m : ma.keySet()) {
			Hospital co=new Hospital();
			co.setId(Integer.valueOf(m+""));

			co.setHospitalName(ma.get(m));
			listhospital.add(co);
		}

		System.out.println(listhospital.size());
		mo.addObject("hospitallist", listhospital);

		ReadXml R1=new ReadXml();
		LinkedHashMap<Object, String>companymap=R1.getCompany();
		companymap.remove("1");
		List<Company> companylist=new ArrayList<>();
		for (Object company : companymap.keySet()) {
			Company co=new Company();
			co.setId(Integer.valueOf(company+""));
			co.setCompanyName(companymap.get(company));

			companylist.add(co);
		}
		System.out.println(companylist.size());
		mo.addObject("companylist", companylist);
		mo.setViewName("/ad/upload");
		return mo;


	}

	/**
	 * 上传慈铭体检报告 html文件
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/ad/uploadHtml", method={RequestMethod.POST,RequestMethod.GET} )
	public String uploadHtml(HttpServletRequest request,HttpServletResponse response) throws Exception{

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");



		String  url="";
		String  back="";
		TbHealthExamination tbHealthExamination=new TbHealthExamination();
		String companyid=request.getParameter("company");
		String examaddr=request.getParameter("examaddr");

		System.out.println(companyid+"--------------"+examaddr);
		//log.debug(companyid+"--------------"+examaddr);
		lr.interfaceInfo(companyid, examaddr);

		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;  

		MultiValueMap<String, MultipartFile> multiValueMap = multipartRequest.getMultiFileMap(); 

		List<MultipartFile> file = multiValueMap.get("healthfile");  
		if(file.size()<1){
			return "上传失败";
		}

		System.out.println(file.get(0).getOriginalFilename());
		UUID uuid = UUID.randomUUID();
		url=Const.FILE_PATH+uuid+".html";



		for (int i = 0; i < file.size(); i++) {
			if (file.isEmpty())
				continue;
			System.out.println("=================" + ((MultipartFile)file.get(i)).getName() + "-----" + ((MultipartFile)file.get(i)).getOriginalFilename());

			File fileWrite = new File(Const.FILE_PATH+uuid+".html");


			try {
				//log.debug("fileWrite.getParentFile().mkdirs()"+fileWrite.getAbsolutePath());
				lr.interfaceInfo("fileWrite.getParentFile().mkdirs()", fileWrite.getAbsolutePath());
				//fileWrite.getParentFile().mkdirs();
				fileWrite.createNewFile();
				FileOutputStream fos = new FileOutputStream(fileWrite);
				OutputStreamWriter out ;
				System.out.println(((MultipartFile)file.get(i)).getOriginalFilename());

				fos.write(((MultipartFile)file.get(i)).getBytes());

				fos.flush();
				fos.close();

				CimingServiceR ci = new CimingServiceR();
				DataHeader<CiMing> dh = new DataHeader<>(ci);
				dh.setEntiy(new CiMing());

				if(dh.getDataIn().loadPathFile( Const.FILE_PATH, uuid+".html")==true){

					dh.getDataIn().loadPathFile( Const.FILE_PATH, uuid+".html");

					String b_personid= dh.getDataIn().getEntity().baseinfo.getB_personid();
					String b_tel= dh.getDataIn().getEntity().baseinfo.getB_tel();
					String b_WorkUnit= dh.getDataIn().getEntity().baseinfo.getB_WorkUnit();
					String b_name= dh.getDataIn().getEntity().baseinfo.getB_name();

					//					tbHealthExamination.setbCompany("光宝");
					//					tbHealthExamination.setExaminationaddr("慈铭体检");
					tbHealthExamination.setbCompany(companyid);
					tbHealthExamination.setExaminationaddr(examaddr);
					tbHealthExamination.setbFileurl(uuid+".html");
					tbHealthExamination.setbPersonid(b_personid);
					tbHealthExamination.setbTel(b_tel);
					//tbHealthExamination.setbCompany(b_WorkUnit);
					tbHealthExamination.setbName(b_name);
					tbHealthExamination.setUploadtime(new Date());



					Map<String,String> map=getHtmlPartData(url);


					if( map==null){
						response.getWriter().write( "格式错误，上传失败！");	
					}

					tbHealthExamination.setExaminationtime(DateTransfer.stringToDateNoTime(map.get("date")));

					boolean check=tbm.selectCheck(b_tel, DateTransfer.stringToDateNoTime(map.get("date")));

					if(check==false){
						tbm.saveHealthExamination(tbHealthExamination);
						//存redis数据库
						dh.getDataOut().outRedis(tbHealthExamination.getId()+"");

						//	back= "上传成功！";
						back= "200";
						//log.debug( "上传体检报告返回值 back:"+back);	
						lr.interfaceInfo("上传体检报告返回值 back", back);
						JSONObject getUserInf=getUserInfo(tbHealthExamination);
						String ci_back=PostJson.sendCiMingData(getUserInf, Const.CI_URL);

						//log.debug("backJson"+ci_back);
						lr.interfaceInfo("上传体检报告返回值backJson", ci_back);
						JSONObject jso=JSONObject.fromObject(ci_back);

						int errmsg=0;
						if(jso.has("errmsg")){
							if("success".equals(jso.get("errmsg"))){
								errmsg=1;
							}else{
								errmsg=0;
							}
						}


						TbHealthRecord tbHealthRecord=new TbHealthRecord();

						tbHealthRecord.setTypeName("tb_health_examination");
						tbHealthRecord.setTypedataId(tbHealthExamination.getId());
						tbHealthRecord.setSendData(getUserInf.toString());
						tbHealthRecord.setSendReturn(ci_back);
						tbHealthRecord.setSendStatus(errmsg);
						tbHealthRecord.setSendTime(new Date());
						tbHealthRecord.setSendUrl(Const.CI_URL);

						record.insert(tbHealthRecord);

						System.out.println(ci_back+"-------------------");


					}else{
						response.getWriter().write( "用户该数据已存在，不能重复上传！");
					}
				}else{
					back=  "格式错误,上传失败！";

				}

			}

			catch (IOException e)
			{

				e.printStackTrace();
				response.getWriter().write( "上传失败！");
			}

		}

		response.getWriter().write(back);
		response.getWriter().flush();
		response.getWriter().close();
		/* GetHtmlData getHtmlData= new GetHtmlData();
		getHtmlData.getCiMingHtmlData(url);*/
		return null;		
	}

	/**
	 * 下载慈铭体检报告
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/ad/downHtml", method={RequestMethod.POST,RequestMethod.GET})
	public void downHtml(HttpServletRequest request,HttpServletResponse response) throws Exception{

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//1.设置文件ContentType类型，这样设置，会自动判断下载文件类型  
		response.setContentType("multipart/form-data"); 
		String fileName=request.getParameter("fileName");
		//2.设置文件头：最后一个参数是设置下载文件名(假如我们叫fileName)  
		response.setHeader("Content-Disposition", "attachment;fileName="+fileName);  
		//response.setHeader("Content-Disposition", "attachment;fileName=");  
		ServletOutputStream out;  
		//通过文件路径获得File对象(假如此路径中有一个fileName文件) 

		//File file = new File("E:\\" +fileName);

		File file = new File(fileName);
		//File file = new File("/data/ecgpost/" +fileName);  
		FileInputStream inputStream = new FileInputStream(file);  
		//3.通过response获取ServletOutputStream对象(out)  
		out = response.getOutputStream();  
		int b = 0;  
		byte[] buffer = new byte[1024];  
		while ((b=inputStream.read(buffer)) != -1){  
			//4.写到输出流(out)中  
			if(b!=-1)
				out.write(buffer,0,b); 
			else
				break;
		}  
		System.out.println("下载完成。。。。。。。。。。。。。。");
		inputStream.close();  
		out.close();  
		out.flush();  
	}

	/**
	 * 利用正则获取体检报告中的日期
	 * @param url
	 * @return
	 */
	public static Map<String,String> getHtmlPartData(String url){
		Map<String, String> htmlmap =new HashMap<String, String>();

		//File in = new File("E:/_000101016121211487.html");
		//File in = new File("E:/1111.html");
		//	File in = new File("E:/ABC/康雪体检报告.html");

		File in = new File(url);
		Document doc=null;
		try {
			doc = Jsoup.parse(in, "GB2312", "");
			Elements tables =doc.getElementsByTag("table");

			Elements date_tds=tables.get(2).getElementsByTag("tr");
			//System.out.println(date_tds.text());
			Elements na_tds=date_tds.get(1).getElementsByTag("td");
			System.out.println(na_tds.text());

			Pattern pattern = Pattern.compile("[0-9]{4}[-][0-9]{1,2}[-][0-9]{1,2}");
			Matcher matcher = pattern.matcher(na_tds.text());  

			String dateStr = null;  
			if(matcher.find()){  
				dateStr = matcher.group(0);  
			}  

			String date =dateStr.toString();  
			System.out.println(date); 
			htmlmap.put("date", date);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return htmlmap=null;
		}

		return htmlmap;

	}	

	/**
	 * 获取体检报告相关数据的excel文档
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/ad/getexcel", method={RequestMethod.POST,RequestMethod.GET})
	public void getexcel(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("ee");
		response.setContentType("application/x-msdownload"); 
		response.setHeader("Content-Disposition","attachment; filename=excel.xls");
		sout.writeEXCEL(null, response);

	}	

	@Autowired
	TbHealthExaminationMapper tm;	
	/**
	 * 全查体检信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/ad/findAll", method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView findAll(HttpServletRequest request,HttpServletResponse response){

		ModelAndView mo=new ModelAndView();
		ReadXml R=new ReadXml();
		LinkedHashMap<Object, String>map=R.getCompany();
		List<Company> list=new ArrayList<>();
		for (Object ma : map.keySet()) {
			Company co=new Company();
			co.setId(Integer.valueOf(ma+""));
			co.setCompanyName(map.get(ma));
			list.add(co);
		}
		mo.addObject("list", list);

		List<TbHealthExamination> li=null;
		String companynameid=request.getParameter("companyname");


		System.out.println(companynameid+"dd");

		if(companynameid==null||companynameid.equals("1")){

			li=tm.selectAll();
		}else {

			TbHealthExamination tb=new TbHealthExamination();
			tb.setbCompany(companynameid);
			li=tm.selectByCondition(tb);

		}



		System.out.println(li.size());

		mo.addObject("li", li);
		mo.setViewName("/ad/findall");
		return mo;
	}

	/**
	 * 获取用户信息
	 * @param tbHealthExamination
	 * @return
	 */
	public static  JSONObject getUserInfo( TbHealthExamination tbHealthExamination){
		JSONObject json=new JSONObject();
		JSONObject js=new JSONObject();

		String downurl=Const.DOWN_URL+tbHealthExamination.getbFileurl();
		System.out.println(tbHealthExamination.getbFileurl()+"--------");
		System.out.println(downurl+"--------");
		tbHealthExamination.setbFileurl(downurl);	


		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());
		json = JSONObject.fromObject(tbHealthExamination,jsonConfig);


		String examinationtime=DateTransfer.dateToStringDate(DateTransfer.stringToDateNoTime((String)json.get("examinationtime")));
		json.put("examinationtime",examinationtime );
		js.accumulate("data", json);

		System.out.println(js.toString()+"+++++++");

		return js ;


	}	



}	

