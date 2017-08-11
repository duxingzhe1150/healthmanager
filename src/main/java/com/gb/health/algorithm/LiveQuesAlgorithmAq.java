
package com.gb.health.algorithm;

import java.util.HashMap;
import java.util.Map;


import com.gb.health.domain.TbHealthLive;
import com.gb.health.init.HealthEnum;
import com.gb.health.init.HealthEnum.LiveFood_oil;

import com.gb.health.init.Concat;
import com.gb.health.init.HealthEnum.LiveFood_structure;
import com.gb.health.op.LiveSuggestDetail;
import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.MathCheckoutUtil;


/**
 * 

 * 
 * @author         Administrator
 * @version        V1.0  
 *            2017年4月5日 下午4:11:00 

 */
public class LiveQuesAlgorithmAq extends AbsFactory<TbHealthLive, Integer> {

	/**
	 * <p>Title: result</p>
	 * <p>Description: </p>
	 * @param fi
	 * @return
	 */
	@Override
	public Integer result(FetureInter<TbHealthLive> fi) {
		
		TbHealthLive t = fi.getParam();
		// TODO Auto-generated method stub
		
       Map<String, Integer> resultMap=new HashMap<String, Integer>();
       
		if (t==null) {
			
			resultMap.put("noData", -1);
			this.suggest=resultMap;
			return -1;
		}
		int score=0;
		//锻炼
		if (t.getlLivesportWay()==null || "无".equals(t.getlLivesportWay())) {
			resultMap.put("l_physical_exercise", 0);
		}else {
			//每周锻炼时间分数
			score= MathCheckoutUtil.integerCheckAndTransfer(t.getlLivesportMinute())*MathCheckoutUtil.integerCheckAndTransfer(t.getlLivesportCount())*MathCheckoutUtil.integerCheckAndTransfer(t.getlLivesportDayweek())/30;
			resultMap.put("l_physical_exercise",   (score>=5 ? 5 :score));
			
			
		}
		
		//每日活动步数分数
		score=MathCheckoutUtil.integerCheckAndTransfer(t.getlLivesportStep())/1200;
		resultMap.put("l_liveSport_step",   (score>=5 ? 5 :score));
		
		
		
		
		//膳食结构分数
		//LiveFood_oil obj=  EnumUtil.getEnumObject(t.getlLivefoodStructure()==null ? 0 :t.getlLivefoodStructure(), LiveFood_oil.class);
		LiveFood_structure obj= t.getlLivefoodStructure()==null ?null : EnumUtil.getEnumObject(t.getlLivefoodStructure(),LiveFood_structure.class);
		resultMap.put("l_liveFood_structure",   (obj==null ? 0 : obj.getScore()));
		
		//每日吃够12种分数
		resultMap.put("l_liveFood_dayKind",   (t.getlLivefoodDaykind()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodDaykind(), HealthEnum.LiveFood_dayKind.class).getScore()));
		
