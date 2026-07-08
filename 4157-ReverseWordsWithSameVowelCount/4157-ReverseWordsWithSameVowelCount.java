// Last updated: 7/8/2026, 3:32:21 PM
class Solution {

    static String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();


        int firstVowels = 0;
        for (char ch : words[0].toCharArray()) {
            if (isVowel(ch)) firstVowels++;
        }

        result.append(words[0]);

        for (int i = 1; i < words.length; i++) {
            int currentVowels = 0;

            for (char ch : words[i].toCharArray()) {
                if (isVowel(ch)) currentVowels++;
            }

            result.append(" ");
            if (currentVowels == firstVowels) {
                result.append(rev(words[i]));
            } else {
                result.append(words[i]);
            }
        }

        return result.toString();
    }

    static boolean isVowel(char ch) {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
