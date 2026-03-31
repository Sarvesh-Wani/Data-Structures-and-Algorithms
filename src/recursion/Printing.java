package recursion;

public class Printing {

    public static void print1(int n){

        while(n-- >= 0){

            if(n<0){
                return;
            }
            System.out.println("Hello");
        }
    }

    public static void printNTo1(int n){

        if(n<1) {
            return;
        }
        //print current then down
        System.out.println(n);
//        then move down
        printNTo1(n-1);

    }

    public static void print1ToN(int n){

        if(n<1) {
            return;
        }
        //first go in
        print1ToN(n-1);
        //then print
        System.out.println(n);


    }

    static void main() {
        print1ToN(10);
    }
}
