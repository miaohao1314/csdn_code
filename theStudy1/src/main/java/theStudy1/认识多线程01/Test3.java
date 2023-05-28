package theStudy1.认识多线程01;

public class Test3 {
	
	
	//主线程/主任务
	public static void main(String[] args) {
		System.out.println("主线程的任务开始执行了！！");
		
//		System.out.println("哈哈");
//		
//		System.out.println("嘿嘿");
//		
//		System.out.println("呵呵");
		
		//开启一条子线程去执行“哈哈”
		Thread t1 = new Thread(new Task("哈哈"));
		
		//开启一条子线程去执行“嘿嘿”
		Thread t2 = new Thread(new Task("嘿嘿"));
		
		//开启一条子线程去执行“呵呵”
		Thread t3 = new Thread(new Task("呵呵"));
		
		
		t1.start();  	//开启线程
		t2.start();		//开启线程
		t3.start();		//开启线程
		
		
		try {
			//主线程在睡觉（3毫秒）
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("主线程的任务执行完毕！！");
	}
	
	
	//实现了这个Runnable接口
	//具备了当任务的能力！！
	private static class Task implements Runnable{
		private String msg;
		public Task(String msg){
			this.msg = msg;
		}
		
		@Override
		public void run() {//这个run方法就是当前这个任务要做的事！！！
			System.out.println(msg);
		}
		
	}
	
	

}
