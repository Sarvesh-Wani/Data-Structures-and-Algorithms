public class Pattern3 {

    public static void trianglePatternStar(int n) {

        for (int i = 0; i < n; i++) {

            //space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void trianglePatternReverse(int n) {

        for (int i = 0; i < n; i++) {

            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < 2*n -(2 * i + 1); j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    public static void diamondPattern(int n){
        trianglePatternStar(n);
        trianglePatternReverse(n);
    }
    static void main() {

        diamondPattern(5);
    }
}
