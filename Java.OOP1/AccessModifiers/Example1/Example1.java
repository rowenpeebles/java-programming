// Private Access Modifier

class Data {
    
    private String name;

    // Getter method
    public String getName() {
        return this.name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

}

public class Example1 {

    public static void main(String[] args) {
        Data d = new Data();
        d.setName("Programiz");
        System.out.println(d.getName());
    }

}
