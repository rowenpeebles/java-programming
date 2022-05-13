// reduce() Method

import java.util.concurrent.ConcurrentHashMap;

class Example7 {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("ConcurrentHashMap: " + numbers);

        // Using search()
        int sum = numbers.reduce(4, (k, v) -> v, (v1, v2) -> v1 + v2);
        System.out.println("Sum of all values: " + sum);

    }

}
