// @FunctionalInterface annotation example

@FunctionalInterface
public interface MyFuncInterface {
    public void firstMethod(); // This is an abstract method
    public void secondMethod(); // This throws compile error
}
