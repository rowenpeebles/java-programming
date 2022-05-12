// Insert Elements to EnumMap

import java.util.EnumMap;

class Example1 {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    
    public static void main(String[] args) {
        
        // Creating an EnumMap of the Size enum 
        EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);

        // Using the put() method
        sizes1.put(Size.SMALL, 28);
        sizes1.put(Size.MEDIUM, 32);
        System.out.println("EnumMap1: " + sizes1);

        // Creating a second EnumMap of the Size enum
        EnumMap<Size, Integer> sizes2 = new EnumMap<>(Size.class);

        // Using the putAll() method
        sizes2.putAll(sizes1);
        sizes2.put(Size.LARGE, 36);
        System.out.println("EnumMap2: " + sizes2);

    }

}
