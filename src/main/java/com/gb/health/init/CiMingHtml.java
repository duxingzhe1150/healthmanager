package com.gb.health.init;
/**
 * 慈铭体检报告 体检项目
 * @author lx
 *
 */
public class CiMingHtml {

	//汇总分析
	public static final String GLOBAL_ANALYSIS = "GLOBAL_ANALYSIS";


	/**
	 * 妇科
	 * @author lx
	 *
	 */
	public final class Gynecology  {
		//月经史
		public static final String  GY_HISTORY = "Women_menstrualHistory";
		//周期时段
		public static final String  GY_CYCLE = "Women_menstruaCycle";
		//孕产史
		public static final String  GY_GESTATION = "Women_pregnancyHistory";
		//手术史
		public static final String  GY_OPERATION = "Women_operationHistory";
		//外阴
		public static final String  GY_VULVA = "Women_vulva";
		//阴道 
		public static final String  GY_VAGINA = "Women_vagina";
		//分泌物
		public static final String  GY_SECRETA = "Women_vagina";
		//宫颈
		public static final String  GY_UTERINE_NECK = "Women_cervical";
		//子宫体
		public static final String  GY_CORPUS_UTERI = "Women_corpusUteri";
		//附件
		public static final String  GY_ACCESSORY = "Women_enclosure";
		//体检所见
		public static final String  GY_FINDING = "Women_physicalExamination";

	}



	public final class Baseinfo  {

		//姓名
		public static final String  BASE_NAME = "b_name";
		//性别
		public static final String  BASE_SEX = "b_sex";
		//出生日期
		public static final String  BASE_BIRTH = "b_birthday";
		//年龄
		public static final String  BASE_AGE = "b_age";
		//国籍
		public static final String  BASE_COUNTRY = "b_country";
		//民族
		public static final String  BASE_NATION = "b_nationality";
		//证件号
		public static final String  BASE_ID = "b_personid";
		//婚否
		public static final String  BASE_MERRY = "b_marriage";
		//工作单位 
		public static final String  BASE_WORK_ADDR = "b_WorkUnit";
		// 手机 
		public static final String  BASE_TEL = "b_tel";
		//通信地址 
		public static final String  BASE_ADDR = "b_MailingAddress";
		//办公电话 
		public static final String  BASE_WORK_TEL = "b_OfficeTelephone";
		//电子邮件
		public static final String  BASE_EMAIL = "b_Email";
    	//宅电
		public static final String  BASE_HOME_TEL = "b_HomePhone";


	}

	/**
	 * TCT检测
	 * @author lx
	 *
	 */
	public final class TCT  {
		// 宫颈液基薄层细胞学检测(TCT)
		public static final String  TCT_TCT = "TCT";

		//体检所见
		public static final String  TCT_FINDING = "TCT__finding";

	}

	/**
	 * 内科
	 * @author lx
	 *
	 */
	public final class Medical  {
		//胸部
		public static final String  MEDICAL_CHEST = "medical_chest";
		//心率
		public static final String  MEDICAL_HR = "medical_heartrate";
		// 心律
		public static final String  MEDICAL_HEART_RHYTHM= "medical_heartrhythm";
		// 心音
		public static final String  MEDICAL_HEART_SOUNDS = "medical_heartsound";
		// 心界
		public static final String  MEDICAL_HEART_BORDER  = "medical_heartborder";
		// 肺 
		public static final String  MEDICAL_LUNG = "medical_lung";
		//  腹部
		public static final String  MEDICAL_BELLY = "medical_stomach";
		// 肝脏
		public static final String  MEDICAL_LIVER = "medical_hepatic";
		// 胆囊
		public static final String  MEDICAL_CHOLECYST = "medical_gallbladder";
		// 脾脏
		public static final String  MEDICAL_SPLEEN = "medical_spleen";
		// 肾脏
		public static final String  MEDICAL_KIDNEY = "medical_kidney";
		// 神经系统
		public static final String NERVOUS_SYSTEM = "medical_nervoussystem";
		// 其他
		public static final String MEDICAL_OTHER = "medical_other";
		// 体检所见
		public static final String MEDICAL_FINDING = "medical_finding";
	}

