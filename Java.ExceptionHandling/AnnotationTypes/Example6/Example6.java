// Custom annotation example

@interface MyCustomAnnotation {
    String value() default "default value";
}

class Example6 {

    @MyCustomAnnotation(value = "Programiz")

    public void method1() {
        System.out.println("Test Method 1");
    }

    public static void main(String[] args) throws Exception {
        Example6 obj = new Example6();
        obj.method1();
    }

} 
