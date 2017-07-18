package com.gb.health.rqf;


import com.gb.health.domain.CiMing;
import com.gb.health.init.CiMingHtml;
import com.gb.health.init.CiMingHtml.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class GetHtmlData {
	public static String key_Personid;
	static	CiMing.Baseinfo ge=new CiMing. Baseinfo();
	public static void main(String[] args) {
//		GetHtmlData getHtmlData= new GetHtmlData();
//		getHtmlData.getCiMingHtmlData("");

//				BaseService baseService=new CiMingService();
//		
//				ChestRadiography ge = (ChestRadiography) baseService.getFromCache("410326199105096772",new CiMing().new ChestRadiography());
//				System.out.println(ge.+"www");
		//System.out.println(intoAndOutRedis("14042719901015813X").toString());	
		//		Map<String, String> map=intoAndOutRedis("130602198301300324");
		//		JSONObject json=JSONObject.fromObject(map);
		//		System.out.println(json.toString());


	}



	//	public  static Map<String, String> intoAndOutRedis(String key){
	//		Map<String, String> map =null;
	//		DB db=new DB();
	//		if( db.getCacheDataByKey(key)!=null){
	//			//从redis中取数据
	//			map =db.getCacheDataByKey(key).getProperties();
	//			//System.out.println(map.toString());
	//		}
	//		//		else {
	//		//			//数据存入redis
	//		//			db.creatCacheData(key_Personid).setProperties(htmlmap).save();	
	//		//		}
	//		//		for (Entry<String, String> ma: map.entrySet()) {  
	//		//			  
	//		//		    System.out.println("Key = " + ma.getKey() + ", Value = " + ma.getValue());  
	//		//		  
	//		//		}  
	//		return map;
	//
	//
	//	}
	public CiMing getCiMingHtmlData(File in) {
		Map<String, String> htmlmap =new HashMap<String, String>();
		//File in = new File("E:/_000101016121211487.html");
		//File in = new File("E:/1111.html");
		//File in = new File("E:/ABC/康雪体检报告.html");
		CiMing ciMing = new CiMing();
		Document doc=null;
		try {
			doc = Jsoup.parse(in, "GB2312", "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		//汇总分析
		//totalAnalarsi(htmlmap, doc);

		//获取所有table中的值
		Elements tables =doc.getElementsByTag("table");
         if(tables.size()==0){
        	 return null;
         }

		//获取基本信息中的姓名表
		baseNameInfo(htmlmap, tables);

		//获取基本信息中的工作单位表
		ciMing.baseinfo = baseWorkInfo(htmlmap, tables);
		if(ciMing.baseinfo== null){
			return null;
		}
	
	

		//体检具体检测项目
		for (int i = 0; i < tables.size(); i++) {
			Element tds1=tables.get(i).getElementsByTag("tr").get(0);
			//检测项目
			
			String type=tds1.text().replaceAll("  ", "");
			System.out.println(type+"ww");
			if(type.equals("一般检查")){
				Elements yb_tds=tables.get(i).getElementsByTag("tr");
				ciMing.generalInspection = generalExamine(htmlmap, yb_tds);
			}
			else if(type.equals("内科")){
				System.out.println(221122);
				Elements tds5=tables.get(i).getElementsByTag("tr");
			   ciMing.medical =medicalExamine(tds5,htmlmap);
			}
			else if(type.equals("外科")){
				Elements w_tds=tables.get(i).getElementsByTag("tr");
				ciMing.surgery = surgeryExamine(htmlmap, w_tds);
			}
			else if(type.equals("眼科")){
				Elements yan_trs=tables.get(i).getElementsByTag("tr");
				ciMing.eye = eyeExamine(htmlmap, yan_trs);
			}
			else if(type.equals("耳鼻喉科")){
				Elements ear_trs=tables.get(i).getElementsByTag("tr");
				ciMing.ent = eNT_Examine(htmlmap, ear_trs);
			}
			else if(type.equals("口腔科")){
				Elements kou_trs=tables.get(i).getElementsByTag("tr");
				ciMing.stomatology = stomatologyExamine(htmlmap, kou_trs);
			}
			else if(type.equals("腹部超声")){
				Elements fu_trs=tables.get(i).getElementsByTag("tr");
				ciMing.taus=tAUS_Examine(htmlmap, fu_trs);
			}
			else if(type.equals("盆腔超声")){
				Elements pen_trs=tables.get(i).getElementsByTag("tr");
				ciMing.pelvicUltrasound=pelvicUltrasoundExamine(htmlmap, pen_trs);
			}
			else if(type.equals("经颅多普勒")){
				Elements duo_trs=tables.get(i).getElementsByTag("tr");
				ciMing.tcd=tCD_Examine( htmlmap, duo_trs);
			}
			else if(type.equals("胸部摄片")){
				Elements xio_trs=tables.get(i).getElementsByTag("tr");
				ciMing.chestRadiography=chestRadiographyExamine(htmlmap, xio_trs);
			}
			else if(type.equals("心电图")){
				Elements ecg_trs=tables.get(i).getElementsByTag("tr");
				ciMing.ecg=ecgExamine( htmlmap, ecg_trs);
			}
			else if(type.equals("动脉硬化检测")){
				Elements dong_trs=tables.get(i).getElementsByTag("tr");
				ciMing.atherosclerosis=atherosclerosisExamine(htmlmap, dong_trs);
			}
			else if(type.equals("亚健康检测")){
				Elements ya_trs=tables.get(i).getElementsByTag("tr");
				ciMing.subTest= SubTestsubExamine(htmlmap, ya_trs);
			}
			else if(type.equals("血常规")){
				Elements xue_trs=tables.get(i).getElementsByTag("tr");
				ciMing.cbc=cBC_Examine( htmlmap, xue_trs);
			}
			else if(type.equals("生化检验")){
				Elements sh_trs=tables.get(i).getElementsByTag("tr");
				ciMing.biochemicalDetection=biochemicalDetectionExamine(htmlmap, sh_trs);
			}

			else if(type.equals("肿瘤检测")){
				Elements zl_trs=tables.get(i).getElementsByTag("tr");
				ciMing.tumor=tumorExamine(htmlmap, zl_trs);
			}
			else if(type.equals("尿常规")){
				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.urinalysis=urinalysisExamine(htmlmap, nc_trs);
			}
			else if(type.equals("妇科")){
				System.out.println(22);
				Elements nc_trs=tables.get(i).getElementsByTag("tr");

				ciMing.gynecology=gynecologyExamine(htmlmap, nc_trs);
			}
			else if(type.equals("TCT检测")){

				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.tCT=tCT_Examine(htmlmap, nc_trs);
			}
			else if(type.equals("心脏彩超")){
				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.ucg=heart_Examine(htmlmap, nc_trs);

			}
			else if(type.equals("颈动脉彩超")){
				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.carotid=carotidExamine(htmlmap, nc_trs);

			}
			else if(type.equals("甲状腺彩超")){
				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.thyroid=thyroidExamine(htmlmap, nc_trs);

			}
			else if(type.equals("乳腺彩超")){
				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.ultrasonography=ultrasonographyExamine(htmlmap, nc_trs);

			}else if(type.equals("甲状腺功能检测")){
				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.thyroidFunction=thyroidFunctionExamine(htmlmap, nc_trs);

			}else if(type.equals("血流变")){
				Elements nc_trs=tables.get(i).getElementsByTag("tr");
				ciMing.hemorheology=hemorheologyExamine(htmlmap, nc_trs);

			}else {
				//return null;
			}

		}
		
		
		return ciMing;
		//存入redis
		//		    DB db=new DB();
		//		    System.out.println(key_Personid);
		//			db.creatCacheData(key_Personid).setProperties(htmlmap).save(1200);	
		// System.out.println(htmlmap.toString());
	}

	/**
	 * 汇总分析
	 * @param htmlmap
	 * @param doc
	 */
	public static void totalAnalarsi(Map<String, String> htmlmap, Document doc) {
		try {
			String totalResult="";
			Element zonghui=doc.getElementsByAttributeValue("class", "div647").get(0);	
			for (int i = 1; i < zonghui.select("tr").size()-1; i++) {
				totalResult+=zonghui.select("tr").get(i).getElementsByTag("td").get(0).text()+"$$";
			}
			htmlmap.put(CiMingHtml.GLOBAL_ANALYSIS, totalResult);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	/**
	 * 获取基本信息中的姓名表
	 * @param htmlmap
	 * @param tables
	 */
	public static CiMing.Baseinfo baseNameInfo(Map<String, String> htmlmap, Elements tables) {


		try {
			//姓名表
			//System.out.println(tables.get(5).text());
			Elements name_tds=tables.get(5).getElementsByTag("tr");
			//System.out.println(name_tds.text());
			for (int i = 0; i < name_tds.size()-1; i++) {
				Elements na_tds=name_tds.get(i).getElementsByTag("td");
				for (int j = 0; j < na_tds.size(); j++) {
					if(na_tds.get(j).text().equals("姓名")){
						String name=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_NAME, name);
						System.out.println("姓名："+name);
						ge.setB_name(name);
					}else if(na_tds.get(j).text().equals("性别")){
						String sex=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_SEX, sex);
						System.out.println("性别："+sex);
						ge.setB_sex(sex);
					}else if(na_tds.get(j).text().equals("出生日期")){
						String birth=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_BIRTH, birth);
						System.out.println("出生日期："+birth);
						ge.setB_birthday(birth);
					}else if(na_tds.get(j).text().equals("年龄")){
						String age=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_AGE, age);
						System.out.println("年龄："+age);
						ge.setB_age(age);
					}else if(na_tds.get(j).text().equals("国籍")){
						String nation=na_tds.get(j+1).text();
						htmlmap.put("", nation);
						System.out.println("国籍："+nation);
						ge.setB_country(nation);
					}else if(na_tds.get(j).text().equals("民族")){
						String minzu=na_tds.get(j+1).text();
						htmlmap.put("", minzu);
						System.out.println("民族："+minzu);
						ge.setB_nationality(minzu);
					}else if(na_tds.get(j).text().equals("证件号")){
						String personid=na_tds.get(j+1).text();
						key_Personid=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_ID, personid);
						System.out.println("证件号："+personid);
						ge.setB_personid(personid);
					}else if(na_tds.get(j).text().equals("婚否")){
						String marry=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_MERRY, marry);
						System.out.println("婚否："+marry);
						ge.setB_marriage(marry);
					}
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(ge, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ge;

	}

	/**
	 * 获取基本信息中的工作单位表
	 * @param htmlmap
	 * @param tables
	 */
	public static CiMing.Baseinfo baseWorkInfo(Map<String, String> htmlmap, Elements tables) {
		try {
              
			//姓名表
			//System.out.println(tables.get(5).text());
			Elements name_tds=tables.get(6).getElementsByTag("tr");
			System.out.println(name_tds.text());
			for (int i = 0; i < name_tds.size(); i++) {
				Elements na_tds=name_tds.get(i).getElementsByTag("td");
				for (int j = 0; j < na_tds.size(); j++) {
					if(na_tds.get(j).text().equals("工作单位")){
						String work_addr=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_WORK_ADDR, work_addr);
						System.out.println("工作单位："+work_addr);
						ge.setB_WorkUnit(work_addr);
					}else if(na_tds.get(j).text().equals("手机")){
						String tel=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_TEL, tel);
						System.out.println("手机："+tel);
						ge.setB_tel(tel);
					}else if(na_tds.get(j).text().equals("通信地址")){
						String tongxun=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_ADDR, tongxun);
						System.out.println("通信地址："+tongxun);
						ge.setB_MailingAddress(tongxun);
					}else if(na_tds.get(j).text().equals("办公电话")){
						String bangongtel=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_WORK_TEL, bangongtel);
						System.out.println("办公电话："+bangongtel);
						ge.setB_OfficeTelephone(bangongtel);
					}else if(na_tds.get(j).text().equals("电子邮件")){
						String email=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_EMAIL, email);
						System.out.println("电子邮件："+email);
						ge.setB_Email(email);
					}else if(na_tds.get(j).text().equals("宅电")){
						String zhaidian=na_tds.get(j+1).text();
						htmlmap.put(Baseinfo.BASE_HOME_TEL, zhaidian);
						System.out.println("宅电："+zhaidian);
						ge.setB_HomePhone(zhaidian);
					}
				}

			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(ge, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		return ge;

	}

	/**
	 *一般检查
	 * @param htmlmap
	 * @param tables
	 */
	public static CiMing.GeneralInspection generalExamine(Map<String, String> htmlmap, Elements yb_tds) {
		CiMing.GeneralInspection ge=new CiMing. GeneralInspection(); 
		try {
			for (int j = 0; j < yb_tds.size()-2; j++) {
				Elements y_tds=yb_tds.get(j).getElementsByTag("td");

				String yb_type=y_tds.get(0).text().replaceAll("  ", "");	
				if (yb_type.equals("身高")) {

					String height=y_tds.get(1).text();
					ge.setGenerl_height(height);
					//htmlmap.put(GeneralInspection.GEN_HEIGHT, height);
					System.out.println(height);
				}else if(yb_type.equals("体重")){
					String weight=y_tds.get(1).text();
					ge.setGenerl_weight(weight);
					//htmlmap.put(GeneralInspection.GEN_WEIGHT, weight);
					System.out.println(weight);

				}else if(yb_type.equals("体重指数")){
					String bmi=y_tds.get(1).text();
					ge.setGenerl_bmi(bmi);
					//htmlmap.put(GeneralInspection.GEN_BMI, bmi);


				}else if(yb_type.equals("体检血压(收缩压)")){
					String shousuo=y_tds.get(1).text();
					ge.setGenerl_systolic(shousuo);
					//htmlmap.put(GeneralInspection.GEN_SBP, shousuo);
					System.out.println(shousuo);

				}else if(yb_type.equals("复测血压(收缩压)")){
					String shousuo1=y_tds.get(1).text();
					ge.setGenerl_systolic1(shousuo1);
					//htmlmap.put(GeneralInspection.GEN_RE_SBP1, shousuo1);
					System.out.println(shousuo1);

				}else if(yb_type.equals("复测血压2(收缩压)")){
					String shousuo2=y_tds.get(1).text();
					ge.setGenerl_systolic2(shousuo2);
					//htmlmap.put(GeneralInspection.GEN_RE_SBP2, shousuo2);
					System.out.println(shousuo2);

				}else if(yb_type.equals("体检血压(舒张压)")){
					String shuzhang=y_tds.get(1).text();
					ge.setGenerl_diastolic(shuzhang);
					//htmlmap.put(GeneralInspection.GEN_DBP, shuzhang);
					System.out.println(shuzhang);

				}else if(yb_type.equals("复测血压(舒张压)")){
					String shuzhang1=y_tds.get(1).text();
					ge.setGenerl_diastolic1(shuzhang1);
					//htmlmap.put(GeneralInspection.GEN_RE_DBP1, shuzhang1);
					System.out.println(shuzhang1);

				}else if(yb_type.equals("复测血压2(舒张压)")){
					String shuzhang2=y_tds.get(1).text();
					ge.setGenerl_diastolic2(shuzhang2);
					//htmlmap.put(GeneralInspection.GEN_RE_DBP2, shuzhang2);
					System.out.println(shuzhang2);

				}

			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(ge, key_Personid);
			return ge;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		
		}
	}
	/**
	 * 尿常规检查
	 * @param htmlmap
	 * @param tables
	 */
	public static CiMing.Urinalysis urinalysisExamine(Map<String, String> htmlmap, Elements nc_trs) {
		CiMing.Urinalysis ur=new CiMing.Urinalysis(); 

		for (int j = 0; j < nc_trs.size()-2; j++) {
			Elements nc_tds=nc_trs.get(j).getElementsByTag("td");
			String nc_type=nc_tds.get(0).text().replaceAll("  ", "");
			if (nc_type.equals("比重（SG）")) {
				String SG=nc_tds.get(1).text();
				ur.setUrineroutines_sg(SG);
				//	htmlmap.put(Urinalysis.URI_SG, SG);
				System.out.println(SG);

			}else if (nc_type.equals("pH值(pH)")){
				String pH=nc_tds.get(1).text();
				ur.setUrineroutines_ph(pH);
				//	htmlmap.put(Urinalysis.URI_PH, pH);
				System.out.println(pH);

			}else if (nc_type.equals("白细胞(LEU)")){
				String LEU=nc_tds.get(1).text();
				ur.setUrineroutines_leu(LEU);
				//	htmlmap.put(Urinalysis.URI_LEU, LEU);
				System.out.println(LEU);

			}else if (nc_type.equals("隐血(ERY)")){
				String ERY=nc_tds.get(1).text();
				ur.setUrineroutines_ery(ERY);
				//	htmlmap.put(Urinalysis.URI_ERY, ERY);
				System.out.println(ERY);

			}else if (nc_type.equals("亚硝酸盐(NIT)")){
				String NIT=nc_tds.get(1).text();
				ur.setUrineroutines_nit(NIT);
				//	htmlmap.put(Urinalysis.URI_NIT, NIT);
				System.out.println(NIT);

			}else if (nc_type.equals("酮体(KET)")){
				String KET=nc_tds.get(1).text();
				//	htmlmap.put(Urinalysis.URI_KET, KET);
				ur.setUrineroutines_ket(KET);
				System.out.println(KET);

			}else if (nc_type.equals("胆红素(BIL)")){
				String BIL=nc_tds.get(1).text();
				//	htmlmap.put(Urinalysis.URI_BIL, BIL);
				ur.setUrineroutines_bil(BIL);
				System.out.println(BIL);

			}else if (nc_type.equals("尿胆元(UBG)")){
				String UBG=nc_tds.get(1).text();
				//	htmlmap.put(Urinalysis.URI_UBG, UBG);
				System.out.println(UBG);

			}else if (nc_type.equals("蛋白质(PRO)")){
				String PRO=nc_tds.get(1).text();
				ur.setUrineroutines_pro(PRO);
				//	htmlmap.put(Urinalysis.URI_PRO, PRO);
				System.out.println(PRO);

			}else if (nc_type.equals("葡萄糖(GLU)")){

				String GLU=nc_tds.get(1).text();
				ur.setUrineroutines_glu(GLU);
				//	htmlmap.put(Urinalysis.URI_GLU, GLU);
				System.out.println(GLU);

			}

		}
//		BaseService baseService=new CiMingService();
//		baseService.saveToCache(ur, key_Personid);
		return ur;

	}
	/**
	 * 肿瘤检测
	 * @param htmlmap
	 * @param zl_trs
	 */
	public static CiMing.Tumor tumorExamine(Map<String, String> htmlmap, Elements zl_trs) {
		CiMing.Tumor tu=new CiMing. Tumor();
		try {
			for (int j = 0; j < zl_trs.size()-2; j++) {
				Elements zl_tds=zl_trs.get(j).getElementsByTag("td");
				String zl_type=zl_tds.get(0).text().replaceAll("  ", "");
				if (zl_type.equals("甲胎蛋白(AFP)（酶免法）")) {
					String AFP=zl_tds.get(1).text();
					htmlmap.put(Tumor.TUMOR_AFP, AFP);
					tu.setTumor_afp(AFP);
					System.out.println(AFP);

				}else if(zl_type.equals("癌胚抗原(CEA)（酶免法）")){
					String CEA=zl_tds.get(1).text();
					htmlmap.put(Tumor.TUMOR_CEA, CEA);
					tu.setTumor_cea(CEA);
					System.out.println(CEA);

				}else if(zl_type.equals("前列腺特异性抗原（T-PSA）（发光法）")){
					String T_PSA=zl_tds.get(1).text();
					htmlmap.put(Tumor.TUMOR_T_PSA, T_PSA);
					tu.setTumor_tpsa(T_PSA);
					System.out.println(T_PSA);

				}else if(zl_type.equals("癌抗原19-9（CA19-9）（发光法）")){
					String T_ca19=zl_tds.get(1).text();
					htmlmap.put(Tumor.TUMOR_CA19_9, T_ca19);
					tu.setTumor_ca19_9(T_ca19);
					System.out.println(T_ca19);

				}else if(zl_type.equals("癌抗原125（CA125）（发光法）")){
					String T_ca125=zl_tds.get(1).text();
					htmlmap.put(Tumor.TUMOR_CA125, T_ca125);
					tu.setTumor_ca125(T_ca125);
					System.out.println(T_ca125);

				}else if(zl_type.equals("癌抗原724（CA724）（发光法）")){
					String T_ca724=zl_tds.get(1).text();
					htmlmap.put(Tumor.TUMOR_CA724, T_ca724);
					tu.setTumor_ca724(T_ca724);
					System.out.println(T_ca724);

				}else if(zl_type.equals("肺细胞角蛋白21-1(Cyfra 21-1)（发光法）")){
					String Cyfra21=zl_tds.get(1).text();
					htmlmap.put(Tumor.TUMOR_CYFRA21_1, Cyfra21);
					tu.setTumor_cyfra21_1(Cyfra21);
					System.out.println(Cyfra21);

				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(tu, key_Personid);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return tu;
	}

	/**
	 * 生化
	 * @param htmlmap
	 * @param sh_trs
	 */
	public static CiMing.BiochemicalDetection biochemicalDetectionExamine(Map<String, String> htmlmap, Elements sh_trs) {
		CiMing.BiochemicalDetection bi=new CiMing. BiochemicalDetection();
		try {
			for (int j = 0; j <sh_trs.size()-2; j++) {
				Elements sh_tds=sh_trs.get(j).getElementsByTag("td");
				String sh_type=sh_tds.get(0).text().replaceAll("  ", "");
				if (sh_type.equals("丙氨酸氨基转移酶（ALT）")) {
					String ALT=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_ALT, ALT);
					bi.setBiochemical_alt(ALT);
					System.out.println(ALT);

				}
				else if(sh_type.equals("天门冬氨酸氨基转移酶（AST）")){
					String AST=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.AST, AST);
					bi.setBiochemical_ast(AST);
					System.out.println(AST);

				}else if(sh_type.equals("γ-谷氨酰转移酶（GGT）")){
					String GGT=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_GGT, GGT);
					bi.setBiochemical_ggt(GGT);
					System.out.println(GGT);

				}else if(sh_type.equals("碱性磷酸酶(ALP)")){
					String ALP=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.ALP, ALP);
					bi.setBiochemical_alp(ALP);
					System.out.println(ALP);

				}else if(sh_type.equals("乳酸脱氢酶（LDH）")){
					String LDH=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.LDH, LDH);
					bi.setBiochemical_ldh(LDH);
					System.out.println(LDH);

				}else if(sh_type.equals("血清总胆汁酸（TBA）")){
					String TBA=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.TBA, TBA);
					bi.setBiochemical_tba(TBA);
					System.out.println(TBA);

				}else if(sh_type.equals("肌酸激酶（CK）")){
					String CK=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.CK, CK);
					bi.setBiochemical_ck(CK);
					System.out.println(CK);

				}else if(sh_type.equals("肌酸激酶同工酶（CK-MB）")){
					String CK_MB=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.CK_MB, CK_MB);
					bi.setBiochemical_ck_mb(CK_MB);
					System.out.println(CK_MB);

				}else if(sh_type.equals("α-羟丁酸脱氢酶（α-HBDH）")){
					String α_HBDH=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.α_HBDH, α_HBDH);
					bi.setBiochemical_α_hbdh(α_HBDH);
					System.out.println(α_HBDH);

				}else if(sh_type.equals("总蛋白（TP）")){
					String TP=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.TP, TP);
					bi.setBiochemical_tp(TP);
					System.out.println(TP);

				}else if(sh_type.equals("白蛋白（ALB）")){
					String ALB=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.ALB, ALB);
					bi.setBiochemical_alb(ALB);
					System.out.println(ALB);

				}else if(sh_type.equals("白蛋白/球蛋白（A/G） ")){
					String A_G=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.A_G, A_G);
					bi.setBiochemical_ag(A_G);
					System.out.println(A_G);

				}else if(sh_type.equals("总胆红素（T-BIL） ")){
					String T_BIL=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.T_BIL, T_BIL);
					bi.setBiochemical_t_bil(T_BIL);
					System.out.println(T_BIL);

				}else if(sh_type.equals("间接胆红素（IBIL） ")){
					String IBIL=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.IBIL, IBIL);
					bi.setBiochemical_ibil(IBIL);
					System.out.println(IBIL);

				}else if(sh_type.equals("直接胆红素（DBIL） ")){
					String DBIL=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.DBIL, DBIL);
					bi.setBiochemical_dbil(DBIL);
					System.out.println(DBIL);

				}
				else if(sh_type.equals("总胆固醇（TC）")){
					String TC=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_TC, TC);
					bi.setBiochemical_tc(TC);
					System.out.println(TC);

				}else if(sh_type.equals("甘油三酯（TG）")){
					String TG=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_TG, TG);
					bi.setBiochemical_tg(TG);
					System.out.println(TG);

				}else if(sh_type.equals("高密度脂蛋白胆固醇（HDL-CHO）")){
					String HDL_CHO=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_HDL_CHO, HDL_CHO);
					bi.setBiochemical_hdl_cho(HDL_CHO);
					System.out.println(HDL_CHO);

				}else if(sh_type.equals("低密度脂蛋白胆固醇（LDL-CHO）")){
					String LDL_CHO=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_LDL_CHO, LDL_CHO);
					bi.setBiochemical_ldl_cho(LDL_CHO);
					System.out.println(LDL_CHO);

				}else if(sh_type.equals("尿素（Urea）")){
					String Urea=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_UREA, Urea);
					bi.setBiochemical_urea(Urea);
					System.out.println(Urea);

				}else if(sh_type.equals("肌酐（Cr）")){
					String Cr=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_CR, Cr);
					bi.setBiochemical_cr(Cr);
					System.out.println(Cr);

				}else if(sh_type.equals("尿酸（UA）")){
					String UA=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_UA, UA);
					bi.setBiochemical_ua(UA);
					System.out.println(UA);

				}else if(sh_type.equals("空腹血糖（FPG）")){
					String FPG=sh_tds.get(1).text();
					htmlmap.put(BiochemicalDetection.BD_FPG, FPG);
					bi.setBiochemical_fpg(FPG);
					System.out.println(FPG);

				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(bi, key_Personid);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bi;
	}
	/**
	 *  血常规检查
	 * @param args
	 * @param htmlmap
	 * @param xue_trs
	 */
	public static CiMing.CBC cBC_Examine(Map<String, String> htmlmap, Elements xue_trs) {
		CiMing.CBC cb=new CiMing.CBC();

		try {
			for (int j = 0; j < xue_trs.size()-2; j++) {
				Elements xue_tds=xue_trs.get(j).getElementsByTag("td");
				String xue_type=xue_tds.get(0).text().replaceAll("  ", "");
				if (xue_type.equals("红细胞计数（RBC）")) {
					String rbc=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_RBC, rbc);
					cb.setBloodroutine_erythrocytes(rbc);
					System.out.println(rbc);

				}else if (xue_type.equals("血红蛋白(HGB)")){
					String HGB=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_HGB, HGB);
					cb.setBloodroutine_hb(HGB);
					System.out.println(HGB);

				}else if (xue_type.equals("红细胞压积(HCT)")){
					String HCT=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_HCT, HCT);
					cb.setBloodroutine_hct(HCT);
					System.out.println(HCT);

				}else if (xue_type.equals("平均红细胞体积（MCV）")){
					String MCV=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_MCV, MCV);
					cb.setBloodroutine_mcv(MCV);
					System.out.println(MCV);

				}else if (xue_type.equals("平均红细胞血红蛋白含量（MCH）")){
					String MCH=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_MCH, MCH);
					cb.setBloodroutine_mch(MCH);
					System.out.println(MCH);

				}else if (xue_type.equals("平均红细胞血红蛋白浓度（MCHC）")){
					String MCHC=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_MCH, MCHC);
					cb.setBloodroutine_mchc(MCHC);
					System.out.println(MCHC);

				}else if (xue_type.equals("红细胞体积分布宽度变异系数（RDW-CV）")){
					String RDW_CV=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_RDW_CV, RDW_CV);
					cb.setBloodroutine_rdwcv(RDW_CV);
					System.out.println(RDW_CV);

				}else if (xue_type.equals("红细胞体积分布宽度标准差（RDW-SD）")){
					String RDW_SD=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_RDW_SD, RDW_SD);
					cb.setBloodroutine_rdwsd(RDW_SD);
					System.out.println(RDW_SD);

				}else if (xue_type.equals("白细胞计数（WBC）")){
					String WBC=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_WBC, WBC);
					cb.setBloodroutine_wbc(WBC);
					System.out.println(WBC);

				}else if (xue_type.equals("中性粒细胞比值（GRA）")){
					String GRA=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_GRA, GRA);
					cb.setBloodroutine_nuet(GRA);
					System.out.println(GRA);

				}else if (xue_type.equals("中性粒细胞绝对值（GRA#）")){
					String GRA1=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_GRA1, GRA1);
					cb.setBloodroutine_gra(GRA1);
					System.out.println(GRA1);

				}else if (xue_type.equals("淋巴细胞比值（LYM）")){
					String LYM=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_LYM, LYM);
					cb.setBloodroutine_nlr(LYM);;
					System.out.println(LYM);

				}else if (xue_type.equals("淋巴细胞绝对值（LYM#）")){
					String LYM1=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_LYM1, LYM1);
					cb.setBloodroutine_lym(LYM1);
					System.out.println(LYM1);

				}else if (xue_type.equals("单核细胞比值（MONO）")){
					String MONO=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_MONO, MONO);
					cb.setBloodroutine_monor(MONO);
					System.out.println(MONO);

				}else if (xue_type.equals("单核细胞绝对值(MONO#)")){
					String MONO1=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_MONO1, MONO1);
					cb.setBloodroutine_mono(MONO1);
					System.out.println(MONO1);

				}else if (xue_type.equals("嗜酸性粒细胞比值（EO）")){
					String EO=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_EO, EO);
					cb.setBloodroutine_eor(EO);
					System.out.println(EO);


				}else if (xue_type.equals("嗜酸性粒细胞绝对值(EO#)")){
					String EO1=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_EO1, EO1);
					cb.setBloodroutine_eo(EO1);
					System.out.println(EO1);

				}else if (xue_type.equals("嗜碱性粒细胞比值（BASO）")){
					String BASO=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_BASO, BASO);
					cb.setBloodroutine_basor(BASO);
					System.out.println(BASO);

				}else if (xue_type.equals("嗜碱性粒细胞绝对值(BASO#)")){
					String BASO1=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_BASO1, BASO1);
					cb.setBloodroutine_baso(BASO1);
					System.out.println(BASO1);

				}else if (xue_type.equals("血小板(PLT)")){
					String PLT=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_PLT, PLT);
					cb.setBloodroutine_platelet(PLT);
					System.out.println(PLT);

				}else if (xue_type.equals("平均血小板体积（MPV）")){
					String MPV=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_MPV, MPV);
					cb.setBloodroutine_mpv(MPV);
					System.out.println(MPV);

				}else if (xue_type.equals("血小板容积分布宽度（PDW）")){
					String PDW=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_PDW, PDW);
					cb.setBloodroutine_pdw(PDW);
					System.out.println(PDW);

				}else if (xue_type.equals("大血小板比率（P-LCR）")){
					String P_LCR=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_P_LCR, P_LCR);
					cb.setBloodroutine_plcr(P_LCR);

					System.out.println(P_LCR);

				}else if (xue_type.equals("血小板比容（PCT）")){
					String PCT=xue_tds.get(1).text();
					htmlmap.put(CBC.CBC_PCT, PCT);
					cb.setBloodroutine_thrombocytocrit(PCT);
					System.out.println(PCT);

				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(cb, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cb;
	}
	/**
	 * 亚健康
	 * @param htmlmap
	 * @param ya_trs
	 */
	public static CiMing.SubTest SubTestsubExamine(Map<String, String> htmlmap, Elements ya_trs) {
		CiMing.SubTest at=new CiMing. SubTest();
		try {
			for (int j = 0; j < ya_trs.size()-2; j++) {
				Elements ya_tds=ya_trs.get(j).getElementsByTag("td");
				String ya_type=ya_tds.get(0).text().replaceAll("  ", "");
				if (ya_type.equals("检查所见")) {
					String ya_finding=ya_tds.get(1).text();
					htmlmap.put(SubTest.SUB_FINDING, ya_finding);
					System.out.println(ya_finding);
					at.setSubhealth_finding(ya_finding);
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(at, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return at;
	}

	/***
	 * 动脉硬化检测
	 * @param htmlmap
	 * @param dong_trs
	 */
	public static CiMing.Atherosclerosis atherosclerosisExamine(Map<String, String> htmlmap, Elements dong_trs) {
		CiMing.Atherosclerosis at=new CiMing.Atherosclerosis();
		System.out.println(11);
		try {
			for (int j = 1; j < dong_trs.size()-2; j++) {
				Elements dong_tds=dong_trs.get(j).getElementsByTag("td");
				String dong_type=dong_tds.get(0).text().replaceAll("  ", "");

				if (dong_type.equals("动脉硬化检测")) {
					String dongmai=dong_tds.get(1).text();
					htmlmap.put(Atherosclerosis.ATH_ATHEROSCLEROSIS, dongmai);
					at.setAtherosclerosis_examination(dongmai);
					System.out.println(dongmai);

				}else if(dong_type.equals("右侧ABI")){
					String r_ABI=dong_tds.get(1).text();
					htmlmap.put(Atherosclerosis.ATH_RIGHT_ABI, r_ABI);
					at.setAtherosclerosis_r_abi(r_ABI);
					System.out.println(r_ABI);

				}else if(dong_type.equals("左侧ABI")){
					String l_ABI=dong_tds.get(1).text();
					htmlmap.put(Atherosclerosis.ATH_LEFT_ABI, l_ABI);
					at.setAtherosclerosis_l__abi(l_ABI);
					System.out.println(l_ABI);

				}else if(dong_type.equals("右侧CAVI")){
					String r_CAVI=dong_tds.get(1).text();
					htmlmap.put(Atherosclerosis.ATH_RIGHT_CAVI, r_CAVI);
					at.setAtherosclerosis_r_cavi(r_CAVI);
					System.out.println(r_CAVI);

				}else if(dong_type.equals("左侧CAVI")){
					String l_CAVI=dong_tds.get(1).text();
					htmlmap.put(Atherosclerosis.ATH_LEFT_CAVI, l_CAVI);
					at.setAtherosclerosis_l_cavi(l_CAVI);
					System.out.println(l_CAVI);

				}else if(dong_type.equals("检查所见")){
					String dong_finding=dong_tds.get(1).text();
					htmlmap.put(Atherosclerosis.ATH_FINDING, dong_finding);
					at.setAtherosclerosis_finding(dong_finding);
					System.out.println(dong_finding);

				}
				
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(at, key_Personid);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return at;
	}

	/**
	 * 心电图检查
	 * @param args
	 * @param htmlmap
	 * @param ecg_trs
	 */
	public static CiMing.Ecg ecgExamine( Map<String, String> htmlmap, Elements ecg_trs) {
		CiMing.Ecg ecg=new CiMing.Ecg();
		try {
			for (int j = 0; j < ecg_trs.size()-2; j++) {
				Elements ecg_tds=ecg_trs.get(j).getElementsByTag("td");
				String ecg_type=ecg_tds.get(0).text().replaceAll("  ", "");	
				if (ecg_type.equals("检查所见")) {
					String ecg_finding=ecg_tds.get(1).text();
					htmlmap.put(Ecg.ECG_FINDING, ecg_finding);
					ecg.setEcg_finding(ecg_finding);
					System.out.println(ecg_finding);
				}

			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(ecg, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ecg;
	}


	/**
	 * 胸部摄片检查
	 * @param htmlmap
	 * @param xio_trs
	 */
	public static CiMing.ChestRadiography chestRadiographyExamine(Map<String, String> htmlmap, Elements xio_trs) {
		CiMing.ChestRadiography ch=new CiMing. ChestRadiography();

		try {
			for (int j = 0; j < xio_trs.size()-2; j++) {
				Elements xio_tds=xio_trs.get(j).getElementsByTag("td");
				String xio_type=xio_tds.get(0).text().replaceAll("  ", "");
				if (xio_type.equals("肺野")) {
					String feiye=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_LUNG_FIELD, feiye);
					ch.setChestradiography_lungfield(feiye);
					System.out.println(feiye);
				}else if(xio_type.equals("肺门")){
					String feimen=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_HILUS_PULMONIS, feimen);
					ch.setChestradiography_hiluspulmonis(feimen);
					System.out.println(feimen);

				}else if(xio_type.equals("纵隔")){
					String zongge=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_MEDIASTINUM, zongge);
					ch.setChestradiography_mediastinal(zongge);
					System.out.println(zongge);

				}else if(xio_type.equals("心影")){
					String xinying=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_PODOID, xinying);
					ch.setChestradiography_podoid(xinying);
					System.out.println(xinying);

				}else if(xio_type.equals("膈肌")){
					String geji=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_DIAPHRAGM, geji);
					ch.setChestradiography_diaphragm(geji);
					System.out.println(geji);

				}else if(xio_type.equals("胸膜")){
					String xiongmo=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_LIGAMENT, xiongmo);
					System.out.println(xiongmo);
					ch.setChestradiography_pleura(xiongmo);
				}else if(xio_type.equals("胸廓")){
					String xiongguo=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_THORAX, xiongguo);
					System.out.println(xiongguo);
					ch.setChestradiography_thorax(xiongguo);
				}else if(xio_type.equals("检查所见")){
					String xio_finding=xio_tds.get(1).text();
					htmlmap.put(ChestRadiography.CR_FINDING, xio_finding);
					System.out.println(xio_finding);
					ch.setChestradiography_finding(xio_finding);
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(ch, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ch;
	}
	/**
	 * 经颅多普勒检查
	 * @param args
	 * @param htmlmap
	 * @param duo_trs
	 */
	public static CiMing.TCD tCD_Examine( Map<String, String> htmlmap, Elements duo_trs) {

		CiMing.TCD tc=new CiMing. TCD();
		try {
			for (int j = 0; j < duo_trs.size()-2; j++) {
				Elements duo_tds=duo_trs.get(j).getElementsByTag("td");
				String duo_type=duo_tds.get(0).text().replaceAll("  ", "");
				if (duo_type.equals("多普勒脑血流图")) {
					String duopule=duo_tds.get(1).text();
					htmlmap.put(TCD.TCD_CHART, duopule);
					tc.setTcd_tcd(duopule);
					System.out.println(duopule);
				}else if(duo_type.equals("检查所见")){
					String duo_finding=duo_tds.get(1).text();
					htmlmap.put(TCD.TCD_FINDING, duo_finding);
					tc.setTcd_finding(duo_finding);
					System.out.println(duo_finding);
				}

			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(tc, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return tc;
	}

	/**
	 * 盆腔超声检查
	 * @param htmlmap
	 * @param pen_trs
	 */
	public static CiMing.PelvicUltrasound pelvicUltrasoundExamine(Map<String, String> htmlmap, Elements pen_trs) {
		CiMing.PelvicUltrasound tc=new CiMing.PelvicUltrasound();
		try {
			for (int j = 0; j < pen_trs.size()-2; j++) {
				Elements pen_tds=pen_trs.get(j).getElementsByTag("td");
				String pen_type=pen_tds.get(0).text().replaceAll("  ", "");	
				if (pen_type.equals("前列腺彩超")) {
					String qianliexian=pen_tds.get(1).text();
					htmlmap.put(PelvicUltrasound.PU_PROSTATE_COLOUR, qianliexian);
					tc.setPelvicultrasound_prostate(qianliexian);
					System.out.println(qianliexian);

				}else if (pen_type.equals("子宫彩超")){
					String zigong=pen_tds.get(1).text();
					//	htmlmap.put(PelvicUltrasound.PU_OTHER_COLOUR, pen_other);
					System.out.println(zigong);
					tc.setPelvicultrasound_uterus(zigong);

				}
				else if (pen_type.equals("附件彩超")){
					String fujian=pen_tds.get(1).text();
					//	htmlmap.put(PelvicUltrasound.PU_OTHER_COLOUR, pen_other);
					System.out.println(fujian);
					tc.setPelvicultrasound_enclosure(fujian);
				}
				else if (pen_type.equals("其他")){
					String pen_other=pen_tds.get(1).text();
					//	htmlmap.put(PelvicUltrasound.PU_OTHER_COLOUR, pen_other);
					System.out.println(pen_other);
					tc.setPelvicultrasound_other(pen_other);	
				} else if (pen_type.equals("检查所见")){
					String pen_finding=pen_tds.get(1).text();
					//htmlmap.put(PelvicUltrasound.PU_FINDING_COLOUR, pen_finding);
					System.out.println(pen_finding);
					tc.setPelvicultrasound_finding(pen_finding);
				}

			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(tc, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return tc;
	}
	/**
	 * 腹部超声检查
	 * @param htmlmap
	 * @param fu_trs
	 */


	public static CiMing.TAUS tAUS_Examine(Map<String, String> htmlmap, Elements fu_trs) {
		CiMing.TAUS ta=new CiMing.TAUS();

		try {
			for (int j = 0; j < fu_trs.size()-2; j++) {
				Elements fu_tds=fu_trs.get(j).getElementsByTag("td");
				String fu_type=fu_tds.get(0).text().replaceAll("  ", "");	
				if(fu_type.equals("肝脏彩超")){
					String ganzang=fu_tds.get(1).text();
					htmlmap.put(TAUS.TAUS_LIVER_COLOUR, ganzang);
					System.out.println(ganzang);
					ta.setTaus_liver(ganzang);

				}else if (fu_type.equals("胆囊彩超")){
					String dannang=fu_tds.get(1).text();
					htmlmap.put(TAUS.TAUS_GALLBLADDER_COLOUR, dannang);
					System.out.println(dannang);
					ta.setTaus_gallbladder(dannang);
				}else if (fu_type.equals("脾脏彩超")){
					String pizang=fu_tds.get(1).text();
					htmlmap.put(TAUS.TAUS_SPLEEN_COLOUR, pizang);
					System.out.println(pizang);
					ta.setTaus_spleen(pizang);
				}else if (fu_type.equals("胰腺彩超")){
					String yixian=fu_tds.get(1).text();
					htmlmap.put(TAUS.TAUS_PANCREAS_COLOUR, yixian);
					System.out.println(yixian);
					ta.setTaus_pancreas(yixian);
				}else if (fu_type.equals("肾脏彩超")){
					String shenzang=fu_tds.get(1).text();
					htmlmap.put(TAUS.TAUS_KIDNEY_COLOUR, shenzang);
					System.out.println(shenzang);
					ta.setTaus_kidney(shenzang);
				}else if (fu_type.equals("其他")){
					String fu_other=fu_tds.get(1).text();
					htmlmap.put(TAUS.TAUS_OTHER_COLOUR, fu_other);
					System.out.println(fu_other);
					ta.setTaus_other(fu_other);
				}else if (fu_type.equals("检查所见")){
					String fu_finding=fu_tds.get(1).text();
					htmlmap.put(TAUS.TAUS_FINDING_COLOUR, fu_finding);
					System.out.println(fu_finding);
					ta.setTaus_finding(fu_finding);
				}
			}

//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(ta, key_Personid);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ta;
	}
	/**
	 * 口腔检测
	 * @param htmlmap
	 * @param tables
	 * @param i
	 */
	public static CiMing.Stomatology stomatologyExamine(Map<String, String> htmlmap, Elements kou_trs) {
		CiMing.Stomatology st=new CiMing.Stomatology();
		try {

			for (int j = 0; j < kou_trs.size()-2; j++) {
				Elements kou_tds=kou_trs.get(j).getElementsByTag("td");
				String kou_type=kou_tds.get(0).text().replaceAll("  ", "");	
				if (kou_type.equals("唇")) {
					String chun=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_LIP, chun);
					System.out.println(chun);
					st.setStomatology_lip(chun);

				}else if (kou_type.equals("口腔粘膜")){
					String nianmo=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_MOUTH, nianmo);
					System.out.println(nianmo);
					st.setStomatology_buccalmucosa(nianmo);
				}else if (kou_type.equals("牙周")){
					String yazhou=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_PERIODONTAL, yazhou);
					System.out.println(yazhou);
					st.setStomatology_periodontal(yazhou);
				}else if (kou_type.equals("齿")){
					String chi=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_TOOTH, chi);
					System.out.println(chi);
					st.setStomatology_stomatology_tooth(chi);
				}else if (kou_type.equals("舌")){
					String she=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_TONGUE, she);
					System.out.println(she);
					st.setStomatology_tongue(she);
				}else if (kou_type.equals("腭")){
					String e=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_PALATE, e);
					System.out.println(e);
					st.setStomatology_palate(e);
				}else if (kou_type.equals("腮腺")){
					String sixian=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_PAROTID_GLAND, sixian);
					System.out.println(sixian);
					st.setStomatology_parotid(sixian);
				}else if (kou_type.equals("颞下颌关节")){
					String heguanjie=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_TMJ, heguanjie);
					System.out.println(heguanjie);
					st.setStomatology_tmj(heguanjie);
				}else if (kou_type.equals("其他")){
					String kou_other=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_OTHER, kou_other);
					System.out.println(kou_other);
					st.setStomatology_other(kou_other);
				}else if (kou_type.equals("体检所见")){
					String kou_finding=kou_tds.get(1).text();
					htmlmap.put(Stomatology.STO_FINDING, kou_finding);
					System.out.println(kou_finding);
					st.setStomatology_finding(kou_finding);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}

	/**
	 * TCT检测 
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.TCT tCT_Examine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.TCT st=new CiMing. TCT();
		try {
			for (int j = 0; j < ear_trs.size()-2; j++) {
				Elements tct_tds=ear_trs.get(j).getElementsByTag("td");
				String tct_type=tct_tds.get(0).text().replaceAll("  ", "");	
				if (tct_type.equals("宫颈液基薄层细胞学检测(TCT)")) {
					String tct=tct_tds.get(1).text();
					htmlmap.put(TCT.TCT_TCT, tct);
					System.out.println(tct);
					st.setTCT(tct);

				}else if (tct_type.equals("检验结果")){
					String tct_finding=tct_tds.get(1).text();
					htmlmap.put(TCT.TCT_FINDING, tct_finding);
					System.out.println(tct_finding);
					st.setCT__finding(tct_finding);
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}


	/**
	 * 乳腺彩超
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.Ultrasonography ultrasonographyExamine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.Ultrasonography st=new CiMing. Ultrasonography();
		try {
			for (int j = 1; j < ear_trs.size()-2; j++) {
				Elements ultrasonography_tds=ear_trs.get(j).getElementsByTag("td");

				String ultrasonography_type=ultrasonography_tds.get(0).text().replaceAll("  ", "");	
				if (ultrasonography_type.equals("乳腺彩超")) {
					String ultrasonography=ultrasonography_tds.get(1).text();
					htmlmap.put(Ultrasonography.ULT_ULTRASONOGRAPHY, ultrasonography);
					System.out.println(ultrasonography);
					st.setPelvicultrasound_breast(ultrasonography);
				}else if (ultrasonography_type.equals("检查所见")){
					String ultrasonography_finding=ultrasonography_tds.get(1).text();
					htmlmap.put(Ultrasonography.ULT_FINDING, ultrasonography_finding);
					System.out.println(ultrasonography_finding);
					st.setBreast_finding(ultrasonography_finding);
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}


	/**
	 * 血流变 检测
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.Hemorheology hemorheologyExamine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.Hemorheology st=new CiMing. Hemorheology();
		try {
			for (int j = 0; j < ear_trs.size()-2; j++) {
				Elements tf_tds=ear_trs.get(j).getElementsByTag("td");

				String tf_type=tf_tds.get(0).text().replaceAll("  ", "");	
				if (tf_type.equals("全血粘度：低切(10/s)")) {
					String HEM_VISCOSITY_DI=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_VISCOSITY_DI, HEM_VISCOSITY_DI);
					System.out.println(HEM_VISCOSITY_DI);
					st.setBloodRheology_viscosityLowCut10_s(HEM_VISCOSITY_DI);

				}else if (tf_type.equals("全血粘度：中切(60/s)")){
					String HEM_VISCOSITY_ZHONG=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_VISCOSITY_ZHONG, HEM_VISCOSITY_ZHONG);
					System.out.println(HEM_VISCOSITY_ZHONG);
					st.setBloodRheology_viscosityInCut60_s(HEM_VISCOSITY_ZHONG);
				}else if (tf_type.equals("全血粘度：高切(150/s)")){
					String HEM_VISCOSITY_GAO=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_VISCOSITY_GAO, HEM_VISCOSITY_GAO);
					System.out.println(HEM_VISCOSITY_GAO);
					st.setBloodRheology_viscosityHighCut150_s(HEM_VISCOSITY_GAO);
				}else if (tf_type.equals("血浆粘度")){
					String HEM_PLASMA_VISCOSITY=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_PLASMA_VISCOSITY, HEM_PLASMA_VISCOSITY);
					System.out.println(HEM_PLASMA_VISCOSITY);
					st.setBloodRheology_plasmaViscosity(HEM_PLASMA_VISCOSITY);
				}else if (tf_type.equals("全血还原粘度(低切)10/s")){
					String HEM_REDUCTIVE_DI=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_REDUCTIVE_DI, HEM_REDUCTIVE_DI);
					System.out.println(HEM_REDUCTIVE_DI);
					st.setBloodRheology_reductionViscosityLowCut10_s(HEM_REDUCTIVE_DI);
				}else if (tf_type.equals("全血还原粘度(中切)60/s")){
					String HEM_REDUCTIVE_ZHONG=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_REDUCTIVE_ZHONG, HEM_REDUCTIVE_ZHONG);
					System.out.println(HEM_REDUCTIVE_ZHONG);
					st.setBloodRheology_reductionViscosityInLowCut60_s(HEM_REDUCTIVE_ZHONG);
				}else if (tf_type.equals("全血还原粘度(高切)150/s")){
					String HEM_REDUCTIVE_GAO=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_REDUCTIVE_GAO, HEM_REDUCTIVE_GAO);
					System.out.println(HEM_REDUCTIVE_GAO);
					st.setBloodRheology_reductionViscosityHighCut150_s(HEM_REDUCTIVE_GAO);
				}else if (tf_type.equals("红细胞聚集指数")){
					String HEM_RED_ASSEMBLING=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_RED_ASSEMBLING, HEM_RED_ASSEMBLING);
					System.out.println(HEM_RED_ASSEMBLING);
					st.setBloodRheology_EaIndex(HEM_RED_ASSEMBLING);
				}else if (tf_type.equals("红细胞变形指数")){
					String HEM_HBX=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_HBX, HEM_HBX);
					System.out.println(HEM_HBX);
					st.setBloodRheology_EdIndex(HEM_HBX);
				}else if (tf_type.equals("红细胞压积")){
					String HEM_HCT=tf_tds.get(1).text();
					htmlmap.put(Hemorheology.HEM_HCT, HEM_HCT);
					System.out.println(HEM_HCT);
					st.setBloodRheology_Hematocrit(HEM_HCT);
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}
	/**
	 * 甲状腺功能检测
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.ThyroidFunction thyroidFunctionExamine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.ThyroidFunction st=new CiMing.ThyroidFunction();
		try {
			for (int j = 1; j < ear_trs.size()-2; j++) {
				Elements tf_tds=ear_trs.get(j).getElementsByTag("td");

				String tf_type=tf_tds.get(0).text().replaceAll("  ", "");	
				if (tf_type.equals("三碘甲状腺原氨酸（T3）电发光")) {
					String tf_t3=tf_tds.get(1).text();
					htmlmap.put(ThyroidFunction.TF_T3, tf_t3);
					System.out.println(tf_t3);
					st.setThyroid_t3(tf_t3);

				}else if (tf_type.equals("甲状腺素（T4）电发光")){
					String tf_t4=tf_tds.get(1).text();
					htmlmap.put(ThyroidFunction.TF_T4, tf_t4);
					System.out.println(tf_t4);
					st.setThyroid_t4(tf_t4);
				}else if (tf_type.equals("促甲状腺素（TSH）电发光")){
					String tf_tsh=tf_tds.get(1).text();
					htmlmap.put(ThyroidFunction.TF_TSH, tf_tsh);
					System.out.println(tf_tsh);
					st.setThyroid_tsh(tf_tsh);

				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}
	/**
	 * 甲状腺彩超 
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.Thyroid thyroidExamine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.Thyroid st=new CiMing. Thyroid();
		try {
			for (int j = 1; j < ear_trs.size()-2; j++) {
				Elements thyroid_tds=ear_trs.get(j).getElementsByTag("td");

				String thyroid_type=thyroid_tds.get(0).text().replaceAll("  ", "");	
				if (thyroid_type.equals("甲状腺")) {
					String thyroid=thyroid_tds.get(1).text();
					htmlmap.put(Thyroid.THY_THYROID, thyroid);
					System.out.println(thyroid);
					st.setPelvicultrasound_thyroid(thyroid);
				}else if (thyroid_type.equals("检查所见")){
					String thyroid_finding=thyroid_tds.get(1).text();
					htmlmap.put(Thyroid.THY_FINDING, thyroid_finding);
					System.out.println(thyroid_finding);
					st.setThyroid_finding(thyroid_finding);

				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}
	/**
	 * 颈动脉彩超检测 
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.Carotid carotidExamine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.Carotid st=new CiMing. Carotid();
		try {
			for (int j = 1; j < ear_trs.size()-2; j++) {
				Elements carotid_tds=ear_trs.get(j).getElementsByTag("td");

				String carotid_type=carotid_tds.get(0).text().replaceAll("  ", "");	
				if (carotid_type.equals("颈动脉彩超")) {
					String carotid=carotid_tds.get(1).text();
					htmlmap.put(Carotid.CA_CAROTID, carotid);
					System.out.println(carotid);
					st.setPelvicultrasound_CarotidArtery(carotid );
				}else if (carotid_type.equals("检查所见")){
					String carotid_finding=carotid_tds.get(1).text();
					htmlmap.put(Carotid.CA_FINDING, carotid_finding);
					System.out.println(carotid_finding);
					st.setCarotidArtery_finding(carotid_finding);

				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return st;
	}
	/**
	 * 心脏彩超
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.UCG  heart_Examine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.UCG st=new CiMing. UCG();
		try {
			for (int j = 0; j < ear_trs.size()-2; j++) {
				Elements heart_tds=ear_trs.get(j).getElementsByTag("td");
				String heart_type=heart_tds.get(0).text().replaceAll("  ", "");	
				if (heart_type.equals("动脉")) {
					String dongmai=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_ARTERY, dongmai);
					System.out.println(dongmai);
					st.setCS_artery(dongmai);

				}else if (heart_type.equals("房室腔")){
					String fangshiqiang=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_ATRIOVENTRICULAR, fangshiqiang);
					System.out.println(fangshiqiang);
					st.setCS_atrioventricularCavity(fangshiqiang);
				}else if (heart_type.equals("室间隔及左室后壁")){
					String shijiange=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_INTERVENTRICULAR, shijiange);
					System.out.println(shijiange);
					st.setCS_wall(shijiange);
				}else if (heart_type.equals("瓣膜")){
					String guamo=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_VALVE, guamo);
					System.out.println(guamo);
					st.setCS_valve(guamo);
				}else if (heart_type.equals("CDFI")){
					String cdfi=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_CDFI, cdfi);
					System.out.println(cdfi);
					st.setCDFI(cdfi);
				}else if (heart_type.equals("心功能")){
					String xindongneng=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_FUNCTION, xindongneng);
					System.out.println(xindongneng);
					st.setCS_heartFunction(xindongneng);
				}else if (heart_type.equals("其他")){
					String ucg_other=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_OTHER, ucg_other);
					System.out.println(ucg_other);
					st.setCS_other(ucg_other);
				}else if (heart_type.equals("测量")){
					String celiang=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_MEASURE, celiang);
					System.out.println(celiang);
					st.setCS_measure(celiang);
				}else if (heart_type.equals("检查所见")){
					String ucg_finding=heart_tds.get(1).text();
					htmlmap.put(UCG.UCG_FINDING, ucg_finding);
					System.out.println(ucg_finding);
					st.setCS_finding(ucg_finding);
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}


	/**
	 * 妇科检查
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.Gynecology gynecologyExamine(Map<String, String> htmlmap, Elements ear_trs) {
		CiMing.Gynecology st=new CiMing. Gynecology();
		try {
			System.out.println(11);
			for (int j = 0; j < ear_trs.size()-2; j++) {
				Elements ear_tds=ear_trs.get(j).getElementsByTag("td");
				String yan_type=ear_tds.get(0).text().replaceAll("  ", "");	
				if (yan_type.equals("月经史")) {
					String yuejingshi=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_HISTORY, yuejingshi);
					System.out.println(yuejingshi);
					st.setWomen_menstrualHistory(yuejingshi);
				}else if (yan_type.equals("周期时段")){
					String zhouqushiduan=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_CYCLE, zhouqushiduan);
					System.out.println(zhouqushiduan);
					st.setWomen_menstruaCycle(zhouqushiduan);
				}else if (yan_type.equals("孕产史")){
					String yunchanshi=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_GESTATION, yunchanshi);
					System.out.println(yunchanshi);
					st.setWomen_pregnancyHistory(yunchanshi);
				}else if (yan_type.equals("手术史")){
					String shoushu=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_OPERATION, shoushu);
					System.out.println(shoushu);
					st.setWomen_operationHistory(shoushu);
				}else if (yan_type.equals("外阴")){
					String waiyin=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_VULVA, waiyin);
					System.out.println(waiyin);
					st.setWomen_vulva(waiyin);
				}else if (yan_type.equals("阴道")){
					String biqiang=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_VAGINA, biqiang);
					System.out.println(biqiang);
					st.setWomen_vagina(biqiang);
				}else if (yan_type.equals("分泌物")){
					String bidou=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_SECRETA, bidou);
					System.out.println(bidou);
					//st.set
				}else if (yan_type.equals("宫颈")){
					String yanbu=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_UTERINE_NECK, yanbu);
					System.out.println(yanbu);
					st.setWomen_cervical(yanbu);
				}else if (yan_type.equals("子宫体")){
					String biantaoti=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_CORPUS_UTERI, biantaoti);
					System.out.println(biantaoti);
					st.setWomen_corpusUteri(biantaoti);
				}else if (yan_type.equals("附件")){
					String ear_other=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_ACCESSORY, ear_other);
					System.out.println(ear_other);
					st.setWomen_enclosure(ear_other);
				}else if (yan_type.equals("体检所见")){
					String ear_finding=ear_tds.get(1).text();
					htmlmap.put(Gynecology.GY_FINDING, ear_finding);
					System.out.println(ear_finding);
					st.setWomen_physicalExamination(ear_finding);
				}
			}
//			BaseService baseService=new CiMingService();
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}





	/**
	 * 耳鼻喉检查
	 * @param htmlmap
	 * @param ear_trs
	 */
	public static CiMing.ENT eNT_Examine(Map<String, String> htmlmap, Elements ear_trs){
		CiMing.ENT st=new CiMing.ENT();


		try {
			for (int j = 0; j < ear_trs.size()-2; j++) {
				Elements ear_tds=ear_trs.get(j).getElementsByTag("td");
				String yan_type=ear_tds.get(0).text().replaceAll("  ", "");	
				if (yan_type.equals("听力")) {
					String tingli=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_LISTENING, tingli);
					System.out.println(tingli);
					st.setOtolaryngology_hearing(tingli);

				}else if (yan_type.equals("外耳")){
					String waier=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_AURICLE, waier);
					System.out.println(waier);
					st.setOtolaryngology_externalear(waier);
				}else if (yan_type.equals("外耳道")){
					String waierdao=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_AURICLE_CANAL, waierdao);
					System.out.println(waierdao);
					st.setOtolaryngology_earcanal(waierdao);
				}else if (yan_type.equals("鼓膜")){
					String gumo=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_EARDRUM, gumo);
					System.out.println(gumo);
					st.setOtolaryngology_tympanic(gumo);
				}else if (yan_type.equals("外鼻")){
					String waibi=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_EXTERNAL_NOSE, waibi);
					System.out.println(waibi);
					st.setOtolaryngology_externalnose(waibi);
				}else if (yan_type.equals("鼻腔")){
					String biqiang=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_NASAL_CAVITY, biqiang);
					System.out.println(biqiang);
					st.setOtolaryngology_nasalcavity(biqiang);
				}else if (yan_type.equals("鼻窦")){
					String bidou=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_NOSE_ANTRAL, bidou);
					System.out.println(bidou);
					st.setOtolaryngology_paranasal(bidou);
				}else if (yan_type.equals("咽部")){
					String yanbu=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_PHARYNGEAL, yanbu);
					System.out.println(yanbu);
					st.setOtolaryngology_pharyngeal(yanbu);
				}else if (yan_type.equals("扁桃体")){
					String biantaoti=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_TONSIL, biantaoti);
					System.out.println(biantaoti);
					st.setOtolaryngology_tonsilla(biantaoti);
				}else if (yan_type.equals("其他")){
					String ear_other=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_OTHER, ear_other);
					System.out.println(ear_other);
					st.setOtolaryngology_other(ear_other);
				}else if (yan_type.equals("体检所见")){
					String ear_finding=ear_tds.get(1).text();
					htmlmap.put(ENT.ENT_FINDING, ear_finding);
					System.out.println(ear_finding);
					st.setOtolaryngology_finding(ear_finding);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();

		}
		return st;
	}

	/**
	 * 眼科检查
	 * @param htmlmap
	 * @param yan_trs
	 */
	public static CiMing.Eye eyeExamine(Map<String, String> htmlmap, Elements yan_trs) {
		CiMing.Eye st=new CiMing.Eye();
		try {
			for (int j = 0; j < yan_trs.size()-2; j++) {
				Elements yan_tds=yan_trs.get(j).getElementsByTag("td");
				String yan_type=yan_tds.get(0).text().replaceAll("  ", "");
				if (yan_type.equals("右眼裸视")) {
					String youluo=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_RIGHT_NAKED, youluo);
					System.out.println(youluo);
					st.setOphthalmology_righteye(youluo);
				} else if(yan_type.equals("左眼裸视")){
					String zuoluo=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_LIFT_NAKED, zuoluo);
					System.out.println(zuoluo);
					st.setOphthalmology_lefteye(zuoluo);
				}else if(yan_type.equals("右眼矫正视力")){
					String youjiao=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_RIGHT_CORRECT, youjiao);
					System.out.println(youjiao);
					st.setOphthalmology_rightcorrected(youjiao);
				}else if(yan_type.equals("左眼矫正视力")){
					String zuojiao=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_LIFT_CORRECT, zuojiao);
					System.out.println(zuojiao);
					st.setOphthalmology_leftcorrected(zuojiao);
				}else if(yan_type.equals("色觉")){
					String sejue=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_COLOUR_VISION, sejue);
					System.out.println(sejue);
					st.setOphthalmology_colorvision(sejue);
				}else if(yan_type.equals("眼睑")){
					String yanjian=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_EYELID, yanjian);
					System.out.println(yanjian);
					st.setOphthalmology_eyelid(yanjian);
				}else if(yan_type.equals("泪器")){
					String leiqi=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_ACRIMAL_APPARATUS, leiqi);
					System.out.println(leiqi);
					st.setOphthalmology_lacrimal(leiqi);
				}else if(yan_type.equals("结膜")){
					String jiemo=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_CONJUNCTIVA, jiemo);
					System.out.println(jiemo);
					st.setOphthalmology_conjunctiva(jiemo);
				}else if(yan_type.equals("眼球")){
					String yanqiu=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_EYEBALL, yanqiu);
					System.out.println(yanqiu);
					st.setOphthalmology_eyeball(yanqiu);
				}else if(yan_type.equals("角膜")){
					String jiaomo=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_CORNEA, jiaomo);
					System.out.println(jiaomo);
					st.setOphthalmology_corneal(jiaomo);
				}else if(yan_type.equals("前房")){
					String qianfang=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_ATRIA, qianfang);
					System.out.println(qianfang);
					st.setOphthalmology_anteriorchamber(qianfang);
				}else if(yan_type.equals("虹膜")){
					String hongmo=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_IRIS, hongmo);
					System.out.println(hongmo);
					st.setOphthalmology_iris(hongmo);
				}else if(yan_type.equals("瞳孔")){
					String tongkong=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_PUPIL, tongkong);
					System.out.println(tongkong);
					st.setOphthalmology_pupil(tongkong);
				}else if(yan_type.equals("晶状体")){
					String jingzhuangti=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_LENS, jingzhuangti);
					System.out.println(jingzhuangti);
					st.setOphthalmology_lens(jingzhuangti);
				}else if(yan_type.equals("玻璃体")){
					String boliti=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_VITREUM, boliti);
					System.out.println(boliti);
					st.setOphthalmology_vitreum(boliti);
				}else if(yan_type.equals("眼底")){
					String yandi=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_GYOUND, yandi);
					System.out.println(yandi);
					st.setOphthalmology_eyeground(yandi);
				}else if(yan_type.equals("杯盘比")){
					String beipanbi=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_VCDR, beipanbi);
					System.out.println(beipanbi);
					st.setOphthalmology_vcdr(beipanbi);
				}else if(yan_type.equals("其他")){
					String yan_other=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_OTHER, yan_other);
					System.out.println(yan_other);
					st.setOphthalmology_other(yan_other);
				}else if(yan_type.equals("体检所见")){
					String yan_finding=yan_tds.get(1).text();
					htmlmap.put(Eye.EYE_FINDING, yan_finding);
					System.out.println(yan_finding);
					st.setOphthalmology_finding(yan_finding);
				}



			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}

	/**
	 * 外科检查
	 * @param htmlmap
	 * @param w_tds
	 */
	public static CiMing.Surgery  surgeryExamine(Map<String, String> htmlmap, Elements w_tds) {
		CiMing.Surgery st=new CiMing.Surgery();
		System.out.println(11);
		try {
			for (int j = 0; j < w_tds.size()-2; j++) {

				Elements wk_tds=w_tds.get(j).getElementsByTag("td");
				String wk_type=wk_tds.get(0).text().replaceAll("  ", "");
				if (wk_type.equals("皮肤")) {
					System.out.println(3);
					String skin=wk_tds.get(1).text();
					System.out.println();
					htmlmap.put(Surgery.SUR_SKIN, skin);
					st.setSurgical_skin(skin);
				} else if(wk_type.equals("浅表淋巴结")){
					String linbajie=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_SUPERFICIAL_LYMPH, linbajie);
					//System.out.println(linbajie);
					st.setSurgical_superficiallymphnodes(linbajie);
				} else if(wk_type.equals("甲状腺")){
					String jiazhuangxian=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_THYROID, jiazhuangxian);
					//System.out.println(jiazhuangxian);
					st.setSurgical_thyroid(jiazhuangxian);
				}else if(wk_type.equals("乳腺")){
					String ruxian=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_BREAST, ruxian);
					//System.out.println(ruxian);
					st.setSurgical_breast(ruxian);
				}else if(wk_type.equals("脊柱")){
					String jizhui=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_SPINE, jizhui);
					//System.out.println(jizhui);
					st.setSurgical_spinal(jizhui);
				}else if(wk_type.equals("四肢与关节")){
					String zhijie=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_LIMBS_JOSTRINGS, zhijie);
					//System.out.println(zhijie);
					st.setSurgical_limbsandjoints(zhijie);
				}else if(wk_type.equals("外生殖器")){
					String shengzhiqi=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_PUDENDUM, shengzhiqi);
					//System.out.println(shengzhiqi);
					st.setSurgical_genitalia(shengzhiqi);
				}else if(wk_type.equals("肛诊")){
					String gangzhen=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_ANAL_DIAGNOSIS, gangzhen);
					//System.out.println(gangzhen);
					st.setSurgical_anal(gangzhen);
				}else if(wk_type.equals("其他")){
					String wk_other=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_OTHER, wk_other+"");
					//System.out.println(wk_other+"111111");
					st.setSurgical_other(wk_other);
				}else if(wk_type.equals("体检所见")){
					String wk_finding=wk_tds.get(1).text();
					htmlmap.put(Surgery.SUR_FINDING, wk_finding);
					//System.out.println(wk_finding+"111111");
					st.setSurgical_finding(wk_finding);
				}

			}
