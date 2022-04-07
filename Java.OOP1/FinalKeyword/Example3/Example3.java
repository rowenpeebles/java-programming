// Java Final Class

final class FinalClass {

    public void display() {
        System.out.println("This is a final method.");
    }

}

class Example3 extends FinalClass {

    public void display() {
        System.out.println("The final method is overridden.");
    }

    public static void main(String [] args) {
        Example3 obj = new Example3();
        obj.display();
    }

}

// cannot inherit from final FinalClass
