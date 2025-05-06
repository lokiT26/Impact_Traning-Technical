// Though there have been more successful pirates, Blackbeard is one of the best-known and widely feared of his time. He commanded four ships and had a pirate army of 300 at the height of his career and defeated the famous warship, HMS "Scarborough" in a sea battle. He was known for barreling into the battle clutching two swords with several knives and pistols at the ready. He captured over forty merchant ships in the Caribbean and without flinching killed many prisoners. Now, Blackbeard and his three pirates found a treasure of gold coins. Long Ben too joined them. They decided to share the treasure. Blackbeard agreed to give x% share for Long Ben. He then decided to take y% share from the remaining treasure. His other pirates will share the remaining gold coins equally. Write a program to compute their shares. After sharing the gold coins in this manner, if there are any leftover coins they decided to throw them into the sea.

import java.util.Scanner;

public class treasure_hunter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total gold: ");
        int totalGold = scanner.nextInt();
        System.out.print("Enter LB shares: ");
        int lbShares = scanner.nextInt();
        System.out.print("Enter BB shares: ");
        int bbShares = scanner.nextInt();
        
        int lbGold = (totalGold * lbShares) / 100;
        int bbGold = ((totalGold-lbGold) * bbShares) / 100;
        int totalGoldAfterBB = totalGold - (lbGold + bbGold);
        System.out.println(lbGold);
        System.out.println(bbGold);
        System.out.println(totalGoldAfterBB/3);

        scanner.close();
    }
}