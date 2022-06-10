// Primitive Types to Wrapper Objects

class Example1 {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.65;
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if (aObj instanceof Integer) {
            System.out.println("An object of Integr is created.");
        }

        if (bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
    }
}
