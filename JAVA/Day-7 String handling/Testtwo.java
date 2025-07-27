//String methods..
public class Testtwo {
    public static void main(String[] args) {
        String name="udaya bhaskar";
        String n="udaya bhaskar";
        String u="harsha";
        System.out.println(name);
        //returns the length of the String 
        System.out.println(name.length());
        //returns the specified index value present in the string..
        System.out.println(name.charAt(2));
        //concat()-used to join the two strings
        name=name.concat("d");
        System.out.println(name);
        //touppercase()-used to convert the string into Uppercase.
        System.out.println(name.toUpperCase());
        //tolowercase()-used to convert the string into lowercase.
        System.out.println(name.toLowerCase());
        //contains(str)-returns boolean value if the string is exists.
        System.out.println(name.contains("d"));
        //equals()-used to check the content of the Strings
        System.out.println(name.equals(n));//False because the content is not same.
        System.out.println(name.equals(u));// false because the content is not same.
        System.out.println(n.equals(u));//false 
        System.out.println(n.equals(name));//false because the content is not same.
        

    }
}
