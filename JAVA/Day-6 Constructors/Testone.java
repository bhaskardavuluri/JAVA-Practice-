//Parametrized constructor
public class Testone {
    String name;
    int age;
    Testone(String n ,int a){
        name=n;
        age=a;

    }
    void display(){
        System.out.println("My name is" +name +"im " +age);
    }
    public static void main(String[] args) {
        Testone t=new Testone("bhaskar", 21);
        t.display();
    }
    
}
