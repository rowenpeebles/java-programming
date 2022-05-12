// Access LinkedHashMap Elements

import java.util.LinkedHashMap;

class Example3 {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("LinkedHasMap: " + numbers);

        // Using entrySet()
        System.out.println("KeyValue Mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());

    }

}
