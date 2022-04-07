// Access Specifier in Java Overriding

class Animal {

    protected void displayInfo() {
        System.out.println("I am an animal");
    }

}

class Dog extends Animal {

    public void displayInfo() {
        System.out.println("I am a dog");
    }

}

class Example3 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }

}
