package com.fuxing.style;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test05 {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println("begin : "+df.format(new Date()));  
		Long sum = 0L;
		for(long i = 0 ; i < Integer.MAX_VALUE ; i++) {
			sum += i ;
		}
		System.out.println(sum);
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println("end : "+df1.format(new Date())); 
		System.out.println();
	}
}
