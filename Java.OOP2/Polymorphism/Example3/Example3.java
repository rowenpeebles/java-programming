// Polymorphism using method overloading

class Pattern {

    public void display() {

        for (int i = 0; i < 10; ++i) {
            System.out.println("*");
        }

    }

    public void display(char symbol) {

        for (int i = 0; i < 10; ++i) {
            System.out.println(symbol);
        }

    }

}

class Example3 {

    public static void main(String[] args) {

        Pattern p1 = new Pattern();

        p1.display();
        System.out.println("\n");

        p1.display('#');

    }

}
