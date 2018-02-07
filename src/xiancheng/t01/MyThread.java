package xiancheng.t01;

public class MyThread implements Runnable{

	int i = 0 ;
	
	@Override
	public void run() { 
		synchronized (this) {
			System.out.println("run "+(i++));
		}
		
	}

}
