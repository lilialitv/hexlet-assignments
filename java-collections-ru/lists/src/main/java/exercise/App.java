package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        List<String> listLetters = new ArrayList<>(Arrays.asList(letters.split("")));
        word = word.toLowerCase();
        List<String> listWord = new ArrayList<>(Arrays.asList(word.split("")));
        if (listLetters.size() < listWord.size()) {
            return false;
        }
        for (var i = 0; i < listWord.size(); i++) {
            if (listLetters.contains(listWord.get(i))) {
                listLetters.remove(listWord.get(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
