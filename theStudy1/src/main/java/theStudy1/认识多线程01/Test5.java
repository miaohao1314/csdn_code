package theStudy1.认识多线程01;

public class Test5 {
	
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		//t1.start();
		
		MyThread t2 = new MyThread();
		//t2.start();
		
		MyThread t3 = new MyThread();
		//t3.start();
		
		
	}
	
	
	
	//MyThread就是线程类
	private static class MyThread extends Thread{
		
		@Override
		public void run() {
			test1();
			test2();
			System.out.println("当前线程要做的事");
		}
		
		private void test1(){
			
		}
		
		private void test2(){
			
		}
		
	}
	
	
}
