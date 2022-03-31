// Create objects inside the same class 

class Example2 {

    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    public static void main(String[] args) {

        Example2 led = new Example2();

        led.turnOn();

    }

}
