package t1;

public class Son extends Father{
	
	static {
		System.out.println("Son: 静态块");
	}
	
	{
		System.out.println("Son: 代码块");
	}
	
	public Son() {
		System.out.println("Son: 构造方法");
	}

	@Override
	public void print() {
		System.out.println("Son: print方法");
	} 
	
}
