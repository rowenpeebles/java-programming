// Java Abstract Class and Method

abstract class Language {
    
    public void display() {
        System.out.println("This is Java Programming");
    }

}

class Example1 extends Language {

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.display();
    }

}
