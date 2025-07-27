//StringBuilder example in java.
public class Testfour {
    //String Builder in JAVA 

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
        sb.append("programming");
        //sb.append("ballaya");
        //sb.append("durga");
        //length()
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        
    }
//Stringbuilder is synchronous which means thread-safe used in multi threaded envirorments.
    
}


