import java.util.Scanner;

class Input {

    public static void main(String[] args) {
        
        // Create an object of Scanner 
        Scanner input = new Scanner(System.in);

        // Getting Float input 
        System.out.println("Enter float : ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered : " + myFloat);

        // Getting Double input 
        System.out.println("Enter double : ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered : " + myDouble);

        // Getting String input 
        System.out.println("Enter string : ");
        String myString = input.next();
        System.out.println("String entered : " + myString);

    }

}
