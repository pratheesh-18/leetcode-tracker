// Last updated: 7/8/2026, 3:40:20 PM
class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }

        return new String(ch);
    }

    public static boolean isVowel(char a) {
        return (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||
                a=='A'||a=='E'||a=='I'||a=='O'||a=='U');
    }
}
