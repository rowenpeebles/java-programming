// Delete a file

import java.io.File;

class Example4 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        boolean value = file.delete();
        if (value) {
            System.out.println("The file is deleted.");
        }
        else {
            System.out.println("The file is not deleted.");
        }
    }
}
