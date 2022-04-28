// @SuppressWarnings annotation example

class Example3 {

    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.deprecatedMethod();
    }
}
