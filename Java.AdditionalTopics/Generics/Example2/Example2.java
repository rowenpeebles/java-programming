// Create a Generics Method

class Example2 {
    public static void main(String[] args) {

        // Initialise the class with integer data
        DemoClass demo = new DemoClass();

        // Generics method working with string
        demo.<String>genericsMethod("Java Programming");

        // Geberics method working with integer
        demo.<Integer>genericsMethod(25);
    }
}

class DemoClass {

    // Create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
