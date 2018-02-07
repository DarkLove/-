package com.fuxing.style;

import java.io.File; 

public class Test2 {
	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Users\\DIY\\Desktop");
		for(String s:file.list()) {
			System.out.println(s);
		}
	}
}
