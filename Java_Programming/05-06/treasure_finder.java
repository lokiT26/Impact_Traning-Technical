// Nikitha and Danny are close friends. They both are studying in the same school. Now they are on summer vacation. As they are bored, they ask their parents to take them to an exhibition. Nikitha and Danny play a game. In this game, there are three boxes with some number written on top. There is a treasure in one of the three boxes and it is present in the box with the second largest number on top. Also, to open the box, they need to decode the correct code of this box. The clue given to them to find the code is that it is the largest number that divides all three given numbers. So, now help Nikitha and Danny to decode the code.

import java.util.Scanner;

public class treasure_finder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int min = Math.min(a, Math.min(b, c));
            int treasure_box = 0;

            if (a > b && a > c) {
                treasure_box = Math.max(b, c);
            } else if (b > a && b > c) {
                treasure_box = Math.max(a, c);
            } else {
                treasure_box = Math.max(a, b);
            }

            int i;
            for (i = min; i >= 1; i--){
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    break;
                }
            }

            System.out.println("The treasure is in the box which has the number " + treasure_box);
            System.out.println("The code to open the box is " + i);
        }
    }
}
