//method overloading example..
public class Test{
    int add(int a ,int b, int c){  //same method type and return name with 3 parameters
        return a+b+c;   
    }
    int add(int a , int b){  //same method type and return name with different parameters..
        return a+b;
    }
    public static void main(String[] args) {
        Test t=new Test();
         System.out.println(t.add(10,20, 30));  //with different parameters van be considered as polymorphism.
         System.out.println(t.add(100,200));
    
    }
}