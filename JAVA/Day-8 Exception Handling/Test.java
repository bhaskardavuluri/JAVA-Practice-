public class Test{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
        } catch(ArithmeticException c){
            System.out.println("cannot divide by zero");
        }
        finally{
            System.out.println("hi this is an first exception handling program");
        }
        
    }
}