// Java 'instanceof' during inheritance

class Animal {

}

class Dog extends Animal {

}

class Example2 {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        System.out.println(d1 instanceof Dog);

        System.out.println(d1 instanceof Animal);

    }

}
