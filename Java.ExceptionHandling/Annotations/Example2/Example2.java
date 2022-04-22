// @SuppressWarnings Annotation Example

import java.util.*;

class Example2 {

    @SuppressWarnigs("unchecked")

    static void wordsList() {
        ArrayList wordList = new ArrayList<>();

        // This causes an unchecked warning
        wordList.add("programiz");
        System.out.println("Word list => " + wordList);

    }

    public static void main(String[] args) {
        wordsList();
    }

}
