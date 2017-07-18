package com.gb.health.algorithm;


import com.gb.health.init.MyContextListener;
import com.gb.health.utill.XmlUtil;
import org.apache.log4j.Logger;
import org.dom4j.Element;
import org.springframework.web.context.WebApplicationContext;

import java.io.Serializable;
import java.util.*;

/**
 * Created by Administrator on 2016/11/14 0014.  计算什么类型体质
 */
public class QuestionCalculate{
	
	private Logger logger=Logger.getLogger(QuestionCalculate.class);
	
    public static final String TAG = "QuestionCalculate";
    /**
     * 题目总分
     */
    private   int originalS;
    /**
     * 平和体质转换分
     */
    private int conversionS;
    /**
     * xml读取的问题和答案
     */
//    public ArrayList<Question>  ques = new ArrayList<>();
    /**
     * 存储题目副本。算法时用到
     */
    public ArrayList<Question>  questCalc = new ArrayList<>();

    /**
     * 每个体质 的平均分
     */
    int[] avgCount = null;
    /**
     * 每个体质的转换分
     */
    public  int[] original = null;
   
    public QuestionCalculate(Map<String, Integer> map){
        init(map);
    }


    public void init(Map<String, Integer> map){

        initProplem();
        initOtherInfo(map);

    }


    private void initProplem(){

////       String[] arr = ctxt.getResources().getStringArray(R.array.body);
//        for (int i = 0; i < arr.length; i++) {
//            Question question = new Question();
//            question.problem = arr[i];
//            question.serai = i+1;
//            if(Const.users.sex == 1&& question.serai == 59){
//             continue;
//            }else if (Const.users.sex != 1&& question.serai == 60){
//                continue;
//            }
//            if(i!=2) {
//             //   question.answer = new Random().nextInt(5) + 1;
//            }
//            ques.add(question);
//        }


    }



    /**
     * @auchor wh
     * create at 2016/12/6 0006 10:47
     * @TODO 校验是否还有没答过的体
     * @param
     * @return 0全部作答 其他则是对应题目未作答
     */

//   public int verification(){
//
//       for (int i = 0; i < ques.size(); i++) {
//
//           if (ques.get(i).answer ==0){
//               return ques.get(i).serai;
//           }
//       }
//
//
//       return  0;
//
//   }

    public  void initOtherInfo(Map<String, Integer> map){
        String[] arr = initArrXML("values1.xml");
        
        List<String> quse=initQuseXML("values1.xml");
        
        
//
        for (int i = 0; i < arr.length; i++) {
            String[] otherInfo = arr[i].split("-");
            Question question = new Question();
            question.tag = Integer.valueOf(otherInfo[0]);
            question.tagStart = Integer.valueOf(otherInfo[2]);
            question.serai =  Integer.valueOf(otherInfo[1]);
           // System.out.println(quse.size()+"----------------------");
            String key=quse.get(Integer.valueOf(otherInfo[1])-1);
//            System.out.println(map);
//            System.out.println(key+"++++++++++++++++"+map.get(key));
           
//
            
            if(question.serai == 60){
            	
            	if (map.get("sex") == 1) {
            		question.answer=map.get(key);
                	questCalc.add(question);
				}
                continue;
            }else if (question.serai == 59){
            	if (map.get("sex") != 1) {
            		question.answer=map.get(key);
                	questCalc.add(question);
				}
                continue;
            }
            
            try {
				question.answer=map.get(key);
			} catch (Exception e) {
				logger.error("数据不全："+key+" 为空");
//				question.answer=1;
				e.printStackTrace();
			}
            questCalc.add(question);
        }
    }
   /**
    * @auchor wh
    * create at 2016/12/6 0006 10:38
    * @TODO中医体质所有分类
    * @param
    * @return
    */
    public enum Tzenum implements Serializable{
        PHYSIQUE_A(1,"平和体质"),
        PHYSIQUE_B(2,"气虚体质"),
        PHYSIQUE_C(3,"阳虚体质"),
        PHYSIQUE_D(4,"阴虚体质"),
        PHYSIQUE_E(5,"痰湿体质"),
        PHYSIQUE_F(6,"湿热体质"),
        PHYSIQUE_G(7,"血瘀体质"),
        PHYSIQUE_H(8,"气郁体质"),
        PHYSIQUE_I(9,"特禀体质"),
        PHYSIQUE_J(10,"平和体质");
       /**
        * 序号
        */
        public int serial;
       /**
        * 题目
        */
        public String text;
        public int count;
        public boolean istrai; //是否倾向
        public static Tzenum getTZennum(int serial){

            switch (serial){
                case 0:
                    return Tzenum.PHYSIQUE_A;
                case 1:
                    return Tzenum.PHYSIQUE_B;
                case 2:
                    return Tzenum.PHYSIQUE_C;
                case 3:
                    return Tzenum.PHYSIQUE_D;
                case 4:
                    return Tzenum.PHYSIQUE_E;
                case 5:
                    return Tzenum.PHYSIQUE_F;
                case 6:
                    return Tzenum.PHYSIQUE_G;
                case 7:
                    return Tzenum.PHYSIQUE_H;
                case 8:
                    return Tzenum.PHYSIQUE_I;
                case 9:
                    return Tzenum.PHYSIQUE_J;


            }
   return null;

        }


