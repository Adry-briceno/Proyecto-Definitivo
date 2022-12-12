import arrays.ArrayFunctions;
import strings.StringFunctions;

public class Main {

    public static void main(String[] args) {
        StringFunctions strings = new StringFunctions();
        StringFunctions strings2 = new StringFunctions();
        ArrayFunctions arrays = new ArrayFunctions();

        System.out.println(strings2.IsPalindrome("ana"));
        System.out.println(strings.IsPalindrome("raro"));
        System.out.println(strings.IsPalindrome("a n i t a l a v a l a t i n a"));
        System.out.println(strings.IsPalindrome("anitalavalatina"));

        System.out.println(strings.ExistWord("ana", "adios bonitana despues de ti"));
        System.out.println(strings.ExistWord("arpa", "adios bonitana despues de ti"));

        System.out.println(arrays.Extract(new String[]{"a", "a", "c", "c", "s", "x", "x", "x", "x", "a"}));
        System.out.println(arrays.Extract(new String[]{"a", "z", "12"}));

        System.out.println(arrays.CreateSeed(new String[]{"a", "c", "x", "a", "a"}, new String[]{"y", "a", "x"}));
        System.out.println(arrays.CreateSeed(new String[]{"a","b","c","a","y"}, new String[]{"x","y","a","b"}));
    }
}