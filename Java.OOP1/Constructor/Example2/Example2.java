// Java private no-arg constructor

class Example2 {

    int i;

    private Example2() {
        i = 5;
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        System.out.println("Value of i: " + obj.i);
    }
}
