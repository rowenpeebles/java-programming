// Remove ArrayDeque Elements

import java.util.ArrayDeque;

class Example5 {

    public static void main(String[] args) {

        ArrayDeque<String> animals = new ArrayDeque<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");

        System.out.println("ArrayDeque: " + animals);

        // Using remove()
        String element = animals.remove();
        System.out.println("Removed Element: " + element);

        // Using removeFirst()
        String firstElement = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Usinng removeLast()
        String lastElement = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement);

    }

} 
