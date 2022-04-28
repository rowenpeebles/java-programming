// Iterate through an ArrayList

import java.util.ArrayList;

class Example5 {

    public static void main(String[] args) {

        // Create an array list
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");

        // Iterate using for-each loop
        System.out.println("Accessing individual elements: ");

        for (String language : animals) {
            System.out.print(language);
            System.out.print(", ");
        }

    }

}
