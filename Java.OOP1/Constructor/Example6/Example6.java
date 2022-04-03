// Java Contructor Overloading 

class Example6 {

    String language;

    Example6() {
        this.language = "Java";
    }

    Example6(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Language: " + this.language);
    }

    public static void main(String[] args) {
        Example6 obj1 = new Example6();
        Example6 obj2 = new Example6("Python");

        obj1.getName();
        obj2.getName();

    }

}
