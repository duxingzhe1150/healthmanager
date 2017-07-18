package com.gb.health.domain;


/**
 * 慈铭体检报告 各体检项
 * @author lx
 *
 */
public class CiMing {
	
	
	public CBC cbc;
	public Ecg ecg;
	public Atherosclerosis atherosclerosis;
	public Baseinfo baseinfo;
	public BiochemicalDetection biochemicalDetection;
	public Carotid carotid;
	public ChestRadiography chestRadiography;
	public ENT ent;
	public Eye eye;
	public GeneralInspection generalInspection;
	public Medical medical;
	public Hemorheology hemorheology;
	public TCD tcd;
	public Thyroid thyroid;
	public Gynecology gynecology;
	public PelvicUltrasound pelvicUltrasound;
	public Urinalysis urinalysis;
	public TAUS taus;
	public Surgery surgery;
	public Tumor tumor;
	public Thyroid thyroid2;
	public ThyroidFunction thyroidFunction;
	public Stomatology stomatology;
	public SubTest subTest;
	public TCT tCT;
	public  UCG ucg;
	public Ultrasonography ultrasonography;
	/**
	 * 妇科
	 * @author lx
	 *
	 */


	public static class Gynecology  {

		//月经史
	private String  Women_menstrualHistory;
		//周期时段
	private String  Women_menstruaCycle;
		//孕产史
	private String  Women_pregnancyHistory;
		//手术史
	private String  Women_operationHistory;
		//外阴
	private String  Women_vulva;
		//阴道 
	private String  Women_vagina;
		//分泌物
	//private String  Women_vagina;
		//宫颈
	private String  Women_cervical;
		//子宫体
	private String  Women_corpusUteri;
		//附件
	private String  Women_enclosure;
		//体检所见
	private String  Women_physicalExamination;
	public String getWomen_menstrualHistory() {
		return Women_menstrualHistory;
	}
	public void setWomen_menstrualHistory(String women_menstrualHistory) {
		Women_menstrualHistory = women_menstrualHistory;
	}
	public String getWomen_menstruaCycle() {
		return Women_menstruaCycle;
	}
	public void setWomen_menstruaCycle(String women_menstruaCycle) {
		Women_menstruaCycle = women_menstruaCycle;
	}
	public String getWomen_pregnancyHistory() {
		return Women_pregnancyHistory;
	}
	public void setWomen_pregnancyHistory(String women_pregnancyHistory) {
		Women_pregnancyHistory = women_pregnancyHistory;
	}
	public String getWomen_operationHistory() {
		return Women_operationHistory;
	}
	public void setWomen_operationHistory(String women_operationHistory) {
		Women_operationHistory = women_operationHistory;
	}
	public String getWomen_vulva() {
		return Women_vulva;
	}
	public void setWomen_vulva(String women_vulva) {
		Women_vulva = women_vulva;
	}
	public String getWomen_vagina() {
		return Women_vagina;
	}
	public void setWomen_vagina(String women_vagina) {
		Women_vagina = women_vagina;
	}
	public String getWomen_cervical() {
		return Women_cervical;
	}
	public void setWomen_cervical(String women_cervical) {
		Women_cervical = women_cervical;
	}
	public String getWomen_corpusUteri() {
		return Women_corpusUteri;
	}
	public void setWomen_corpusUteri(String women_corpusUteri) {
		Women_corpusUteri = women_corpusUteri;
	}
	public String getWomen_enclosure() {
		return Women_enclosure;
	}
	public void setWomen_enclosure(String women_enclosure) {
		Women_enclosure = women_enclosure;
	}
	public String getWomen_physicalExamination() {
		return Women_physicalExamination;
	}
	public void setWomen_physicalExamination(String women_physicalExamination) {
		Women_physicalExamination = women_physicalExamination;
	}
	
	

	}

/**
 * 基本信息
 */

	public static class Baseinfo  {


		//姓名
		private String  b_name;
		//性别
		private String b_sex;
		//出生日期
		private String b_birthday;
		//年龄
		private String  b_age;
		//国籍
		private String  b_country;
		//民族
		private String  b_nationality;
		//证件号
		private String  b_personid;
		//婚否
		private String  b_marriage;
		//工作单位 
		private String  b_WorkUnit;
		// 手机 
		private String b_tel;
		//通信地址 
		private String b_MailingAddress;
		//办公电话 
		private String b_OfficeTelephone;
		//电子邮件
		private String  b_Email;
		// 宅电
		private String  b_HomePhone;
		public String getB_name() {
			return b_name;
		}
		public void setB_name(String b_name) {
			this.b_name = b_name;
		}
		public String getB_sex() {
			return b_sex;
		}
		public void setB_sex(String b_sex) {
			this.b_sex = b_sex;
		}
		public String getB_birthday() {
			return b_birthday;
		}
		public void setB_birthday(String b_birthday) {
			this.b_birthday = b_birthday;
		}
		public String getB_age() {
			return b_age;
		}
		public void setB_age(String b_age) {
			this.b_age = b_age;
		}
		public String getB_country() {
			return b_country;
		}
		public void setB_country(String b_country) {
			this.b_country = b_country;
		}
		public String getB_nationality() {
			return b_nationality;
		}
		public void setB_nationality(String b_nationality) {
			this.b_nationality = b_nationality;
		}
		public String getB_personid() {
			return b_personid;
		}
		public void setB_personid(String b_personid) {
			this.b_personid = b_personid;
		}
		public String getB_marriage() {
			return b_marriage;
		}
		public void setB_marriage(String b_marriage) {
			this.b_marriage = b_marriage;
		}
		public String getB_WorkUnit() {
			return b_WorkUnit;
		}
		public void setB_WorkUnit(String b_WorkUnit) {
			this.b_WorkUnit = b_WorkUnit;
		}
		public String getB_tel() {
			return b_tel;
		}
		public void setB_tel(String b_tel) {
			this.b_tel = b_tel;
		}
		public String getB_MailingAddress() {
			return b_MailingAddress;
		}
		public void setB_MailingAddress(String b_MailingAddress) {
			this.b_MailingAddress = b_MailingAddress;
		}
		public String getB_OfficeTelephone() {
			return b_OfficeTelephone;
		}
		public void setB_OfficeTelephone(String b_OfficeTelephone) {
			this.b_OfficeTelephone = b_OfficeTelephone;
		}
		public String getB_Email() {
			return b_Email;
		}
		public void setB_Email(String b_Email) {
			this.b_Email = b_Email;
		}
		public String getB_HomePhone() {
			return b_HomePhone;
		}
		public void setB_HomePhone(String b_HomePhone) {
			this.b_HomePhone = b_HomePhone;
		}


	}

	
	/**
	 * TCT检测
	 * @author lx
	 *
	 */

	public static  class TCT  {

