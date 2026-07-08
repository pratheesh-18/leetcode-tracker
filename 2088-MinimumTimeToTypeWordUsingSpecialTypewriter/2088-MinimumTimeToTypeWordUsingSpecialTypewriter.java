// Last updated: 7/8/2026, 3:36:01 PM
class Solution {
    public int minTimeToType(String word) {
        int answer = 0;
        char pointer = 'a';

        for (char ch : word.toCharArray()) {
            int clockwise = Math.abs(ch - pointer);
            int counterclockwise = 26 - clockwise;
            answer += Math.min(clockwise, counterclockwise) + 1;
            pointer = ch;
        }

        return answer;
    }
}