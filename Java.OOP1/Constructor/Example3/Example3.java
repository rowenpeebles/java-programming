// Java public no-arg constructors 

class Company {

    String name;

    public Company() {
        name = "Programiz";
    }

}

class Example3 {

    public static void main(String[] args) {
        Company obj = new Company();
        System.out.println("Company name: " + obj.name);
    }
}
