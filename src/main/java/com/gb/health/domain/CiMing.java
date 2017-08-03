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
	private String  Women_vaginalDischarge;
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
	public String getWomen_vaginalDischarge() {
		return Women_vaginalDischarge;
	}
	public void setWomen_vaginalDischarge(String women_vaginalDischarge) {
		Women_vaginalDischarge = women_vaginalDischarge;
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
		private String thyroid_t3_unit;
		private String thyroid_t3_scope;

		// 甲状腺素（T4）电发光
		private String thyroid_t4;
		private String thyroid_t4_unit;
		private String thyroid_t4_scope;

		// 促甲状腺素（TSH）电发光
		private String thyroid_tsh;
		private String thyroid_tsh_unit;
		private String thyroid_tsh_scope;

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

		public String getThyroid_t3_unit() {
			return thyroid_t3_unit;
		}

		public void setThyroid_t3_unit(String thyroid_t3_unit) {
			this.thyroid_t3_unit = thyroid_t3_unit;
		}

		public String getThyroid_t3_scope() {
			return thyroid_t3_scope;
		}

		public void setThyroid_t3_scope(String thyroid_t3_scope) {
			this.thyroid_t3_scope = thyroid_t3_scope;
		}

		public String getThyroid_t4_unit() {
			return thyroid_t4_unit;
		}

		public void setThyroid_t4_unit(String thyroid_t4_unit) {
			this.thyroid_t4_unit = thyroid_t4_unit;
		}

		public String getThyroid_t4_scope() {
			return thyroid_t4_scope;
		}

		public void setThyroid_t4_scope(String thyroid_t4_scope) {
			this.thyroid_t4_scope = thyroid_t4_scope;
		}

		public String getThyroid_tsh_unit() {
			return thyroid_tsh_unit;
		}

		public void setThyroid_tsh_unit(String thyroid_tsh_unit) {
			this.thyroid_tsh_unit = thyroid_tsh_unit;
		}

		public String getThyroid_tsh_scope() {
			return thyroid_tsh_scope;
		}

		public void setThyroid_tsh_scope(String thyroid_tsh_scope) {
			this.thyroid_tsh_scope = thyroid_tsh_scope;
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
		private String bloodroutine_erythrocytes_unit;
		private String bloodroutine_erythrocytes_scope;
		// 血红蛋白(HGB)  
		private String bloodroutine_hb;
		private String bloodroutine_hb_unit;
		private String bloodroutine_hb_scope;
		// 红细胞压积(HCT) 
		private String  bloodroutine_hct;
		private String  bloodroutine_hct_unit;
		private String bloodroutine_hct_scope;
		// 平均红细胞体积（MCV）
		private String  bloodroutine_mcv;
		private String bloodroutine_mcv_unit;
		private String bloodroutine_mcv_scope;
		
		//  平均红细胞血红蛋白含量（MCH） 
		private String   bloodroutine_mch;
		private String bloodroutine_mch_unit;
		private String bloodroutine_mch_scope;
		// 平均红细胞血红蛋白浓度（MCHC)
		private String  bloodroutine_mchc;
		private String bloodroutine_mchc_unit;
		private String bloodroutine_mchc_scope;
		//   红细胞体积分布宽度变异系数（RDW-CV）
		private String  bloodroutine_rdwcv;
		private String  bloodroutine_rdwcv_unit;
		private String  bloodroutine_rdwcv_scope;
		//   红细胞体积分布宽度标准差（RDW-SD）
		private String   bloodroutine_rdwsd;
		private String   bloodroutine_rdwsd_unit;
		private String   bloodroutine_rdwsd_scope;
		// 白细胞计数（WBC）
		private String  bloodroutine_wbc;
		private String  bloodroutine_wbc_unit;
		private String  bloodroutine_wbc_scope;
		// 中性粒细胞比值（GRA）
		private String  bloodroutine_nuet;
		private String  bloodroutine_nuet_unit;
		private String  bloodroutine_nuet_scope;
		//中性粒细胞绝对值（GRA#）
		private String   bloodroutine_gra;
		private String   bloodroutine_gra_unit;
		private String   bloodroutine_gra_scope;
		// 淋巴细胞比值（LYM）
		private String  bloodroutine_nlr;
		private String  bloodroutine_nlr_unit;
		private String  bloodroutine_nlr_scope;
		//  淋巴细胞绝对值（LYM#）
		private String  bloodroutine_lym;
		private String  bloodroutine_lym_unit;
		private String  bloodroutine_lym_scope;
		//单核细胞比值（MONO）
		private String bloodroutine_monor;
		private String bloodroutine_monor_unit;
		private String bloodroutine_monor_scope;
		//  单核细胞绝对值(MONO#)
		private String  bloodroutine_mono;
		private String  bloodroutine_mono_unit;
		private String  bloodroutine_mono_scope;
		// 嗜酸性粒细胞比值（EO）
		private String  bloodroutine_eor;
		private String  bloodroutine_eor_unit;
		private String  bloodroutine_eor_scope;
		//嗜酸性粒细胞绝对值(EO#)
		private String  bloodroutine_eo;
		private String  bloodroutine_eo_unit;
		private String  bloodroutine_eo_scope;
		// 嗜碱性粒细胞比值（BASO） 
		private String  bloodroutine_basor;
		private String  bloodroutine_basor_unit;
		private String  bloodroutine_basor_scope;
		// 嗜碱性粒细胞绝对值(BASO#)
		private String   bloodroutine_baso;
		private String   bloodroutine_baso_unit;
		private String   bloodroutine_baso_scope;
		// 血小板(PLT) 
		private String bloodroutine_platelet;
		private String bloodroutine_platelet_unit;
		private String bloodroutine_platelet_scope;
		// 平均血小板体积（MPV） 
		private String  bloodroutine_mpv;
		private String  bloodroutine_mpv_unit;
		private String  bloodroutine_mpv_scope;
		//  血小板容积分布宽度（PDW）
		private String   bloodroutine_pdw;
		private String   bloodroutine_pdw_unit;
		private String   bloodroutine_pdw_scope;
		// 大血小板比率（P-LCR）
		private String  bloodroutine_plcr;
		private String  bloodroutine_plcr_unit;
		private String  bloodroutine_plcr_scope;
		// 血小板比容（PCT) 
		private String  bloodroutine_thrombocytocrit;
		private String bloodroutine_thrombocytocrit_unit;
		private String bloodroutine_thrombocytocrit_scope;
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
		public String getBloodroutine_erythrocytes_unit() {
			return bloodroutine_erythrocytes_unit;
		}
		public void setBloodroutine_erythrocytes_unit(String bloodroutine_erythrocytes_unit) {
			this.bloodroutine_erythrocytes_unit = bloodroutine_erythrocytes_unit;
		}
		public String getBloodroutine_erythrocytes_scope() {
			return bloodroutine_erythrocytes_scope;
		}
		public void setBloodroutine_erythrocytes_scope(String bloodroutine_erythrocytes_scope) {
			this.bloodroutine_erythrocytes_scope = bloodroutine_erythrocytes_scope;
		}
		public String getBloodroutine_hb_unit() {
			return bloodroutine_hb_unit;
		}
		public void setBloodroutine_hb_unit(String bloodroutine_hb_unit) {
			this.bloodroutine_hb_unit = bloodroutine_hb_unit;
		}
		public String getBloodroutine_hb_scope() {
			return bloodroutine_hb_scope;
		}
		public void setBloodroutine_hb_scope(String bloodroutine_hb_scope) {
			this.bloodroutine_hb_scope = bloodroutine_hb_scope;
		}
		public String getBloodroutine_hct_unit() {
			return bloodroutine_hct_unit;
		}
		public void setBloodroutine_hct_unit(String bloodroutine_hct_unit) {
			this.bloodroutine_hct_unit = bloodroutine_hct_unit;
		}
		public String getBloodroutine_hct_scope() {
			return bloodroutine_hct_scope;
		}
		public void setBloodroutine_hct_scope(String bloodroutine_hct_scope) {
			this.bloodroutine_hct_scope = bloodroutine_hct_scope;
		}
		public String getBloodroutine_mcv_unit() {
			return bloodroutine_mcv_unit;
		}
		public void setBloodroutine_mcv_unit(String bloodroutine_mcv_unit) {
			this.bloodroutine_mcv_unit = bloodroutine_mcv_unit;
		}
		public String getBloodroutine_mcv_scope() {
			return bloodroutine_mcv_scope;
		}
		public void setBloodroutine_mcv_scope(String bloodroutine_mcv_scope) {
			this.bloodroutine_mcv_scope = bloodroutine_mcv_scope;
		}
		public String getBloodroutine_mch_unit() {
			return bloodroutine_mch_unit;
		}
		public void setBloodroutine_mch_unit(String bloodroutine_mch_unit) {
			this.bloodroutine_mch_unit = bloodroutine_mch_unit;
		}
		public String getBloodroutine_mch_scope() {
			return bloodroutine_mch_scope;
		}
		public void setBloodroutine_mch_scope(String bloodroutine_mch_scope) {
			this.bloodroutine_mch_scope = bloodroutine_mch_scope;
		}
		public String getBloodroutine_mchc_unit() {
			return bloodroutine_mchc_unit;
		}
		public void setBloodroutine_mchc_unit(String bloodroutine_mchc_unit) {
			this.bloodroutine_mchc_unit = bloodroutine_mchc_unit;
		}
		public String getBloodroutine_mchc_scope() {
			return bloodroutine_mchc_scope;
		}
		public void setBloodroutine_mchc_scope(String bloodroutine_mchc_scope) {
			this.bloodroutine_mchc_scope = bloodroutine_mchc_scope;
		}
		public String getBloodroutine_rdwcv_unit() {
			return bloodroutine_rdwcv_unit;
		}
		public void setBloodroutine_rdwcv_unit(String bloodroutine_rdwcv_unit) {
			this.bloodroutine_rdwcv_unit = bloodroutine_rdwcv_unit;
		}
		public String getBloodroutine_rdwcv_scope() {
			return bloodroutine_rdwcv_scope;
		}
		public void setBloodroutine_rdwcv_scope(String bloodroutine_rdwcv_scope) {
			this.bloodroutine_rdwcv_scope = bloodroutine_rdwcv_scope;
		}
		public String getBloodroutine_rdwsd_unit() {
			return bloodroutine_rdwsd_unit;
		}
		public void setBloodroutine_rdwsd_unit(String bloodroutine_rdwsd_unit) {
			this.bloodroutine_rdwsd_unit = bloodroutine_rdwsd_unit;
		}
		public String getBloodroutine_rdwsd_scope() {
			return bloodroutine_rdwsd_scope;
		}
		public void setBloodroutine_rdwsd_scope(String bloodroutine_rdwsd_scope) {
			this.bloodroutine_rdwsd_scope = bloodroutine_rdwsd_scope;
		}
		public String getBloodroutine_wbc_unit() {
			return bloodroutine_wbc_unit;
		}
		public void setBloodroutine_wbc_unit(String bloodroutine_wbc_unit) {
			this.bloodroutine_wbc_unit = bloodroutine_wbc_unit;
		}
		public String getBloodroutine_wbc_scope() {
			return bloodroutine_wbc_scope;
		}
		public void setBloodroutine_wbc_scope(String bloodroutine_wbc_scope) {
			this.bloodroutine_wbc_scope = bloodroutine_wbc_scope;
		}
		public String getBloodroutine_nuet_scope() {
			return bloodroutine_nuet_scope;
		}
		public void setBloodroutine_nuet_scope(String bloodroutine_nuet_scope) {
			this.bloodroutine_nuet_scope = bloodroutine_nuet_scope;
		}
		public String getBloodroutine_gra_unit() {
			return bloodroutine_gra_unit;
		}
		public void setBloodroutine_gra_unit(String bloodroutine_gra_unit) {
			this.bloodroutine_gra_unit = bloodroutine_gra_unit;
		}
		public String getBloodroutine_gra_scope() {
			return bloodroutine_gra_scope;
		}
		public void setBloodroutine_gra_scope(String bloodroutine_gra_scope) {
			this.bloodroutine_gra_scope = bloodroutine_gra_scope;
		}
		public String getBloodroutine_nlr_unit() {
			return bloodroutine_nlr_unit;
		}
		public void setBloodroutine_nlr_unit(String bloodroutine_nlr_unit) {
			this.bloodroutine_nlr_unit = bloodroutine_nlr_unit;
		}
		public String getBloodroutine_nlr_scope() {
			return bloodroutine_nlr_scope;
		}
		public void setBloodroutine_nlr_scope(String bloodroutine_nlr_scope) {
			this.bloodroutine_nlr_scope = bloodroutine_nlr_scope;
		}
		public String getBloodroutine_lym_unit() {
			return bloodroutine_lym_unit;
		}
		public void setBloodroutine_lym_unit(String bloodroutine_lym_unit) {
			this.bloodroutine_lym_unit = bloodroutine_lym_unit;
		}
		public String getBloodroutine_lym_scope() {
			return bloodroutine_lym_scope;
		}
		public void setBloodroutine_lym_scope(String bloodroutine_lym_scope) {
			this.bloodroutine_lym_scope = bloodroutine_lym_scope;
		}
		public String getBloodroutine_monor_unit() {
			return bloodroutine_monor_unit;
		}
		public void setBloodroutine_monor_unit(String bloodroutine_monor_unit) {
			this.bloodroutine_monor_unit = bloodroutine_monor_unit;
		}
		public String getBloodroutine_monor_scope() {
			return bloodroutine_monor_scope;
		}
		public void setBloodroutine_monor_scope(String bloodroutine_monor_scope) {
			this.bloodroutine_monor_scope = bloodroutine_monor_scope;
		}
		public String getBloodroutine_mono_unit() {
			return bloodroutine_mono_unit;
		}
		public void setBloodroutine_mono_unit(String bloodroutine_mono_unit) {
			this.bloodroutine_mono_unit = bloodroutine_mono_unit;
		}
		public String getBloodroutine_mono_scope() {
			return bloodroutine_mono_scope;
		}
		public void setBloodroutine_mono_scope(String bloodroutine_mono_scope) {
			this.bloodroutine_mono_scope = bloodroutine_mono_scope;
		}
		public String getBloodroutine_eor_unit() {
			return bloodroutine_eor_unit;
		}
		public void setBloodroutine_eor_unit(String bloodroutine_eor_unit) {
			this.bloodroutine_eor_unit = bloodroutine_eor_unit;
		}
		public String getBloodroutine_eor_scope() {
			return bloodroutine_eor_scope;
		}
		public void setBloodroutine_eor_scope(String bloodroutine_eor_scope) {
			this.bloodroutine_eor_scope = bloodroutine_eor_scope;
		}
		public String getBloodroutine_eo_unit() {
			return bloodroutine_eo_unit;
		}
		public void setBloodroutine_eo_unit(String bloodroutine_eo_unit) {
			this.bloodroutine_eo_unit = bloodroutine_eo_unit;
		}
		public String getBloodroutine_eo_scope() {
			return bloodroutine_eo_scope;
		}
		public void setBloodroutine_eo_scope(String bloodroutine_eo_scope) {
			this.bloodroutine_eo_scope = bloodroutine_eo_scope;
		}
		public String getBloodroutine_basor_unit() {
			return bloodroutine_basor_unit;
		}
		public void setBloodroutine_basor_unit(String bloodroutine_basor_unit) {
			this.bloodroutine_basor_unit = bloodroutine_basor_unit;
		}
		public String getBloodroutine_basor_scope() {
			return bloodroutine_basor_scope;
		}
		public void setBloodroutine_basor_scope(String bloodroutine_basor_scope) {
			this.bloodroutine_basor_scope = bloodroutine_basor_scope;
		}
		public String getBloodroutine_baso_unit() {
			return bloodroutine_baso_unit;
		}
		public void setBloodroutine_baso_unit(String bloodroutine_baso_unit) {
			this.bloodroutine_baso_unit = bloodroutine_baso_unit;
		}
		public String getBloodroutine_baso_scope() {
			return bloodroutine_baso_scope;
		}
		public void setBloodroutine_baso_scope(String bloodroutine_baso_scope) {
			this.bloodroutine_baso_scope = bloodroutine_baso_scope;
		}
		public String getBloodroutine_platelet_unit() {
			return bloodroutine_platelet_unit;
		}
		public void setBloodroutine_platelet_unit(String bloodroutine_platelet_unit) {
			this.bloodroutine_platelet_unit = bloodroutine_platelet_unit;
		}
		public String getBloodroutine_platelet_scope() {
			return bloodroutine_platelet_scope; 
		}
		public void setBloodroutine_platelet_scope(String bloodroutine_platelet_scope) {
			this.bloodroutine_platelet_scope = bloodroutine_platelet_scope;
		}
		public String getBloodroutine_mpv_unit() {
			return bloodroutine_mpv_unit;
		}
		public void setBloodroutine_mpv_unit(String bloodroutine_mpv_unit) {
			this.bloodroutine_mpv_unit = bloodroutine_mpv_unit;
		}
		public String getBloodroutine_mpv_scope() {
			return bloodroutine_mpv_scope;
		}
		public void setBloodroutine_mpv_scope(String bloodroutine_mpv_scope) {
			this.bloodroutine_mpv_scope = bloodroutine_mpv_scope;
		}
		public String getBloodroutine_pdw_unit() {
			return bloodroutine_pdw_unit;
		}
		public void setBloodroutine_pdw_unit(String bloodroutine_pdw_unit) {
			this.bloodroutine_pdw_unit = bloodroutine_pdw_unit;
		}
		public String getBloodroutine_pdw_scope() {
			return bloodroutine_pdw_scope;
		}
		public void setBloodroutine_pdw_scope(String bloodroutine_pdw_scope) {
			this.bloodroutine_pdw_scope = bloodroutine_pdw_scope;
		}
		public String getBloodroutine_plcr_unit() {
			return bloodroutine_plcr_unit;
		}
		public void setBloodroutine_plcr_unit(String bloodroutine_plcr_unit) {
			this.bloodroutine_plcr_unit = bloodroutine_plcr_unit;
		}
		public String getBloodroutine_plcr_scope() {
			return bloodroutine_plcr_scope;
		}
		public void setBloodroutine_plcr_scope(String bloodroutine_plcr_scope) {
			this.bloodroutine_plcr_scope = bloodroutine_plcr_scope;
		}
		public String getBloodroutine_nuet_unit() {
			return bloodroutine_nuet_unit;
		}
		public void setBloodroutine_nuet_unit(String bloodroutine_nuet_unit) {
			this.bloodroutine_nuet_unit = bloodroutine_nuet_unit;
		}
		public String getBloodroutine_thrombocytocrit_unit() {
			return bloodroutine_thrombocytocrit_unit;
		}
		public void setBloodroutine_thrombocytocrit_unit(String bloodroutine_thrombocytocrit_unit) {
			this.bloodroutine_thrombocytocrit_unit = bloodroutine_thrombocytocrit_unit;
		}
		public String getBloodroutine_thrombocytocrit_scope() {
			return bloodroutine_thrombocytocrit_scope;
		}
		public void setBloodroutine_thrombocytocrit_scope(String bloodroutine_thrombocytocrit_scope) {
			this.bloodroutine_thrombocytocrit_scope = bloodroutine_thrombocytocrit_scope;
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
		private String biochemical_alt_unit;
		private String biochemical_alt_scope;
		
		//天门冬氨酸氨基转移酶（AST） biochemical_ast
		
		private String biochemical_ast;
		private String biochemical_ast_unit;
		private String biochemical_ast_scope;
		// γ-谷氨酰转移酶（GGT ) 
		private String biochemical_ggt;
		private String biochemical_ggt_unit;
		private String biochemical_ggt_scope;
		
		//碱性磷酸酶(ALP)   biochemical_alp
		private String  biochemical_alp;
		private String  biochemical_alp_unit;
		private String  biochemical_alp_scope;
		// 乳酸脱氢酶（LDH）  biochemical_ldh
		
		private String  biochemical_ldh;
		private String  biochemical_ldh_unit;
		private String  biochemical_ldh_scope;
	    //血清总胆汁酸（TBA） biochemical_tba
		private String  biochemical_tba;
		private String  biochemical_tba_unit;
		private String  biochemical_tba_scope;
	    //  肌酸激酶（CK）  biochemical_ck
		private String  biochemical_ck;
		private String  biochemical_ck_unit;
		private String  biochemical_ck_scope;
		//肌酸激酶同工酶（CK-MB） biochemical_ck-mb
		private String  biochemical_ck_mb;
		private String  biochemical_ck_mb_unit;
		private String  biochemical_ck_mb_scope;
		//α-羟丁酸脱氢酶（α-HBDH）  biochemical_α-hbdh
		private String  biochemical_α_hbdh;
		private String  biochemical_α_hbdh_unit;
		private String  biochemical_α_hbdh_scope;
		//总蛋白（TP）  biochemical_tp
		private String  biochemical_tp;
		private String  biochemical_tp_unit;
		private String  biochemical_tp_scope;
		//白蛋白（ALB） biochemical_alb
		private String  biochemical_alb;
		private String  biochemical_alb_unit;
		private String  biochemical_alb_scope;
		//球蛋白（GLB） biochemical_glb
		private String  biochemical_glb;	
		private String  biochemical_glb_unit;
		private String  biochemical_glb_scope;
		//白蛋白/球蛋白（A/G）  biochemical_a/g
		private String   biochemical_ag;
		private String   biochemical_ag_unit;
		private String   biochemical_ag_scope;
		
		// 总胆红素（T-BIL） biochemical_t-bil
		private String biochemical_t_bil;
		private String biochemical_t_bil_unit;
		private String biochemical_t_bil_scope;
		//间接胆红素（IBIL）biochemical_ibil
		private String  biochemical_ibil;
		private String  biochemical_ibil_unit;
		private String  biochemical_ibil_scope;
		// 直接胆红素（DBIL）biochemical_dbil
		private String  biochemical_dbil;
		private String biochemical_dbil_unit;
		private String biochemical_dbil_scope;
		//
		
		//  总胆固醇（TC） 
		private String  biochemical_tc;
		private String biochemical_tc_unit;
		private String biochemical_tc_scope;
		//  甘油三酯（TG）
		private String  biochemical_tg;
		private String biochemical_tg_unit;
		private String biochemical_tg_scope;
		// 高密度脂蛋白胆固醇（HDL-CHO）
		private String   biochemical_hdl_cho;
		private String biochemical_hdl_cho_unit;
		private String biochemical_hdl_cho_scope;
		// 低密度脂蛋白胆固醇（LDL-CHO）
		private String  biochemical_ldl_cho;
		private String biochemical_ldl_cho_unit;

		public String getBiochemical_hdl_cho_unit() {
			return biochemical_hdl_cho_unit;
		}

		public void setBiochemical_hdl_cho_unit(String biochemical_hdl_cho_unit) {
			this.biochemical_hdl_cho_unit = biochemical_hdl_cho_unit;
		}

		public String getBiochemical_hdl_cho_scope() {
			return biochemical_hdl_cho_scope;
		}

		public void setBiochemical_hdl_cho_scope(String biochemical_hdl_cho_scope) {
			this.biochemical_hdl_cho_scope = biochemical_hdl_cho_scope;
		}

		private String biochemical_ldl_cho_scope;
		//   尿素（Urea） 
		private String   biochemical_urea;
		private String biochemical_urea_unit;
		private String biochemical_urea_scope;
		//    肌酐（Cr）
		private String  biochemical_cr;
		private String biochemical_cr_unit;
		private String biochemical_cr_scope;
		// 尿酸（UA）
		private String  biochemical_ua;
		private String biochemical_ua_unit;
		private String biochemical_ua_scope;
		// 空腹血糖（FPG） 
		private String  biochemical_fpg;
		private String biochemical_fpg_unit;
		private String  biochemical_fpg_scope;
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
		public String getBiochemical_alt_unit() {
			return biochemical_alt_unit;
		}
		public void setBiochemical_alt_unit(String biochemical_alt_unit) {
			this.biochemical_alt_unit = biochemical_alt_unit;
		}
		public String getBiochemical_alt_scope() {
			return biochemical_alt_scope;
		}
		public void setBiochemical_alt_scope(String biochemical_alt_scope) {
			this.biochemical_alt_scope = biochemical_alt_scope;
		}
		public String getBiochemical_ast_unit() {
			return biochemical_ast_unit;
		}
		public void setBiochemical_ast_unit(String biochemical_ast_unit) {
			this.biochemical_ast_unit = biochemical_ast_unit;
		}
		public String getBiochemical_ast_scope() {
			return biochemical_ast_scope;
		}
		public void setBiochemical_ast_scope(String biochemical_ast_scope) {
			this.biochemical_ast_scope = biochemical_ast_scope;
		}
		public String getBiochemical_ggt_unit() {
			return biochemical_ggt_unit;
		}
		public void setBiochemical_ggt_unit(String biochemical_ggt_unit) {
			this.biochemical_ggt_unit = biochemical_ggt_unit;
		}
		public String getBiochemical_ggt_scope() {
			return biochemical_ggt_scope;
		}
		public void setBiochemical_ggt_scope(String biochemical_ggt_scope) {
			this.biochemical_ggt_scope = biochemical_ggt_scope;
		}
		public String getBiochemical_alp_unit() {
			return biochemical_alp_unit;
		}
		public void setBiochemical_alp_unit(String biochemical_alp_unit) {
			this.biochemical_alp_unit = biochemical_alp_unit;
		}
		public String getBiochemical_alp_scope() {
			return biochemical_alp_scope;
		}
		public void setBiochemical_alp_scope(String biochemical_alp_scope) {
			this.biochemical_alp_scope = biochemical_alp_scope;
		}
		public String getBiochemical_ldh_unit() {
			return biochemical_ldh_unit;
		}
		public void setBiochemical_ldh_unit(String biochemical_ldh_unit) {
			this.biochemical_ldh_unit = biochemical_ldh_unit;
		}
		public String getBiochemical_ldh_scope() {
			return biochemical_ldh_scope;
		}
		public void setBiochemical_ldh_scope(String biochemical_ldh_scope) {
			this.biochemical_ldh_scope = biochemical_ldh_scope;
		}
		public String getBiochemical_tba_unit() {
			return biochemical_tba_unit;
		}
		public void setBiochemical_tba_unit(String biochemical_tba_unit) {
			this.biochemical_tba_unit = biochemical_tba_unit;
		}
		public String getBiochemical_tba_scope() {
			return biochemical_tba_scope;
		}
		public void setBiochemical_tba_scope(String biochemical_tba_scope) {
			this.biochemical_tba_scope = biochemical_tba_scope;
		}
		public String getBiochemical_ck_unit() {
			return biochemical_ck_unit;
		}
		public void setBiochemical_ck_unit(String biochemical_ck_unit) {
			this.biochemical_ck_unit = biochemical_ck_unit;
		}
		public String getBiochemical_ck_scope() {
			return biochemical_ck_scope;
		}
		public void setBiochemical_ck_scope(String biochemical_ck_scope) {
			this.biochemical_ck_scope = biochemical_ck_scope;
		}
		public String getBiochemical_ck_mb_unit() {
			return biochemical_ck_mb_unit;
		}
		public void setBiochemical_ck_mb_unit(String biochemical_ck_mb_unit) {
			this.biochemical_ck_mb_unit = biochemical_ck_mb_unit;
		}
		public String getBiochemical_ck_mb_scope() {
			return biochemical_ck_mb_scope;
		}
		public void setBiochemical_ck_mb_scope(String biochemical_ck_mb_scope) {
			this.biochemical_ck_mb_scope = biochemical_ck_mb_scope;
		}
		public String getBiochemical_α_hbdh_unit() {
			return biochemical_α_hbdh_unit;
		}
		public void setBiochemical_α_hbdh_unit(String biochemical_α_hbdh_unit) {
			this.biochemical_α_hbdh_unit = biochemical_α_hbdh_unit;
		}
		public String getBiochemical_α_hbdh_scope() {
			return biochemical_α_hbdh_scope;
		}
		public void setBiochemical_α_hbdh_scope(String biochemical_α_hbdh_scope) {
			this.biochemical_α_hbdh_scope = biochemical_α_hbdh_scope;
		}
		public String getBiochemical_tp_unit() {
			return biochemical_tp_unit;
		}
		public void setBiochemical_tp_unit(String biochemical_tp_unit) {
			this.biochemical_tp_unit = biochemical_tp_unit;
		}
		public String getBiochemical_tp_scope() {
			return biochemical_tp_scope;
		}
		public void setBiochemical_tp_scope(String biochemical_tp_scope) {
			this.biochemical_tp_scope = biochemical_tp_scope;
		}
		public String getBiochemical_alb_unit() {
			return biochemical_alb_unit;
		}
		public void setBiochemical_alb_unit(String biochemical_alb_unit) {
			this.biochemical_alb_unit = biochemical_alb_unit;
		}
		public String getBiochemical_alb_scope() {
			return biochemical_alb_scope;
		}
		public void setBiochemical_alb_scope(String biochemical_alb_scope) {
			this.biochemical_alb_scope = biochemical_alb_scope;
		}
		public String getBiochemical_glb_unit() {
			return biochemical_glb_unit;
		}
		public void setBiochemical_glb_unit(String biochemical_glb_unit) {
			this.biochemical_glb_unit = biochemical_glb_unit;
		}
		public String getBiochemical_glb_scope() {
			return biochemical_glb_scope;
		}
		public void setBiochemical_glb_scope(String biochemical_glb_scope) {
			this.biochemical_glb_scope = biochemical_glb_scope;
		}
		public String getBiochemical_ag_unit() {
			return biochemical_ag_unit;
		}
		public void setBiochemical_ag_unit(String biochemical_ag_unit) {
			this.biochemical_ag_unit = biochemical_ag_unit;
		}
		public String getBiochemical_ag_scope() {
			return biochemical_ag_scope;
		}
		public void setBiochemical_ag_scope(String biochemical_ag_scope) {
			this.biochemical_ag_scope = biochemical_ag_scope;
		}
		public String getBiochemical_t_bil_unit() {
			return biochemical_t_bil_unit;
		}
		public void setBiochemical_t_bil_unit(String biochemical_t_bil_unit) {
			this.biochemical_t_bil_unit = biochemical_t_bil_unit;
		}
		public String getBiochemical_t_bil_scope() {
			return biochemical_t_bil_scope;
		}
		public void setBiochemical_t_bil_scope(String biochemical_t_bil_scope) {
			this.biochemical_t_bil_scope = biochemical_t_bil_scope;
		}
		public String getBiochemical_ibil_unit() {
			return biochemical_ibil_unit;
		}
		public void setBiochemical_ibil_unit(String biochemical_ibil_unit) {
			this.biochemical_ibil_unit = biochemical_ibil_unit;
		}
		public String getBiochemical_ibil_scope() {
			return biochemical_ibil_scope;
		}
		public void setBiochemical_ibil_scope(String biochemical_ibil_scope) {
			this.biochemical_ibil_scope = biochemical_ibil_scope;
		}
		public String getBiochemical_dbil_unit() {
			return biochemical_dbil_unit;
		}
		public void setBiochemical_dbil_unit(String biochemical_dbil_unit) {
			this.biochemical_dbil_unit = biochemical_dbil_unit;
		}
		public String getBiochemical_dbil_scope() {
			return biochemical_dbil_scope;
		}
		public void setBiochemical_dbil_scope(String biochemical_dbil_scope) {
			this.biochemical_dbil_scope = biochemical_dbil_scope;
		}
		public String getBiochemical_tc_unit() {
			return biochemical_tc_unit;
		}
		public void setBiochemical_tc_unit(String biochemical_tc_unit) {
			this.biochemical_tc_unit = biochemical_tc_unit;
		}
		public String getBiochemical_tc_scope() {
			return biochemical_tc_scope;
		}
		public void setBiochemical_tc_scope(String biochemical_tc_scope) {
			this.biochemical_tc_scope = biochemical_tc_scope;
		}
		public String getBiochemical_tg_unit() {
			return biochemical_tg_unit;
		}
		public void setBiochemical_tg_unit(String biochemical_tg_unit) {
			this.biochemical_tg_unit = biochemical_tg_unit;
		}
		public String getBiochemical_tg_scope() {
			return biochemical_tg_scope;
		}
		public void setBiochemical_tg_scope(String biochemical_tg_scope) {
			this.biochemical_tg_scope = biochemical_tg_scope;
		}
		public String getBiochemical_ldl_cho_unit() {
			return biochemical_ldl_cho_unit;
		}
		public void setBiochemical_ldl_cho_unit(String biochemical_ldl_cho_unit) {
			this.biochemical_ldl_cho_unit = biochemical_ldl_cho_unit;
		}
		public String getBiochemical_ldl_cho_scope() {
			return biochemical_ldl_cho_scope;
		}
		public void setBiochemical_ldl_cho_scope(String biochemical_ldl_cho_scope) {
			this.biochemical_ldl_cho_scope = biochemical_ldl_cho_scope;
		}
		public String getBiochemical_urea_unit() {
			return biochemical_urea_unit;
		}
		public void setBiochemical_urea_unit(String biochemical_urea_unit) {
			this.biochemical_urea_unit = biochemical_urea_unit;
		}
		public String getBiochemical_urea_scope() {
			return biochemical_urea_scope;
		}
		public void setBiochemical_urea_scope(String biochemical_urea_scope) {
			this.biochemical_urea_scope = biochemical_urea_scope;
		}
		public String getBiochemical_cr_unit() {
			return biochemical_cr_unit;
		}
		public void setBiochemical_cr_unit(String biochemical_cr_unit) {
			this.biochemical_cr_unit = biochemical_cr_unit;
		}
		public String getBiochemical_cr_scope() {
			return biochemical_cr_scope;
		}
		public void setBiochemical_cr_scope(String biochemical_cr_scope) {
			this.biochemical_cr_scope = biochemical_cr_scope;
		}

		public String getBiochemical_ua_scope() {
			return biochemical_ua_scope;
		}
		public void setBiochemical_ua_scope(String biochemical_ua_scope) {
			this.biochemical_ua_scope = biochemical_ua_scope;
		}
		public String getBiochemical_fpg_unit() {
			return biochemical_fpg_unit;
		}
		public void setBiochemical_fpg_unit(String biochemical_fpg_unit) {
			this.biochemical_fpg_unit = biochemical_fpg_unit;
		}
		public String getBiochemical_fpg_scope() {
			return biochemical_fpg_scope;
		}
		public void setBiochemical_fpg_scope(String biochemical_fpg_scope) {
			this.biochemical_fpg_scope = biochemical_fpg_scope;
		}
		public String getBiochemical_ua_unit() {
			return biochemical_ua_unit;
		}
		public void setBiochemical_ua_unit(String biochemical_ua_unit) {
			this.biochemical_ua_unit = biochemical_ua_unit;
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
		private String tumor_afp_unit;
		private String tumor_afp_scope;
		// 癌胚抗原(CEA)（酶免法）  
		private String  tumor_cea;
		private String tumor_cea_unit;
		private String tumor_cea_scope;
		//癌抗原19-9（CA19-9）（发光法）
		private String  tumor_ca19_9;
		private String tumor_ca19_9_unit;
		private String tumor_ca19_9_scope;
		//癌抗原125（CA125）（发光法）
		private String  tumor_ca125;
		private String tumor_ca125_unit;
		private String tumor_ca125_scope;
		//癌抗原724（CA724）（发光法)
		private String  tumor_ca724;
		private String tumor_ca724_unit;
		private String tumor_ca724_scope;
		// 肺细胞角蛋白21-1(Cyfra 21-1)（发光法）
		private String  tumor_tpsa;
		private String tumor_tpsa_unit;
		private String tumor_tpsa_scope;
		// 前列腺特异性抗原（T-PSA）（发光法）
		private String  tumor_cyfra21_1;
		private String tumor_cyfra21_1_unit;
		private String tumor_cyfra21_1_scope;
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
		public String getTumor_afp_unit() {
			return tumor_afp_unit;
		}
		public void setTumor_afp_unit(String tumor_afp_unit) {
			this.tumor_afp_unit = tumor_afp_unit;
		}
		public String getTumor_afp_scope() {
			return tumor_afp_scope;
		}
		public void setTumor_afp_scope(String tumor_afp_scope) {
			this.tumor_afp_scope = tumor_afp_scope;
		}
		public String getTumor_cea_unit() {
			return tumor_cea_unit;
		}
		public void setTumor_cea_unit(String tumor_cea_unit) {
			this.tumor_cea_unit = tumor_cea_unit;
		}
		public String getTumor_cea_scope() {
			return tumor_cea_scope;
		}
		public void setTumor_cea_scope(String tumor_cea_scope) {
			this.tumor_cea_scope = tumor_cea_scope;
		}
		public String getTumor_ca19_9_unit() {
			return tumor_ca19_9_unit;
		}
		public void setTumor_ca19_9_unit(String tumor_ca19_9_unit) {
			this.tumor_ca19_9_unit = tumor_ca19_9_unit;
		}

		public String getTumor_ca125_unit() {
			return tumor_ca125_unit;
		}
		public void setTumor_ca125_unit(String tumor_ca125_unit) {
			this.tumor_ca125_unit = tumor_ca125_unit;
		}
		public String getTumor_ca125_scope() {
			return tumor_ca125_scope;
		}
		public void setTumor_ca125_scope(String tumor_ca125_scope) {
			this.tumor_ca125_scope = tumor_ca125_scope;
		}
		public String getTumor_ca724_unit() {
			return tumor_ca724_unit;
		}
		public void setTumor_ca724_unit(String tumor_ca724_unit) {
			this.tumor_ca724_unit = tumor_ca724_unit;
		}
		public String getTumor_ca724_scope() {
			return tumor_ca724_scope;
		}
		public void setTumor_ca724_scope(String tumor_ca724_scope) {
			this.tumor_ca724_scope = tumor_ca724_scope;
		}
		public String getTumor_tpsa_unit() {
			return tumor_tpsa_unit;
		}
		public void setTumor_tpsa_unit(String tumor_tpsa_unit) {
			this.tumor_tpsa_unit = tumor_tpsa_unit;
		}
		public String getTumor_tpsa_scope() {
			return tumor_tpsa_scope;
		}
		public void setTumor_tpsa_scope(String tumor_tpsa_scope) {
			this.tumor_tpsa_scope = tumor_tpsa_scope;
		}
		public String getTumor_cyfra21_1_unit() {
			return tumor_cyfra21_1_unit;
		}
		public void setTumor_cyfra21_1_unit(String tumor_cyfra21_1_unit) {
			this.tumor_cyfra21_1_unit = tumor_cyfra21_1_unit;
		}
		public String getTumor_cyfra21_1_scope() {
			return tumor_cyfra21_1_scope;
		}
		public void setTumor_cyfra21_1_scope(String tumor_cyfra21_1_scope) {
			this.tumor_cyfra21_1_scope = tumor_cyfra21_1_scope;
		}
		public String getTumor_ca19_9_scope() {
			return tumor_ca19_9_scope;
		}
		public void setTumor_ca19_9_scope(String tumor_ca19_9_scope) {
			this.tumor_ca19_9_scope = tumor_ca19_9_scope;
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
		private String  BloodRheology_viscosityLowCut10_s_unit;
		private String  BloodRheology_viscosityLowCut10_s_scope;
		// 全血粘度：中切(60/s) 
		private String  BloodRheology_viscosityInCut60_s;
		private String  BloodRheology_viscosityInCut60_s_unit;
		private String  BloodRheology_viscosityInCut60_s_scope;
		// 全血粘度：高切(150/s) 
		private String  BloodRheology_viscosityHighCut150_s;
		private String  BloodRheology_viscosityHighCut150_s_unit;
		private String  BloodRheology_viscosityHighCut150_s_scope;
		// 血浆粘度
		private String  BloodRheology_plasmaViscosity;
		private String  BloodRheology_plasmaViscosity_unit;
		private String  BloodRheology_plasmaViscosity_scope;
		//全血还原粘度(低切)10/s 
		private String  BloodRheology_reductionViscosityLowCut10_s;
		private String  BloodRheology_reductionViscosityLowCut10_s_unit;
		private String  BloodRheology_reductionViscosityLowCut10_s_scope;
		//全血还原粘度(中切)60/s
		private String BloodRheology_reductionViscosityInLowCut60_s;
		private String BloodRheology_reductionViscosityInLowCut60_s_unit;
		private String BloodRheology_reductionViscosityInLowCut60_s_scope;
		// 全血还原粘度(高切)150/s
		private String  BloodRheology_reductionViscosityHighCut150_s;
		private String  BloodRheology_reductionViscosityHighCut150_s_unit;
		private String  BloodRheology_reductionViscosityHighCut150_s_scope;
		//红细胞聚集指数 
		private String BloodRheology_EaIndex;
		private String BloodRheology_EaIndex_unit;
		private String BloodRheology_EaIndex_scope;
		// 红细胞变形指数 
		private String BloodRheology_EdIndex;
		private String BloodRheology_EdIndex_unit;
		private String BloodRheology_EdIndex_scope;
		//红细胞压积
		private String  BloodRheology_Hematocrit;
		private String  BloodRheology_Hematocrit_unit;
		private String  BloodRheology_Hematocrit_scope;
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
		public String getBloodRheology_viscosityLowCut10_s_unit() {
			return BloodRheology_viscosityLowCut10_s_unit;
		}
		public void setBloodRheology_viscosityLowCut10_s_unit(String bloodRheology_viscosityLowCut10_s_unit) {
			BloodRheology_viscosityLowCut10_s_unit = bloodRheology_viscosityLowCut10_s_unit;
		}
		public String getBloodRheology_viscosityLowCut10_s_scope() {
			return BloodRheology_viscosityLowCut10_s_scope;
		}
		public void setBloodRheology_viscosityLowCut10_s_scope(String bloodRheology_viscosityLowCut10_s_scope) {
			BloodRheology_viscosityLowCut10_s_scope = bloodRheology_viscosityLowCut10_s_scope;
		}
		public String getBloodRheology_viscosityInCut60_s_unit() {
			return BloodRheology_viscosityInCut60_s_unit;
		}
		public void setBloodRheology_viscosityInCut60_s_unit(String bloodRheology_viscosityInCut60_s_unit) {
			BloodRheology_viscosityInCut60_s_unit = bloodRheology_viscosityInCut60_s_unit;
		}
		public String getBloodRheology_viscosityInCut60_s_scope() {
			return BloodRheology_viscosityInCut60_s_scope;
		}
		public void setBloodRheology_viscosityInCut60_s_scope(String bloodRheology_viscosityInCut60_s_scope) {
			BloodRheology_viscosityInCut60_s_scope = bloodRheology_viscosityInCut60_s_scope;
		}
		public String getBloodRheology_viscosityHighCut150_s_unit() {
			return BloodRheology_viscosityHighCut150_s_unit;
		}
		public void setBloodRheology_viscosityHighCut150_s_unit(String bloodRheology_viscosityHighCut150_s_unit) {
			BloodRheology_viscosityHighCut150_s_unit = bloodRheology_viscosityHighCut150_s_unit;
		}
		public String getBloodRheology_viscosityHighCut150_s_scope() {
			return BloodRheology_viscosityHighCut150_s_scope;
		}
		public void setBloodRheology_viscosityHighCut150_s_scope(String bloodRheology_viscosityHighCut150_s_scope) {
			BloodRheology_viscosityHighCut150_s_scope = bloodRheology_viscosityHighCut150_s_scope;
		}
		public String getBloodRheology_plasmaViscosity_unit() {
			return BloodRheology_plasmaViscosity_unit;
		}
		public void setBloodRheology_plasmaViscosity_unit(String bloodRheology_plasmaViscosity_unit) {
			BloodRheology_plasmaViscosity_unit = bloodRheology_plasmaViscosity_unit;
		}
		public String getBloodRheology_plasmaViscosity_scope() {
			return BloodRheology_plasmaViscosity_scope;
		}
		public void setBloodRheology_plasmaViscosity_scope(String bloodRheology_plasmaViscosity_scope) {
			BloodRheology_plasmaViscosity_scope = bloodRheology_plasmaViscosity_scope;
		}
		public String getBloodRheology_reductionViscosityLowCut10_s_unit() {
			return BloodRheology_reductionViscosityLowCut10_s_unit;
		}
		public void setBloodRheology_reductionViscosityLowCut10_s_unit(
				String bloodRheology_reductionViscosityLowCut10_s_unit) {
			BloodRheology_reductionViscosityLowCut10_s_unit = bloodRheology_reductionViscosityLowCut10_s_unit;
		}
		public String getBloodRheology_reductionViscosityLowCut10_s_scope() {
			return BloodRheology_reductionViscosityLowCut10_s_scope;
		}
		public void setBloodRheology_reductionViscosityLowCut10_s_scope(
				String bloodRheology_reductionViscosityLowCut10_s_scope) {
			BloodRheology_reductionViscosityLowCut10_s_scope = bloodRheology_reductionViscosityLowCut10_s_scope;
		}
		public String getBloodRheology_reductionViscosityInLowCut60_s_unit() {
			return BloodRheology_reductionViscosityInLowCut60_s_unit;
		}
		public void setBloodRheology_reductionViscosityInLowCut60_s_unit(
				String bloodRheology_reductionViscosityInLowCut60_s_unit) {
			BloodRheology_reductionViscosityInLowCut60_s_unit = bloodRheology_reductionViscosityInLowCut60_s_unit;
		}
		public String getBloodRheology_reductionViscosityInLowCut60_s_scope() {
			return BloodRheology_reductionViscosityInLowCut60_s_scope;
		}
		public void setBloodRheology_reductionViscosityInLowCut60_s_scope(
				String bloodRheology_reductionViscosityInLowCut60_s_scope) {
			BloodRheology_reductionViscosityInLowCut60_s_scope = bloodRheology_reductionViscosityInLowCut60_s_scope;
		}
		public String getBloodRheology_reductionViscosityHighCut150_s_unit() {
			return BloodRheology_reductionViscosityHighCut150_s_unit;
		}
		public void setBloodRheology_reductionViscosityHighCut150_s_unit(
				String bloodRheology_reductionViscosityHighCut150_s_unit) {
			BloodRheology_reductionViscosityHighCut150_s_unit = bloodRheology_reductionViscosityHighCut150_s_unit;
		}
		public String getBloodRheology_reductionViscosityHighCut150_s_scope() {
			return BloodRheology_reductionViscosityHighCut150_s_scope;
		}
		public void setBloodRheology_reductionViscosityHighCut150_s_scope(
				String bloodRheology_reductionViscosityHighCut150_s_scope) {
			BloodRheology_reductionViscosityHighCut150_s_scope = bloodRheology_reductionViscosityHighCut150_s_scope;
		}
		public String getBloodRheology_EaIndex_unit() {
			return BloodRheology_EaIndex_unit;
		}
		public void setBloodRheology_EaIndex_unit(String bloodRheology_EaIndex_unit) {
			BloodRheology_EaIndex_unit = bloodRheology_EaIndex_unit;
		}
		public String getBloodRheology_EaIndex_scope() {
			return BloodRheology_EaIndex_scope;
		}
		public void setBloodRheology_EaIndex_scope(String bloodRheology_EaIndex_scope) {
			BloodRheology_EaIndex_scope = bloodRheology_EaIndex_scope;
		}
		public String getBloodRheology_EdIndex_unit() {
			return BloodRheology_EdIndex_unit;
		}
		public void setBloodRheology_EdIndex_unit(String bloodRheology_EdIndex_unit) {
			BloodRheology_EdIndex_unit = bloodRheology_EdIndex_unit;
		}
		public String getBloodRheology_EdIndex_scope() {
			return BloodRheology_EdIndex_scope;
		}
		public void setBloodRheology_EdIndex_scope(String bloodRheology_EdIndex_scope) {
			BloodRheology_EdIndex_scope = bloodRheology_EdIndex_scope;
		}
		public String getBloodRheology_Hematocrit_unit() {
			return BloodRheology_Hematocrit_unit;
		}
		public void setBloodRheology_Hematocrit_unit(String bloodRheology_Hematocrit_unit) {
			BloodRheology_Hematocrit_unit = bloodRheology_Hematocrit_unit;
		}
		public String getBloodRheology_Hematocrit_scope() {
			return BloodRheology_Hematocrit_scope;
		}
		public void setBloodRheology_Hematocrit_scope(String bloodRheology_Hematocrit_scope) {
			BloodRheology_Hematocrit_scope = bloodRheology_Hematocrit_scope;
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
		private String urineroutines_sg_unit;
		private String urineroutines_sg_scope;
		// pH值(pH)  
		private String  urineroutines_ph;
		private String urineroutines_ph_unit;
		private String urineroutines_ph_scope;
		//白细胞(LEU) 
		private String  urineroutines_leu;
		private String urineroutines_leu_unit;
		private String urineroutines_leu_scope;
		//隐血(ERY) 
		private String  urineroutines_ery;
		private String urineroutines_ery_unit;
		private String urineroutines_ery_scope;
		// 亚硝酸盐(NIT)）  
		private String urineroutines_nit;
		private String urineroutines_nit_unit;
		private String urineroutines_nit_scope;
		//酮体(KET) 
		private String  urineroutines_ket;
		private String  urineroutines_ket_unit;
		private String  urineroutines_ket_scope;
		//胆红素(BIL)
		private String  urineroutines_bil;
		private String  urineroutines_bil_unit;
		private String  urineroutines_bil_scope;
		//  尿胆元(UBG)   
		private String urineroutines_ubg;
		private String urineroutines_ubg_unit;
		private String urineroutines_ubg_scope;
		//蛋白质(PRO)
		private String  urineroutines_pro;
		private String  urineroutines_pro_unit;
		private String  urineroutines_pro_scope;
		//葡萄糖(GLU)
		private String  urineroutines_glu;
		private String urineroutines_glu_unit;
		private String urineroutines_glu_scope;
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
		public String getUrineroutines_sg_unit() {
			return urineroutines_sg_unit;
		}
		public void setUrineroutines_sg_unit(String urineroutines_sg_unit) {
			this.urineroutines_sg_unit = urineroutines_sg_unit;
		}
		public String getUrineroutines_sg_scope() {
			return urineroutines_sg_scope;
		}
		public void setUrineroutines_sg_scope(String urineroutines_sg_scope) {
			this.urineroutines_sg_scope = urineroutines_sg_scope;
		}
		public String getUrineroutines_ph_unit() {
			return urineroutines_ph_unit;
		}
		public void setUrineroutines_ph_unit(String urineroutines_ph_unit) {
			this.urineroutines_ph_unit = urineroutines_ph_unit;
		}
		public String getUrineroutines_ph_scope() {
			return urineroutines_ph_scope;
		}
		public void setUrineroutines_ph_scope(String urineroutines_ph_scope) {
			this.urineroutines_ph_scope = urineroutines_ph_scope;
		}
		public String getUrineroutines_leu_unit() {
			return urineroutines_leu_unit;
		}
		public void setUrineroutines_leu_unit(String urineroutines_leu_unit) {
			this.urineroutines_leu_unit = urineroutines_leu_unit;
		}
		public String getUrineroutines_leu_scope() {
			return urineroutines_leu_scope;
		}
		public void setUrineroutines_leu_scope(String urineroutines_leu_scope) {
			this.urineroutines_leu_scope = urineroutines_leu_scope;
		}
		public String getUrineroutines_ery_unit() {
			return urineroutines_ery_unit;
		}
		public void setUrineroutines_ery_unit(String urineroutines_ery_unit) {
			this.urineroutines_ery_unit = urineroutines_ery_unit;
		}
		public String getUrineroutines_ery_scope() {
			return urineroutines_ery_scope;
		}
		public void setUrineroutines_ery_scope(String urineroutines_ery_scope) {
			this.urineroutines_ery_scope = urineroutines_ery_scope;
		}
		public String getUrineroutines_nit_unit() {
			return urineroutines_nit_unit;
		}
		public void setUrineroutines_nit_unit(String urineroutines_nit_unit) {
			this.urineroutines_nit_unit = urineroutines_nit_unit;
		}
		public String getUrineroutines_nit_scope() {
			return urineroutines_nit_scope;
		}
		public void setUrineroutines_nit_scope(String urineroutines_nit_scope) {
			this.urineroutines_nit_scope = urineroutines_nit_scope;
		}
		public String getUrineroutines_ket_unit() {
			return urineroutines_ket_unit;
		}
		public void setUrineroutines_ket_unit(String urineroutines_ket_unit) {
			this.urineroutines_ket_unit = urineroutines_ket_unit;
		}
		public String getUrineroutines_ket_scope() {
			return urineroutines_ket_scope;
		}
		public void setUrineroutines_ket_scope(String urineroutines_ket_scope) {
			this.urineroutines_ket_scope = urineroutines_ket_scope;
		}
		public String getUrineroutines_bil_unit() {
			return urineroutines_bil_unit;
		}
		public void setUrineroutines_bil_unit(String urineroutines_bil_unit) {
			this.urineroutines_bil_unit = urineroutines_bil_unit;
		}
		public String getUrineroutines_bil_scope() {
			return urineroutines_bil_scope;
		}
		public void setUrineroutines_bil_scope(String urineroutines_bil_scope) {
			this.urineroutines_bil_scope = urineroutines_bil_scope;
		}
		public String getUrineroutines_ubg_unit() {
			return urineroutines_ubg_unit;
		}
		public void setUrineroutines_ubg_unit(String urineroutines_ubg_unit) {
			this.urineroutines_ubg_unit = urineroutines_ubg_unit;
		}
		public String getUrineroutines_ubg_scope() {
			return urineroutines_ubg_scope;
		}
		public void setUrineroutines_ubg_scope(String urineroutines_ubg_scope) {
			this.urineroutines_ubg_scope = urineroutines_ubg_scope;
		}
		public String getUrineroutines_pro_unit() {
			return urineroutines_pro_unit;
		}
		public void setUrineroutines_pro_unit(String urineroutines_pro_unit) {
			this.urineroutines_pro_unit = urineroutines_pro_unit;
		}
		public String getUrineroutines_pro_scope() {
			return urineroutines_pro_scope;
		}
		public void setUrineroutines_pro_scope(String urineroutines_pro_scope) {
			this.urineroutines_pro_scope = urineroutines_pro_scope;
		}
		public String getUrineroutines_glu_unit() {
			return urineroutines_glu_unit;
		}
		public void setUrineroutines_glu_unit(String urineroutines_glu_unit) {
			this.urineroutines_glu_unit = urineroutines_glu_unit;
		}
		public String getUrineroutines_glu_scope() {
			return urineroutines_glu_scope;
		}
		public void setUrineroutines_glu_scope(String urineroutines_glu_scope) {
			this.urineroutines_glu_scope = urineroutines_glu_scope;
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
		private String generl_height_unit;
		private String generl_height_scope;	
		// 体重 
		private String  generl_weight;
		private String  generl_weight_unit;
		private String  generl_weight_scope;
		//体重指数 
		private String  generl_bmi;
		private String  generl_bmi_unit;
		private String  generl_bmi_scope;
		//体检血压(收缩压)
		private String   generl_systolic;
		private String   generl_systolic_unit;
		private String   generl_systolic_scope;
		//体检血压(舒张压)  
		private String  generl_diastolic;
		private String  generl_diastolic_unit;
		private String  generl_diastolic_scope;
		// 复测血压(收缩压) 
		private String  generl_systolic1;
		private String  generl_systolic1_unit;
		private String  generl_systolic1_scope;
		//复测血压(舒张压) 
		private String  generl_diastolic1;
		private String  generl_diastolic1_unit;
		private String  generl_diastolic1_scope;
		//  复测血压2(收缩压)  
		private String  generl_systolic2;
		private String  generl_systolic2_unit;
		private String  generl_systolic2_scope;
		//  复测血压2(舒张压)
		private String   generl_diastolic2;
		private String   generl_diastolic2_unit;
		private String   generl_diastolic2_scope;
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
		public String getGenerl_height_unit() {
			return generl_height_unit;
		}
		public void setGenerl_height_unit(String generl_height_unit) {
			this.generl_height_unit = generl_height_unit;
		}
		public String getGenerl_height_scope() {
			return generl_height_scope;
		}
		public void setGenerl_height_scope(String generl_height_scope) {
			this.generl_height_scope = generl_height_scope;
		}
		public String getGenerl_weight_unit() {
			return generl_weight_unit;
		}
		public void setGenerl_weight_unit(String generl_weight_unit) {
			this.generl_weight_unit = generl_weight_unit;
		}
		public String getGenerl_weight_scope() {
			return generl_weight_scope;
		}
		public void setGenerl_weight_scope(String generl_weight_scope) {
			this.generl_weight_scope = generl_weight_scope;
		}
		public String getGenerl_bmi_unit() {
			return generl_bmi_unit;
		}
		public void setGenerl_bmi_unit(String generl_bmi_unit) {
			this.generl_bmi_unit = generl_bmi_unit;
		}
		public String getGenerl_bmi_scope() {
			return generl_bmi_scope;
		}
		public void setGenerl_bmi_scope(String generl_bmi_scope) {
			this.generl_bmi_scope = generl_bmi_scope;
		}
		public String getGenerl_systolic_unit() {
			return generl_systolic_unit;
		}
		public void setGenerl_systolic_unit(String generl_systolic_unit) {
			this.generl_systolic_unit = generl_systolic_unit;
		}
		public String getGenerl_systolic_scope() {
			return generl_systolic_scope;
		}
		public void setGenerl_systolic_scope(String generl_systolic_scope) {
			this.generl_systolic_scope = generl_systolic_scope;
		}
		public String getGenerl_diastolic_unit() {
			return generl_diastolic_unit;
		}
		public void setGenerl_diastolic_unit(String generl_diastolic_unit) {
			this.generl_diastolic_unit = generl_diastolic_unit;
		}
		public String getGenerl_diastolic_scope() {
			return generl_diastolic_scope;
		}
		public void setGenerl_diastolic_scope(String generl_diastolic_scope) {
			this.generl_diastolic_scope = generl_diastolic_scope;
		}
		public String getGenerl_systolic1_unit() {
			return generl_systolic1_unit;
		}
		public void setGenerl_systolic1_unit(String generl_systolic1_unit) {
			this.generl_systolic1_unit = generl_systolic1_unit;
		}
		public String getGenerl_systolic1_scope() {
			return generl_systolic1_scope;
		}
		public void setGenerl_systolic1_scope(String generl_systolic1_scope) {
			this.generl_systolic1_scope = generl_systolic1_scope;
		}
		public String getGenerl_diastolic1_unit() {
			return generl_diastolic1_unit;
		}
		public void setGenerl_diastolic1_unit(String generl_diastolic1_unit) {
			this.generl_diastolic1_unit = generl_diastolic1_unit;
		}
		public String getGenerl_diastolic1_scope() {
			return generl_diastolic1_scope;
		}
		public void setGenerl_diastolic1_scope(String generl_diastolic1_scope) {
			this.generl_diastolic1_scope = generl_diastolic1_scope;
		}
		public String getGenerl_systolic2_scope() {
			return generl_systolic2_scope;
		}
		public void setGenerl_systolic2_scope(String generl_systolic2_scope) {
			this.generl_systolic2_scope = generl_systolic2_scope;
		}
		public String getGenerl_diastolic2_unit() {
			return generl_diastolic2_unit;
		}
		public void setGenerl_diastolic2_unit(String generl_diastolic2_unit) {
			this.generl_diastolic2_unit = generl_diastolic2_unit;
		}
		public String getGenerl_diastolic2_scope() {
			return generl_diastolic2_scope;
		}
		public void setGenerl_diastolic2_scope(String generl_diastolic2_scope) {
			this.generl_diastolic2_scope = generl_diastolic2_scope;
		}
		public String getGenerl_systolic2_unit() {
			return generl_systolic2_unit;
		}
		public void setGenerl_systolic2_unit(String generl_systolic2_unit) {
			this.generl_systolic2_unit = generl_systolic2_unit;
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
