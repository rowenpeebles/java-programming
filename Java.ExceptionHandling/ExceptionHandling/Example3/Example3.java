// Exception handling using Java Throw

class Example3 {

    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by zero");
    }

    public static void main(String[] args) {
        divideByZero();
    }

}
