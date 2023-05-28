package theStudy1.认识多线程01;

public class Test4 {

	public static void main(String[] args) {

		// 开启一条线程
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("哈哈"+i);
				}
			}
		});
		

		
		// 开启一条线程
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("呵呵"+i);
				}
			}
		});

		
		// 开启一条线程
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("嘿嘿"+i);
				}
			}
		});
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
