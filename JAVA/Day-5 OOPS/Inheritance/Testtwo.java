//Hierachel Inheritance
class Animal{
    void sou(){
        System.out.println("animal makes an sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("cat makes sound as meow");
    }
}
public class Testtwo{
public static void main(String[] args) {
    cat c=new cat();
    c.sound();
    c.sou();
    
    Dog d=new Dog();
    d.bark();
    d.sou();
    Animal a=new Animal();
    a.sou();

}
}
