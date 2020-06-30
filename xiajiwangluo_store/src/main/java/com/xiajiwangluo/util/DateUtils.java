package com.xiajiwangluo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 * 
 * @author Administrator
 *
 */
public class DateUtils {
	
	/**
	 * 字符串的日期格式的计算
	 * @param smdate  数据库时间
	 * @param bdate   当前时间
	 * @return  相差多少天
	 * @throws ParseException
	 */

	public static int daysBetween(String smdate,Date bdate) throws ParseException {
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(sdf.parse(smdate));
	    long time1 = cal.getTimeInMillis();
	    cal.setTime(bdate);
	    long time2 = cal.getTimeInMillis();
	    long between_days=(time2-time1)/(1000*3600*24);

	    return Integer.parseInt(String.valueOf(between_days));
	}
	

	/**
	 * 返回当前时间。格式yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getCurrentDateTime() {

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return sf.format(new Date());

	}

	/**
	 * 返回当前日期。格式：yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getCurrentDate() {

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

		return sf.format(new Date());
	}

	/**
	 * 根据日期时间，比较两时间差多少秒
	 * 
	 * @param time1
	 * @param time2
	 * @return
	 */
	public static int bidaxiao(String time1, String time2) {

		int i = -1;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = sf.parse(time1);
			Date date2 = sf.parse(time2);
			long tim1 = date1.getTime();
			long tim2 = date2.getTime();
			Long longtime = tim1 - tim2;
			i = longtime.intValue();
			if (i < 0) {
				i = -i;
			}
		} catch (ParseException e) {
		}

		return i / 1000;
	}

	/**
	 * 根据日期时间，比较两时间差多少秒
	 * 
	 * @param date1
	 * @param time0
	 * @return
	 */
	public static int bidaxiao(Date date1, String time0) {

		int i = -1;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date2 = sf.parse(time0);
			long tim1 = date1.getTime();
			long tim2 = date2.getTime();
			Long longtime = tim1 - tim2;
			i = longtime.intValue();
			if (i < 0) {
				i = -i;
			}
		} catch (ParseException e) {
		}
		return i / 1000;
	}

	/**
	 * 根据日期时间，比较两时间差多少秒
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int bidaxiao(Date date1, Date date2) {

		int i = -1;
		long tim1 = date1.getTime();
		long tim2 = date2.getTime();
		Long longtime = tim1 - tim2;
		i = longtime.intValue();
		if (i < 0) {
			i = -i;
		}
		return i / 1000;
	}

	/**
	 * 日期转换成字符串
	 * @param date
	 * @param patt
	 * @return
	 */

	public static String date2String(Date date,String patt){
		SimpleDateFormat sdf = new SimpleDateFormat(patt);
		String format = sdf.format(date);
		return format;
	}

	/**
	 * 字符串转换日期
	 * @param str
	 * @param patt
	 * @return
	 * @throws ParseException
	 */

	public static Date string2Date(String str,String patt) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(patt);
		Date date = sdf.parse(str);
		return date;
	}

	/**
	 * 获取过期 第 past 天的日期
	 * @param past
	 * @return Date
	 */
	public static Date getPastDate(int past) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
		Date today = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String result = format.format(today);

		Date date = format.parse(result);
		return date;
	}

	/**
	 * 获取未来 第 past 天的日期
	 * @param past
	 * @return Date
	 */
	public static Date getFetureDate(int past) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + past);
		Date today = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String result = format.format(today);
		Date date = format.parse(result);
		return date;
	}
	/**
	 * 判断当前日期是否在俩个时间之间
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static boolean nowTimeIn(Date startTime,Date nowTime,Date endTime){

		if (nowTime.getTime() == startTime.getTime()
				|| nowTime.getTime() == endTime.getTime()) {
			return true;
		}

		Calendar date = Calendar.getInstance();
		date.setTime(nowTime);

		Calendar begin = Calendar.getInstance();
		begin.setTime(startTime);

		Calendar end = Calendar.getInstance();
		end.setTime(endTime);

		if (date.after(begin) && date.before(end)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断某个日期是否在两个日期范围之内（参数是字符串）
	 * @param startTime
	 * @param time
	 * @param endTime
	 * @return boolean
	 */
	public static boolean Date2Date(String startTime, Date time, String endTime) throws ParseException {

		String s = DateUtils.date2String(time, "yyyy-MM-dd");
		//判断某个日期是否在两个日期范围之内
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");

		Date date1=simpleDateFormat.parse(startTime);
		Date date2=simpleDateFormat.parse(endTime);
		Date date3=simpleDateFormat.parse(s);

		if(date1.getTime()<=date3.getTime() && date2.getTime()>=date3.getTime()){
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 比较俩个日期的大小
	 * @param startTime
	 * @param time
	 * @return boolean
	 */
	public static boolean Date2Date(String startTime, Date time) throws ParseException {

		String s = DateUtils.date2String(time, "yyyy-MM-dd");
		//判断某个日期是否在两个日期范围之内
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");

		Date date1=simpleDateFormat.parse(startTime);

		Date date3=simpleDateFormat.parse(s);

		if(date1.getTime()>=date3.getTime()){
			return true;
		}else {
			return false;
		}
	}
}
