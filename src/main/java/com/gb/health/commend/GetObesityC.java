package com.gb.health.commend;

import com.gb.health.domain.TbHealthArchive;
import com.gb.health.init.Concat;
import com.gb.health.init.HealthEnum.Sex;
import com.gb.health.op.Obesity;
import com.gb.health.op.Result;
import com.gb.health.service.i.SystemOut;
import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;
/**
 * 肥胖数据分析
 * @author lx
 *
 */
public class GetObesityC extends Commend{
	//private static Logger log = Logger.getLogger(GetObesityC.class);   
	LogRecordInf lr = new LogRecordInf (GetObesityC.class);
	private SystemOut systemOut;


	public GetObesityC(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
		systemOut = (SystemOut)mContext.getBean("systemOutImpl");
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}
	/**
	 * 肥胖数据分析的具体方法
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			TbHealthArchive healthArchive=new TbHealthArchive();

			if(json.has("fat_sex")){
				//String b_sex=(String) json.get("b_sex");
				String b_sex=(int)EnumUtil.getEnumObject(json.get("fat_sex"), Sex.class).getValueCode()+"";
				healthArchive.setbSex(b_sex);
			} 
			if(json.has("fat_heght")){
				String b_heght=(String) json.get("fat_heght");
				healthArchive.setbHeght(Float.valueOf(b_heght));
			}
			if(json.has("fat_weight")){
				String b_weight=(String) json.get("fat_weight");
				healthArchive.setbWeight(Float.valueOf(b_weight));
			}
			if(json.has("fat_waistline")){
				String b_waistline=(String) json.get("fat_waistline");

				healthArchive.setbWaistline(Float.valueOf(b_waistline));
			}

			System.out.println(BeanUtils.describe(healthArchive));
			Result<Obesity> result=  systemOut.getObesityResult(healthArchive);


			System.out.println(result.getMsg());
			JSONObject jSONObject=inf.getResFat(Concat.ResultType.SUCCESS, result);
			//log.debug("肥胖接口返回值："+jSONObject);
			lr.interfaceDebug("肥胖接口返回值", jSONObject.toString());
			return jSONObject;

		}catch(Exception e){
			//log.error(e.toString());
			lr.interfaceError("肥胖接口报错", e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.error(js.toString());
			lr.interfaceError("肥胖接口报错", js.toString());
			return js;

		}	
	}
}
