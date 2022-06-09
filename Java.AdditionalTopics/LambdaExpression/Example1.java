// Lambda Expression

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface {
    double getPiValue();
}

public class Example1 {
    public static void main(String[] args) {
        // Declare reference to interface
        MyInterface ref;
        // Lambda expression
        ref = () -> 3.1415;
        System.out.println("Value of Pi: " + ref.getPiValue());
    }
}
