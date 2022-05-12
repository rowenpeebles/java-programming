// Access EnumMap Elements

import java.util.EnumMap;

class Example2 {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);

        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the entrySet() method
        System.out.println("KeyValue Mappings: " + sizes.entrySet());

        // Using the keySet() method
        System.out.println("keys: " + sizes.keySet());

        // Using the values() method
        System.out.println("Values: " + sizes.values());

    }

}
