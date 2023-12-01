package com.building.common.util;

import org.apache.commons.lang.time.DateUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * 请使用基于jdk1.8 的 DateUtils
 * 2014年11月24日 上午11:15:47
 */
public class DateUtil {
	
	public static final String sdf1 = "yyyy-MM-dd HH:mm:ss";
	
	public static final String sdf2 = "yyyy-MM-dd";
	
	public static final String sdf3 = "yyyy-MM-dd HH:mm";
	
	public static final String sdf4 = "yyyy/MM/dd";
	
	public static final String sdf5 = "yyyyMMdd";
	
	public static final String sdf6 = "MM月dd日";
	
	public static final String sdf7 = "yyyy-MM";
	
	public static final String sdf8 = "HH:mm";
	
	public static final String sdf9 = "yyMMdd";
	

	/**
	 * 获取系统当前时间
	 */
	public static Date now() {
		return Calendar.getInstance().getTime();
	}

	/**
	 * 将Sting类型转为date类型
	 * 
	 * @param str
	 *            待转换的字符
	 * @param date
	 *            时间类型，如：yyyy-MM-dd HH:mm:ss
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToDate(String str, String date){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(date);
			return sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将date类型转为String类型
	 * 
	 * @param date
	 *            时间
	 * @param type
	 *            格式
	 * @return
	 */
	public static String dateFormat(Date date, String type) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.format(date);
	}

	/**
	 * 计算时间差 (时间单位,开始时间,结束时间)
	 * 
	 * @param unit
	 *            时间单位 s - 秒,m - 分,h - 时,d - 天 ,M - 月 y - 年
	 * @param begin
	 *            开始时间
	 * @param end
	 *            结束时间
	 * @return
	 */
	public static long howLong(String unit, Date begin, Date end) {
		long ltime = begin.getTime() - end.getTime() < 0 ? end.getTime() - begin.getTime()
				: begin.getTime() - end.getTime();
		if (unit.equals("s")) {
			return ltime / 1000;// 返回秒
		} else if (unit.equals("m")) {
			return ltime / 60000;// 返回分钟
		} else if (unit.equals("h")) {
			return ltime / 3600000;// 返回小时
		} else if (unit.equals("d")) {
			return ltime / 86400000;// 返回天数
		} else if (unit.equals("y")) {
			long res = ltime / 86400000;
			return res / 365;
		} else if (unit.equals("M")) {
			long res = ltime / 86400000;
			return res / 30;
		} else {
			return 0;
		}
	}

	public static Double howLongDou(String unit, Date begin, Date end) {
		long ltime = begin.getTime() - end.getTime() < 0 ? end.getTime() - begin.getTime()
				: begin.getTime() - end.getTime();
		Double ret = 0.0;
		double time = 0.0;
		if (unit.equals("s")) {
			 time = (double) ltime / 1000;// 返回秒
		} else if (unit.equals("m")) {
			time = (double)ltime / 60000;// 返回分钟
		} else if (unit.equals("h")) {
			time = (double)ltime / 3600000;// 返回小时

		} else if (unit.equals("d")) {
			time =  (double)ltime / 86400000;// 返回天数
		} else if (unit.equals("y")) {
			Double res = (double)ltime / 86400000;
			time =  res / 365;
		} else if (unit.equals("M")) {
			Double res = (double)ltime / 86400000;
			time =  res / 30;
		} else {
			time =  0.0;
		}
		BigDecimal bd = new BigDecimal(time);
		ret = bd.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
		return ret;
	}

	/**
	 * 输出时间转换计算时间差
	 * 
	 * @param convert_dt
	 *            转换的日期
	 * @param
	 *
	 * @param
	 *
	 * @return
	 */
	public static String visitDateState(Date convert_dt) {
		// 用户最新操作信息 如刚刚操作
		if (convert_dt == null) {
			return "刚刚";
		}
		Calendar c_now = Calendar.getInstance();
		Calendar dt = Calendar.getInstance();
		dt.setTime(convert_dt);
		long c_min = c_now.getTimeInMillis() - dt.getTimeInMillis();
		long c_check_min = c_min / (60 * 1000);
		long c_check_hour = c_min / (60 * 60 * 1000);
		long c_check = c_min / (24 * 60 * 60 * 1000);
		if (c_check_min == 0) {
			return "刚刚";
		} else if (c_check_min > 0 && c_check_min <= 60) {
			return c_check_min + "分钟前";
		} else if (c_check_hour > 0 && c_check_hour <= 24) {
			return c_check_hour + "小时前";
		} else {
			return c_check + "天前";
		}
	}

	/**
	 * 时间戳转换为date
	 * 
	 * @param timestampString
	 *            位数为13位 ，不满13为*倍数
	 * @return
	 */
	public static String timeToDate(String timestampString) {
		Long timestamp = Long.parseLong(timestampString);
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timestamp));
		return date;
	}

	/**
	 * 返回周几
	 * 
	 * @param date
	 * @return
	 */
	public static String getWeekDayString(Date date) {
		String weekString = "";
		final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar calendar = Calendar.getInstance();
		if (date == null)
			date = new Date();
		calendar.setTime(date);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		weekString = dayNames[dayOfWeek - 1];
		return weekString;

	}
	
	/**
	 * 减加天
	 * 
	 * @param date
	 * @param day
	 * @return
	 */
	@SuppressWarnings("static-access")
	public static Date subtractDays(Date date, int day){
		 Calendar calendar = Calendar.getInstance();
		 calendar.setTime(date);
		 calendar.add(calendar.DATE,-day);
		 date=calendar.getTime();
		 return date;
	}
	
	/**
	 * 增加天
	 * 
	 * @param date
	 * @param day
	 * @return
	 */
	public static Date addDays(Date date, int day) {
		return DateUtils.addDays(date, day);
	}

	/**
	 * 增加月
	 * 
	 * @param date
	 * @param months
	 * @return
	 */
	public static Date addMonths(Date date, int months) {
		return DateUtils.addMonths(date, months);
	}

	/**
	 * 增加年
	 * 
	 * @param date
	 * @param years
	 * @return
	 */
	public static Date addYears(Date date, int years) {
		return DateUtils.addYears(date, years);
	}

	/**
	 * 增加小时
	 * 
	 * @param date
	 * @param hours
	 * @return
	 */
	public static Date addHours(Date date, int hours) {
		return DateUtils.addHours(date, hours);
	}

	/**
	 * 增加分钟
	 * 
	 * @param date
	 * @param minutes
	 * @return
	 */
	public static Date addMinutes(Date date, int minutes) {
		return DateUtils.addMinutes(date, minutes);
	}


	/**
	 * 获取季度
	 * 
	 * @param date
	 * @return 1 第一季度 2 第二季度 3 第三季度 4 第四季度
	 */
	public static int getQuarter(Date date) {
		int season = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int month = c.get(Calendar.MONTH);
		switch (month) {
		case Calendar.JANUARY:
		case Calendar.FEBRUARY:
		case Calendar.MARCH:
			season = 1;
			break;
		case Calendar.APRIL:
		case Calendar.MAY:
		case Calendar.JUNE:
			season = 2;
			break;
		case Calendar.JULY:
		case Calendar.AUGUST:
		case Calendar.SEPTEMBER:
			season = 3;
			break;
		case Calendar.OCTOBER:
		case Calendar.NOVEMBER:
		case Calendar.DECEMBER:
			season = 4;
			break;
		default:
			break;
		}
		return season;
	}

	/**
	 * 获取季度开始结束日期
	 * 
	 * @param year
	 *            年份
	 * @param quarter
	 *            1:第一季度 ,2:第二季度,3:第三季度 ,4:第四季度
	 * @return 开始日期，结束日期
	 */
	public static Date[] getQuarterDate(String year, int quarter) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date date = null;
		try {
			date = sdf.parse(year);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		Date[] dates = new Date[2];
		switch (quarter) {
		case 1:
			calendar.set(Calendar.MONTH, Calendar.JANUARY);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			dates[0] = calendar.getTime();
			calendar.set(Calendar.MONTH, Calendar.MARCH);
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			dates[1] = calendar.getTime();
			break;
		case 2:
			calendar.set(Calendar.MONTH, Calendar.APRIL);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			dates[0] = calendar.getTime();
			calendar.set(Calendar.MONTH, Calendar.JUNE);
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			dates[1] = calendar.getTime();
			break;
		case 3:
			calendar.set(Calendar.MONTH, Calendar.JULY);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			dates[0] = calendar.getTime();
			calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			dates[1] = calendar.getTime();
			break;
		case 4:
			calendar.set(Calendar.MONTH, Calendar.OCTOBER);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			dates[0] = calendar.getTime();
			calendar.set(Calendar.MONTH, Calendar.DECEMBER);
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			dates[1] = calendar.getTime();
			break;
		default:
			break;
		}
		return dates;
	}

	/**
	 * 获取某年某月第一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, cal.getMinimum(Calendar.DATE));
		return cal.getTime();
	}

	/**
	 * 获取某年某月最后一天
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int value = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, value);
		return cal.getTime();
	}
     
    //与本周一相隔的天数
 	private static int getMondayPlus(Date date) {  
 	    Calendar cd = Calendar.getInstance();  
 	    cd.setTime(date);  
 	    // 获得今天是一周的第几天，星期日是第一天，星期二是第二天......  
 	    int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK); 
 	    if (dayOfWeek == 1) {
 	    	return -6;
 	    } else {
 	    	return 2 - dayOfWeek;
 	    }
 	}
 	
 	// 获得下周星期一的日期  
 	public static Date getNextMonday(Date date) {  
 	    int mondayPlus = getMondayPlus(date);  
 	    Date monday = DateUtils.addDays(date, mondayPlus + 7);
 	    return monday;  
 	}

	/**
	 * 清空时分秒
	 * @param calendar
	 */
 	public static void clearHMS(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY,0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		calendar.set(Calendar.MILLISECOND,0);
	}
 	
 	/**
 	 * 获取日期对象
 	 * @return
 	 */
 	public static Calendar getCalendar(){
 		return Calendar.getInstance();
 	}
 	
 	/**
 	 * 获取年份
 	 * @return
 	 */
 	public static int getYear(){
 		return getCalendar().get(Calendar.YEAR);
 	}
 	
 	/**
 	 * 获取月份
 	 * @return
 	 */
 	public static int getMonth(){
 		return getCalendar().get(Calendar.MONTH)+1;
 	}
 	
 	/**
 	 * 获取天
 	 * @return
 	 */
 	public static int getDay(){
 		return getCalendar().get(Calendar.DATE);
 	}
 	
 	/**
 	 * 转换为 月日格式
 	 * @param dateStr
 	 * @return
 	 */
 	public static String StringToString(String dateStr){
 		Date date = stringToDate(dateStr, DateUtil.sdf2);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH)+1; //注意月份是从0开始的,比如当前7月，获得的month为6
		int day = cal.get(Calendar.DAY_OF_MONTH);
		return month+"月"+day+"日";
 	}
 	
 	/**
	 * 功能：得到当前日期 格式为：xxxx-yy-zz (eg: 2007-12-05)<br>
	 * 
	 * @return String
	 * @author pure
	 */
	public static String today() {
		String strY = null;
		String strZ = null;
		Calendar localTime; // 当前日期
		localTime = Calendar.getInstance();
		int x = localTime.get(Calendar.YEAR);
		int y = localTime.get(Calendar.MONTH) + 1;
		int z = localTime.get(Calendar.DATE);
		strY = y >= 10 ? String.valueOf(y) : ("0" + y);
		strZ = z >= 10 ? String.valueOf(z) : ("0" + z);
		return x + "-" + strY + "-" + strZ;
	}
	
	/**
	 * string类型日期之间相差的天数 
	 * @param smdate
	 * @param bdate
	 * @return
	 */
	public static int daysBetween(String smdate,String bdate){ 
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
	     Calendar cal = Calendar.getInstance();  
	     long time1 = 0;
	     long time2 = 0;
	      
	     try{
	       cal.setTime(sdf.parse(smdate));  
	       time1 = cal.getTimeInMillis();  
	       cal.setTime(sdf.parse(bdate)); 
	       time2 = cal.getTimeInMillis(); 
	     }catch(Exception e){
	       e.printStackTrace();
	     }
	     long between_days=(time2-time1)/(1000*3600*24); 
	        
	    return Integer.parseInt(String.valueOf(between_days));   
   }
	
   
   public static long getTime4Long(String time,String format){
	   Date toDate = DateUtil.stringToDate(time, format);
	   return toDate.getTime();
   }	
	
	
}