		// 宫颈液基薄层细胞学检测(TCT)
		private  String TCT;
		//体检所见
		private String  CT__finding;
		public String getTCT() {
			return TCT;
		}
		public void setTCT(String tCT) {
			TCT = tCT;
		}
		public String getCT__finding() {
			return CT__finding;
		}
		public void setCT__finding(String cT__finding) {
			CT__finding = cT__finding;
		}
		
		

	}

	
	/**
	 * 内科 Medical
	 * @author lx
	 *
	 */
	public  static class Medical  {
		//胸部
		private String  medical_chest;
		//心率
		private String  medical_heartrate;
		// 心律
		private String  medical_heartrhythm;
		// 心音
		private String  medical_heartsound;
		// 心界
		private String  medical_heartborder;
		// 肺 
		private String  medical_lung;
		//  腹部
		private String  medical_stomach;
		// 肝脏
		private String medical_hepatic;
		// 胆囊
		private String  medical_gallbladder;
		// 脾脏
		private String  medical_spleen;
		// 肾脏
		private String  medical_kidney;
		// 神经系统
		private String medical_nervoussystem;
		// 其他
		private String medical_other;
		// 体检所见
		private String medical_finding;
		public String getMedical_chest() {
			return medical_chest;
		}
		public void setMedical_chest(String medical_chest) {
			this.medical_chest = medical_chest;
		}
		public String getMedical_heartrate() {
			return medical_heartrate;
		}
		public void setMedical_heartrate(String medical_heartrate) {
			this.medical_heartrate = medical_heartrate;
		}
		public String getMedical_heartrhythm() {
			return medical_heartrhythm;
		}
		public void setMedical_heartrhythm(String medical_heartrhythm) {
			this.medical_heartrhythm = medical_heartrhythm;
		}
		public String getMedical_heartsound() {
			return medical_heartsound;
		}
		public void setMedical_heartsound(String medical_heartsound) {
			this.medical_heartsound = medical_heartsound;
		}
		public String getMedical_heartborder() {
			return medical_heartborder;
		}
		public void setMedical_heartborder(String medical_heartborder) {
			this.medical_heartborder = medical_heartborder;
		}
		public String getMedical_lung() {
			return medical_lung;
		}
		public void setMedical_lung(String medical_lung) {
			this.medical_lung = medical_lung;
		}
		public String getMedical_stomach() {
			return medical_stomach;
		}
		public void setMedical_stomach(String medical_stomach) {
			this.medical_stomach = medical_stomach;
		}
		public String getMedical_hepatic() {
			return medical_hepatic;
		}
		public void setMedical_hepatic(String medical_hepatic) {
			this.medical_hepatic = medical_hepatic;
		}
		public String getMedical_gallbladder() {
			return medical_gallbladder;
		}
		public void setMedical_gallbladder(String medical_gallbladder) {
			this.medical_gallbladder = medical_gallbladder;
		}
		public String getMedical_spleen() {
			return medical_spleen;
		}
		public void setMedical_spleen(String medical_spleen) {
			this.medical_spleen = medical_spleen;
		}
		public String getMedical_kidney() {
			return medical_kidney;
		}
		public void setMedical_kidney(String medical_kidney) {
			this.medical_kidney = medical_kidney;
		}
		public String getMedical_nervoussystem() {
			return medical_nervoussystem;
		}
		public void setMedical_nervoussystem(String medical_nervoussystem) {
			this.medical_nervoussystem = medical_nervoussystem;
		}
		public String getMedical_other() {
			return medical_other;
		}
		public void setMedical_other(String medical_other) {
			this.medical_other = medical_other;
		}
		public String getMedical_finding() {
			return medical_finding;
		}
		public void setMedical_finding(String medical_finding) {
			this.medical_finding = medical_finding;
		}
		
		
		
		
	}

	
	/**
	 * 腹部声超  TAUS
	 * @author lx
	 *
	 */
	public static class TAUS  {
		//肝脏彩超
		private String  taus_liver;
		// 胆囊彩超 
		private String taus_gallbladder;
		//   脾脏彩超
		private String taus_spleen;
		//  胰腺彩超 
		private String  taus_pancreas;
		//  肾脏彩超 
		private String  taus_kidney;
		// 其他 
		private String  taus_other;
		// 检查所见
		private String taus_finding;
		public String getTaus_liver() {
			return taus_liver;
		}
		public void setTaus_liver(String taus_liver) {
			this.taus_liver = taus_liver;
		}
		public String getTaus_gallbladder() {
			return taus_gallbladder;
		}
		public void setTaus_gallbladder(String taus_gallbladder) {
			this.taus_gallbladder = taus_gallbladder;
		}
		public String getTaus_spleen() {
			return taus_spleen;
		}
		public void setTaus_spleen(String taus_spleen) {
			this.taus_spleen = taus_spleen;
		}
		public String getTaus_pancreas() {
			return taus_pancreas;
		}
		public void setTaus_pancreas(String taus_pancreas) {
			this.taus_pancreas = taus_pancreas;
		}
		public String getTaus_kidney() {
			return taus_kidney;
		}
		public void setTaus_kidney(String taus_kidney) {
			this.taus_kidney = taus_kidney;
		}
		public String getTaus_other() {
			return taus_other;
		}
		public void setTaus_other(String taus_other) {
			this.taus_other = taus_other;
		}
		public String getTaus_finding() {
			return taus_finding;
		}
		public void setTaus_finding(String taus_finding) {
			this.taus_finding = taus_finding;
		}
		

		
		
	}
	
	/**
	 * 盆腔超声  PelvicUltrasound
	 * @author lx
	 *
	 */

	public  static class PelvicUltrasound  {


		//子宫彩超
		private String  pelvicultrasound_uterus;
		//附件彩超
		private String  pelvicultrasound_enclosure;
		//前列腺彩超
		private String pelvicultrasound_prostate;
		// 其他 
		private String  pelvicultrasound_other;
		// 检查所见
		private String pelvicultrasound_finding;
		public String getPelvicultrasound_uterus() {
			return pelvicultrasound_uterus;
		}
		public void setPelvicultrasound_uterus(String pelvicultrasound_uterus) {
			this.pelvicultrasound_uterus = pelvicultrasound_uterus;
		}
		public String getPelvicultrasound_enclosure() {
			return pelvicultrasound_enclosure;
		}
		public void setPelvicultrasound_enclosure(String pelvicultrasound_enclosure) {
			this.pelvicultrasound_enclosure = pelvicultrasound_enclosure;
		}
		public String getPelvicultrasound_prostate() {
			return pelvicultrasound_prostate;
		}
		public void setPelvicultrasound_prostate(String pelvicultrasound_prostate) {
			this.pelvicultrasound_prostate = pelvicultrasound_prostate;
		}
		public String getPelvicultrasound_other() {
			return pelvicultrasound_other;
		}
		public void setPelvicultrasound_other(String pelvicultrasound_other) {
			this.pelvicultrasound_other = pelvicultrasound_other;
		}
		public String getPelvicultrasound_finding() {
			return pelvicultrasound_finding;
		}
		public void setPelvicultrasound_finding(String pelvicultrasound_finding) {
			this.pelvicultrasound_finding = pelvicultrasound_finding;
		}
		
	
}
	/**
	 * 心脏彩超 UCG
	 * @author lx
	 *
	 */
	public static class UCG  {

		//动脉
		private String  CS_artery;
		// 房室腔
		private String  CS_atrioventricularCavity;
		//室间隔及左室后壁 
		private String CS_wall;
		//瓣膜 
		private String  CS_valve;
		//CDFI 
		private String CDFI;
		//心功能 
		private String CS_heartFunction;
		//其他 
		private String  CS_other;
		// 测量
		private String  CS_measure;
		// 检查所见
		private String CS_finding;
		public String getCS_artery() {
			return CS_artery;
		}
		public void setCS_artery(String cS_artery) {
			CS_artery = cS_artery;
		}
		public String getCS_atrioventricularCavity() {
			return CS_atrioventricularCavity;
		}
		public void setCS_atrioventricularCavity(String cS_atrioventricularCavity) {
			CS_atrioventricularCavity = cS_atrioventricularCavity;
		}
		public String getCS_wall() {
			return CS_wall;
		}
		public void setCS_wall(String cS_wall) {
			CS_wall = cS_wall;
		}
		public String getCS_valve() {
			return CS_valve;
		}
		public void setCS_valve(String cS_valve) {
			CS_valve = cS_valve;
		}
		public String getCDFI() {
			return CDFI;
		}
		public void setCDFI(String cDFI) {
			CDFI = cDFI;
		}
		public String getCS_heartFunction() {
			return CS_heartFunction;
		}
		public void setCS_heartFunction(String cS_heartFunction) {
			CS_heartFunction = cS_heartFunction;
		}
		public String getCS_other() {
			return CS_other;
		}
		public void setCS_other(String cS_other) {
			CS_other = cS_other;
		}
		public String getCS_measure() {
			return CS_measure;
		}
		public void setCS_measure(String cS_measure) {
			CS_measure = cS_measure;
		}
		public String getCS_finding() {
			return CS_finding;
		}
		public void setCS_finding(String cS_finding) {
			CS_finding = cS_finding;
		}
		

	}

