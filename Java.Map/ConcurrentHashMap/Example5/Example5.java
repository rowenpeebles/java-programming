// forEach() Method

import java.util.concurrent.ConcurrentHashMap;

class Example5 {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("ConcurrentHashMap: " + numbers);

        // forEach() without transformer function
        numbers.forEach(4, (k, v) -> System.out.println("Key: " + " Value: " + v));

        // forEach() with transformer function
        System.out.println("Values are ");
        numbers.forEach(4, (k, v) -> v, (v) -> System.out.print(v + ", "));

    }

}
