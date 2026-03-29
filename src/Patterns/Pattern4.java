public class Pattern4 {

    public void comboPattern(int n){

        for(int i=0; i<=2*n-1; i++){

            int stars = i;

            if(i>n) stars = 2*n-i;

            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void main() {
        Pattern4 p = new Pattern4();
        p.comboPattern(5);
    }
}