	/**
	 * 颈动脉彩超 Carotid
	 * @author lx
	 *
	 */
	public static class Carotid  {
		//  颈动脉彩超
		private String  pelvicultrasound_CarotidArtery;
		// 检查所见
		private String CarotidArtery_finding;
		public String getPelvicultrasound_CarotidArtery() {
			return pelvicultrasound_CarotidArtery;
		}
		public void setPelvicultrasound_CarotidArtery(String pelvicultrasound_CarotidArtery) {
			this.pelvicultrasound_CarotidArtery = pelvicultrasound_CarotidArtery;
		}
		public String getCarotidArtery_finding() {
			return CarotidArtery_finding;
		}
		public void setCarotidArtery_finding(String carotidArtery_finding) {
			CarotidArtery_finding = carotidArtery_finding;
		}
		
		
		
		

	}
	
	
	/**
	 * 甲状腺彩超 Thyroid
	 * @author lx
	 *
	 */
	public static class  Thyroid  {
		//  甲状腺
		private String  pelvicultrasound_thyroid;
		// 检查所见
		private String thyroid_finding;
		public String getPelvicultrasound_thyroid() {
			return pelvicultrasound_thyroid;
		}
		public void setPelvicultrasound_thyroid(String pelvicultrasound_thyroid) {
			this.pelvicultrasound_thyroid = pelvicultrasound_thyroid;
		}
		public String getThyroid_finding() {
			return thyroid_finding;
		}
		public void setThyroid_finding(String thyroid_finding) {
			this.thyroid_finding = thyroid_finding;
		}
		
		

	}

	/**
	 *  乳腺彩超  Ultrasonography
	 * @author lx
	 *
	 */
	public static class  Ultrasonography  {
		//    乳腺彩超 
		private String pelvicultrasound_breast;
		// 检查所见
		private String breast_finding;
		public String getPelvicultrasound_breast() {
			return pelvicultrasound_breast;
		}
		public void setPelvicultrasound_breast(String pelvicultrasound_breast) {
			this.pelvicultrasound_breast = pelvicultrasound_breast;
		}
		public String getBreast_finding() {
			return breast_finding;
		}
		public void setBreast_finding(String breast_finding) {
			this.breast_finding = breast_finding;
		}
		
		
		

	}

	/**
	 * 经颅多普勒TCD
	 * @author lx
	 *
	 */
	public static class TCD {
		//前列腺彩超
		private String tcd_tcd;

		// 检查所见
		private String tcd_finding;

		public String getTcd_tcd() {
			return tcd_tcd;
		}

		public void setTcd_tcd(String tcd_tcd) {
			this.tcd_tcd = tcd_tcd;
		}

		public String getTcd_finding() {
			return tcd_finding;
		}

		public void setTcd_finding(String tcd_finding) {
			this.tcd_finding = tcd_finding;
		}
		
		

	}
	
	

	/**
	 * 甲状腺功能检测 ThyroidFunction
	 * @author lx
	 *
	 */
	public static class ThyroidFunction {
		// 三碘甲状腺原氨酸（T3）电发光 
		private String thyroid_t3;

		// 甲状腺素（T4）电发光
		private String thyroid_t4;

		// 促甲状腺素（TSH）电发光
		private String thyroid_tsh;

		public String getThyroid_t3() {
			return thyroid_t3;
		}

		public void setThyroid_t3(String thyroid_t3) {
			this.thyroid_t3 = thyroid_t3;
		}

		public String getThyroid_t4() {
			return thyroid_t4;
		}

		public void setThyroid_t4(String thyroid_t4) {
			this.thyroid_t4 = thyroid_t4;
		}

		public String getThyroid_tsh() {
			return thyroid_tsh;
		}

		public void setThyroid_tsh(String thyroid_tsh) {
			this.thyroid_tsh = thyroid_tsh;
		}
		
		

	}	


	/**
	 *  胸部摄片  ChestRadiography
	 * @author lx
	 *
	 */
	public static class  ChestRadiography {
		//肺野
		private String  chestradiography_lungfield;
		// 肺门 
		private String  chestradiography_hiluspulmonis;
		//纵隔 
		private String   chestradiography_mediastinal;
		// 心影 
		private String  chestradiography_podoid;
		// 膈肌 
		private String   chestradiography_diaphragm;
		// 胸膜
		private String  chestradiography_pleura;
		//胸廓
		private String  chestradiography_thorax;
		// 检查所见
		private String  chestradiography_finding;
		public String getChestradiography_lungfield() {
			return chestradiography_lungfield;
		}
		public void setChestradiography_lungfield(String chestradiography_lungfield) {
			this.chestradiography_lungfield = chestradiography_lungfield;
		}
		public String getChestradiography_hiluspulmonis() {
			return chestradiography_hiluspulmonis;
		}
		public void setChestradiography_hiluspulmonis(String chestradiography_hiluspulmonis) {
			this.chestradiography_hiluspulmonis = chestradiography_hiluspulmonis;
		}
		public String getChestradiography_mediastinal() {
			return chestradiography_mediastinal;
		}
		public void setChestradiography_mediastinal(String chestradiography_mediastinal) {
			this.chestradiography_mediastinal = chestradiography_mediastinal;
		}
		public String getChestradiography_podoid() {
			return chestradiography_podoid;
		}
		public void setChestradiography_podoid(String chestradiography_podoid) {
			this.chestradiography_podoid = chestradiography_podoid;
		}
		public String getChestradiography_diaphragm() {
			return chestradiography_diaphragm;
		}
		public void setChestradiography_diaphragm(String chestradiography_diaphragm) {
			this.chestradiography_diaphragm = chestradiography_diaphragm;
		}
		public String getChestradiography_pleura() {
			return chestradiography_pleura;
		}
		public void setChestradiography_pleura(String chestradiography_pleura) {
			this.chestradiography_pleura = chestradiography_pleura;
		}
		public String getChestradiography_thorax() {
			return chestradiography_thorax;
		}
		public void setChestradiography_thorax(String chestradiography_thorax) {
			this.chestradiography_thorax = chestradiography_thorax;
		}
		public String getChestradiography_finding() {
			return chestradiography_finding;
		}
		public void setChestradiography_finding(String chestradiography_finding) {
			this.chestradiography_finding = chestradiography_finding;
		}
		
		


	}
	
	

	/**
	 *  心电图 Ecg
	 * @author lx
	 *
	 */
	public static class  Ecg {

		// 检查所见
		private String  ecg_finding;

		public String getEcg_finding() {
			return ecg_finding;
		}

		public void setEcg_finding(String ecg_finding) {
			this.ecg_finding = ecg_finding;
		}
		


	}

	
	/**
	 *  动脉硬化检测  Atherosclerosis
	 * @author lx
	 *
	 */

	public  static class  Atherosclerosis {

		
		//右侧ABI
		private String  atherosclerosis_r_abi;
		// 左侧ABI  
		private String  atherosclerosis_l__abi;
		//右侧CAVI
		private String  atherosclerosis_r_cavi;
		// 左侧CAVI 
		private String   atherosclerosis_l_cavi;
		// 动脉硬化检测 
		private String   atherosclerosis_examination;
		// 检查所见
		private String  atherosclerosis_finding;
		public String getAtherosclerosis_r_abi() {
			return atherosclerosis_r_abi;
		}
		public void setAtherosclerosis_r_abi(String atherosclerosis_r_abi) {
			this.atherosclerosis_r_abi = atherosclerosis_r_abi;
		}
		public String getAtherosclerosis_l__abi() {
			return atherosclerosis_l__abi;
		}
		public void setAtherosclerosis_l__abi(String atherosclerosis_l__abi) {
			this.atherosclerosis_l__abi = atherosclerosis_l__abi;
		}
		public String getAtherosclerosis_r_cavi() {
			return atherosclerosis_r_cavi;
		}
		public void setAtherosclerosis_r_cavi(String atherosclerosis_r_cavi) {
			this.atherosclerosis_r_cavi = atherosclerosis_r_cavi;
		}
		public String getAtherosclerosis_l_cavi() {
			return atherosclerosis_l_cavi;
		}
		public void setAtherosclerosis_l_cavi(String atherosclerosis_l_cavi) {
			this.atherosclerosis_l_cavi = atherosclerosis_l_cavi;
		}
		public String getAtherosclerosis_examination() {
			return atherosclerosis_examination;
		}
		public void setAtherosclerosis_examination(String atherosclerosis_examination) {
			this.atherosclerosis_examination = atherosclerosis_examination;
		}
		public String getAtherosclerosis_finding() {
			return atherosclerosis_finding;
		}
		public void setAtherosclerosis_finding(String atherosclerosis_finding) {
			this.atherosclerosis_finding = atherosclerosis_finding;
		}

		
		

	}
	
	
	/**
	 *  亚健康检测  SubTest
	 * @author lx
	 *
	 */
	public static class  SubTest {
		//检查所见
		private String  subhealth_finding;

