// Java Enum Constructor

enum Size {

    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    private Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }

}

class Example1 {

    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.getSize());
    }

}
