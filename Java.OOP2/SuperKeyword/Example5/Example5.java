// Call parameterized constructor using 'super()'

class Animal {

    Animal() {
        System.out.println("I am an animal");
    }

    Animal(String type) {
        System.out.println("Type: " + type);
    }

}

class Dog extends Animal {

    Dog() {
        super("Animal");
        System.out.println("I am a dog");
    }

}

class Example5 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
    }

}
