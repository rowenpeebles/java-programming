// @SafeVarArgs annotation example

import java.util.*;

class Example4 {
    
    private void displayList(List<String>... lists) {
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }

    public static void main(String args[]) {

        Example4 obj = new Example4();

        List<String> universityList = Arrays.asList("Herriot Watt University", "Napier University");
        obj.displayList(universityList);

        List<String> programmingLanguage = Arrays.asList("Java", "C++");
        obj.displayList(universityList, programmingLanguage); 

    }

}