	/**
	 * 腹部声超
	 * @author lx
	 *
	 */
	public final class TAUS  {
		//肝脏彩超
		public static final String  TAUS_LIVER_COLOUR = "taus_liver";
		// 胆囊彩超 
		public static final String TAUS_GALLBLADDER_COLOUR = "taus_gallbladder";
		//   脾脏彩超
		public static final String TAUS_SPLEEN_COLOUR = "taus_spleen";
		//  胰腺彩超 
		public static final String  TAUS_PANCREAS_COLOUR = "taus_pancreas";
		//  肾脏彩超 
		public static final String  TAUS_KIDNEY_COLOUR  = "taus_kidney";
		// 其他 
		public static final String  TAUS_OTHER_COLOUR = "taus_other";
		// 检查所见
		public static final String TAUS_FINDING_COLOUR = "taus_finding";

	}

	/**
	 * 盆腔超声
	 * @author lx
	 *
	 */
	public final class PelvicUltrasound  {

		//子宫彩超
		public static final String  PU_UTERUS = "pelvicultrasound_uterus";
		//附件彩超
		public static final String  PU_ATTACHMENT = "pelvicultrasound_enclosure";
		//前列腺彩超
		public static final String  PU_PROSTATE_COLOUR = "pelvicultrasound_prostate";
		// 其他 
		public static final String  PU_OTHER_COLOUR = "pelvicultrasound_other";
		// 检查所见
		public static final String PU_FINDING_COLOUR = "pelvicultrasound_finding";

	}

	/**
	 * 心脏彩超
	 * @author lx
	 *
	 */
	public final class UCG  {

		//动脉
		public static final String  UCG_ARTERY = "CS_artery";
		// 房室腔
		public static final String  UCG_ATRIOVENTRICULAR = "CS_atrioventricularCavity";
		//室间隔及左室后壁 
		public static final String UCG_INTERVENTRICULAR = "CS_wall";
		//瓣膜 
		public static final String  UCG_VALVE = "CS_valve";
		//CDFI 
		public static final String  UCG_CDFI = "CDFI";
		//心功能 
		public static final String  UCG_FUNCTION = "CS_heartFunction";
		//测量
		public static final String  UCG_MEASURE = "CS_other";
		// 其他 
		public static final String  UCG_OTHER = "CS_measure";
		// 检查所见
		public static final String UCG_FINDING = "CS_finding";

	}

	/**
	 * 颈动脉彩超
	 * @author lx
	 *
	 */
	public final class Carotid  {
		//  颈动脉彩超
		public static final String  CA_CAROTID = "pelvicultrasound_CarotidArtery";
		// 检查所见
		public static final String CA_FINDING = "CarotidArtery_finding";

	}

	/**
	 * 甲状腺彩超
	 * @author lx
	 *
	 */
	public final class  Thyroid  {
		//  甲状腺
		public static final String  THY_THYROID = "pelvicultrasound_thyroid";
		// 检查所见
		public static final String THY_FINDING = "thyroid_finding";

	}

	/**
	 *  乳腺彩超
	 * @author lx
	 *
	 */
	public final class  Ultrasonography  {
		//    乳腺彩超 
		public static final String  ULT_ULTRASONOGRAPHY = "pelvicultrasound_breast";
		// 检查所见
		public static final String ULT_FINDING = "breast_finding";

	}

	/**
	 * 经颅多普勒
	 * @author lx
	 *
	 */
	public final class TCD {
		//多普勒脑血流图
		public static final String  TCD_CHART = "tcd_tcd";

		// 检查所见
		public static final String TCD_FINDING = "tcd_finding";

	}

	/**
	 * 甲状腺功能检测
	 * @author lx
	 *
	 */
	public final class ThyroidFunction {
		// 三碘甲状腺原氨酸（T3）电发光 
		public static final String  TF_T3 = "thyroid_t3";

		// 甲状腺素（T4）电发光
		public static final String TF_T4 = "thyroid_t4";

		// 促甲状腺素（TSH）电发光
		public static final String TF_TSH = "thyroid_tsh";

	}

