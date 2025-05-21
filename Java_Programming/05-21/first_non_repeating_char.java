import java.util.Scanner;

public class first_non_repeating_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(str.indexOf(c) == str.lastIndexOf(c)){
                System.out.println("First non-repeating char: "+c);
                System.exit(0);
            }
        }
        System.out.println("No non-repeating character");

        sc.close();
    }
}
