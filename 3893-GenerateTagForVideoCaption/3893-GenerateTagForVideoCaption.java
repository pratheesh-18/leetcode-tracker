// Last updated: 7/8/2026, 3:32:38 PM
class Solution {
    public String generateTag(String caption) {
        caption = caption.trim();

        if (caption.length() == 0) return "#";

        StringBuilder sb = new StringBuilder("#");
        String[] words = caption.split("\\s+");

        sb.append(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1));
            }
        }

        if (sb.length() > 100) {
            sb.delete(100, sb.length());
        }

        return sb.toString();
    }
}