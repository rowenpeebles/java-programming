// 'super' to call SuperClass Method

class Animal {

    public void display() {
        System.out.println("I am an animal");
    }

}

class Dog extends Animal {

    @Override
    public void display() {
        System.out.println("I am a dog");
    }

    public void printMessage() {
        display();
        super.display();
    }

}

class Example2 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.printMessage();
    }

} 
