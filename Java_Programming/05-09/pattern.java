public class pattern{
    public static void main(String[] args) {
        int n = 5;

        // Right angle Triangle
        for(int i = 1; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Right angle Triangle
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = n; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }


        // Diamond
        System.out.println();
        for(int i = 1; i <= (2*n)-1; i++){
            int space = Math.abs(n - i);
            int star = 2 * (n - space) - 1;

            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= star; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Hollow square
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j > 1 && j < n && i > 1 && i < n){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}