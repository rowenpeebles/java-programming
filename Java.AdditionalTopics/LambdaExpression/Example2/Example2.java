// Using lambda expression with parameters

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface {
    String reverse(String n);
}

public class Example2 {
    public static void main(String[] args) {
        // Declare reference to interface
        // Assign a lambda expression to ref
        MyInterface ref = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
            return result;
        };
        // Call method of the interface
        System.out.println("Lambda reversed: " + ref.reverse("Lambda"));
    }
}
