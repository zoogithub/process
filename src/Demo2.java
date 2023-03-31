import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Demo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(i+"只"+Thread.currentThread().getName()+"正在打滚");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo2 microprocess1=new Demo2();
//        Demo2 microprocess2=new Demo2();这里不需要，反正大家都一样的结构，传一个参数进去就够了~
        Thread thread1=new Thread(microprocess1,"辅导员");
//        Thread thread2=new Thread(microprocess2,"王杰");
        Thread thread2=new Thread(microprocess1,"余丹华");
        thread1.start();
        thread2.start();
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
        AtomicStampedReference atomicStampedReference;
    }
}
