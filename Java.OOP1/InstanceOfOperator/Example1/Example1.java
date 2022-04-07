// Java 'instanceof'

class Example1 {

    public static void main(String[] args) {

        String name = "Programiz";
        boolean result1 = name instanceof String;
        System.out.println("name is an instance of String: " + result1);

        Example1 obj = new Example1();

        boolean result2 = obj instanceof Example1;
        System.out.println("obj is an instance of Example1: " + result2);

    }

}
