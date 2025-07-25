public class Testthree {
    public static void main(String[] args) {
        float value = 12.5f;

        // Autoboxing
        Float floatObj = value;

        // Unboxing
        float original = floatObj;

        // Using parseFloat method
        float parsed = Float.parseFloat("34.6");

        System.out.println("Float Object: " + floatObj);
        System.out.println("Unboxed float: " + original);
        System.out.println("Parsed from String: " + parsed);
    }
}
 
    

