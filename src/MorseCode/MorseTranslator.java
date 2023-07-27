package MorseCode;

import java.util.*;

public class MorseTranslator {
    private HashMap<String, Character> morseToCharMap;

    public MorseTranslator() {
        initializeMorseToCharMap();
    }

    private void initializeMorseToCharMap() {
        morseToCharMap = new HashMap<>();
        morseToCharMap.put(".-", 'A');
        morseToCharMap.put("...-", 'V');
        morseToCharMap.put("-.-.", 'C');
        morseToCharMap.put(".---", 'J');
        morseToCharMap.put("---", 'O');
        morseToCharMap.put(".-..", 'L');
        morseToCharMap.put("-.-", 'K');
        morseToCharMap.put("..", 'I');
        morseToCharMap.put("...", 'S');
        // Add more mappings if needed
    }

    public String translate(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] words = morseCode.split(" / ");

        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                Character character = morseToCharMap.get(letter);
                if (character != null) {
                    result.append(character);
                } else {
                    result.append('?');
                }
            }
            result.append(' ');
        }

        return result.toString().trim();
    }
}
