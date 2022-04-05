// This with Getters and Setters

class Example3 {

    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        Example3 obj = new Example3();

        obj.setName("Toshiba");
        System.out.println("obj.name: " + obj.getName());

    }

} 
