package com.fuxing.style;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		HashMap<String,List<String>> map = Test03.newInstance();
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		map.put("abc", list);
		System.out.println(map.toString());
	}
	
	public static <K,V> HashMap<K,V> newInstance(){
		return new HashMap<K,V>();
	}
}

 