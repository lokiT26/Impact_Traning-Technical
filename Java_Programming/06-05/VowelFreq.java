import java.util.*;
public class VowelFreq {
    public static void main(String[] args) {
        HashMap<Character, Integer> obj = new HashMap<>();

        
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        String Vowel = "AEIOU";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Vowel.indexOf(ch) != -1) {
                if (obj.containsKey(ch)) {
                    obj.put(ch, obj.get(ch) + 1);
                } else {
                    obj.put(ch, 1);
                }
            }
        }
        System.out.println(obj);
        sc.close();
    }
}