		public String getSubhealth_finding() {
			return subhealth_finding;
		}

		public void setSubhealth_finding(String subhealth_finding) {
			this.subhealth_finding = subhealth_finding;
		}



	}
	
	/**
	 *  血常规   CBC
	 * @author lx
	 *
	 */
	public static class  CBC {
		//  红细胞计数（RBC）
		private String  bloodroutine_erythrocytes;
		// 血红蛋白(HGB)  
		private String bloodroutine_hb;
		// 红细胞压积(HCT) 
		private String  bloodroutine_hct;
		// 平均红细胞体积（MCV）
		private String  bloodroutine_mcv;
		//  平均红细胞血红蛋白含量（MCH） 
		private String   bloodroutine_mch;
		// 平均红细胞血红蛋白浓度（MCHC)
		private String  bloodroutine_mchc;
		//   红细胞体积分布宽度变异系数（RDW-CV）
		private String  bloodroutine_rdwcv;
		//   红细胞体积分布宽度标准差（RDW-SD）
		private String   bloodroutine_rdwsd;
		// 白细胞计数（WBC）
		private String  bloodroutine_wbc;
		// 中性粒细胞比值（GRA）
		private String  bloodroutine_nuet;
		//中性粒细胞绝对值（GRA#）
		private String   bloodroutine_gra;
		// 淋巴细胞比值（LYM）
		private String  bloodroutine_nlr;
		//  淋巴细胞绝对值（LYM#）
		private String  bloodroutine_lym;
		//单核细胞比值（MONO）
		private String bloodroutine_monor;
		//  单核细胞绝对值(MONO#)
		private String  bloodroutine_mono;
		// 嗜酸性粒细胞比值（EO）
		private String  bloodroutine_eor;
		//嗜酸性粒细胞绝对值(EO#)
		private String  bloodroutine_eo;
		// 嗜碱性粒细胞比值（BASO） 
		private String  bloodroutine_basor;
		// 嗜碱性粒细胞绝对值(BASO#)
		private String   bloodroutine_baso;
		// 血小板(PLT) 
		private String bloodroutine_platelet;
		// 平均血小板体积（MPV） 
		private String  bloodroutine_mpv;
		//  血小板容积分布宽度（PDW）
		private String   bloodroutine_pdw;
		// 大血小板比率（P-LCR）
		private String  bloodroutine_plcr;
		// 血小板比容（PCT) 
		private String  bloodroutine_thrombocytocrit;
		public String getBloodroutine_erythrocytes() {
			return bloodroutine_erythrocytes;
		}
		public void setBloodroutine_erythrocytes(String bloodroutine_erythrocytes) {
			this.bloodroutine_erythrocytes = bloodroutine_erythrocytes;
		}
		public String getBloodroutine_hb() {
			return bloodroutine_hb;
		}
		public void setBloodroutine_hb(String bloodroutine_hb) {
			this.bloodroutine_hb = bloodroutine_hb;
		}
		public String getBloodroutine_hct() {
			return bloodroutine_hct;
		}
		public void setBloodroutine_hct(String bloodroutine_hct) {
			this.bloodroutine_hct = bloodroutine_hct;
		}
		public String getBloodroutine_mcv() {
			return bloodroutine_mcv;
		}
		public void setBloodroutine_mcv(String bloodroutine_mcv) {
			this.bloodroutine_mcv = bloodroutine_mcv;
		}
		public String getBloodroutine_mch() {
			return bloodroutine_mch;
		}
		public void setBloodroutine_mch(String bloodroutine_mch) {
			this.bloodroutine_mch = bloodroutine_mch;
		}
		public String getBloodroutine_mchc() {
			return bloodroutine_mchc;
		}
		public void setBloodroutine_mchc(String bloodroutine_mchc) {
			this.bloodroutine_mchc = bloodroutine_mchc;
		}
		public String getBloodroutine_rdwcv() {
			return bloodroutine_rdwcv;
		}
		public void setBloodroutine_rdwcv(String bloodroutine_rdwcv) {
			this.bloodroutine_rdwcv = bloodroutine_rdwcv;
		}
		public String getBloodroutine_rdwsd() {
			return bloodroutine_rdwsd;
		}
		public void setBloodroutine_rdwsd(String bloodroutine_rdwsd) {
			this.bloodroutine_rdwsd = bloodroutine_rdwsd;
		}
		public String getBloodroutine_wbc() {
			return bloodroutine_wbc;
		}
		public void setBloodroutine_wbc(String bloodroutine_wbc) {
			this.bloodroutine_wbc = bloodroutine_wbc;
		}
		public String getBloodroutine_nuet() {
			return bloodroutine_nuet;
		}
		public void setBloodroutine_nuet(String bloodroutine_nuet) {
			this.bloodroutine_nuet = bloodroutine_nuet;
		}
		public String getBloodroutine_gra() {
			return bloodroutine_gra;
		}
		public void setBloodroutine_gra(String bloodroutine_gra) {
			this.bloodroutine_gra = bloodroutine_gra;
		}
	
		public String getBloodroutine_lym() {
			return bloodroutine_lym;
		}
		public void setBloodroutine_lym(String bloodroutine_lym) {
			this.bloodroutine_lym = bloodroutine_lym;
		}
		public String getBloodroutine_monor() {
			return bloodroutine_monor;
		}
		public void setBloodroutine_monor(String bloodroutine_monor) {
			this.bloodroutine_monor = bloodroutine_monor;
		}
		public String getBloodroutine_mono() {
			return bloodroutine_mono;
		}
		public void setBloodroutine_mono(String bloodroutine_mono) {
			this.bloodroutine_mono = bloodroutine_mono;
		}
		public String getBloodroutine_eor() {
			return bloodroutine_eor;
		}
		public void setBloodroutine_eor(String bloodroutine_eor) {
			this.bloodroutine_eor = bloodroutine_eor;
		}
		public String getBloodroutine_eo() {
			return bloodroutine_eo;
		}
		public void setBloodroutine_eo(String bloodroutine_eo) {
			this.bloodroutine_eo = bloodroutine_eo;
		}
		public String getBloodroutine_basor() {
			return bloodroutine_basor;
		}
		public void setBloodroutine_basor(String bloodroutine_basor) {
			this.bloodroutine_basor = bloodroutine_basor;
		}
		public String getBloodroutine_baso() {
			return bloodroutine_baso;
		}
		public void setBloodroutine_baso(String bloodroutine_baso) {
			this.bloodroutine_baso = bloodroutine_baso;
		}
		public String getBloodroutine_platelet() {
			return bloodroutine_platelet;
		}
		public void setBloodroutine_platelet(String bloodroutine_platelet) {
			this.bloodroutine_platelet = bloodroutine_platelet;
		}
		public String getBloodroutine_mpv() {
			return bloodroutine_mpv;
		}
		public void setBloodroutine_mpv(String bloodroutine_mpv) {
			this.bloodroutine_mpv = bloodroutine_mpv;
		}
		public String getBloodroutine_pdw() {
			return bloodroutine_pdw;
		}
		public void setBloodroutine_pdw(String bloodroutine_pdw) {
			this.bloodroutine_pdw = bloodroutine_pdw;
		}
		public String getBloodroutine_plcr() {
			return bloodroutine_plcr;
		}
		public void setBloodroutine_plcr(String bloodroutine_plcr) {
			this.bloodroutine_plcr = bloodroutine_plcr;
		}
		public String getBloodroutine_thrombocytocrit() {
			return bloodroutine_thrombocytocrit;
		}
		public void setBloodroutine_thrombocytocrit(String bloodroutine_thrombocytocrit) {
			this.bloodroutine_thrombocytocrit = bloodroutine_thrombocytocrit;
		}
		public String getBloodroutine_nlr() {
			return bloodroutine_nlr;
		}
		public void setBloodroutine_nlr(String bloodroutine_nlr) {
			this.bloodroutine_nlr = bloodroutine_nlr;
		}



	}

	

	/**
	 *  生化检验   BiochemicalDetection
	 * @author lx
	 *
	 */
	public static class BiochemicalDetection {
		//   丙氨酸氨基转移酶（ALT）
		private String  biochemical_alt;
		
		//天门冬氨酸氨基转移酶（AST） biochemical_ast
		
		private String biochemical_ast;
		// γ-谷氨酰转移酶（GGT ) 
		private String biochemical_ggt;
		
