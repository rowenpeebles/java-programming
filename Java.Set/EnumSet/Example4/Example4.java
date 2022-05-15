// Using of() Method

import java.util.EnumSet;

class Example4 {

    enum Size {
        
        SMALL, MEDIUM, LARGE, EXTRALARGE

    }

    public static void main(String[] args) {

        // Using of() with a single parameter
        EnumSet<Size> sizes1 = EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet1: " + sizes1);

        // Using of() with 2 parameters
        EnumSet<Size> sizes2 = EnumSet.of(Size.SMALL, Size.MEDIUM);
        System.out.println("EnumSet2: " + sizes2);

    }

}
