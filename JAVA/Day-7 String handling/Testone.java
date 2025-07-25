//Memory allocation example in JAVA 
public class Testone {
    public static void main(String[] args) {
        String s1="bhaskar";  //it is stored in scp [inside heap memory]
        String s2="bhaskar"; //it reuses the s1 object because the content is same right..
        String s3=new String("bhaskar");   //it creates an new object in heap memoroy.
        String s4="udaya";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        //== operator is used to check the memory address of the strings and returns the boolean value.
        System.out.println(s1==s2); //true  because it resues the s1 object for s2 so the memory address will not be changed.
        System.out.println(s2==s3);//false
        System.out.println(s1==s3);//false
        //equals()-method is used to check the content of the strings and returns an boolean value.
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(s4));//false
        System.out.println(s2.equals(s3));//true
        System.out.println(s2.equals(s1));//true
        System.out.println(s3.equals(s4));//false
        System.out.println(s3.equals(s2));//true
        System.out.println(s3.equals(s1));//true




    }
    
}
