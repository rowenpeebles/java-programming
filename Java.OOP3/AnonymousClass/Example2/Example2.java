// Anonymous Class Extending a Class

class Polygon {

    public void display() {
        System.out.println("Inside the Polygon Class.");
    }

}

class AnonymousDemo {

    public void createClass() {

        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };

        p1.display();

    }

}

class Example2 {

    public static void main(String[] args) {

        AnonymousDemo an = new AnonymousDemo();

        an.createClass();

    }

}
