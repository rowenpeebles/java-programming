// Java Final Method

class FinalDemo {

    public final void display() {

        System.out.println("This is a final method.");

    }

}

class Example2 extends FinalDemo {

    public final void display() {
        System.out.println("The final method is overridden.");
    }

    public static void main(String[] args) {

        Example2 obj = new Example2();
        obj.display();

    }

}

// Cannot override final method.
