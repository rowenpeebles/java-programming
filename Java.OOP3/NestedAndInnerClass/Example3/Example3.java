// Static Inner Class

class MotherBoard {

    static class USB {

        int usb2 = 2;
        int usb3 = 1;

        int getTotalPorts() {
            return usb2 + usb3;
        }

    }

}

public class Example3 {

    public static void main(String[] args) {

        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());

    }

} 
