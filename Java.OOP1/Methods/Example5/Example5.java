// Java Method for Code Reusability

public class Example5 {

    private static int getSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; ++i) {

            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);

        }

    }

}
