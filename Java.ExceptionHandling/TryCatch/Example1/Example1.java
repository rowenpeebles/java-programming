// Java Try...Catch Block

class Example1 {

    public static void main(String[] args) {

        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of the code in try block.");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

    }

}
