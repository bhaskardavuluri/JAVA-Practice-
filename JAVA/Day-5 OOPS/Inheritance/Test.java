//single Inheritance example
class Animal{
    void sound(){
        System.out.println("animal makes an sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dogas makes sound barks");
    }
}
public class Test{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();

    }
}