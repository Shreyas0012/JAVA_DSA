public class longestnonrepeat {

    static int longestUniqueSubstring(String s) {

        int[] freq = new int[26];   // frequency of characters
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'a']++;

            // shrink window if character repeats
            while (freq[ch - 'a'] > 1) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            // update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUniqueSubstring(s)); // 3
    }
}
