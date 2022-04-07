// Access SuperClass Attribute

class Animal {

    protected String type = "Animal";

}

class Dog extends Animal {

    public String type = "Mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am a " + super.type);
    }

}

class Example3 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.printType();
    }

}