		//碱性磷酸酶(ALP)   biochemical_alp
		private String  biochemical_alp;
		// 乳酸脱氢酶（LDH）  biochemical_ldh
		
		private String  biochemical_ldh;
	    //血清总胆汁酸（TBA） biochemical_tba
		private String  biochemical_tba;
	    //  肌酸激酶（CK）  biochemical_ck
		private String  biochemical_ck;
		//肌酸激酶同工酶（CK-MB） biochemical_ck-mb
		private String  biochemical_ck_mb;
		//α-羟丁酸脱氢酶（α-HBDH）  biochemical_α-hbdh
		private String  biochemical_α_hbdh;
		//总蛋白（TP）  biochemical_tp
		private String  biochemical_tp;
		//白蛋白（ALB） biochemical_alb
		private String  biochemical_alb;
		//球蛋白（GLB） biochemical_glb
		private String  biochemical_glb;	
		//白蛋白/球蛋白（A/G）  biochemical_a/g
		private String   biochemical_ag;
		// 总胆红素（T-BIL） biochemical_t-bil
		private String biochemical_t_bil;
		//间接胆红素（IBIL）biochemical_ibil
		private String  biochemical_ibil;
		// 直接胆红素（DBIL）biochemical_dbil
		private String  biochemical_dbil;
		//
		
		//  总胆固醇（TC） 
		private String  biochemical_tc;
		//  甘油三酯（TG）
		private String  biochemical_tg;
		// 高密度脂蛋白胆固醇（HDL-CHO） 
		private String   biochemical_hdl_cho;
		// 低密度脂蛋白胆固醇（LDL-CHO）
		private String  biochemical_ldl_cho;
		//   尿素（Urea） 
		private String   biochemical_urea;
		//    肌酐（Cr）
		private String  biochemical_cr;
		// 尿酸（UA）
		private String  biochemical_ua;
		// 空腹血糖（FPG） 
		private String  biochemical_fpg;
		public String getBiochemical_alt() {
			return biochemical_alt;
		}
		public void setBiochemical_alt(String biochemical_alt) {
			this.biochemical_alt = biochemical_alt;
		}
		public String getBiochemical_ast() {
			return biochemical_ast;
		}
		public void setBiochemical_ast(String biochemical_ast) {
			this.biochemical_ast = biochemical_ast;
		}
		public String getBiochemical_ggt() {
			return biochemical_ggt;
		}
		public void setBiochemical_ggt(String biochemical_ggt) {
			this.biochemical_ggt = biochemical_ggt;
		}
		public String getBiochemical_alp() {
			return biochemical_alp;
		}
		public void setBiochemical_alp(String biochemical_alp) {
			this.biochemical_alp = biochemical_alp;
		}
		public String getBiochemical_ldh() {
			return biochemical_ldh;
		}
		public void setBiochemical_ldh(String biochemical_ldh) {
			this.biochemical_ldh = biochemical_ldh;
		}
		public String getBiochemical_tba() {
			return biochemical_tba;
		}
		public void setBiochemical_tba(String biochemical_tba) {
			this.biochemical_tba = biochemical_tba;
		}
		public String getBiochemical_ck() {
			return biochemical_ck;
		}
		public void setBiochemical_ck(String biochemical_ck) {
			this.biochemical_ck = biochemical_ck;
		}
		public String getBiochemical_ck_mb() {
			return biochemical_ck_mb;
		}
		public void setBiochemical_ck_mb(String biochemical_ck_mb) {
			this.biochemical_ck_mb = biochemical_ck_mb;
		}
		public String getBiochemical_α_hbdh() {
			return biochemical_α_hbdh;
		}
		public void setBiochemical_α_hbdh(String biochemical_α_hbdh) {
			this.biochemical_α_hbdh = biochemical_α_hbdh;
		}
		public String getBiochemical_tp() {
			return biochemical_tp;
		}
		public void setBiochemical_tp(String biochemical_tp) {
			this.biochemical_tp = biochemical_tp;
		}
		public String getBiochemical_alb() {
			return biochemical_alb;
		}
		public void setBiochemical_alb(String biochemical_alb) {
			this.biochemical_alb = biochemical_alb;
		}
		public String getBiochemical_glb() {
			return biochemical_glb;
		}
		public void setBiochemical_glb(String biochemical_glb) {
			this.biochemical_glb = biochemical_glb;
		}
		public String getBiochemical_ag() {
			return biochemical_ag;
		}
		public void setBiochemical_ag(String biochemical_ag) {
			this.biochemical_ag = biochemical_ag;
		}
		public String getBiochemical_t_bil() {
			return biochemical_t_bil;
		}
		public void setBiochemical_t_bil(String biochemical_t_bil) {
			this.biochemical_t_bil = biochemical_t_bil;
		}
		public String getBiochemical_ibil() {
			return biochemical_ibil;
		}
		public void setBiochemical_ibil(String biochemical_ibil) {
			this.biochemical_ibil = biochemical_ibil;
		}
		public String getBiochemical_dbil() {
			return biochemical_dbil;
		}
		public void setBiochemical_dbil(String biochemical_dbil) {
			this.biochemical_dbil = biochemical_dbil;
		}
		public String getBiochemical_tc() {
			return biochemical_tc;
		}
		public void setBiochemical_tc(String biochemical_tc) {
			this.biochemical_tc = biochemical_tc;
		}
		public String getBiochemical_tg() {
			return biochemical_tg;
		}
		public void setBiochemical_tg(String biochemical_tg) {
			this.biochemical_tg = biochemical_tg;
		}
		public String getBiochemical_hdl_cho() {
			return biochemical_hdl_cho;
		}
		public void setBiochemical_hdl_cho(String biochemical_hdl_cho) {
			this.biochemical_hdl_cho = biochemical_hdl_cho;
		}
		public String getBiochemical_ldl_cho() {
			return biochemical_ldl_cho;
		}
		public void setBiochemical_ldl_cho(String biochemical_ldl_cho) {
			this.biochemical_ldl_cho = biochemical_ldl_cho;
		}
		public String getBiochemical_urea() {
			return biochemical_urea;
		}
		public void setBiochemical_urea(String biochemical_urea) {
			this.biochemical_urea = biochemical_urea;
		}
		public String getBiochemical_cr() {
			return biochemical_cr;
		}
		public void setBiochemical_cr(String biochemical_cr) {
			this.biochemical_cr = biochemical_cr;
		}
		public String getBiochemical_ua() {
			return biochemical_ua;
		}
		public void setBiochemical_ua(String biochemical_ua) {
			this.biochemical_ua = biochemical_ua;
		}
		public String getBiochemical_fpg() {
			return biochemical_fpg;
		}
		public void setBiochemical_fpg(String biochemical_fpg) {
			this.biochemical_fpg = biochemical_fpg;
		}
		
		

	}
	
	/**
	 *  肿瘤检测 Tumor
	 * @author lx
	 *
	 */
	public static class  Tumor {
		//甲胎蛋白(AFP)（酶免法）
		private String  tumor_afp;
		// 癌胚抗原(CEA)（酶免法）  
		private String  tumor_cea;
		//癌抗原19-9（CA19-9）（发光法）
		private String  tumor_ca19_9;
		//癌抗原125（CA125）（发光法）
		private String  tumor_ca125;
		//癌抗原724（CA724）（发光法)
		private String  tumor_ca724;
		// 肺细胞角蛋白21-1(Cyfra 21-1)（发光法）
		private String  tumor_tpsa;
		// 前列腺特异性抗原（T-PSA）（发光法）
		private String  tumor_cyfra21_1;
		public String getTumor_afp() {
			return tumor_afp;
		}
		public void setTumor_afp(String tumor_afp) {
			this.tumor_afp = tumor_afp;
		}
		public String getTumor_cea() {
			return tumor_cea;
		}
		public void setTumor_cea(String tumor_cea) {
			this.tumor_cea = tumor_cea;
		}
		public String getTumor_ca19_9() {
			return tumor_ca19_9;
		}
		public void setTumor_ca19_9(String tumor_ca19_9) {
			this.tumor_ca19_9 = tumor_ca19_9;
		}
		public String getTumor_ca125() {
			return tumor_ca125;
		}
		public void setTumor_ca125(String tumor_ca125) {
			this.tumor_ca125 = tumor_ca125;
		}
		public String getTumor_ca724() {
			return tumor_ca724;
		}
		public void setTumor_ca724(String tumor_ca724) {
			this.tumor_ca724 = tumor_ca724;
		}
		public String getTumor_tpsa() {
			return tumor_tpsa;
		}
		public void setTumor_tpsa(String tumor_tpsa) {
			this.tumor_tpsa = tumor_tpsa;
		}
		public String getTumor_cyfra21_1() {
			return tumor_cyfra21_1;
		}
		public void setTumor_cyfra21_1(String tumor_cyfra21_1) {
			this.tumor_cyfra21_1 = tumor_cyfra21_1;
		}


	}
	

