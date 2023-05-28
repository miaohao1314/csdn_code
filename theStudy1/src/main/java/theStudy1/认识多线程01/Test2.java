package theStudy1.认识多线程01;

public class Test2 {


    public static void main(String[] args) {


        //study();
        //开启一条任务执行
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {//这条任务要做的事情
                try {
                    study();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }//学习
            }
        });


        //play();
        //开启一条任务执行
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {//这条任务要做的事情
                try {
                    play();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }//玩
            }
        });

        //开2条任务同时执行
        t1.start();
        t2.start();

    }


    //cpu频率（切换任务的速度）
    //cpu在同一个时间点只能执行1个任务
    public static void study() throws InterruptedException {
        System.out.println("我要学习第1阶段");
        Thread.sleep(1000);//让当前任务暂停1000毫秒
        System.out.println("我要学习第2阶段");
        Thread.sleep(1000);
        System.out.println("我要学习第3阶段");
        Thread.sleep(1000);
        System.out.println("我要学习第4阶段");
        Thread.sleep(1000);
        System.out.println("我要学习第5阶段");
    }

    public static void play() throws InterruptedException {
        System.out.println("我要娱乐1");
        Thread.sleep(1500);
        System.out.println("我要娱乐2");
        Thread.sleep(1500);
        System.out.println("我要娱乐3");
        Thread.sleep(1500);
        System.out.println("我要娱乐4");
        Thread.sleep(1500);
        System.out.println("我要娱乐5");
    }


}
