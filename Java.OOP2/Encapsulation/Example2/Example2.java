// Data hiding using the private specifier

class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Example2 {

    public static void main(String[] args) {

        // Create an object of Person
        Person p1 = new Person();
        
        // Change age using setter
        p1.setAge(24);

        // Access age using getter
        System.out.println("My age is " + p1.getAge());

    }

}
