package theStudy1.认识多线程01;

import java.util.Scanner;

public class Test1 {
	
	//main方法执行完毕，则程序的进程任务结束！！
	public static void main(String[] args) {
		System.out.println("开始执行程序");
		
		//虽然调用了2次，但是始终还是只有1条任务在顺序往下执行
		// 一条任务执行执行流
		study();
		play();
		
		System.out.println("结束执行程序");
	}
	
	public static void  study(){
		System.out.println("我要学习第1阶段");
		System.out.println("我要学习第2阶段");
		System.out.println("我要学习第3阶段");
		System.out.println("我要学习第4阶段");
		System.out.println("我要学习第5阶段");
	}
	
	public static void play(){
		System.out.println("我要娱乐1");
		System.out.println("我要娱乐2");
		System.out.println("我要娱乐3");
		System.out.println("我要娱乐4");
		System.out.println("我要娱乐5");
	}

}
