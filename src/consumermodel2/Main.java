package consumermodel2;

public class Main {
    public static void main(String[] args) {
        StoreHouse storeHouse=new StoreHouse(80);
        Produce produce1=new Produce(80,storeHouse);
        Produce produce2=new Produce(50,storeHouse);
        Produce produce3=new Produce(30,storeHouse);
        Consume consume1=new Consume(10,storeHouse);
        Consume consume2=new Consume(30,storeHouse);
        Consume consume3=new Consume(20,storeHouse);
        Consume consume4=new Consume(20,storeHouse);
        Consume consume5=new Consume(20,storeHouse);
        Consume consume6=new Consume(20,storeHouse);
        Consume consume7=new Consume(20,storeHouse);
        Consume consume8=new Consume(20,storeHouse);
        consume1.start();
        consume2.start();
        consume3.start();
        consume4.start();
        consume5.start();
        consume6.start();
        consume7.start();
        consume8.start();
        produce1.start();
        produce2.start();
        produce3.start();
    }
}
