// Use of 'super()' to access SuperClass constructor

class Animal {

    Animal() {
        System.out.println("I am an animal");
    }

}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("I am a dog");
    }

}

class Example4 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
    }

} 
