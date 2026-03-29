public class Pattern1 {

    public static void newpattern(int n) {

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void newpattern2(int n) {

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    public static void main() {

        newpattern2(5);

    }
}