	/**
	 *  胸部摄片
	 * @author lx
	 *
	 */
	public final class  ChestRadiography {
		//肺野
		public static final String  CR_LUNG_FIELD = "chestradiography_lungfield";
		// 肺门 
		public static final String  CR_HILUS_PULMONIS = "chestradiography_hiluspulmonis";
		//纵隔 
		public static final String   CR_MEDIASTINUM = "chestradiography_mediastinal";
		// 心影 
		public static final String  CR_PODOID = "chestradiography_podoid";
		// 膈肌 
		public static final String   CR_DIAPHRAGM = "chestradiography_diaphragm";
		// 胸膜
		public static final String  CR_LIGAMENT = "chestradiography_pleura";
		//胸廓
		public static final String  CR_THORAX = "chestradiography_thorax";
		// 检查所见
		public static final String  CR_FINDING = "chestradiography_finding";


	}

	/**
	 *  心电图
	 * @author lx
	 *
	 */
	public final class  Ecg {

		// 检查所见
		public static final String  ECG_FINDING = "ecg_finding";


	}

	/**
	 *  动脉硬化检测 
	 * @author lx
	 *
	 */
	public final class  Atherosclerosis {
		//右侧ABI
		public static final String  ATH_RIGHT_ABI= "atherosclerosis_r_abi";
		// 左侧ABI  
		public static final String  ATH_LEFT_ABI = "atherosclerosis_l__abi";
		//右侧CAVI
		public static final String  ATH_RIGHT_CAVI = "atherosclerosis_r_cavi";
		// 左侧CAVI 
		public static final String   ATH_LEFT_CAVI = "atherosclerosis_l_cavi";
		// 动脉硬化检测 
		public static final String   ATH_ATHEROSCLEROSIS = "atherosclerosis_examination";
		// 检查所见
		public static final String  ATH_FINDING = "atherosclerosis_finding";


	}
	/**
	 *  亚健康检测
	 * @author lx
	 *
	 */
	public final class  SubTest {
		//检查所见
		public static final String  SUB_FINDING= "subhealth_finding";



	}
	/**
	 *  血常规 
	 * @author lx
	 *
	 */
	public final class  CBC {
		//  红细胞计数（RBC）
		public static final String  CBC_RBC= "bloodroutine_erythrocytes";
		// 血红蛋白(HGB)  
		public static final String CBC_HGB = "bloodroutine_hb";
		// 红细胞压积(HCT) 
		public static final String  CBC_HCT = "bloodroutine_hct";
		// 平均红细胞体积（MCV）
		public static final String  CBC_MCV = "bloodroutine_mcv";
		//  平均红细胞血红蛋白含量（MCH） 
		public static final String   CBC_MCH = "bloodroutine_mch";
		// 平均红细胞血红蛋白浓度（MCHC)
		public static final String  CBC_MCHC = "bloodroutine_mchc";
		//   红细胞体积分布宽度变异系数（RDW-CV）
		public static final String   CBC_RDW_CV = "bloodroutine_rdwcv";
		//   红细胞体积分布宽度标准差（RDW-SD）
		public static final String   CBC_RDW_SD = "bloodroutine_rdwsd";
		// 白细胞计数（WBC）
		public static final String  CBC_WBC = "bloodroutine_wbc";
		// 中性粒细胞比值（GRA）
		public static final String  CBC_GRA = "bloodroutine_nuet";
		//中性粒细胞绝对值（GRA#）
		public static final String   CBC_GRA1 = "bloodroutine_gra";
		// 淋巴细胞比值（LYM）
		public static final String   CBC_LYM = "bloodroutine_nlr";
		//  淋巴细胞绝对值（LYM#）
		public static final String  CBC_LYM1 = "bloodroutine_lym";
		//单核细胞比值（MONO）
		public static final String CBC_MONO = "bloodroutine_monor";
		//  单核细胞绝对值(MONO#)
		public static final String   CBC_MONO1 = "bloodroutine_mono";
		// 嗜酸性粒细胞比值（EO）
		public static final String  CBC_EO = "bloodroutine_eor";
		//嗜酸性粒细胞绝对值(EO#)
		public static final String  CBC_EO1 = "bloodroutine_eo";
		// 嗜碱性粒细胞比值（BASO） 
		public static final String   CBC_BASO = "bloodroutine_basor";
		// 嗜碱性粒细胞绝对值(BASO#)
		public static final String   CBC_BASO1 = "bloodroutine_baso";
		// 血小板(PLT) 
		public static final String CBC_PLT = "bloodroutine_platelet";
		// 平均血小板体积（MPV） 
		public static final String   CBC_MPV = "bloodroutine_mpv";
		//  血小板容积分布宽度（PDW）
		public static final String   CBC_PDW = "bloodroutine_pdw";
		// 大血小板比率（P-LCR）
		public static final String  CBC_P_LCR = "bloodroutine_plcr";
		// 血小板比容（PCT) 
		public static final String  CBC_PCT = "bloodroutine_thrombocytocrit";



	}

