public class patterns1 {
    public static void main(String[] args) {
        
        // Problem 5: Inverted Left-Aligned Triangle
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = n; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        // Problem 6: Hollow Right-Angled Triangle
        n = 5; 

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i > 2 && i < n && j > 1 && j < i){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Problem 7: Hollow Pyramid
        n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k < 2*i; k++){
                if(k == 1 || k == (2*i)-1 || i == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Problem 8: Diamond
        n = 5;

        for(int i = 1; i < 2*n; i++){
            int spaces = Math.abs(n-i);
            int stars = 2 * (n - spaces) - 1;

            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= stars ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
