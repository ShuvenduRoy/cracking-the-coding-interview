/* Implement an algorithm to determine if a string has all unique characters What if
        you can not use additional data structures? */

public class UniqueCharDetector {
    // Time complexity is O(n), where n is the length of the string, and space complexity is O(n)
    public static boolean isUniqueChars2(String str){
        boolean[] char_set = new boolean[256];

        for(int i=0; i<str.length(); i++){
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args){
        String test = "this";
        System.out.println(isUniqueChars2(test));
    }
}