	/**
	 *  血流变 Hemorheology
	 * @author lx
	 *
	 */
	public static class  Hemorheology {
		//全血粘度：低切(10/s) 
		private String  BloodRheology_viscosityLowCut10_s;
		// 全血粘度：中切(60/s) 
		private String  BloodRheology_viscosityInCut60_s;
		// 全血粘度：高切(150/s) 
		private String  BloodRheology_viscosityHighCut150_s;
		// 血浆粘度
		private String  BloodRheology_plasmaViscosity;
		//全血还原粘度(低切)10/s 
		private String  BloodRheology_reductionViscosityLowCut10_s;
		//全血还原粘度(中切)60/s
		private String BloodRheology_reductionViscosityInLowCut60_s;
		// 全血还原粘度(高切)150/s
		private String  BloodRheology_reductionViscosityHighCut150_s;
		//红细胞聚集指数 
		private String BloodRheology_EaIndex;
		// 红细胞变形指数 
		private String BloodRheology_EdIndex;
		//红细胞压积
		private String  BloodRheology_Hematocrit;
		public String getBloodRheology_viscosityLowCut10_s() {
			return BloodRheology_viscosityLowCut10_s;
		}
		public void setBloodRheology_viscosityLowCut10_s(String bloodRheology_viscosityLowCut10_s) {
			BloodRheology_viscosityLowCut10_s = bloodRheology_viscosityLowCut10_s;
		}
		public String getBloodRheology_viscosityInCut60_s() {
			return BloodRheology_viscosityInCut60_s;
		}
		public void setBloodRheology_viscosityInCut60_s(String bloodRheology_viscosityInCut60_s) {
			BloodRheology_viscosityInCut60_s = bloodRheology_viscosityInCut60_s;
		}
		public String getBloodRheology_viscosityHighCut150_s() {
			return BloodRheology_viscosityHighCut150_s;
		}
		public void setBloodRheology_viscosityHighCut150_s(String bloodRheology_viscosityHighCut150_s) {
			BloodRheology_viscosityHighCut150_s = bloodRheology_viscosityHighCut150_s;
		}
		public String getBloodRheology_plasmaViscosity() {
			return BloodRheology_plasmaViscosity;
		}
		public void setBloodRheology_plasmaViscosity(String bloodRheology_plasmaViscosity) {
			BloodRheology_plasmaViscosity = bloodRheology_plasmaViscosity;
		}
		public String getBloodRheology_reductionViscosityLowCut10_s() {
			return BloodRheology_reductionViscosityLowCut10_s;
		}
		public void setBloodRheology_reductionViscosityLowCut10_s(String bloodRheology_reductionViscosityLowCut10_s) {
			BloodRheology_reductionViscosityLowCut10_s = bloodRheology_reductionViscosityLowCut10_s;
		}
		public String getBloodRheology_reductionViscosityInLowCut60_s() {
			return BloodRheology_reductionViscosityInLowCut60_s;
		}
		public void setBloodRheology_reductionViscosityInLowCut60_s(String bloodRheology_reductionViscosityInLowCut60_s) {
			BloodRheology_reductionViscosityInLowCut60_s = bloodRheology_reductionViscosityInLowCut60_s;
		}
		public String getBloodRheology_reductionViscosityHighCut150_s() {
			return BloodRheology_reductionViscosityHighCut150_s;
		}
		public void setBloodRheology_reductionViscosityHighCut150_s(String bloodRheology_reductionViscosityHighCut150_s) {
			BloodRheology_reductionViscosityHighCut150_s = bloodRheology_reductionViscosityHighCut150_s;
		}
		public String getBloodRheology_EaIndex() {
			return BloodRheology_EaIndex;
		}
		public void setBloodRheology_EaIndex(String bloodRheology_EaIndex) {
			BloodRheology_EaIndex = bloodRheology_EaIndex;
		}
		public String getBloodRheology_EdIndex() {
			return BloodRheology_EdIndex;
		}
		public void setBloodRheology_EdIndex(String bloodRheology_EdIndex) {
			BloodRheology_EdIndex = bloodRheology_EdIndex;
		}
		public String getBloodRheology_Hematocrit() {
			return BloodRheology_Hematocrit;
		}
		public void setBloodRheology_Hematocrit(String bloodRheology_Hematocrit) {
			BloodRheology_Hematocrit = bloodRheology_Hematocrit;
		}



	}


	/**
	 *  尿常规
	 * @author lx
	 *
	 */
	public static class  Urinalysis {
		// 比重（SG）
		private String urineroutines_sg;
		// pH值(pH)  
		private String  urineroutines_ph;
		//白细胞(LEU) 
		private String  urineroutines_leu;
		//隐血(ERY) 
		private String  urineroutines_ery;
		// 亚硝酸盐(NIT)）  
		private String urineroutines_nit;
		//酮体(KET) 
		private String  urineroutines_ket;
		//胆红素(BIL)
		private String  urineroutines_bil;
		//  尿胆元(UBG)   
		private String urineroutines_ubg;
		//蛋白质(PRO)
		private String  urineroutines_pro;
		//葡萄糖(GLU)
		private String  urineroutines_glu;
		public String getUrineroutines_sg() {
			return urineroutines_sg;
		}
		public void setUrineroutines_sg(String urineroutines_sg) {
			this.urineroutines_sg = urineroutines_sg;
		}
		public String getUrineroutines_ph() {
			return urineroutines_ph;
		}
		public void setUrineroutines_ph(String urineroutines_ph) {
			this.urineroutines_ph = urineroutines_ph;
		}
		public String getUrineroutines_leu() {
			return urineroutines_leu;
		}
		public void setUrineroutines_leu(String urineroutines_leu) {
			this.urineroutines_leu = urineroutines_leu;
		}
		public String getUrineroutines_ery() {
			return urineroutines_ery;
		}
		public void setUrineroutines_ery(String urineroutines_ery) {
			this.urineroutines_ery = urineroutines_ery;
		}
		public String getUrineroutines_nit() {
			return urineroutines_nit;
		}
		public void setUrineroutines_nit(String urineroutines_nit) {
			this.urineroutines_nit = urineroutines_nit;
		}
		public String getUrineroutines_ket() {
			return urineroutines_ket;
		}
		public void setUrineroutines_ket(String urineroutines_ket) {
			this.urineroutines_ket = urineroutines_ket;
		}
		public String getUrineroutines_bil() {
			return urineroutines_bil;
		}
		public void setUrineroutines_bil(String urineroutines_bil) {
			this.urineroutines_bil = urineroutines_bil;
		}
		public String getUrineroutines_ubg() {
			return urineroutines_ubg;
		}
		public void setUrineroutines_ubg(String urineroutines_ubg) {
			this.urineroutines_ubg = urineroutines_ubg;
		}
		public String getUrineroutines_pro() {
			return urineroutines_pro;
		}
		public void setUrineroutines_pro(String urineroutines_pro) {
			this.urineroutines_pro = urineroutines_pro;
		}
		public String getUrineroutines_glu() {
			return urineroutines_glu;
		}
		public void setUrineroutines_glu(String urineroutines_glu) {
			this.urineroutines_glu = urineroutines_glu;
		}


	}

	
	/**
	 *  一般检查  GeneralInspection
	 * @author lx
	 *
	 */
	public static class  GeneralInspection {
		//身高
		private String generl_height;
		// 体重 
		private String  generl_weight;
		//体重指数 
		private String  generl_bmi;
		//体检血压(收缩压)
		private String   generl_systolic;
		//体检血压(舒张压)  
		private String  generl_diastolic;
		// 复测血压(收缩压) 
		private String  generl_systolic1;
		//复测血压(舒张压) 
		private String  generl_diastolic1;
		//  复测血压2(收缩压)  
		private String  generl_systolic2;
		//  复测血压2(舒张压)
		private String   generl_diastolic2;
		public String getGenerl_height() {
			return generl_height;
		}
		public void setGenerl_height(String generl_height) {
			this.generl_height = generl_height;
		}
		public String getGenerl_weight() {
			return generl_weight;
		}
		public void setGenerl_weight(String generl_weight) {
			this.generl_weight = generl_weight;
		}
		public String getGenerl_bmi() {
			return generl_bmi;
		}
		public void setGenerl_bmi(String generl_bmi) {
			this.generl_bmi = generl_bmi;
		}
		public String getGenerl_systolic() {
			return generl_systolic;
		}
		public void setGenerl_systolic(String generl_systolic) {
			this.generl_systolic = generl_systolic;
		}
		public String getGenerl_diastolic() {
			return generl_diastolic;
		}
		public void setGenerl_diastolic(String generl_diastolic) {
			this.generl_diastolic = generl_diastolic;
		}
		public String getGenerl_systolic1() {
			return generl_systolic1;
		}
		public void setGenerl_systolic1(String generl_systolic1) {
			this.generl_systolic1 = generl_systolic1;
		}
		public String getGenerl_diastolic1() {
			return generl_diastolic1;
		}
		public void setGenerl_diastolic1(String generl_diastolic1) {
			this.generl_diastolic1 = generl_diastolic1;
		}
		public String getGenerl_systolic2() {
			return generl_systolic2;
		}
		public void setGenerl_systolic2(String generl_systolic2) {
			this.generl_systolic2 = generl_systolic2;
		}
		public String getGenerl_diastolic2() {
			return generl_diastolic2;
		}
		public void setGenerl_diastolic2(String generl_diastolic2) {
			this.generl_diastolic2 = generl_diastolic2;
		}



	}

