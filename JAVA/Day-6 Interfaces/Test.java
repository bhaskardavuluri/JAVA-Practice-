//Interfaces example
interface Bluetooth{
    abstract void connect();
    default void show(){
        System.out.println("Bluetooth needs an interface to coonect with it");
    }
    static void display(){
        System.out.println("the device need some device ton connect with it");
    }

}
class  Mobile implements Bluetooth{
    public void connect(){
        System.out.println("Mobile is connected via Bluetooth");
    }
}
class Speaker implements Bluetooth{
    public void connect(){
        System.out.println("Laptop Device is connected via Bluetooth ");
    }
}
public class Test{
  public static void main(String[] args) {
    Mobile m=new Mobile();
    m.connect();
    m.show();
    Bluetooth.display();
    Speaker s=new Speaker();
    s.connect();
    s.show();
    Bluetooth.display();
  }
}