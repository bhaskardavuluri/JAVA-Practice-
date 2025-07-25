//Multilevel Inheritance example
class Animal{
    void sound(){
        System.out.println("animal makes sounds");
    }
}
class Dog extends Animal{
    void silence(){
        System.out.println("DOg makes sounds as bark");
    }
}
class Puppy extends Dog{
    void silent(){
        System.out.println("Puppy slowly starts barking");
    }
}
public class Testone{
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.sound();
        p.silence();
        p.silent();
    }
}
