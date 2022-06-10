// Bounded Types

class GenericClass <T extends Number> {
    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}

class Example3 {
    public static void main(String[] args) {
        GenericClass<Integer> obj = new GenericClass<>();
    }
}
