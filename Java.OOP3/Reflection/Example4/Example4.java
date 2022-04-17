// Access and Modify Private Fields

import java.lang.Class;
import java.lang.reflect.*;

class Dog {
    private String color;
}

class Example4 {
    public static void main(String[] args) {

        try {

            // Create an object of Dog
            Dog d1 = new Dog();

            // Create an object of Class
            Class obj = d1.getClass();

            // Access the private field color
            Field field1 = obj.getDeclaredField("color");

            // Allow modification of the private field
            field1.setAccessible(true);

            // Set the value of color
            field1.set(d1, "brown");

            // Get the value of field color
            String colorValue = (String) field1.get(d1);
            System.out.println("Value: " + colorValue);

            // Get the access modifier of color
            int mod2 = field1.getModifiers();

            // Convert the access mofidier to String
            String modifier2 = Modifier.toString(mod2);
            System.out.println("Modifier: " + modifier2);

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
