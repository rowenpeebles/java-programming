// Remove ConcurrentHashMap Elements

import java.util.concurrent.ConcurrentHashMap;

class Example4 {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("ConcurrentHashMap: " + numbers);

        // Remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);

        // Remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);

        System.out.println("Updated ConcurrentHashMap: " + numbers);

    }

}
