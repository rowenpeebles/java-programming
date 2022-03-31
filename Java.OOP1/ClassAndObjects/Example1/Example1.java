// Java Class and Objects 

class Lamp {

    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }

}

class Example1 {

    public static void main(String[] args) {

        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();

        halogen.turnOff();

    }

}
