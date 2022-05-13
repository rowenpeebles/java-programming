// Remove TreeMap Elements

import java.util.TreeMap;

class Example4 {

    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("TreeMap: " + numbers);

        // Remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);

        // Remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Has the entry {Three=3} been removed? " + result);

        System.out.println("Updated TreeMap: " + numbers);

    }

}
