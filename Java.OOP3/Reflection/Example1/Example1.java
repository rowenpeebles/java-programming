// Java Class Reflection

import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

class Example1 {
    
    public static void main(String[] args) {
        
        try {
            // Create an object
            Dog d1 = new Dog();

            // Create object of class using getClass()
            Class obj = d1.getClass();

            // Get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // Get the access modifier of the class
            int modifier = obj.getModifiers();

            // Convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // Get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        }
    
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
