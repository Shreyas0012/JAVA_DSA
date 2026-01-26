public class Palindrome {

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        String str = "pop";

        if (isPalindrome(str)) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }
}