	/**
	 *  生化检验  
	 * @author lx
	 *
	 */
	public final class BiochemicalDetection {
		//   丙氨酸氨基转移酶（ALT）
		public static final String  BD_ALT= "biochemical_alt";
		
		//天门冬氨酸氨基转移酶（AST） biochemical_ast
		
		public static final String AST = "biochemical_ast";
		// γ-谷氨酰转移酶（GGT ) 
		public static final String BD_GGT = "biochemical_ggt";
		
		//碱性磷酸酶(ALP)   biochemical_alp
		public static final String  ALP = " biochemical_alp";
		// 乳酸脱氢酶（LDH）  biochemical_ldh
		
		public static final String  LDH = "biochemical_ldh";
	    //血清总胆汁酸（TBA） biochemical_tba
		public static final String  TBA = "biochemical_tba";
	    //  肌酸激酶（CK）  biochemical_ck
		public static final String  CK = "biochemical_ck";
		//肌酸激酶同工酶（CK-MB） biochemical_ck-mb
		public static final String  CK_MB = "biochemical_ck-mb";
		//α-羟丁酸脱氢酶（α-HBDH）  biochemical_α-hbdh
		public static final String  α_HBDH = "biochemical_α-hbdh";
		//总蛋白（TP）  biochemical_tp
		public static final String  TP = "biochemical_tp";
		//白蛋白（ALB） biochemical_alb
		public static final String  ALB = "biochemical_alb";
		//球蛋白（GLB） biochemical_glb
		public static final String  GLB = "biochemical_glb";	
		//白蛋白/球蛋白（A/G）  biochemical_a/g
		public static final String  A_G = " biochemical_a/g";
		// 总胆红素（T-BIL） biochemical_t-bil
		public static final String  T_BIL = "biochemical_t-bil";
		//间接胆红素（IBIL）biochemical_ibil
		public static final String  IBIL = "biochemical_ibil";
		// 直接胆红素（DBIL）biochemical_dbil
		public static final String  DBIL = "biochemical_dbil";
		//
		
		//  总胆固醇（TC） 
		public static final String  BD_TC = "biochemical_tc";
		//  甘油三酯（TG）
		public static final String  BD_TG = "biochemical_tg";
		// 高密度脂蛋白胆固醇（HDL-CHO） 
		public static final String   BD_HDL_CHO = "biochemical_hdl_cho";
		// 低密度脂蛋白胆固醇（LDL-CHO）
		public static final String  BD_LDL_CHO = "biochemical_ldl_cho";
		//   尿素（Urea） 
		public static final String   BD_UREA = "biochemical_urea";
		//    肌酐（Cr）
		public static final String  BD_CR = "biochemical_cr";
		// 尿酸（UA）
		public static final String  BD_UA = "biochemical_ua";
		// 空腹血糖（FPG） 
		public static final String  BD_FPG = "biochemical_fpg";
		
		
		
		
		
		
		

	}

