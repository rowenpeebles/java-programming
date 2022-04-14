// Java Enum Class

enum Example3 {

    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {
        switch(this) {
            case SMALL:
                return "Small";
            case MEDIUM:
                return "Medium";
            case LARGE:
                return "Large";
            case EXTRALARGE:
                return "Extra Large";
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        System.out.println("The size of the pizza is " + Example3.SMALL.getSize());

    }

}
