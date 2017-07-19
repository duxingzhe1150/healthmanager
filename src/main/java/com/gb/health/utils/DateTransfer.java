package com.gb.health.utils;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateTransfer {
	// yyyy-MM-dd HH:mm:ss
	public static String dateToString(Date date) {
		return dateToAllString(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到本月份
	 * patter--month
	 * @param date
	 * @author 梁美怀
	 * @return
	 */
	public static String dateToOnlyMonthString(Date date) {
		return dateToAllString(date, "MM");
	}
	/**
	 * 得到本年份
	 * pattern--yyyy
	 * @param date
	 * @author 梁美怀
	 * @return
	 */
	public static String dateToOnlyYearString(Date date) {
		return dateToAllString(date, "yyyy");
	}

	/**
	 * 
	 * Description: yyyy-MM-dd   
	     * Create at:   2016年6月17日
		 * @param date
		 * @return
	 */
	public static String dateToStringDate(Date date) {
		return dateToAllString(date, "yyyy-MM-dd");
	}

	// HH:mm:ss
	public static String dateToTime(Date date) {
		return dateToAllString(date, "HH:mm:ss");
	}

	// 毫秒值转化为yyyy-MM-dd HH:mm:ss字符串
	public static String milliToDateString(Long millitimes) {
		return dateToAllString(new Date(millitimes), "yyyy-MM-dd HH:mm:ss");
	}

	// 把date类型转化为各种字符串类型的工具类
	private static String dateToAllString(Date date, String datePattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		String datestr = null;
		try {
			datestr = sdf.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DateToString类的日期转换异常");
		}
		return datestr;
	}

	/**
	 * yyyy-MM-dd HH:mm:ss String类型的时间转化为Date类型
	 * @param dateString
	 * @return
	 */
	public static Date stringToDate(String dateString) {
		return dateStringToDateFormat(dateString,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * yyyy-MM-dd String类型的时间转化为Date类型
	 * @param dateString
	 * @return
	 */
	public static Date stringToDateNoTime(String dateString) {
		return dateStringToDateFormat(dateString,"yyyy-MM-dd");
	}
	/**
	 * yyyyMMdd String类型的时间转化为Date类型
	 * @param dateString
	 * @return
	 */
	public static Date noDashStringToDate(String dateString) {
		return dateStringToDateFormat(dateString,"yyyyMMdd");
	}
	/**
	 * yyyy-MM-dd String类型的时间转化为Date类型
	 * @param dateString
	 * @return
	 */
	public static Date dateStringToDate(String dateString) {
		return dateStringToDateFormat(dateString,"yyyy-MM-dd hh:mm:ss");
	}
   /**
    * 根据patter把日期字符串转化为Date格式
    * @param dateString 日期字符串
    * @param pattern  要转化成的时间格式
    * @return
    */
	private static Date dateStringToDateFormat(String dateString,String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {

			e.printStackTrace();
			return null;
		}
		return date;
	}
	
	
	
	public static boolean isToday(String time) {
		if (time == null)
			return false;
		Date date = DateTransfer.dateStringToDate(time);

		Calendar after = Calendar.getInstance();
		after.setTime(date);

		Calendar today = Calendar.getInstance();
		today.setTimeInMillis(System.currentTimeMillis());

		if ((after.get(Calendar.YEAR) == today.get(Calendar.YEAR))
				&& (after.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (after.get(Calendar.DAY_OF_MONTH) == today
						.get(Calendar.DAY_OF_MONTH))) {
			return true;
		}
		return false;
	}

	public static boolean isToWeek(String time) {
		if (time == null)
			return false;
		Date date = DateTransfer.dateStringToDate(time);

		Calendar after = Calendar.getInstance();
		after.setTime(date);

		Calendar today = Calendar.getInstance();
		today.setTimeInMillis(System.currentTimeMillis());

		if ((after.get(Calendar.YEAR) == today.get(Calendar.YEAR))
				&& (after.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (after.get(Calendar.WEEK_OF_MONTH) == today
						.get(Calendar.WEEK_OF_MONTH))) {
			return true;
		}
		return false;
	}

	public static boolean isToMonth(String time) {
		if (time == null)
			return false;
		Date date = DateTransfer.dateStringToDate(time);

		Calendar after = Calendar.getInstance();
		after.setTime(date);

		Calendar today = Calendar.getInstance();
		today.setTimeInMillis(System.currentTimeMillis());

		if ((after.get(Calendar.YEAR) == today.get(Calendar.YEAR))
				&& (after.get(Calendar.MONTH) == today.get(Calendar.MONTH))) {
			return true;
		}
		return false;

	}
	public static boolean isYear(String time) {
		if (time == null)
			return false;
		Date date = DateTransfer.dateStringToDate(time);

		Calendar after = Calendar.getInstance();
		after.setTime(date);

		Calendar today = Calendar.getInstance();
		today.setTimeInMillis(System.currentTimeMillis());

		if (after.get(Calendar.YEAR) == today.get(Calendar.YEAR)
				) {
			return true;
		}
		return false;
	}
	public static Date dateToTimeMillis(long timeMills) {
		Date da = new Date();
		da.setTime(timeMills);
		return da;
	}

	/**
	 * 四舍五入DOuble,保留2位小数
	 */
	public static String roundDouble(double f) {
		BigDecimal b = new BigDecimal(f);
		double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return f1 + "" + "%";
	}
	/**
	 * 四舍五入DOuble,保留2位小数
	 */
	public static String roundDouble2(double f) {
		BigDecimal b = new BigDecimal(f);
		double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return f1 + "";
	}
	/**
	 * 把日期字符串的天数+NDay(N天）后，返回新的日期字符串
	 * @param time传入的参数，日期字符串
	 * @param NDay 传入的参数，NDay
	 * @return 返回的日期字符串
	 * @author meihuai
	 */
	public static String StringDateAddNDay(String time,int NDay){
		Date date = DateTransfer.dateStringToDate(time);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH,NDay);
		Date addNDayDate=calendar.getTime();
		String addNDayDateString=DateTransfer.dateToStringDate(addNDayDate);
		return addNDayDateString;
	}
	/** 根据身份证生日计算年龄 */ 
	private static  int getAge(Date birthDay) { 
	        Calendar cal = Calendar.getInstance(); 

	        if (cal.before(birthDay)) { 
	            throw new IllegalArgumentException( 
	                "The birthDay is before Now.It's unbelievable!"); 
	        } 

	        int yearNow = cal.get(Calendar.YEAR); 
	        int monthNow = cal.get(Calendar.MONTH)+1; 
	        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); 
	        
	        cal.setTime(birthDay); 
	        int yearBirth = cal.get(Calendar.YEAR); 
	        int monthBirth = cal.get(Calendar.MONTH); 
	        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH); 

	        int age = yearNow - yearBirth; 

	        if (monthNow <= monthBirth) { 
	            if (monthNow == monthBirth) { 
	                //monthNow==monthBirth 
	                if (dayOfMonthNow < dayOfMonthBirth) { 
	                    age--; 
	                } 
	            } else { 
	                //monthNow>monthBirth 
	                age--; 
	            } 
	        } 

	        return age; 
	    }
	/**
	 * 
	 * @param idCardNo 身份证号
	 * @return
	 */
	public static int getAgeByIdCard(String idCardNo){
		String birthdayString=idCardNo.substring(6,14);
		Date birthday=DateTransfer.noDashStringToDate(birthdayString);
		int age=DateTransfer.getAge(birthday);
		return age;
	}
}
