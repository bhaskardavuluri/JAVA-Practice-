//logical operators example
public class Test4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean x = true;
        boolean y = false;

        // Logical AND
        System.out.println("a < b && x: " + (a < b && x));  // true && true = true

        // Logical OR
        System.out.println("a > b || y: " + (a > b || y));  // false || false = false

        // Logical NOT
        System.out.println("!x: " + (!x));  // !true = false
        System.out.println("!y: " + (!y));  // !false = true
    }
}
