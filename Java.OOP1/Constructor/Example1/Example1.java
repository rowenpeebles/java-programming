// Java Constructor

class Example1 {

    private String name;

    // Constructor
    Example1() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {
        // Constructor is invoked while
        // creating an object of the Example1 class
        Example1 obj = new Example1();
        System.out.println("The name is " + obj.name);
    }
}
