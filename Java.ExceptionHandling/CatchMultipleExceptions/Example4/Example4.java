// Catching base and child exception classes

class Example4 {

    public static void main(String[] args) {

        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        }

        catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}

// In this example, ArithmeticException and ArrayIndexOutOfBoundsException
// are both subclasses of the Exception class. So, we get a compilation error. 