         Tzenum(int serial,String text){
            this.serial = serial;
            this.text = text;
        }

    }


    /**
     * @auchor wh
     * create at 2016/12/6 0006 10:41
     * @TODO 计算出属于什么体质
     * @param
     * @return
     */
    public ArrayList<Tzenum> getResult(){
        calcu();

        ArrayList<Tzenum>  tzs = new ArrayList<>();
        int c30 = 0;
        int c30r40 = 0;
        int c40=0;
        if(conversionS >= 60){
            for (int i = 1; i < avgCount.length; i++) {
                if(avgCount[i]<30){
                    c30++;
                }else if(avgCount[i]>=30 && avgCount[i]<=40){
                    c30r40++;
                }else if(avgCount[i]>=40){
                    c40++;
                        Tzenum tzenum = Tzenum.getTZennum(i);
                        tzenum.count = avgCount[i];
                        tzs.add(Tzenum.getTZennum(i));

                }
            }

            if (c30 == 8){
                tzs.add(Tzenum.PHYSIQUE_A);
            }else if(c30r40 == 8){
                tzs.add(Tzenum.PHYSIQUE_I);
            }

        }else if(conversionS<60){
            int tag  = -1;   //找出30到40间的索引 i

            int value = 0;   //30到40间值的最大值


            for (int i = 1; i < avgCount.length; i++) {

                if (avgCount[i] >= 40) {
                    c40++;
                        Tzenum tzenum = Tzenum.getTZennum(i);
                        tzenum.count = avgCount[i];
                        tzs.add(Tzenum.getTZennum(i));

                } else if (avgCount[i] >= 30 && avgCount[i] <= 40) {
                    c30r40++;
                    if (avgCount[i] > value) {
                        value = avgCount[i];
                        tag = i;
                    }

                } else if (avgCount[i] < 30) {
                    c30++;
                }


            }

            if (c30 == 8){
                tzs.add(Tzenum.PHYSIQUE_A);
                return tzs;
            }
            if(c30r40 == 8){
                Tzenum  tzenum= Tzenum.PHYSIQUE_J;
                tzs.add(tzenum);
                return  tzs;
            }
            if (tzs.size()==0 && tag != -1){
                Tzenum  tzenum= Tzenum.getTZennum(tag);
                tzenum.istrai = true;
                tzs.add(tzenum);
                return  tzs;
            }



        }
          printLog();


        Collections.sort(tzs, new Comparator<Tzenum>() {
            @Override
            public int compare(Tzenum lhs, Tzenum rhs) {

                if (lhs.count < rhs.count) {
                    return 1;
                } else if (lhs.count == rhs.count) {
                    return 0;
                }
                return -1;
            }
        });

//        Log.e(TAG, "getResult: "+tzs );



        if(tzs.size()>3){


            Tzenum[] removeindex = new Tzenum[tzs.size()-3];
            for (int i=3;i<tzs.size();i++){
                removeindex[i-3] = tzs.get(i);
            }
            for (int i = 0; i < removeindex.length; i++) {
                tzs.remove(removeindex[i]);
            }


        }


        return  tzs;


    }


