// Java Unboxing

import java.util.ArrayList;

class Example2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Autoboxing
        list.add(5);
        list.add(6);

        System.out.println("ArrayList: " + list);

        // Unboxing
        int a = list.get(0);
        System.out.println("Value at index 0: " + a);

    }

}
