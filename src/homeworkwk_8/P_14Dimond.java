package homeworkwk_8;

import java.util.Scanner;

public class P_14Dimond {
    int i = 0, j=1, r;

    public void shape() {

        //int i,j,r=0;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        while ( i <= r) {
            j=1;
            while ( j <= r - i){
                System.out.print(" ");
            j++;}
            j=1;
            while (j <= 2 * i - 1){
                System.out.print("*");
                j++;}
            System.out.print("\n");
            i++;
        }
        i = r - 1;

        while ( i >= 1 ) {
            j = 1;
            while ( j <= r - i){
                System.out.print(" ");
            j++;}
            j = 1;
            while ( j <= 2 * i - 1){
                System.out.print("*");
            j++;}
            System.out.print("\n");
            i--;
        }

    }

    public static void main(String[] args) {
        P_14Dimond obj = new P_14Dimond();
        obj.shape();
    }
}