		//每周吃25种分数
		resultMap.put("l_liveFood_weekKind",   (t.getlLivefoodWeekkind()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodWeekkind(), HealthEnum.LiveFood_weekKind.class).getScore()));
		
		//主食摄入状况分数
		resultMap.put("l_liveFood_primary",   (t.getlLivefoodPrimary()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodPrimary(), HealthEnum.LiveFood_primary.class).getScore()));
		
		//薯类摄入分数
		resultMap.put("l_liveFood_potato",   (t.getlLivefoodPotato()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodPotato(), HealthEnum.LiveFood_potato.class).getScore()));
		
		//谷物和杂豆摄入状况分数
		resultMap.put("l_liveFood_bean",   (t.getlLivefoodBean()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodBean(), HealthEnum.LiveFood_bean.class).getScore()));
		
		//蔬菜摄入分数
		resultMap.put("l_liveFood_vegetable",   (t.getlLivefoodVegetable()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodVegetable(), HealthEnum.LiveFood_vegetable.class).getScore()));
		
		//水果摄入分数
		resultMap.put("l_liveFood_fruit",   (t.getlLivefoodFruit()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodFruit(), HealthEnum.LiveFood_fruit.class).getScore()));
		
		//奶及奶制品摄入
		resultMap.put("l_liveFood_milk",   (t.getlLivefoodMilk()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodMilk(), HealthEnum.LiveFood_milk.class).getScore()));
		
		//坚果摄入状况分数
		resultMap.put("l_liveFood_nut",   (t.getlLivefoodNut()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodNut(), HealthEnum.LiveFood_nut.class).getScore()));
		
		//摄入食盐的量分数
		resultMap.put("l_liveFood_salt",   (t.getlLivefoodSalt()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodSalt(), HealthEnum.LiveFood_salt.class).getScore()));
		
		//畜禽肉摄入分数
		resultMap.put("l_liveFood_meat",   (t.getlLivefoodMeat()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodMeat(), HealthEnum.LiveFood_meat.class).getScore()));
		
		//鱼虾摄入分数
		resultMap.put("l_liveFood_fish",   (t.getlLivefoodFish()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodFish(), HealthEnum.LiveFood_fish.class).getScore()));
		
		//蛋类分数
		resultMap.put("l_liveFood_egg",   (t.getlLivefoodEgg()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodEgg(), HealthEnum.LiveFood_egg.class).getScore()));
		
		//食用油分数
		resultMap.put("l_liveFood_oil",   (t.getlLivefoodOil()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodOil(), LiveFood_oil.class).getScore()));
		
		//食用单糖分数
		resultMap.put("l_liveFood_sugar",   (t.getlLivefoodSugar()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodSugar(), HealthEnum.LiveFood_sugar.class).getScore()));
		
		//饮水分数
		resultMap.put("l_liveFood_water",   (t.getlLivefoodWater()==null ? 0 : EnumUtil.getEnumObject(t.getlLivefoodWater(), HealthEnum.LiveFood_water.class).getScore()));
		
		//吸烟分数
		resultMap.put("l_smoke_condition",   (t.getlSmokeCondition()==null ? 0 : EnumUtil.getEnumObject(t.getlSmokeCondition(), HealthEnum.Smoke_condition.class).getScore()));
		resultMap.put("l_smoke_env",   (t.getlSmokeEnv()==null ? 0 : EnumUtil.getEnumObject(t.getlSmokeEnv(), HealthEnum.Smoke_env.class).getScore()));
		
		//饮酒分数
		if (t.getlWineHz()==null || t.getlWineHz()==0 || t.getlWineHz()==4) {
			resultMap.put("l_drinking_situation",  0);
			resultMap.put("wineYear",   0);
		}else {
			if (t.getlWineKind()!=null) {
				if (HealthEnum.Wine_kind.wine_kind0.getIndex()==t.getlWineKind()) {
					resultMap.put("l_drinking_situation",   (t.getlWineWhite()==null ? 0 : EnumUtil.getEnumObject(t.getlWineWhite(), HealthEnum.Wine_white.class).getScore()));
				}else if (HealthEnum.Wine_kind.wine_kind1.getIndex()==t.getlWineKind()) {
					resultMap.put("l_drinking_situation",   (t.getlWineBeer()==null ? 0 : EnumUtil.getEnumObject(t.getlWineBeer(), HealthEnum.Wine_beer.class).getScore()));
				}else if (HealthEnum.Wine_kind.wine_kind2.getIndex()==t.getlWineKind()) {
					resultMap.put("l_drinking_situation",   (t.getlWineRed()==null ? 0 : EnumUtil.getEnumObject(t.getlWineRed(), HealthEnum.Wine_red.class).getScore()));
				}else if (HealthEnum.Wine_kind.wine_kind3.getIndex()==t.getlWineKind()) {
					resultMap.put("l_drinking_situation",   (t.getlWineYellow()==null ? 0 : EnumUtil.getEnumObject(t.getlWineYellow(), HealthEnum.Wine_yellow.class).getScore()));
				}else {
					resultMap.put("l_drinking_situation",  0);
				}
			}else {
				resultMap.put("l_drinking_situation",  0);
			}
			
			resultMap.put("wineYear",   (t.getlWineYear()==null ? 0 :(t.getlWineYear()>=4 ? 0 : 1)));
		}
		
		
		//睡眠分数
		resultMap.put("l_sleep_time",   (t.getlSleepTime()==null ? 0 : EnumUtil.getEnumObject(t.getlSleepTime(), HealthEnum.Sleep_time.class).getScore()));
		resultMap.put("l_sleep_situation",   (t.getlSleepInsomnia()==null ? 0 : EnumUtil.getEnumObject(t.getlSleepInsomnia(), HealthEnum.Sleep_insomnia.class).getScore()));
		
		//认知状况分数
		Boolean perceiveCalc=t.getlPerceiveCalc();
		Boolean perceiveDirection=t.getlPerceiveDirection();
		Boolean perceiveFarmemory=t.getlPerceiveFarmemory();
		Boolean perceiveNearmemory=t.getlPerceiveNearmemory();
		
		if (perceiveCalc==null || perceiveDirection==null || perceiveFarmemory==null || perceiveNearmemory==null) {
			score=0;
		}else{
			score=MathCheckoutUtil.booleanCount(!perceiveCalc,!perceiveDirection,!perceiveFarmemory,!perceiveNearmemory)/2;
		}
		
		resultMap.put("l_cognitive_situation",   (score));
		
		
		//心理状况分数
		Boolean live=t.getlPsyLive();
		Boolean job=t.getlPsyJob();
		Boolean anxiety=t.getlPsyAnxiety();
		Boolean feellow=t.getlPsyFeellow();
		Boolean workpress=t.getlPsyWorkpress();
		
		if (live==null || job==null || anxiety==null || feellow==null || workpress==null) {
			score=0;
		}else{
			score=(MathCheckoutUtil.booleanCount(live,job,!anxiety,!feellow,!workpress)-1)/2;
//			System.out.println(score);
		}
		
		
		resultMap.put("l_psy_situation",   (score));
		
		//性格测试分数
		Boolean character1=t.getlPersonalityWorry();
		Boolean character2=t.getlPersonalityCalm();
		Boolean character3=t.getlPersonalityUnhappy();
		
		if (character1==null || character2==null || character3==null) {
			score=0;
		}else{
			score=MathCheckoutUtil.booleanCount(!character1,!character2,!character3)-1;
		}
		
		resultMap.put("l_Personality_test",   (score<0 ? 0 : score));
		
        //System.out.println("score Map:"+resultMap);
		
		int result=0;
		
		if (resultMap==null || resultMap.isEmpty()) {
			
			return result;
		}
		
		for (String key : resultMap.keySet()) {
			
			result+=resultMap.get(key);
			
		}
		
		this.suggest=resultMap;
		
		return result;
	}

	@Override
	public Object suggest() {
		
		LiveSuggestDetail result=new LiveSuggestDetail();
		
		if (suggest==null || suggest.containsKey("noData")) {
			
			
			return null;
		}
		
		//每周锻炼时间
		result.setL_physical_exercise(suggest.get("l_physical_exercise")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//每日活动步数
		result.setL_liveSport_step(suggest.get("l_liveSport_step")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//运动
		result.setL_physical_sport(suggest.get("l_liveSport_step")+suggest.get("l_liveSport_step")<10?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//膳食结构建议
		result.setL_liveFood_structure(suggest.get("l_liveFood_structure")<3?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//每日吃够12种
		result.setL_liveFood_dayKind(suggest.get("l_liveFood_dayKind")<1?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//谷物和杂豆摄入状况
		result.setL_liveFood_bean(suggest.get("l_liveFood_bean")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//每周吃25种
		result.setL_liveFood_weekKind(suggest.get("l_liveFood_weekKind")<1?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//主食摄入状况
		result.setL_liveFood_primary(suggest.get("l_liveFood_primary")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//薯类摄入
		result.setL_liveFood_potato(suggest.get("l_liveFood_potato")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//蔬菜摄入
		result.setL_liveFood_vegetable(suggest.get("l_liveFood_vegetable")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//水果摄入
		result.setL_liveFood_fruit(suggest.get("l_liveFood_fruit")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//奶及奶制品摄入
		result.setL_liveFood_milk(suggest.get("l_liveFood_milk")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//坚果摄入状况
		result.setL_liveFood_nut(suggest.get("l_liveFood_nut")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//摄入食盐的量
		result.setL_liveFood_salt(suggest.get("l_liveFood_salt")<4?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//畜禽肉摄入
		result.setL_liveFood_meat(suggest.get("l_liveFood_meat")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//鱼虾摄入
		result.setL_liveFood_fish(suggest.get("l_liveFood_fish")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//蛋类
		result.setL_liveFood_egg(suggest.get("l_liveFood_egg")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//食用油
		result.setL_liveFood_oil(suggest.get("l_liveFood_oil")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//食用单糖
		result.setL_liveFood_sugar(suggest.get("l_liveFood_sugar")<1?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//饮水
		result.setL_liveFood_water(suggest.get("l_liveFood_water")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//吸烟状况
		result.setL_smoke_condition(suggest.get("l_smoke_condition")+suggest.get("l_smoke_env")<3?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		System.out.println(suggest.get("l_drinking_situation"));
		System.out.println(suggest.get("wineYear"));
		//饮酒
		result.setL_drinking_situation(suggest.get("l_drinking_situation")+suggest.get("wineYear")<4?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//睡眠
		result.setL_sleep_situation(suggest.get("l_sleep_situation")+suggest.get("l_sleep_time")<5?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		//认知状况
		result.setL_cognitive_situation(suggest.get("l_cognitive_situation")<2?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
			
		//性格测试
		result.setL_Personality_test(suggest.get("l_Personality_test")<2?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		//心理状况
		result.setL_psy_situation(suggest.get("l_psy_situation")<2?Concat.Suggest.IMPROVE_IMMEDIATELY:Concat.Suggest.KEEP_UP);
		
		return result;
	}

	
}
