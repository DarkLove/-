package com.fuxing.style;

import java.util.HashMap;
import java.util.Map;

public class Test07 {
	public static void main(String[] args) {
		Map<String,Student> map = new HashMap<>();
		Student stu = new Student();
		stu.id = "1";
		stu.name = "fx";
		map.put("key", stu);
		stu.id = "2";
		stu.name = "wr";
		System.out.println(map);
	}
	
	static class Student{
		String id;
		String name ;
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
	}
  
}