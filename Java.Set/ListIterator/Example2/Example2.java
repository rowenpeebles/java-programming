// Implementation of ListIterator

import java.util.ArrayList;
import java.util.ListIterator;

class Example2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);
        
        ListIterator<Integer> iterate = numbers.listIterator();
        iterate.next();
        iterate.next();

        int number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);

        int index1 = iterate.previousIndex();
        System.out.println("Position of the previous element: " + index1);

    }

}
