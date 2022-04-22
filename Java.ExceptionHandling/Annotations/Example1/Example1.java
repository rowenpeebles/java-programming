// @Override Annotation Example

class Animal {

    public void displayInfo() {
        System.out.println("I am an animal.");
    }

}

class Dog extends Animal {

    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }

}

class Example1 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }

}
