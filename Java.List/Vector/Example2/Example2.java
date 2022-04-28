// Access Vector Elements

import java.util.Iterator;
import java.util.Vector;

class Example2 {

    public static void main(String[] args) {

        Vector<String> animals = new Vector<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.println("Vector: ");

        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }

}
