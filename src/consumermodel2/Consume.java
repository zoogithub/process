package consumermodel2;

public class Consume extends Thread{
    private int putNum;
    private StoreHouse storeHouse;
    Consume(int putNum,StoreHouse storeHouse){
        this.putNum=putNum;
        this.storeHouse=storeHouse;
    }
    public void run(){
        storeHouse.output(putNum);
    }
}
