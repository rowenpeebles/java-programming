// search() Method

import java.util.concurrent.ConcurrentHashMap;

class Example6 {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("ConcurrentHashMap: " + numbers);

        // Using search()
        String key = numbers.search(4, (k, v) -> {return v == 3 ? k: null;});
        System.out.println("Searched Value: " + key);

    }

}
