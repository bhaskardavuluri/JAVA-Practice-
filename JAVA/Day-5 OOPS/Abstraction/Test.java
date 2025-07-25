//abstract classes example
abstract class  Vehicle{
    abstract void start();
    void sound(){
        System.out.println("suiiii");
    }
}
class car extends Vehicle{
    void start(){
        System.out.println("car starts when the push is pressed ");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("old model bikes are started by using kick start");
    }
}
public class Test{
    public static void main(String[] args) {
        car c=new car();
        c.start();
        c.sound();
        Bike b=new Bike();
        b.start();
        b.sound();
        
            
        
    }
}