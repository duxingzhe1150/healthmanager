package com.gb.health.algorithm;

/**
 * Created by Administrator on 2016/11/14 0014.
 */
public class Question {
    /**
     *  需要颠倒运算  
     */
    public static final int START_YES = 1;
    /**
     *不需要颠倒运算  
     */
    public static final int START_NO = 0;
    /**
     *问题
     */
    public String problem;   //问题
    /**
     答案
     */
    public int answer;       //答案
    /**
     *分类标记
     */
    public int tag;          //分类标记
    /**
     *分数
     */
    public int score;        // 分数
    /**
     *是否有星星标记
     */
    public int tagStart ;     //是否有星星标记
    /**
     *序号
     */
    public int serai;

  /**
   * @auchor wh
   * create at 2016/12/6 0006 10:37
   * @TODO 颠倒运算 
   * @param 
   * @return 
   */
    public void calculate(){
      if(tagStart == Question.START_YES && score!=0){
          this.score = 6-answer;
      }else{
          this.score = answer;
      }
    }

}
