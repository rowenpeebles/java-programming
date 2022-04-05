// Using 'this' in Constructor Overloading 

class Example4 {

    private int a, b;

    private Example4(int i, int j) {
        this.a = i;
        this.b = j;
    }

    private Example4(int i) {
        this(i, i);
    }

    private Example4() {
        this(0);
    }

    @Override
    public String toString() {
        return this.a + " + " + this.b + "i";
    }

    public static void main(String[] args) {

        Example4 c1 = new Example4(2, 3);
        Example4 c2 = new Example4(3);
        Example4 c3 = new Example4();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

}
