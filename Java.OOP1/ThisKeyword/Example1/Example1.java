// This Keyword

class Example1 {

    int instVar;

    Example1(int instVar) {
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1(8);
        System.out.println("object reference = " + obj);
    }

}
