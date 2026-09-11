import java.util.*;

class ValidAnagram{

public boolean isAnagram(String s, String t) {
    // if length is different they can't be anagrams
    if (s.length() != t.length()) {
        return false;
    }

    // create an array to count frequency char
    int[] charCounts = new int[26];
    for (int i = 0; i < s.length(); i++) {
        charCounts[s.charAt(i) - 'a']++;
        charCounts[t.charAt(i) - 'a']--;
    }

    // check if all counts are zero
    for (int i = 0; i < charCounts.length; i++) {
        if (charCounts[i] != 0) {
            return false;
        }
    }

    return true;
}

    public static void main(String[] args) {
    String s= "cat";
    String t= "atc";

    ValidAnagram validAnagram = new ValidAnagram();
    System.out.println(validAnagram.isAnagram(s, t));
}

}