	/**
	 *   外科
	 * @author lx
	 *
	 */
	public static  class Surgery {
		//皮肤
		private String surgical_skin;
		// 浅表淋巴结 
		private String  surgical_superficiallymphnodes;
		//甲状腺 
		private String surgical_thyroid;
		//乳腺 
		private String   surgical_breast;
		//脊柱  
		private String  surgical_spinal;
		// 四肢与关节  
		private String   surgical_limbsandjoints;
		//外生殖器 
		private String  surgical_genitalia;
		//  肛诊  
		private String  surgical_anal;
		//  其他 
		private String  surgical_other;
		//  体检所见
		private String   surgical_finding;
		public String getSurgical_skin() {
			return surgical_skin;
		}
		public void setSurgical_skin(String surgical_skin) {
			this.surgical_skin = surgical_skin;
		}
		public String getSurgical_superficiallymphnodes() {
			return surgical_superficiallymphnodes;
		}
		public void setSurgical_superficiallymphnodes(String surgical_superficiallymphnodes) {
			this.surgical_superficiallymphnodes = surgical_superficiallymphnodes;
		}
		public String getSurgical_thyroid() {
			return surgical_thyroid;
		}
		public void setSurgical_thyroid(String surgical_thyroid) {
			this.surgical_thyroid = surgical_thyroid;
		}
		public String getSurgical_breast() {
			return surgical_breast;
		}
		public void setSurgical_breast(String surgical_breast) {
			this.surgical_breast = surgical_breast;
		}
		public String getSurgical_spinal() {
			return surgical_spinal;
		}
		public void setSurgical_spinal(String surgical_spinal) {
			this.surgical_spinal = surgical_spinal;
		}
		public String getSurgical_limbsandjoints() {
			return surgical_limbsandjoints;
		}
		public void setSurgical_limbsandjoints(String surgical_limbsandjoints) {
			this.surgical_limbsandjoints = surgical_limbsandjoints;
		}
		public String getSurgical_genitalia() {
			return surgical_genitalia;
		}
		public void setSurgical_genitalia(String surgical_genitalia) {
			this.surgical_genitalia = surgical_genitalia;
		}
		public String getSurgical_anal() {
			return surgical_anal;
		}
		public void setSurgical_anal(String surgical_anal) {
			this.surgical_anal = surgical_anal;
		}
		public String getSurgical_other() {
			return surgical_other;
		}
		public void setSurgical_other(String surgical_other) {
			this.surgical_other = surgical_other;
		}
		public String getSurgical_finding() {
			return surgical_finding;
		}
		public void setSurgical_finding(String surgical_finding) {
			this.surgical_finding = surgical_finding;
		}


	}

	

	/**
	 *   眼科 Eye
	 * @author lx
	 *
	 */
	public static class Eye {
		//右眼裸视
		private String ophthalmology_righteye;
		// 左眼裸视 
		private String  ophthalmology_lefteye;
		//右眼矫正视力
		private String ophthalmology_rightcorrected;
		//左眼矫正视力
		private String  ophthalmology_leftcorrected;
		//色觉  
		private String   ophthalmology_colorvision;
		//眼睑  
		private String   ophthalmology_eyelid;
		//泪器 
		private String  ophthalmology_lacrimal;
		//结膜   
		private String  ophthalmology_conjunctiva;
		//眼球
		private String ophthalmology_eyeball;
		//  角膜 
		private String  ophthalmology_corneal;
		//   前房
		private String  ophthalmology_anteriorchamber;
		//  虹膜
		private String   ophthalmology_iris;
		//  瞳孔 
		private String   ophthalmology_pupil;
		//   晶状体
		private String    ophthalmology_lens;
		//  玻璃体
		private String   ophthalmology_vitreum;
		//  眼底
		private String  ophthalmology_eyeground;
		//  杯盘比
		private String   ophthalmology_vcdr;
		//其他 
		private String   ophthalmology_other;
		//体检所见
		private String   ophthalmology_finding;
		public String getOphthalmology_righteye() {
			return ophthalmology_righteye;
		}
		public void setOphthalmology_righteye(String ophthalmology_righteye) {
			this.ophthalmology_righteye = ophthalmology_righteye;
		}
		public String getOphthalmology_lefteye() {
			return ophthalmology_lefteye;
		}
		public void setOphthalmology_lefteye(String ophthalmology_lefteye) {
			this.ophthalmology_lefteye = ophthalmology_lefteye;
		}
		public String getOphthalmology_rightcorrected() {
			return ophthalmology_rightcorrected;
		}
		public void setOphthalmology_rightcorrected(String ophthalmology_rightcorrected) {
			this.ophthalmology_rightcorrected = ophthalmology_rightcorrected;
		}
		public String getOphthalmology_leftcorrected() {
			return ophthalmology_leftcorrected;
		}
		public void setOphthalmology_leftcorrected(String ophthalmology_leftcorrected) {
			this.ophthalmology_leftcorrected = ophthalmology_leftcorrected;
		}
		public String getOphthalmology_colorvision() {
			return ophthalmology_colorvision;
		}
		public void setOphthalmology_colorvision(String ophthalmology_colorvision) {
			this.ophthalmology_colorvision = ophthalmology_colorvision;
		}
		public String getOphthalmology_eyelid() {
			return ophthalmology_eyelid;
		}
		public void setOphthalmology_eyelid(String ophthalmology_eyelid) {
			this.ophthalmology_eyelid = ophthalmology_eyelid;
		}
		public String getOphthalmology_lacrimal() {
			return ophthalmology_lacrimal;
		}
		public void setOphthalmology_lacrimal(String ophthalmology_lacrimal) {
			this.ophthalmology_lacrimal = ophthalmology_lacrimal;
		}
		public String getOphthalmology_conjunctiva() {
			return ophthalmology_conjunctiva;
		}
		public void setOphthalmology_conjunctiva(String ophthalmology_conjunctiva) {
			this.ophthalmology_conjunctiva = ophthalmology_conjunctiva;
		}
		public String getOphthalmology_eyeball() {
			return ophthalmology_eyeball;
		}
		public void setOphthalmology_eyeball(String ophthalmology_eyeball) {
			this.ophthalmology_eyeball = ophthalmology_eyeball;
		}
		public String getOphthalmology_corneal() {
			return ophthalmology_corneal;
		}
		public void setOphthalmology_corneal(String ophthalmology_corneal) {
			this.ophthalmology_corneal = ophthalmology_corneal;
		}
		public String getOphthalmology_anteriorchamber() {
			return ophthalmology_anteriorchamber;
		}
		public void setOphthalmology_anteriorchamber(String ophthalmology_anteriorchamber) {
			this.ophthalmology_anteriorchamber = ophthalmology_anteriorchamber;
		}
		public String getOphthalmology_iris() {
			return ophthalmology_iris;
		}
		public void setOphthalmology_iris(String ophthalmology_iris) {
			this.ophthalmology_iris = ophthalmology_iris;
		}
		public String getOphthalmology_pupil() {
			return ophthalmology_pupil;
		}
		public void setOphthalmology_pupil(String ophthalmology_pupil) {
			this.ophthalmology_pupil = ophthalmology_pupil;
		}
		public String getOphthalmology_lens() {
			return ophthalmology_lens;
		}
		public void setOphthalmology_lens(String ophthalmology_lens) {
			this.ophthalmology_lens = ophthalmology_lens;
		}
		public String getOphthalmology_vitreum() {
			return ophthalmology_vitreum;
		}
		public void setOphthalmology_vitreum(String ophthalmology_vitreum) {
			this.ophthalmology_vitreum = ophthalmology_vitreum;
		}
		public String getOphthalmology_eyeground() {
			return ophthalmology_eyeground;
		}
		public void setOphthalmology_eyeground(String ophthalmology_eyeground) {
			this.ophthalmology_eyeground = ophthalmology_eyeground;
		}
		public String getOphthalmology_vcdr() {
			return ophthalmology_vcdr;
		}
		public void setOphthalmology_vcdr(String ophthalmology_vcdr) {
			this.ophthalmology_vcdr = ophthalmology_vcdr;
		}
		public String getOphthalmology_other() {
			return ophthalmology_other;
		}
		public void setOphthalmology_other(String ophthalmology_other) {
			this.ophthalmology_other = ophthalmology_other;
		}
		public String getOphthalmology_finding() {
			return ophthalmology_finding;
		}
		public void setOphthalmology_finding(String ophthalmology_finding) {
			this.ophthalmology_finding = ophthalmology_finding;
		}




	}

