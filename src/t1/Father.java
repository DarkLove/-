package t1;

public class Father { 
	
	static {
		System.out.println("Father: 静态块"); 
	}
	
	static public void fun() { 
		System.out.println("fun");
	}
	
	{
		System.out.println("Father: 代码块 ");
	}
	
	public Father() {
		System.out.println("Father: 构造方法");
	}
	
	public void print() {
		System.out.println("Father: print方法");
	}
	
}
