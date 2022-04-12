// Accessing members of Outer class inside Static Inner Class

class MotherBoard {

    String model;

    public MotherBoard(String model) {
        this.model = model;
    }

    static class USB {

        int usb2 = 2;
        int usb3 = 1;

        int getTotalPorts() {

            if (MotherBoard.this.model.equals("MSI")) {
                return 4;
            }

            else {
                return usb2 + usb3;
            }

        }

    }

}

public class Example4 {

    public static void main(String[] args) {

        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " +  usb.getTotalPorts());

    }

}

// error: non-static variable this cannot be referenced from a static context
