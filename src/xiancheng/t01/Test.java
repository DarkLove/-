package xiancheng.t01;

public class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		 
		Thread t1 = new Thread(t);
		t1.start();
		
		Thread t2 = new Thread(t);
		t2.start(); 
		
		Thread t3 = new Thread(t);
		t3.start(); 
	}
}