    /**
     * 算法实现
     */
    public  void calcu(){

            originalS = 0;
            conversionS =0;
        avgCount = new int[9];


//        for (int i = 0; i < questCalc.size(); i++) {
//            Question calcQuest = questCalc.get(i);
//            Question question = null;
//            if (calcQuest.serai == 61){
//                 question = ques.get(59);
//            }else
//             question = ques.get(calcQuest.serai-1);
//            calcQuest.answer = question.answer;
//            calcQuest.score = question.score;
//            calcQuest.problem = question.problem;
//        }

        for (int i = 0; i < questCalc.size(); i++) {
            Question question = questCalc.get(i);
            question.calculate();
            originalS +=  question.score;

            switch (question.tag){
                case 1:
                    avgCount[0] += question.score;
//                    Log.e(TAG, "question.tag: "+ question.score);
                    break;
                case 2:
                    avgCount[1] += question.score;
                    break;
                case 3:
                    avgCount[2] += question.score;
                    break;
                case 4:
                    avgCount[3] += question.score;
                    break;
                case 5:
                    avgCount[4] += question.score;
                    break;
                case 6:
                    avgCount[5] += question.score;
                    break;
                case 7:
                    avgCount[6] += question.score;
                    break;
                case 8:
                    avgCount[7] += question.score;
                    break;
                case 9:
                    avgCount[8] += question.score;
                    break;
            }



        }

        logger.debug(TAG+"avgCount11: "+avgCount[0] );
        logger.debug(TAG+ "avgCount12: "+avgCount[1] );
        logger.debug(TAG+"avgCount13: "+avgCount[2] );
        logger.debug(TAG+"avgCount14: "+avgCount[3] );
        logger.debug(TAG+"avgCount15: "+avgCount[4] );
        logger.debug(TAG+"avgCount16: "+avgCount[5] );
        logger.debug(TAG+"avgCount17: "+avgCount[6] );
        logger.debug(TAG+"avgCount18: "+avgCount[7] );
        original = new int[9];
        for (int i=0;i<avgCount.length;i++){

            original[i] = avgCount[i];

        }



        avgCount[0] = (int)((avgCount[0]-8)/(8*4f)*100);
        avgCount[1] = (int)((avgCount[1]-8)/(8*4f)*100);
        avgCount[2] = (int)((avgCount[2]-7)/(7*4f)*100);
        avgCount[3] = (int)((avgCount[3]-8)/(8*4f)*100);
        avgCount[4] = (int)((avgCount[4]-8)/(8*4f)*100);
        avgCount[5] = (int)((avgCount[5]-6)/(6*4f)*100);
        avgCount[6] = (int)((avgCount[6]-7)/(7*4f)*100);
        avgCount[7] = (int)((avgCount[7]-7)/(7*4f)*100);
        avgCount[8] = (int)((avgCount[8]-7)/(7*4f)*100);



        conversionS = avgCount[0];
        logger.debug(TAG+"originalS总分: "+originalS );
        logger.debug(TAG+"conversionS转换分: "+conversionS );




    }
    
    private static  String[] initArrXML(String url){
    	
    	//String path=url;
    	
    	WebApplicationContext web = (WebApplicationContext) MyContextListener.getApplicationContext();
		String path =web.getServletContext().getRealPath("/");
		path = path+"/WEB-INF/"+url;
    	
    	Element element =XmlUtil.getRootNode(path);
    	
    	Element el=XmlUtil.getChild(element, "class-array");
    	
    	List<Element> list=XmlUtil.getChildList(el);
    	System.out.println(list);
    	
    	String[] arr=new String[list.size()];
    	
    	for (int i = 0; i < list.size(); i++) {
    		arr[i]=list.get(i).getText();
		}
    	
    	
    	return arr;
    }
    
    private List<String> initQuseXML(String url){
    	
    	WebApplicationContext web = (WebApplicationContext) MyContextListener.getApplicationContext();
		String path =web.getServletContext().getRealPath("/");
		path = path+"/WEB-INF/"+url;
    	
    	Element element =XmlUtil.getRootNode(path);
    	
    	Element el=XmlUtil.getChild(element, "string-array1");
    	
    	List<Element> list=XmlUtil.getChildList(el);
    	
    	List<String> arr=new ArrayList<>();
    	
    	for (int i = 0; i < list.size(); i++) {
    		arr.add(list.get(i).getText());
		}
    	
    	return arr;
    }



    private void  printLog(){

    	logger.debug(TAG+ "avgCount11: "+avgCount[0] );
    	logger.debug(TAG+"avgCount12: "+avgCount[1] );
    	logger.debug(TAG+"avgCount13: "+avgCount[2] );
    	logger.debug(TAG+"avgCount14: "+avgCount[3] );
    	logger.debug(TAG+"avgCount15: "+avgCount[4] );
    	logger.debug(TAG+"avgCount16: "+avgCount[5] );
    	logger.debug(TAG+ "avgCount17: "+avgCount[6] );
    	logger.debug(TAG+"avgCount18: "+avgCount[7] );


    	logger.debug(TAG+"originalS总分: "+originalS );
    	logger.debug(TAG+"conversionS转换分: "+conversionS );

    }
    public static void main(String[] args) {
    String[] str=	initArrXML("WebContent/WEB-INF/values1.xml");
    for (String string : str) {
    	System.out.println(string);
		
	}
    	
	}


}
