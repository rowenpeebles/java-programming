// Java Methods

class Example1 {

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        Example1 obj = new Example1();

        int result = obj.addNumbers(num1, num2);

        System.out.println("Sum is: " + result);

    }

}