	/**
	 *   耳鼻喉科  ENT
	 * @author lx
	 *
	 */
	public static class  ENT {
		//听力 
		private String otolaryngology_hearing;
		// 外耳 
		private String  otolaryngology_externalear;
		//外耳道
		private String otolaryngology_earcanal;
		//鼓膜
		private String  otolaryngology_tympanic;
		//外鼻 
		private String  otolaryngology_externalnose;
		//鼻腔
		private String  otolaryngology_nasalcavity;
		//鼻窦 
		private String   otolaryngology_paranasal;
		//咽部 
		private String  otolaryngology_pharyngeal;
		//扁桃体 
		private String otolaryngology_tonsilla;

		//其他 
		private String otolaryngology_other;
		//体检所见
		private String   otolaryngology_finding;
		public String getOtolaryngology_hearing() {
			return otolaryngology_hearing;
		}
		public void setOtolaryngology_hearing(String otolaryngology_hearing) {
			this.otolaryngology_hearing = otolaryngology_hearing;
		}
		public String getOtolaryngology_externalear() {
			return otolaryngology_externalear;
		}
		public void setOtolaryngology_externalear(String otolaryngology_externalear) {
			this.otolaryngology_externalear = otolaryngology_externalear;
		}
		public String getOtolaryngology_earcanal() {
			return otolaryngology_earcanal;
		}
		public void setOtolaryngology_earcanal(String otolaryngology_earcanal) {
			this.otolaryngology_earcanal = otolaryngology_earcanal;
		}
		public String getOtolaryngology_tympanic() {
			return otolaryngology_tympanic;
		}
		public void setOtolaryngology_tympanic(String otolaryngology_tympanic) {
			this.otolaryngology_tympanic = otolaryngology_tympanic;
		}
		public String getOtolaryngology_externalnose() {
			return otolaryngology_externalnose;
		}
		public void setOtolaryngology_externalnose(String otolaryngology_externalnose) {
			this.otolaryngology_externalnose = otolaryngology_externalnose;
		}
		public String getOtolaryngology_nasalcavity() {
			return otolaryngology_nasalcavity;
		}
		public void setOtolaryngology_nasalcavity(String otolaryngology_nasalcavity) {
			this.otolaryngology_nasalcavity = otolaryngology_nasalcavity;
		}
		public String getOtolaryngology_paranasal() {
			return otolaryngology_paranasal;
		}
		public void setOtolaryngology_paranasal(String otolaryngology_paranasal) {
			this.otolaryngology_paranasal = otolaryngology_paranasal;
		}
		public String getOtolaryngology_pharyngeal() {
			return otolaryngology_pharyngeal;
		}
		public void setOtolaryngology_pharyngeal(String otolaryngology_pharyngeal) {
			this.otolaryngology_pharyngeal = otolaryngology_pharyngeal;
		}
		public String getOtolaryngology_tonsilla() {
			return otolaryngology_tonsilla;
		}
		public void setOtolaryngology_tonsilla(String otolaryngology_tonsilla) {
			this.otolaryngology_tonsilla = otolaryngology_tonsilla;
		}
		public String getOtolaryngology_other() {
			return otolaryngology_other;
		}
		public void setOtolaryngology_other(String otolaryngology_other) {
			this.otolaryngology_other = otolaryngology_other;
		}
		public String getOtolaryngology_finding() {
			return otolaryngology_finding;
		}
		public void setOtolaryngology_finding(String otolaryngology_finding) {
			this.otolaryngology_finding = otolaryngology_finding;
		}
		

	}

	/**
	 *   口腔科
	 * @author lx
	 *
	 */
	public static  class  Stomatology {

		//唇
		private String stomatology_lip;
		// 口腔粘膜 
		private String   stomatology_buccalmucosa;
		//牙周
		private String stomatology_periodontal;
		//齿
		private String stomatology_stomatology_tooth;
		//舌
		private String   stomatology_tongue;
		//腭 
		private String   stomatology_palate;
		//腮腺  
		private String    stomatology_parotid;
		//颞下颌关节 
		private String   stomatology_tmj;
		//其他 
		private String  stomatology_other;
		//体检所见
		private String    stomatology_finding;
		public String getStomatology_lip() {
			return stomatology_lip;
		}
		public void setStomatology_lip(String stomatology_lip) {
			this.stomatology_lip = stomatology_lip;
		}
		public String getStomatology_buccalmucosa() {
			return stomatology_buccalmucosa;
		}
		public void setStomatology_buccalmucosa(String stomatology_buccalmucosa) {
			this.stomatology_buccalmucosa = stomatology_buccalmucosa;
		}
		public String getStomatology_periodontal() {
			return stomatology_periodontal;
		}
		public void setStomatology_periodontal(String stomatology_periodontal) {
			this.stomatology_periodontal = stomatology_periodontal;
		}
		public String getStomatology_stomatology_tooth() {
			return stomatology_stomatology_tooth;
		}
		public void setStomatology_stomatology_tooth(String stomatology_stomatology_tooth) {
			this.stomatology_stomatology_tooth = stomatology_stomatology_tooth;
		}
		public String getStomatology_tongue() {
			return stomatology_tongue;
		}
		public void setStomatology_tongue(String stomatology_tongue) {
			this.stomatology_tongue = stomatology_tongue;
		}
		public String getStomatology_palate() {
			return stomatology_palate;
		}
		public void setStomatology_palate(String stomatology_palate) {
			this.stomatology_palate = stomatology_palate;
		}
		public String getStomatology_parotid() {
			return stomatology_parotid;
		}
		public void setStomatology_parotid(String stomatology_parotid) {
			this.stomatology_parotid = stomatology_parotid;
		}
		public String getStomatology_tmj() {
			return stomatology_tmj;
		}
		public void setStomatology_tmj(String stomatology_tmj) {
			this.stomatology_tmj = stomatology_tmj;
		}
		public String getStomatology_other() {
			return stomatology_other;
		}
		public void setStomatology_other(String stomatology_other) {
			this.stomatology_other = stomatology_other;
		}
		public String getStomatology_finding() {
			return stomatology_finding;
		}
		public void setStomatology_finding(String stomatology_finding) {
			this.stomatology_finding = stomatology_finding;
		}
		
		
		
		
	}	
}
