//method overriding example..
class payment{
    void pay(){
        System.out.println("pay by using cash");
    }
}
class creditcard extends payment{  //overiding
    void pay(){
        System.out.println("pay gia using credit card");
    }
}
class UPI extends payment { //overiding
    void pay(){
        System.out.println("pay via using BHIMUPI");
    }
}
public class Testone{
    public static void main(String[] args) {
       payment p=new payment();
       p.pay();
       creditcard cc=new creditcard();
       cc.pay();
       UPI upi =new UPI();
       upi.pay();
    }
}