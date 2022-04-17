// Reflection of Java Constructor

import java.lang.Class;
import java.lang.reflect.*;

class Dog {
    
    public Dog() {

    }
    
    private Dog(int age) {

    }

}

class Example5 {

    public static void main(String[] args) {

        try {

            // Create object of Dog
            Dog d1 = new Dog();

            // Create object of Class
            Class obj = d1.getClass();

            // Get all constructors of Dog
            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor c : constructors) {
                // Get the name of the constructors
                System.out.println("Constructor Name: " + c.getName());
                // Get the access modifier and convert to String
                int modifier = c.getModifiers();
                String mod = Modifier.toString(modifier);
                System.out.println("Modifier: " + mod);

                // Get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
                System.out.println("");
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
