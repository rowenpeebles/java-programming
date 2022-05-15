// Remove EnumSet Elements

import java.util.EnumSet;

class Example7 {

    enum Size {

        SMALL, MEDIUM, LARGE, EXTRALARGE

    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet: " + sizes);

        // Using remove()
        boolean value1 = sizes.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed?: " + value1);

        // Using removeAll()
        boolean value2 = sizes.removeAll(sizes);
        System.out.println("Are all the elements removed?: " + value2);

    }

}
