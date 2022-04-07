// Java 'instanceof' in inheritance

interface Animal {

}

class Dog implements Animal {

}

class Example3 {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        System.out.println(d1 instanceof Animal);

    }

}
