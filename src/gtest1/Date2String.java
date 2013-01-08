package gtest1;

import java.util.*;

public class Date2String {
	
//	private Date today;
//	private Date2String(Date date){
//		this.today = date;
//	}
//	
	private String format(Date date){
		String todyis = date.toLocaleString();
		return todyis;
	}
	
	 /** 
     * 将某个日期以固定格式转化成字符串 
     * @param date 
    * @return str 
    */ 

	
	public static void main(String args[]){
		Date2String now = new Date2String();
		Date tody = new Date();
		System.out.print(tody + "\t" + now.format(tody));

	}
}
