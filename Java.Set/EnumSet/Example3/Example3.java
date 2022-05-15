// Using range(e1, e2) Method

import java.util.EnumSet;

class Example3 {

    enum Size {

        SMALL, MEDIUM, LARGE, EXTRALARGE

    }

    public static void main(String[] args) {

        // Creating an EnumSet using range()
        EnumSet<Size> sizes = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

        System.out.println("EnumSet: " + sizes);

    }

}
