// Change default String Value of Enums

enum Size {
    SMALL {
        public String toString() {
            return "The size is small.";
        }
    },
    MEDIUM {
        public String toString() {
            return "The size is medium.";
        }
    };
}

class Example2 {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.toString());
    }
}