//			BaseService baseService=new CiMingService();
//			System.out.println(key_Personid+"ww");
//			baseService.saveToCache(st, key_Personid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}

	//汇总分析
	//		String totalResult="";
	//		Element zonghui=doc.getElementsByAttributeValue("class", "div647").get(0);	
	//		for (int i = 1; i < zonghui.select("tr").size()-1; i++) {
	//			totalResult+=zonghui.select("tr").get(i).getElementsByTag("td").get(0).text()+"$$";
	//		}
	//		htmlmap.put(CiMingHtml.GLOBAL_ANALYSIS, totalResult);
	//		System.out.println(totalResult);


	//内科-----------------------------------------------------------------------------------

	//	System.out.println(NERVOUS_SYSTEM);

	//腹部超声-----------------------------------------------------------------------------------
	//	Elements tds1=tables.get(15).getElementsByTag("tr");
	//	System.out.println(tds5.text());

	/*System.out.println(tds5.size()-3);
				//腹部 
				String belly=tds5.get(8).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_BELLY, belly);
				//胸部 
				String chest=tds5.get(2).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_CHEST, chest);
				//胆囊
				String CHOLECYST=tds5.get(10).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_CHOLECYST, CHOLECYST);
				//体检所见
				String FINDING=tds5.get(15).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_FINDING, FINDING);
				//心界
				String HEART_BORDER=tds5.get(6).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_HEART_BORDER, HEART_BORDER);
				//心律
				String HEART_RHYTHM=tds5.get(4).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_HEART_RHYTHM, HEART_RHYTHM);
				//心音
				String HEART_SOUNDS=tds5.get(5).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_HEART_SOUNDS, HEART_SOUNDS);
				//肾脏
				String KIDNEY=tds5.get(12).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_KIDNEY, KIDNEY);
				//心率
				String MEDICAL_HR=tds5.get(3).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_HR, MEDICAL_HR);
				// 肝脏
				String LIVER=tds5.get(9).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_LIVER, LIVER);
				//肺
				String LUNG=tds5.get(7).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_LUNG, LUNG);
				//其他 
				String MEDICAL_OTHER=tds5.get(14).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_OTHER, MEDICAL_OTHER);
				// 脾脏
				String MEDICAL_SPLEEN=tds5.get(11).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.MEDICAL_SPLEEN, MEDICAL_SPLEEN);
				//神经系统
				String NERVOUS_SYSTEM=tds5.get(13).getElementsByTag("td").get(1).text();
				htmlmap.put(Medical.NERVOUS_SYSTEM, NERVOUS_SYSTEM);
				System.out.println(NERVOUS_SYSTEM);*/

	//		
	//		
	//		
	//		
	//		
	//		String MEDICAL_SPLEEN=;
	//		
	//		
	//		
	//		
	//		htmlmap.put(Medical.MEDICAL_CHOLECYST, totalResult);
	//		htmlmap.put(Medical.MEDICAL_FINDING, totalResult);
	//		htmlmap.put(Medical.MEDICAL_HEART_BORDER, totalResult);
	//		htmlmap.put(Medical.MEDICAL_HEART_RHYTHM, totalResult);
	//		htmlmap.put(Medical.MEDICAL_HEART_SOUNDS, totalResult);
	//		htmlmap.put(Medical.MEDICAL_HR, totalResult);
	//		htmlmap.put(Medical.MEDICAL_KIDNEY, totalResult);
	//		htmlmap.put(Medical.MEDICAL_LIVER totalResult);
	//		htmlmap.put(Medical.MEDICAL_LUNG, totalResult);
	//		htmlmap.put(Medical.MEDICAL_OTHER, totalResult);
	//		htmlmap.put(Medical.MEDICAL_SPLEEN, totalResult);



	//		
	//		for (int i = 2; i < tds5.size()-3; i++) {
	//			
	//			System.out.println("key:"+ tds5.get(i).getElementsByTag("td").get(0).text());
	//			System.out.println("value:"+ tds5.get(i).getElementsByTag("td").get(1).text());
	//		}




	//		
	//		for (int i = 13; i < tables.size(); i++) {
	//			
	//			Elements tds=tables.get(i).getElementsByTag("tr");
	//			
	//			for (int j = 2; j < tds.size()-1; j++) {
	//				
	//				try {
	//					System.out.println("key:"+tds.get(j).getElementsByTag("td").get(0).text());
	//					System.out.println("value:"+tds.get(j).getElementsByTag("td").get(1).text());
	//				} catch (Exception e) {
	//					// TODO Auto-generated catch block
	//					
	//				}
	//			}

	/**
	 * 内科
	 * @param tds5
	 * @param htmlmap
	 */
	public static CiMing.Medical medicalExamine(Elements tds5, Map<String, String> htmlmap) {
		CiMing.Medical st=new CiMing.Medical();
		try {
			for (int i = 0; i < tds5.size()-2; i++) {
				Elements nei_tds=tds5.get(i).getElementsByTag("td");
				String nei_type=nei_tds.get(0).text().replaceAll("  ", "");	
				if (nei_type.equals("胸部")) {
					//胸部 
					String chest=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_CHEST, chest);
					System.out.println(chest);
					st.setMedical_chest(chest);
				}else if (nei_type.equals("心率")){
					//心率
					String MEDICAL_HR=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_HR, MEDICAL_HR);
					System.out.println(MEDICAL_HR);
					st.setMedical_heartrate(MEDICAL_HR);
				}else if (nei_type.equals("心律")){
					//心律
					String HEART_RHYTHM=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_HEART_RHYTHM, HEART_RHYTHM);
					System.out.println(HEART_RHYTHM);
					st.setMedical_heartrhythm(HEART_RHYTHM);
				}else if (nei_type.equals("心音")){
					//心音
					String HEART_SOUNDS=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_HEART_SOUNDS, HEART_SOUNDS);
					System.out.println(HEART_SOUNDS);
					st.setMedical_heartsound(HEART_SOUNDS);
				}else if (nei_type.equals("心界")){
					//心界
					String HEART_BORDER=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_HEART_BORDER, HEART_BORDER);
					System.out.println(HEART_BORDER);
					st.setMedical_heartborder(HEART_BORDER);
				}else if (nei_type.equals("肺")){
					//肺
					String LUNG=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_LUNG, LUNG);
					System.out.println(LUNG);
					st.setMedical_lung(LUNG);
				}else if (nei_type.equals("腹部")){
					//腹部 
					String belly=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_BELLY, belly);
					System.out.println(belly);
					st.setMedical_stomach(belly);
				}else if (nei_type.equals("肝脏")){
					// 肝脏
					String LIVER=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_LIVER, LIVER);
					System.out.println(LIVER);
					st.setMedical_hepatic(LIVER);
				}else if (nei_type.equals("胆囊")){
					//胆囊
					String CHOLECYST=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_CHOLECYST, CHOLECYST);
					System.out.println(CHOLECYST);
					st.setMedical_gallbladder(CHOLECYST);
				}else if (nei_type.equals("脾脏")){
					// 脾脏
					String MEDICAL_SPLEEN=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_SPLEEN, MEDICAL_SPLEEN);
					System.out.println(MEDICAL_SPLEEN);
					st.setMedical_spleen(MEDICAL_SPLEEN);
				}else if (nei_type.equals("肾脏")){
					//心音
					String HEART_SOUNDS=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_HEART_SOUNDS, HEART_SOUNDS);
					System.out.println(HEART_SOUNDS);
					st.setMedical_kidney(HEART_SOUNDS);
				}else if (nei_type.equals("神经系统")){
					//神经系统
					String NERVOUS_SYSTEM=nei_tds.get(1).text();
					htmlmap.put(Medical.NERVOUS_SYSTEM, NERVOUS_SYSTEM);
					System.out.println(NERVOUS_SYSTEM);
					st.setMedical_nervoussystem(NERVOUS_SYSTEM);
				}else if (nei_type.equals("其他")){
					//其他 
					String MEDICAL_OTHER=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_OTHER, MEDICAL_OTHER);
					System.out.println(MEDICAL_OTHER);
					st.setMedical_other(MEDICAL_OTHER);
				}else if (nei_type.equals("体检所见")){
					//体检所见
					String FINDING=nei_tds.get(1).text();
					htmlmap.put(Medical.MEDICAL_FINDING, FINDING);	
					System.out.println(FINDING);
					st.setMedical_finding(FINDING);
				}
			}
//			BaseService baseService=new CiMingService();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}

}
