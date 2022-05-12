// Removed LinkedHashMap Elements

import java.util.LinkedHashMap;

class Example5 {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("LinkedHashMap: " + numbers);

        // Remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);

        // Remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry 'Three' removed?" + result);

        System.out.println("Updated LinkedHashMap: " + numbers);

    }

}
