/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司*/
package com.qzdatasoft.framework.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期帮助类
 *
 * History:<br> 
 *    . 1.0.0.20160910, com.qzdatasoft.koradji, Create<br>
 *
 */
public class DateTimeHelper {

	/**
	 * 获取当前系统时间并进行格式化
	 * @param format
	 * @return
	 */
	public static String getDateTime(String format){
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date curDate = new Date(System.currentTimeMillis());
		String sDate = formatter.format(curDate);
		return sDate;
	}
	
	/**
	 * 时间格式化
	 * @param date
	 * @param format
	 * @return
	 */
	public static String getDateTime(Date date, String format){
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		//Date curDate = new Date(System.currentTimeMillis());
		String sDate = formatter.format(date);
		return sDate;
	}
	
	/**
	 * 计算指定日期是该年度第几周
	 * @param date
	 * @return 从0开始
	 */
	public static int getWeekNumber(Date date){
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
		Calendar cl = Calendar.getInstance();   
		cl.setTime(date);   
		int week = cl.get(Calendar.WEEK_OF_YEAR);   
		//System.out.println(week);   
		cl.add(Calendar.DAY_OF_MONTH, -7);  
		int year = cl.get(Calendar.YEAR);  
		if(week<cl.get(Calendar.WEEK_OF_YEAR)){  
		    year+=1;  
		}  
		return week;
		//System.out.println(year+"年第"+week+"周"); 
	}
	
	/**
	 * 计算指定日期是哪个季度
	 * @param date
	 * @return 0|1|2|3
	 */
	public static int getQuarter(Date date)
	{
		if(Arrays.asList(0,1, 2).contains(date.getMonth())) return 0  ;
		else if(Arrays.asList(3,4,5).contains(date.getMonth())) return 1  ;
		else if(Arrays.asList(6,7,8).contains(date.getMonth())) return 2  ;
		else return 3;
	}
	
	/**
	 * 计算指定日期是上半年还是下半年
	 * @param date
	 * @return 0 上半年， 1 下半年
	 */
	public static int getHalfOneYear(Date date)
	{
		if(Arrays.asList(0,1, 2,3,4,5).contains(date.getMonth())) return 0  ;
		else return 1;
	}
}
