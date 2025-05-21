// Antakshari is a popular parlor game played in India. Many word games are similar to antakshari. One such game is wordakshari. The game can be played by two or more people. The first player has to recite a word. The last letter of the word is then used by the next player to recite another word starting with that letter. The winner or winning team is decided by a process of elimination. The person or the team that cannot come up with a word with the right consonant is eliminated. - The following rules need to be followed while playing this game. - (i) All other words except the first word have to begin with the last letter of the previous word - (ii) No words can be repeated. write a program to print the wordakshari chain.
// https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/wordakshari-1

// Input Format:
// Input consists of n+1 lines.
// The first n lines contain strings corresponding to the words in the chain.
// The last line of input contains the string #### to mark the end of the input.

import java.util.Scanner;

public class wordakshari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        String s_temp = "";
        while(true) {
            s_temp = sc.nextLine();
            if(s_temp.contains("####")){
                break;
            }
            if(s.contains(s_temp) || s.charAt(s.length()-1)!=s_temp.charAt(0)){
                System.exit(0);
            } else{
                System.out.println(s_temp);
                s += s_temp;
            }
        }
        sc.close();
    }
}
