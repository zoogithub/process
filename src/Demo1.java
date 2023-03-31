public class Demo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName()+":     "+i);
        }
    }

    public static void main(String[] args) {
//        Thread thread1=new Thread("张三");这里不应该是Thread，看漏了
//        Thread thread2=new Thread("赵云");
        Demo1 thread1=new Demo1();
        Demo1 thread2=new Demo1();
        thread1.start();
        thread2.start();
    }
}
