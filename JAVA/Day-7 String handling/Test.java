//String immutability example
public class Test{
 public static void main(String[] args) {
       String name="bhaskar";   //it is stored in scp..
       name.concat("uday"); //this doesnt change original string.
       System.out.println(name); //bhaskar 
       //to change it you must assign it..
       name=name.concat("uday");
       System.out.println(name);  //now name=bhaskaruday.
 }

}