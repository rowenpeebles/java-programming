// Java Enum Strings

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Example1 {
    public static void main(String[] args) {
        System.out.println("String value of SMALL is " + Size.SMALL.toString());
        System.out.println("String value of MEDIUM is " + Size.MEDIUM.name());
    }
}
