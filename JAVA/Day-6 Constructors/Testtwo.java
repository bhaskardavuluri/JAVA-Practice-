//parametrized constructor
public class Testtwo {
    String username;
    String email;
    Testtwo(String u, String e){
        username=u;
        email=e;
    }
    void display(){
        System.out.println("Enter your username:"+username );
        System.out.println("Enter your email address:"+ email);
    }
    public static void main(String[] args) {
        Testtwo t=new Testtwo("balayya ", "balayyababu9949@gmail.com");
        t.display();
    }
    
}
