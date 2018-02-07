package com.fuxing.style;

public class Test06 extends A{

	@Override
	public void print() {
		 System.out.println("Test06");
	}
	 
	public void print2() {
		 System.out.println("Test06 2");
	}
	 

}

abstract class A{
	public void print() {
		System.out.println("A");
	} 
}