	/**
	 *  肿瘤检测 
	 * @author lx
	 *
	 */
	public final class  Tumor {
		//甲胎蛋白(AFP)（酶免法）
		public static final String  TUMOR_AFP= "tumor_afp";
		// 癌胚抗原(CEA)（酶免法）  
		public static final String  TUMOR_CEA = "tumor_cea";
		//癌抗原19-9（CA19-9）（发光法）
		public static final String  TUMOR_CA19_9 = "tumor_ca19-9";
		//癌抗原125（CA125）（发光法）
		public static final String  TUMOR_CA125 = "tumor_ca125";
		//癌抗原724（CA724）（发光法)
		public static final String  TUMOR_CA724 = "tumor_ca724";
		// 肺细胞角蛋白21-1(Cyfra 21-1)（发光法）
		public static final String  TUMOR_CYFRA21_1 = "tumor_tpsa";
		// 前列腺特异性抗原（T-PSA）（发光法）
		public static final String  TUMOR_T_PSA = "tumor_cyfra21-1";



	}
	/**
	 *  血流变 
	 * @author lx
	 *
	 */
	public final class  Hemorheology {
		//全血粘度：低切(10/s) 
		public static final String  HEM_VISCOSITY_DI= "BloodRheology_viscosityLowCut10/s";
		// 全血粘度：中切(60/s) 
		public static final String  HEM_VISCOSITY_ZHONG = "BloodRheology_viscosityInCut60/s";
		// 全血粘度：高切(150/s) 
		public static final String  HEM_VISCOSITY_GAO = "BloodRheology_viscosityHighCut150/s";
		// 血浆粘度
		public static final String  HEM_PLASMA_VISCOSITY = "BloodRheology_plasmaViscosity";
		//全血还原粘度(低切)10/s 
		public static final String  HEM_REDUCTIVE_DI = "BloodRheology_reductionViscosityLowCut10/s";
		//全血还原粘度(中切)60/s
		public static final String HEM_REDUCTIVE_ZHONG = "BloodRheology_reductionViscosityInLowCut60/s";
		// 全血还原粘度(高切)150/s
		public static final String  HEM_REDUCTIVE_GAO = "BloodRheology_reductionViscosityHighCut150/s";
		//红细胞聚集指数 
		public static final String  HEM_RED_ASSEMBLING = "BloodRheology_EaIndex";
		// 红细胞变形指数 
		public static final String  HEM_HBX = "BloodRheology_EdIndex";
		//红细胞压积
		public static final String  HEM_HCT = "BloodRheology_Hematocrit";



	}



	/**
	 *  尿常规
	 * @author lx
	 *
	 */
	public final class  Urinalysis {
		// 比重（SG）
		public static final String URI_SG= "urineroutines_sg";
		// pH值(pH)  
		public static final String  URI_PH = "urineroutines_ph";
		//白细胞(LEU) 
		public static final String  URI_LEU = "urineroutines_leu";
		//隐血(ERY) 
		public static final String  URI_ERY= "urineroutines_ery";
		// 亚硝酸盐(NIT)）  
		public static final String URI_NIT = "urineroutines_nit";
		//酮体(KET) 
		public static final String  URI_KET = "urineroutines_ket";
		//胆红素(BIL)
		public static final String  URI_BIL= "urineroutines_bil";
		//  尿胆元(UBG)   
		public static final String  URI_UBG = "urineroutines_ubg";
		//蛋白质(PRO)
		public static final String  URI_PRO = "urineroutines_pro";
		//葡萄糖(GLU)
		public static final String  URI_GLU = "urineroutines_glu";


	}

	/**
	 *  一般检查
	 * @author lx
	 *
	 */
	public final class  GeneralInspection {
		//身高
		public static final String GEN_HEIGHT= "generl_height";
		// 体重 
		public static final String  GEN_WEIGHT = "generl_weight";
		//体重指数 
		public static final String  GEN_BMI = "generl_bmi";
		//体检血压(收缩压)
		public static final String   GEN_SBP= "generl_systolic";
		//体检血压(舒张压)  
		public static final String  GEN_DBP = "generl_diastolic";
		// 复测血压(收缩压) 
		public static final String  GEN_RE_SBP1 = "generl_systolic1";
		//复测血压(舒张压) 
		public static final String  GEN_RE_DBP1= "generl_diastolic1";
		//  复测血压2(收缩压)  
		public static final String  GEN_RE_SBP2 = "generl_systolic2";
		//  复测血压2(舒张压)
		public static final String   GEN_RE_DBP2 = "generl_diastolic2";



	}

	/**
	 *   外科
	 * @author lx
	 *
	 */
	public final class Surgery {
		//皮肤
		public static final String SUR_SKIN= "surgical_skin";
		// 浅表淋巴结 
		public static final String  SUR_SUPERFICIAL_LYMPH = "surgical_superficiallymphnodes";
		//甲状腺 
		public static final String SUR_THYROID = "surgical_thyroid";
		//乳腺 
		public static final String   SUR_BREAST= "surgical_breast";
		//脊柱  
		public static final String   SUR_SPINE = "surgical_spinal";
		// 四肢与关节  
		public static final String   SUR_LIMBS_JOSTRINGS = "surgical_limbsandjoints";
		//外生殖器 
		public static final String  SUR_PUDENDUM= "surgical_genitalia";
		//  肛诊  
		public static final String  SUR_ANAL_DIAGNOSIS = "surgical_anal";
		//  其他 
		public static final String  SUR_OTHER = "surgical_other";
		//  体检所见
		public static final String   SUR_FINDING = "surgical_finding";



	}

