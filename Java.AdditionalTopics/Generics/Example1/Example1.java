// Create a Generic Class

class Example1 {
    public static void main(String[] args) {

        // Initialise generic class with integer data
        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // Initialise generic class with string data
        GenericClass<String> stringObj = new GenericClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}

// Create generic class
class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
