package t4;

import org.junit.jupiter.api.Test;

public class Test01{
	
	@Test
	public void test1() {
		int a = 1 ;
		int b = 1 ;
		System.out.println(a==b);
	}
	
	@Test
	public void test2() {
		/**
		 *  Integer a = 1 ;
			Integer b = 1 ; 
			返回true
			根本原因是java的包装类Integer使用了缓存，
			对包装类的自动装箱、自动拆箱也是一种语法糖, 
			Java的new Integer操作，
			当参数值在【-128，127】之间时，
			new操作返回的对象是有缓存的，
			使用的1在这个范围内，
			所以使用的是a、b是同一个对象
		 */
		
		Integer a = 128 ;
		Integer b = 128 ; 
		System.out.println(a==b);
	}
	
	
	
	@Test
	public void test3() {
		String a = "1";
		String b = "1";
		String c = a ;

		a = "2";
		
		System.out.println("a==b: "+(a==b));
		System.out.println("a==c: "+(a==c));
	}
	
	@Test
	public void test4(){
		String s1 = "a";
		String s2 = s1 + "b";
		String s3 = "a" + "b";
		System.out.println(s2 == "ab");
		System.out.println(s3 == "ab");
		
		
		 
		
		
		
	}
	
	
}
