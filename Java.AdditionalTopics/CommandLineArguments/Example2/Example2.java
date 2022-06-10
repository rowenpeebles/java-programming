// Numeric Command-Line Arguments

class Example2 {
    public static void main(String[] args) {
        for (String str : args) {
            int argument = Integer.parseInt(str);
            System.out.println("Arguments in integer form: " + argument);
        }
    }
}
