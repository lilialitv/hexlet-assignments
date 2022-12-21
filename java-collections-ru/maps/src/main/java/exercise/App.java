package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        List<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, words);
        Map<String, Integer> map = new HashMap<>();
        if (sentence == "") {
            return map;
        }
        for (var i = 0; i < wordsList.size(); i++) {
            Integer number = Collections.frequency(wordsList, wordsList.get(i));
            map.put(wordsList.get(i), number);
        }
        return map;
    }
    public static String toString(Map<String, Integer> words) {
        var result = new StringBuilder("{");
        if (words.isEmpty()) {
            result.append("}");
            return result.toString();
        }
        for (Map.Entry<String, Integer> word: words.entrySet()) {
            result.append("\n")
                    .append("  ")
                    .append(word.getKey())
                    .append(": ")
                    .append(word.getValue());
        }
        result.append("\n}");
        return result.toString();
    }
}
//END
