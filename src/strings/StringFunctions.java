package strings;

public class StringFunctions {
    public String name;

    public Boolean IsPalindrome(String w) {
        String inverted = "";
        boolean isPalindrome = false;

        for (int i = w.length() - 1; i >= 0; i--) {
            inverted = inverted + w.charAt(i);
        }

        if (w.equals(inverted)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }

    public Boolean ExistWord(String w, String fragment) {
        boolean existWord;

        if(fragment.contains(w)) {
            existWord = true;
        } else {
            existWord = false;
        }

        return existWord;
    }
}
