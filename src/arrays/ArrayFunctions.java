package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayFunctions {

    public ArrayList<ArrayList<String>> Extract(String[] arr) {
        ArrayList<ArrayList<String>> words = new ArrayList<>();
        Map<String, Integer> continuousWords = new HashMap<>();
        String currentWord;
        String previousWord;

        for(int i = 0; i < arr.length; i++) {
            currentWord = arr[i];

            if(i > 0) {
                previousWord = arr[i - 1];

                if (previousWord.equals(currentWord)) {
                    continuousWords.put(currentWord, continuousWords.get(previousWord) + 1);
                } else {
                    if(!continuousWords.containsKey(currentWord)) {
                        continuousWords.put(currentWord, 1);
                    }
                }
            } else {
                continuousWords.put(currentWord, 1);
            }
        }

        if(!continuousWords.isEmpty()) {
            int count;
            ArrayList<String> continuousWordsArray;

            for (String key: continuousWords.keySet()) {
                count = continuousWords.get(key);
                continuousWordsArray = new ArrayList<>();

                if(count > 1) {
                    for(int i = 0; i < count; i++) {
                        continuousWordsArray.add(key);
                    }

                    words.add(continuousWordsArray);
                }
            }
        }

        return words;
    }

    public Integer CreateSeed(String[] s, String[] p) {
        int sum = 0;
        int multi = 1;
        Map<String, Integer> indices = new HashMap<>();
        String characterBase;
        String characterWeight;

        for(int i = 0; i < s.length; i++) {
            characterBase = s[i];

            for(int j = 0; j < p.length; j++) {
                characterWeight = p[j];

                if (characterBase.equals(characterWeight)) {
                    indices.put(characterBase + "_" + i, j);
                }
            }
        }

        for (Integer value: indices.values()) {
            sum = sum + value;
            multi = multi * value;
        }

        return sum + multi;
    }
}
