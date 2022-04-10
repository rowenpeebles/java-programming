// Java Abstraction

abstract class MotorBike {

    abstract void brake();

}

class SportsBike extends Motorbike {

    public void brake() {
        System.out.println("SportsBike Break");
    }

}

class MountainBike extends MotorBike {

    public void brake() {
        System.out.println("MountainBike Break");
    }

}

class Example3 {

    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }

}
