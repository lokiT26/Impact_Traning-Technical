// A company transfers an encrypted code to one of its clients. The code needs to be decrypted so that it can be used for accessing all the required information. The code can be decrypted by interchanging each consecutive digit and once a digit has been interchanged then it cannot be used again. If at a certain point there is no digit to be interchanged with, then the single digit must be left as it is.
// Write an algorithm to decrypt the code so that it can be used to access the required information.

// Sample Input:
// 39631
// Sample Output:
// 93361

import java.util.Scanner;

public class decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int i=0,j=1;
        while(i<s.length() && j<s.length()){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i+=2;
            j+=2;
        }
        for(char l : ch){
            System.out.print(l);
        }
        sc.close();
    }
}
