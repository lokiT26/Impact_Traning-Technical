// Count the total number of vowels in a String

public class vowel_count {
    public static void main(String[] args) {
        String s = "abcdefzyuUSA";
        String vowel = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
