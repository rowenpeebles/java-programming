// Using 'this' for Ambiguity Variable Names

class Example2 {

    int age;

    Example2(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2(8);
        System.out.println("obj.age = " + obj.age);
    }

}
