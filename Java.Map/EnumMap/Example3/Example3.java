// Remove EnumMap Elements

import java.util.EnumMap;

class Example3 {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // creating EnumMap of the Size clasas
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);

        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 34);
        sizes.put(Size.EXTRALARGE, 40);

        System.out.println("EnumMap: " + sizes);

        // Using the remove() method
        int value = sizes.remove(Size.MEDIUM);
        System.out.println("Removed Value: " + value);

        boolean result = sizes.remove(Size.SMALL, 28);
        System.out.println("Has the entry {SMALL=28} been removed? " + result);

        System.out.println("Updated EnumMap: " + sizes);

    }

}
