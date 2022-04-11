// Polymorphic Variables

class ProgrammingLanguage {

    public void display() {
        System.out.println("I am a Programming Language.");
    }

}

class Java extends ProgrammingLanguage {

    @Override
    public void display() {
        System.out.println("I am an Object-Orientated Programming Language.");
    }

}

class Example4 {

    public static void main(String[] args) {

        ProgrammingLanguage p1;

        p1 = new ProgrammingLanguage();

        p1.display();

        p1 = new Java();

        p1.display();

    }

}
