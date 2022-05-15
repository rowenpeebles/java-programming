// Using noneOf(Size)

import java.util.EnumSet;

class Example2 { 

    enum Size { 
        
        SMALL, MEDIUM, LARGE, EXTRALARGE

    }

    public static void main(String[] args) {

        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes = EnumSet.noneOf(Size.class);

        System.out.println("Empty EnumSet: " + sizes);

    }

} 