	/**
	 *   眼科
	 * @author lx
	 *
	 */
	public final class Eye {
		//右眼裸视 
		public static final String EYE_RIGHT_NAKED  = "ophthalmology_righteye";
		// 左眼裸视 
		public static final String  EYE_LIFT_NAKED = "ophthalmology_lefteye";
		//右眼矫正视力
		public static final String EYE_RIGHT_CORRECT = "ophthalmology_rightcorrected";
		//左眼矫正视力
		public static final String  EYE_LIFT_CORRECT= "ophthalmology_leftcorrected";
		//色觉  
		public static final String   EYE_COLOUR_VISION = "ophthalmology_colorvision";
		//眼睑  
		public static final String   EYE_EYELID = "ophthalmology_eyelid";
		//泪器 
		public static final String  EYE_ACRIMAL_APPARATUS= "ophthalmology_lacrimal";
		//结膜   
		public static final String  EYE_CONJUNCTIVA = "ophthalmology_conjunctiva";
		//眼球
		public static final String EYE_EYEBALL = "ophthalmology_eyeball";
		//  角膜 
		public static final String   EYE_CORNEA = "ophthalmology_corneal";
		//   前房
		public static final String  EYE_ATRIA = "ophthalmology_anteriorchamber";
		//  虹膜
		public static final String   EYE_IRIS = "ophthalmology_iris";
		//  瞳孔 
		public static final String   EYE_PUPIL = "ophthalmology_pupil";
		//   晶状体
		public static final String    EYE_LENS = "ophthalmology_lens";
		//  玻璃体
		public static final String   EYE_VITREUM = "ophthalmology_vitreum";
		//  眼底
		public static final String   EYE_GYOUND = "ophthalmology_eyeground";
		//  杯盘比
		public static final String   EYE_VCDR = "ophthalmology_vcdr";
		//其他 
		public static final String   EYE_OTHER = "ophthalmology_other";
		//体检所见
		public static final String   EYE_FINDING = "ophthalmology_finding";




	}

	/**
	 *   耳鼻喉科
	 * @author lx
	 *
	 */
	public final class  ENT {
		//听力 
		public static final String ENT_LISTENING   = "otolaryngology_hearing";
		// 外耳 
		public static final String  ENT_AURICLE = "otolaryngology_externalear";
		//外耳道
		public static final String ENT_AURICLE_CANAL = "otolaryngology_earcanal";
		//鼓膜
		public static final String  ENT_EARDRUM= "otolaryngology_tympanic";
		//外鼻 
		public static final String   ENT_EXTERNAL_NOSE = "otolaryngology_externalnose";
		//鼻腔
		public static final String   ENT_NASAL_CAVITY = "otolaryngology_nasalcavity";
		//鼻窦 
		public static final String   ENT_NOSE_ANTRAL= "otolaryngology_paranasal";
		//咽部 
		public static final String  ENT_PHARYNGEAL = "otolaryngology_pharyngeal";
		//扁桃体 
		public static final String ENT_TONSIL = "otolaryngology_tonsilla";

		//其他 
		public static final String  ENT_OTHER = "otolaryngology_other";
		//体检所见
		public static final String   ENT_FINDING = "otolaryngology_finding";

	}

	/**
	 *   口腔科
	 * @author lx
	 *
	 */
	public final class  Stomatology {
		//唇
		public static final String STO_LIP    = "stomatology_lip";
		// 口腔粘膜 
		public static final String    STO_MOUTH  = "stomatology_buccalmucosa";
		//牙周
		public static final String STO_PERIODONTAL = "stomatology_periodontal";
		//齿
		public static final String  STO_TOOTH= "stomatology_stomatology_tooth";
		//舌
		public static final String   STO_TONGUE = "stomatology_tongue";
		//腭 
		public static final String   STO_PALATE= "stomatology_palate";
		//腮腺  
		public static final String    STO_PAROTID_GLAND= "stomatology_parotid";
		//颞下颌关节 
		public static final String   STO_TMJ = "stomatology_tmj";
		//其他 
		public static final String  STO_OTHER = "stomatology_other";
		//体检所见
		public static final String    STO_FINDING = "stomatology_finding";

	}
}
