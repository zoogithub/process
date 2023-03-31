package consumermodel2;

public class StoreHouse {
    public static final int MAX_NUMBER=100;
    public int currentNumber=0;
    public StoreHouse(){

    }
    StoreHouse(int currentNumber){
        this.currentNumber=currentNumber;
    }
    public synchronized void produce(int addnum){
        while (addnum+currentNumber>MAX_NUMBER){
            System.out.println("仓库已满");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        currentNumber+=addnum;
        System.out.println("增加成功,增加数量为:"+addnum+"增加后库存为:"+currentNumber);
        notifyAll();
    }
    public synchronized void output(int outputnum){
        while (currentNumber-outputnum<0){
            System.out.println("库存不足了，等着吧");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        currentNumber-=outputnum;
        System.out.println("取出成功,数量为:"+outputnum+"取出后库存为:"+currentNumber);
        notifyAll();
    }
}
