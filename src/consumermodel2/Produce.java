package consumermodel2;

public class Produce extends Thread{
    private int addNum;
    private StoreHouse storeHouse;
    public Produce(int addNum,StoreHouse storeHouse){
        this.addNum=addNum;
        this.storeHouse=storeHouse;
    }

    public void run(){
        storeHouse.produce(addNum);
    }

}
