package com.gb.health.init;
/**
 * 健康陈述中的全部枚举
 * @author lx
 *
 */

public class HealthEnum2 {
	

	/**
	 *舒张压    低压
	 *
                  <80 760
                  80-84 761
                  85-89 762                      
	 * @author lx   Slack
	 *
	 */
	public enum  ChineseMedcine implements EnumMessage2{
		ChineseMedcine1("没有",  1),
		ChineseMedcine2("很少",  2),
		ChineseMedcine3("有时",  3),
		ChineseMedcine4("经常",  4),
		ChineseMedcine5("总是",  5);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		ChineseMedcine (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID () {
			// TODO Auto-generated method stub
			return null;
		}  
	}
	

	
	/**
	 *舒张压    低压
	 *
                  <80 760
                  80-84 761
                  85-89 762                      
	 * @author lx  Slack
	 *
	 */
	public enum  Diastolic implements EnumMessage2{
		Hb_diastolic0("760",  0),
		Hb_diastolic1("761",  1),
		Hb_diastolic2("762",  2);

		private String name;  
		private int index;
	
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Diastolic (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}
	

	
	
	/**
	 *脑卒中家族史
	 *
                   是 751
                   否 752                        
	 * @author lx  Slack
	 *
	 */
	public enum  History implements EnumMessage2{
		 Stroke_history0("751",  1),
		 Stroke_history1("752",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		History (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}
	
	
	
	
	
	/**
	 *体力锻炼很少或轻体力劳动
	 *
                     是 749
                     否 750                        
	 * @author lx  
	 *
	 */
	public enum  Exercise implements EnumMessage2{
		 Stroke_exercise0("749",  1),
		 Stroke_exercise1("750",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Exercise (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}
	
	
	
	
	/**
	 *血脂
	 *
                  正常 745
                  异常 746                        
	 * @author lx
	 *
	 */
	public enum Lipid implements EnumMessage2{
		 Stroke_lipid0("745",  0),
		 Stroke_lipid1("746",  1);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Lipid (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}

	
	
	
	/**
	 *患有房颤或瓣膜性心肌炎
	 *
                    是 741
                    否 742                        
	 * @author lx
	 *
	 */		
	public enum Stroke_carditis implements EnumMessage2{
		Stroke_carditis0("741",  1),
		Stroke_carditis1("742", 0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Stroke_carditis (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}

	/**
	 *短暂性脑缺血  
	 *
                    是 737
                    否 738                        
	 * @author lx
	 *
	 */
	public enum Stroke_ischemic implements EnumMessage2{
		Stroke_ischemic0("737",  1),
		Stroke_ischemic1("738",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Stroke_ischemic (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}



	/**
	 *脑卒中  是 735
                            否 736
	 * @author lx
	 *
	 */
	public enum Stroke_stroke implements EnumMessage2{
		Stroke_stroke0("735",  1),
		Stroke_stroke1("736",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Stroke_stroke (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}





	/**
	 * 您是否发现有高血糖（比如体检时、生病时、怀孕期）是 419 否 420
	 * 
	 *   脑卒中    是 739
                                           否 740
                                           
           高血压：父母是否有高血压
                                    
                都没有 763
                其中一方有 764
                都有 765                            
	 * @author lx
	 *
	 */
	public enum HypertensionAll implements EnumMessage2{
		Hypertension0("419",  1),
		Hypertension1("420",  0),
		
		Stroke_hypertension0("739",  1),
		Stroke_hypertension1("740",  0),
		
		Hb_hypertension0("763",  0),
		Hb_hypertension1("764",  1),
		Hb_hypertension2("765",  2);
		
		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		HypertensionAll (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}




	/**
	 * 您长期服用过降压药吗？是 417 否 418
	 * @author lx
	 *
	 */
	public enum Hypotensor implements EnumMessage2{
		Hypotensor0("417",  1),
		Hypotensor1("418",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Hypotensor (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}


	/**
	 * 您每天吃蔬菜？是 428 否 429
	 * @author lx
	 *
	 */
	public enum Vegetable implements EnumMessage2{
		Vegetable0("428",  1),
		Vegetable1("429",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Vegetable (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}



	/**
	 * 您每天吃水果？是 415 否 416
	 * @author lx
	 *
	 */
	public enum Fruit implements EnumMessage2{
		Fruit0("415",  1),
		Fruit1("416",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Fruit (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}



	/**
	 * 您每天锻炼30分钟以上吗？是 413 否 414
	 * @author lx
	 *
	 */
	public enum Sport implements EnumMessage2{
		Sport0("413",  1),
		Sport1("414",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Sport (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}





	/**
	 * 是否患有糖尿病        糖尿病： 是 422                                                心血管中的糖尿病：   是 403 否 404
                                                                          否 421
                                                                          是（祖父母、堂兄妹） 423
                                                                          
                                                             脑卒中  ：                                                       
                                                                          是 747
                                                                          否 748
	 * @author lx
	 *
	 */
	public enum Diabete implements EnumMessage2{
		Diabetes0("422",  1),
		Diabetes1("421",  0),
		Diabetes2("423",  2),

		Diabetes3("403",  1),
		Diabetes4("404",  0),
		
		Stroke_diabetes0("747",  1),
		Stroke_diabetes1("748",  0);
		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Diabete (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}


	/**
	 * 是否吸烟   是 426 否 427
	 * 
	 * 脑卒中   是 743
                                    否 744
	 * @author lx
	 *
	 */
	public enum Smoking implements EnumMessage2{
		Smoking0("426",  1),
		Smoking1("427",  0),
		
		
		Stroke_smoking0("743",  1),
		Stroke_smoking1("744",  0);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Smoking (String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}


	/**
	 * 总胆固醇                     ＜5.18  424
                    ≥5.18   425
	 * @author lx
	 *
	 */
	public enum Cholesterol implements EnumMessage2{
		Cholesterol0("424",  0),
		Cholesterol1("425",  1);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Cholesterol(String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}




	/**
	 * 高压             ＜120  397
              120-129 398
              130-139  399
              140-159  400
              160-179  401
               ≥180   402
               
      高血压：       
                <120 757
             120-129 758
             130-139 759     
               
               
	 * @author lx
	 *
	 */
	public enum Systolic implements EnumMessage2{



		Systolic0("397",  0),
		Systolic1("398",  1),
		Systolic2("399",  2),
		Systolic3("400",  3),
		Systolic4("401",  4),
		Systolic5("402",  5),
		

		Hb_systolic0("757",  0),
		Hb_systolic1("758",  1),
		Hb_systolic2("759",  2);

		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Systolic(String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}





	/**
	 * 年龄
	 * 35-39  385
40-44  386
45-49  387
50-54  388
55-59  389
60-64  390
65-69  391
70-74  392
75-79  393
80-84  394
85-89  395
90-95  396



糖尿病：
＜45 409
45-54 410
55-64 411
＞64 412

高血压  (年龄)：
20-34 753
35-44 754
45-54 755
55-64 756
	 * @author lx
	 *
	 */
	public enum Age implements EnumMessage2{



		Age0("385",  0),
		Age1("386",  1),
		Age2("387",  2),
		Age3("388",  3),
		Age4("389",  4),
		Age5("390",  5),
		Age6("391",  6),
		Age7("392",  7),
		Age8("393",  8),
		Age9("394",  9),
		Age10("395",  10),
		Age11("396",  11),



		Age12("409",  0),
		Age13("410",  1),
		Age14("411",  2),
		Age15("412",  3),
		
		Hb_age0("753",  0),
		Hb_age1("754",  1),
		Hb_age2("755",  2),
		Hb_age3("756",  3);
		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Age(String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}





	/**
	 * 性别       心血管：男383 女384          糖尿病： 男 407 女 408    中心性肥胖评估：   男405 女 406
	 * @author lx
	 *
	 */
	public enum Sex implements EnumMessage2{



		Sex0("383",  0),
		Sex1("384",  1),
		Sex2("407",  0),
		Sex3("408",  1),
		Sex4("405",  0),
		Sex5("406",  1);
		private String name;  
		private int index;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Sex(String name, int index) {  
			this.name = name;  
			this.index = index;  
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return null;
		}  
	}

	//	public enum sportTime(){
	//		sportTime0(),
	//		sportTime1(),
	//		sportTime2(),
	//		sportTime3(),
	//		sportTime4(),
	//		sportTime5();
	//		
	//	}
	//	
	//	
	//	public enum sportSteps(){
	//		sportSteps0(),
	//		sportSteps1(),
	//		sportSteps2(),
	//		sportSteps3(),
	//		sportSteps4(),
	//		sportSteps5();
	//		
	//	}
	//	



	/**
	 * h_education 文化程度
	 * @author lx
	 *
	 */
	public enum Education implements EnumMessage2{

		education0("文盲及半文盲", 0,258),

		education1("小学以下",  1,99),

		education2("初中",  2,100),

		education3("高中",  3,101),

		education4("中专及技校", 4,102),

		education5("大学本科/大专", 5,103),

		education6("研究生及以上", 6,104);

		public String name;  
		public int index;
		public int id;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Education(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  

	}




	/**
	 * h_insurance 医保类型
	 * @author lx
	 *
	 */
	public enum Insurance implements EnumMessage2{

		insurance0("城镇职工医保", 0,106),

		insurance1("城镇居民医保",  1,328),

		insurance2("新农合医保",  2,327),

		insurance3("无",  3,329),

		insurance4("其他", 4,330);

		private String name;  
		private int index;
		private int id;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */ 
		Insurance(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  

		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}


	/**
	 * h_marriage 婚姻史
	 * @author lx
	 *
	 */
	public enum Marriage implements EnumMessage2{

		marriage0("已婚", 0,107),

		marriage1("未婚",  1,254),

		marriage2("丧偶",  2,255),

		marriage3("离异",  3,256),

		marriage4("其他", 4,257);

		private String name;  
		private int index;
		private int id;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		Marriage(String name, int index,int id) {  
			this.name = name;  
			this.index = index;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}


	/**
	 * l_liveSport_count 每天锻炼次数
	 * @author lx
	 *
	 */
	public enum L_liveSport_count implements EnumMessage2{



		l_liveSport_count1("1",  1,368),

		l_liveSport_count2("2",  2,369),

		l_liveSport_count3("3",  3,370),

		l_liveSport_count4("4",  4,371),

		l_liveSport_count5("5",  5,372),

		l_liveSport_count6("大于5",  6,373);



		private String name;  
		private int index;
		private int id;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		L_liveSport_count(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}


	/**
	 * l_liveSport_minute 每次锻炼时间
	 * @author lx
	 *
	 */
	public enum L_liveSport_minute implements EnumMessage2{



		l_liveSport_minute1("10分钟",  10,361),

		l_liveSport_minute2("20分钟",  20,362),

		l_liveSport_minute3("30分钟",  30,363),

		l_liveSport_minute4("40分钟",  40,364),

		l_liveSport_minute5("50分钟",  50,365),

		l_liveSport_minute6("60分钟",  60,366),

		l_liveSport_minute7("大于60分钟",  70,367);



		private String name;  
		private int index;
		private int id;
		/**
		 * 构造方法  
		 * @param name
		 * @param index
		 */
		L_liveSport_minute(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}





	/**
	 * h_liveFood_structure 饮食结构
	 * @author lx
	 *
	 */
	public enum LiveFood_structure implements EnumMessage2{

		Food_structure0("荤素搭配", 0,3,116),

		Food_structur1("素食为主",  1,0,118),

		Food_structure2("荤食为主", 2,0,119);

		private String name;  
		private int index;
		private int score;
		private int id;
		/**
		 *  构造方法  
		 * @param name
		 * @param index
		 * @param score
		 */
		LiveFood_structure(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}

	/**
	 * 每日平均摄入食物种类   h_liveFood_dayKind
	 * @author lx
	 *
	 */
	public enum LiveFood_dayKind implements EnumMessage2{

		liveFood_dayKind0("小于12种", 0,0,134),

		liveFood_dayKind1("12种",  1,1,135),

		liveFood_dayKind2("大于12种", 2,1,136);

		private String name;  
		private int index;
		private int score;
		private int id;
		/**
		 *  构造方法  
		 * @param name
		 * @param index
		 * @param score
		 */
		LiveFood_dayKind(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}


	/**
	 * h_liveFood_weekKind 每周平均摄入食物种类
	 * @author lx
	 *
	 */
	public enum LiveFood_weekKind implements EnumMessage2{

		liveFood_weekKind0("小于25种", 0,0,288),

		liveFood_weekKind1("25种",  1,1,289),

		liveFood_weekKind2("大于25种", 2,1,290);
		private String name;  
		private int index;
		private int score;
		private int id;
		/**
		 *  构造方法  
		 * @param name
		 * @param index
		 * @param score
		 */
		LiveFood_weekKind(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}

	/**
	 * h_liveFood_primary每日平均摄入主食的量
	 * @author lx
	 *
	 */
	public enum LiveFood_primary implements EnumMessage2{

		liveFood_primary0("小于250克", 0,3,275),

		liveFood_primary1("250-400克",  1,5,276),

		liveFood_primary2("大于400克", 2,3,277);

		private String name;  
		private int index;
		private int score;
		private int id;
		
		/**
		 *  构造方法  
		 * @param name
		 * @param index
		 * @param score
		 */
		LiveFood_primary(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		} 

		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}



	/**
	 * h_liveFood_potato 每日平均摄入薯类的量
	 * @author lx
	 *
	 */
	public enum LiveFood_potato implements EnumMessage2{

		liveFood_potato0("小于50克", 0,3,278),

		liveFood_potato1("50-100克",  1,5,279),

		liveFood_potato2("大于100克", 2,3,280),

		liveFood_potato3("从不吃", 3,0,284);

		private String name;  
		private int index;
		private int score;
		private int id;
		/**
		 *  构造方法  
		 * @param name
		 * @param index
		 * @param score
		 */
		LiveFood_potato(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}


	/**
	 * h_liveFood_bean 每日平均摄入谷物和杂豆类的量
	 * @author lx
	 *
	 */
	public enum LiveFood_bean implements EnumMessage2{

		liveFood_bean0("小于50克", 0,3,281),

		liveFood_bean1("50-100克",  1,5,282),

		liveFood_bean2("大于100克", 2,5,283);
		private String name;  
		private int index;
		private int score;
		private int id;
		/**
		 *  构造方法  
		 * @param name
		 * @param index
		 * @param score
		 */
		LiveFood_bean(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  

	}


	/**
	 * h_liveFood_vegetable 每日平均摄入蔬菜的量
	 * @author lx
	 *
	 */
	public enum LiveFood_vegetable implements EnumMessage2{

		liveFood_vegetable0("小于300克", 0,3,285),

		liveFood_vegetable1("300-500克",  1,5,286),

		liveFood_vegetable2("500克以上", 2,5,287);

		private String name;  
		private int index;
		private int score;
		private int id;
		/**
		 *  构造方法  
		 * @param name
		 * @param index
		 * @param score
		 */
		LiveFood_vegetable(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}


	/**
	 * h_liveFood_fruit 每日平均摄入水果的量        lackinfo
	 */
	public enum LiveFood_fruit implements EnumMessage2{

		liveFood_fruit0("小于200克", 0,3,291),

		liveFood_fruit1("200-350克",  1,5,292),

		liveFood_fruit2("大于350克", 2,5,293),

		liveFood_fruit3("不吃", 3,0,0);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_fruit(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id =id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  

	}


	/**
	 * h_liveFood_milk 每日平均摄入奶以及奶制品的量
	 * @author lx
	 *
	 */
	public enum LiveFood_milk implements EnumMessage2{

		liveFood_milk0("小于300克", 0,3,294),

		liveFood_milk1("大于等于300克", 1, 5,295),

		liveFood_milk2("从来不喝或不吃",2, 0,296);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_milk(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id=id;

		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;

		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  


	}



	/**
	 * h_liveFood_nut 每日平均摄入的大豆及坚果的量  lackinfo
	 * @author lx
	 *
	 */
	public enum LiveFood_nut implements EnumMessage2{

		liveFood_nut0("25-35克", 0,5,297),

		liveFood_nut1("大于35克",  1,5,298),

		liveFood_nut2("小于25克", 2,3,299),

		liveFood_nut3("不吃", 3,0,0);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_nut(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}


	/**
	 * h_liveFood_salt 每日平均摄入的盐的量
	 * @author lx
	 *
	 */
	public enum LiveFood_salt implements EnumMessage2{

		liveFood_salt0("2-6克", 0,4,300),

		liveFood_salt1("6克",  1,4,301),

		liveFood_salt2("6-12克", 2,2,302),

		liveFood_salt3("大于12克", 3,2,303);



		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_salt(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}	


	/**
	 * h_liveFood_meat 每日平均摄入的畜禽肉的量
	 * @author lx
	 *
	 */
	public enum LiveFood_meat implements EnumMessage2{

		liveFood_meat0("小于40克", 0,3,304),

		liveFood_meat1("40-75克",  1,5,305),

		liveFood_meat2("大于75克", 2,5,306),

		liveFood_meat3("从不吃", 2,0,311);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_meat(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	



	/**
	 * h_liveFood_fish  每日平均摄入鱼虾的量
	 * @author lx
	 *
	 */
	public enum LiveFood_fish  implements EnumMessage2{

		liveFood_fish0("小于40克", 0,3,308),

		liveFood_fish1("40-75克",  1,5,309),

		liveFood_fish2("大于75克", 2,5,310),

		liveFood_fish3("从不吃", 3,0,307);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_fish(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	


	/**
	 * h_liveFood_egg 每日平均摄入蛋的量
	 * @author lx
	 *
	 */
	public enum LiveFood_egg  implements EnumMessage2{

		liveFood_egg0("25-50克", 0,3,312),

		liveFood_egg1("50克",  1,5,313),

		liveFood_egg2("大于50克", 2,0,314),

		liveFood_egg3("从不吃", 3,0,315);



		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_egg(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	


	/**
	 * h_liveFood_oil	每日平均摄入的油的量 
	 * @author lx
	 *
	 */
	public enum LiveFood_oil  implements EnumMessage2{

		liveFood_oil0("小于25克", 0,3,316),

		liveFood_oil1("25-30克",  1,5,317),

		liveFood_oil2("大于30克", 2,3,318);


		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_oil(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	


	/**
	 * h_liveFood_sugar 每日平均摄入的单糖的量
	 * @author lx
	 *
	 */
	public enum LiveFood_sugar  implements EnumMessage2{

		liveFood_sugar0("小于25克", 0,1,320),

		liveFood_sugar1("25-50克",  1,0,321),

		liveFood_sugar2("大约50克", 2,0,322),

		liveFood_sugar3("从来不吃", 3,1,323);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_sugar(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}	

	/**
	 * h_liveFood_water 每日平均饮水量
	 * @author lx
	 *
	 */
	public enum LiveFood_water  implements EnumMessage2{

		liveFood_water0("小于1500毫升", 0,0,324),

		liveFood_water1("1500-1700毫升（大约7-8杯）",  1,5,325),

		liveFood_water2("大于1700毫升", 2,3,326);


		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		LiveFood_water(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	


	/**
	 * h_smoke_condition吸烟状况
	 * @author lx
	 *
	 */
	public enum Smoke_condition  implements EnumMessage2{

		smoke_condition0("从不吸烟", 0,4,120),

		smoke_condition1("已戒烟",  1,2,121),

		smoke_condition2("吸烟", 2,0,122);


		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Smoke_condition(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		} 

		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	



	/**
	 * h_smoke_beginAge 开始吸烟的年龄
	 * @author lx
	 *
	 */
	public enum Smoke_beginAge  implements EnumMessage2{

		smoke_beginAge0("20岁之前", 0,123),

		smoke_beginAge1("20岁之后",  1,124),

		smoke_beginAge2("30岁之后", 2,125);


		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Smoke_beginAge(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	


	/**
	 * h_smoke_number 每天吸烟的支数
	 * @author lx
	 *
	 */
	public enum Smoke_number implements EnumMessage2{

		smoke_number0("1-5支", 0,126),

		smoke_number1("5-10支", 1,127),

		smoke_number2("10-20支", 2,128);


		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Smoke_number(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	


	/**
	 * h_smoke_endAge 开始戒烟的年龄
	 * @author lx
	 *
	 */
	public enum Smoke_endAge  implements EnumMessage2{

		smoke_endAge0("30-40岁", 0,129),

		smoke_endAge1("40-50岁",  1,130),

		smoke_endAge2("50-60岁", 2,131);


		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Smoke_endAge(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id =id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	

	/**
	 * h_smoke_env 工作或者居住的环境有吸烟的吗  int 
	 * @author lx
	 *
	 */
	public enum Smoke_env  implements EnumMessage2{

		smoke_env0("无", 0,1,132),

		smoke_env1("有",  1,0,133);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Smoke_env(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	



	/**
	 * h_wine_Hz 饮酒频率
	 * @author lx
	 *
	 */
	public enum Wine_Hz  implements EnumMessage2{

		wine_Hz0("从不", 0,137),

		wine_Hz1("偶尔", 1,138),

		wine_Hz2("经常",  2,139),

		wine_Hz3("每天",  3,140),

		wine_Hz4("已戒酒",  4,141);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Wine_Hz(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	



	/**
	 * h_wine_kind 饮酒种类 lackinfo
	 * @author lx
	 *
	 */
	public enum Wine_kind  implements EnumMessage2{

		wine_kind0("白酒", 0,142),

		wine_kind1("啤酒", 1,143),

		wine_kind2("红酒",  2,144),

		wine_kind3("黄酒",  3,145),

		wine_kind4("其他",  4,0);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Wine_kind(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;

		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}	

	/**
	 * h_wine_beer	啤酒
	 * @author lx
	 *
	 */
	public enum Wine_beer  implements EnumMessage2{

		wine_beer0("小于等于 450毫升", 0,4,153),

		wine_beer1("大于450毫升", 1,0,154),

		wine_beer2("小于等于750毫升",  2,4,146),

		wine_beer3("大于750毫升",  3,0,147);

		private int score;
		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Wine_beer(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id=id;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}	


	/**
	 * h_wine_white 白酒
	 * @author lx
	 *
	 */
	public enum Wine_white  implements EnumMessage2{

		wine_white0("小于等于1两", 0,4,155),

		wine_white1("大于1两", 1,0,156),

		wine_white2("小于等于1.5两",2,4,148),

		wine_white3("大于1.5两",  3,0,149);


		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Wine_white(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index; 
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}			

	/**
	 * h_wine_red 红酒
	 * @author lx
	 *
	 */
	public enum Wine_red  implements EnumMessage2{

		wine_red0("小于等于 150毫升", 0,4,157),

		wine_red1("大于150毫升", 1,0,158),

		wine_red2("小于等于250毫升",  2,4,381),

		wine_red3("大于250毫升",  3,0,382);


		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Wine_red(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}				

	/**
	 * h_wine_yellow 黄酒 lackinfo
	 * @author lx
	 *
	 */
	public enum Wine_yellow  implements EnumMessage2{

		wine_yellow0("小于等于4两", 0,4,159),

		wine_yellow1("4两以上", 1,0,160),

		wine_yellow2("小于等于6两",  2,4,150),

		wine_yellow3("大于6两",  3,0,151);


		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Wine_yellow(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;
			this.score=score;
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}				


	//h_wine_beginAge 开始饮酒年龄
	public enum Wine_beginAge  implements EnumMessage2{

		wine_beginAge0("20岁之前", 0,350),

		wine_beginAge1("20岁之后", 1,351),

		wine_beginAge2("30岁之后",  2,352);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Wine_beginAge(String name, int index,int id) {  
			this.name = name;  
			this.index = index;
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}				


	//h_wine_endAge 开始戒酒年龄
	public enum Wine_endAge implements EnumMessage2{

		wine_endAge0("30-40岁", 0,353),

		wine_endAge1("40-50岁", 1,354),

		wine_endAge2("50-60岁",  2,355);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Wine_endAge(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			

	/**
	 * h_wine_year 饮酒年数
	 * @author lx
	 *
	 */
	public enum Wine_year implements EnumMessage2{

		wine_year0("四年及以上", 0,0,356),

		wine_year1("四年以下", 1,1,357);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Wine_year(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}

		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}				

	/**
	 * h_wine_drunk 最近一年是否有醉酒
	 * @author lx
	 *
	 */
	public enum Wine_drunk implements EnumMessage2{

		wine_drunk0("否", 0,359),

		wine_drunk1("是", 1,358);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Wine_drunk(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		} 

		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}

		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}				


	/**
	 * h_sleep_time 您每天的睡眠时间是
	 * @author lx
	 *
	 */
	public enum Sleep_time implements EnumMessage2 {

		sleep_time0("3-5小时", 0,1,161),

		sleep_time1("5-7小时", 1,3,162),

		sleep_time2("大于等于7小时", 2,4,163);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Sleep_time(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;  
			this.score=score;
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}				

	/**
	 * h_sleep_wakeNumber 每天夜里是否会醒来
	 * @author lx
	 *
	 */
	public enum Sleep_wakeNumber implements EnumMessage2{

		sleep_wakeNumber0("从不", 0,166),

		sleep_wakeNumber1("2-3次", 1,164),

		sleep_wakeNumber2("大于3次", 2,165);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Sleep_wakeNumber(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			

	/**
	 * h_sleep_insomnia 失眠
	 * @author lx
	 *
	 */
	public enum Sleep_insomnia implements EnumMessage2{

		sleep_insomnia0("从不", 0,1,167),

		sleep_insomnia1("经常", 1,0,169),

		sleep_insomnia2("偶尔", 2,0,168);

		private String name;  
		private int index;
		private int score;
		private int id;
		// 构造方法  
		Sleep_insomnia(String name, int index,int score,int id) {  
			this.name = name;  
			this.index = index;
			this.score=score;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			


	/**
	 * h_perceive_nearMemory 您的近期记忆有减轻吗
	 * @author lx
	 *
	 */
	public enum Perceive_nearMemory implements EnumMessage2{

		perceive_nearMemory0("没有", 0,171),

		perceive_nearMemory1("有", 1,170);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Perceive_nearMemory(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}			


	/**
	 * h_perceive_farMemory 您的远期记忆有减轻吗
	 * @author lx
	 *
	 */
	public enum Perceive_farMemory implements EnumMessage2{

		perceive_farMemory0("没有", 0,173),

		perceive_farMemory1("有", 1,172);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Perceive_farMemory(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			


	/**
	 * h_perceive_calc 您的计算能力有下降吗
	 * @author lx
	 *
	 */
	public enum Perceive_calc implements EnumMessage2{

		perceive_calc0("没有", 0,175),

		perceive_calc1("有", 1,174);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Perceive_calc(String name, int index,int id) {  
			this.name = name;  
			this.index = index;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			



	/**
	 * h_perceive_direction您的定向力（方向感）有下降吗
	 * @author lx
	 *
	 */
	public enum Perceive_direction implements EnumMessage2{

		perceive_direction0("没有", 0,177),

		perceive_direction1("有", 1,176);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Perceive_direction(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	
	}			


	/**
	 * h_psy_live 您是否对目前的生活满意吗
	 * @author lx
	 *
	 */
	public enum Psy_live implements EnumMessage2{

		psy_live0("否", 0,179),

		psy_live1("是", 1,178);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Psy_live(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			

	/**
	 * h_psy_job 您是否对目前的工作满意
	 * @author lx
	 *
	 */
	public enum Psy_job implements EnumMessage2{

		psy_job0("否", 0,181),

		psy_job1("是", 1,180);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Psy_job(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			

	/**
	 * h_psy_workPress	您是否认为过去一年中自己的工作压力很大
	 * @author lx
	 *
	 */
	public enum Psy_workPress implements EnumMessage2{

		psy_workPress0("否", 0,183),

		psy_workPress1("是", 1,182);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Psy_workPress(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id =id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			


	/**
	 * h_psy_feelLow 您是否认为过去一年中自己的情绪低落或者沮丧
	 * @author lx
	 *
	 */
	public enum Psy_feelLow implements EnumMessage2{

		psy_feelLow0("否", 0,185),

		psy_feelLow1("是", 1,184);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Psy_feelLow(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id =id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return  id;
		}  	
	}

	/**
	 * h_psy_anxiety 您是否认为过去一年中自己的心情烦躁或者焦虑
	 * @author lx
	 *
	 */
	public enum Psy_anxiety implements EnumMessage2{

		psy_anxiety0("否", 0,187),

		psy_anxiety1("是", 1,186);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Psy_anxiety(String name, int index,int id) {  
			this.name = name;  
			this.index = index;  
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		} 
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			

	/**
	 * h_character1 您是属于爱发脾气，遇事着急的吗
	 * @author lx
	 *
	 */
	public enum Character1 implements EnumMessage2{

		character1_0("否", 0,189),

		character1_1("是", 1,188);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Character1(String name, int index,int id) {  
			this.name = name;  
			this.index = index;
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}		


	/**
	 * h_character2 
	 * @author lx
	 *
	 */
	public enum Character2 implements EnumMessage2{

		character2_0("否", 0,191),

		character2_1("是", 1,190);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Character2(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}  
		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  
	}			


	/**
	 * h_character3 您是属于郁郁寡欢，经常不开心的吗
	 * @author lx
	 *
	 */
	public enum Character3 implements EnumMessage2{

		character3_0("否", 0,193),

		character3_1("是", 1,192);

		private String name;  
		private int index;
		private int id;
		// 构造方法  
		Character3(String name, int index,int id) {  
			this.name = name;  
			this.index = index; 
			this.id=id;
		}
		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}

		@Override
		public Object getValueCode() {
			// TODO Auto-generated method stub
			return index;
		}
		@Override
		public Object getValueID() {
			// TODO Auto-generated method stub
			return id;
		}  	

			}				



}