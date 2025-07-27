//String BUffer in JAVA 
public class Testthree {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("java");
        sb.append("programming");
        //sb.append("ballaya");
        //sb.append("durga");
        //length()
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        
    }
//Stringbuffer is synchronous which means thread-safe used in multi threaded envirorments.
    
}
