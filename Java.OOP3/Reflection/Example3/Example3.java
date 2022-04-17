// Reflection of Java Fields

import java.lang.Class;
import java.lang.reflect.*;

class Dog {
    public String type;
}

class Example3 {
    public static void main(String[] args) {
        try {

            // Create an object of Dog
            Dog d1 = new Dog();

            // Create an object of Class
            Class obj = d1.getClass();

            // Access and set the type field
            Field field1 = obj.getField("type");
            field1.set(d1, "labrador");

            // Get the value of the field type
            String typeValue = (String) field1.get(d1);
            System.out.println("Value: " + typeValue);

            // Get the access modifier of the field type
            int mod = field1.getModifiers();

            // Convert the mofifier to String
            String modifier1 = Modifier.toString(mod);
            System.out.println("Modifier: " + modifier1);
            System.out.println(" ");

        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
