package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    private static String[] morses = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    public static void main(String[] args) {
        String[] words = {
                "gin", "zen", "gig", "msg"
        };
        uniqueMorseRepresentations(words);
    }
    private static int uniqueMorseRepresentations(String[] words) {
        Set<String> morseWords = new HashSet<>();
        for (String word : words) {
            StringBuilder morseWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                morseWord.append(morses[c - 97]);
            }
            morseWords.add(morseWord.toString());
        }
        return morseWords.size();
    }
}
