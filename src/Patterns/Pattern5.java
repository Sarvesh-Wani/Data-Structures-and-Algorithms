package Patterns;

public class Pattern5 {

    public static void numberPattern(int n) {

        int start = 1;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) start = 1;
            else start = 0;

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();

        }
    }

    static void main() {
        numberPattern(5);
    }
}
