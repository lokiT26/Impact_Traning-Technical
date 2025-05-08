public class patterns {
    public static void main(String[] args) {
        
        // Problem 1: Right-Angled Triangle
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Problem 2: Left-Aligned Triangle
        n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Problem 3: Pyramid
        n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Problem 4: Inverted Right-Angled Triangle
        n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
