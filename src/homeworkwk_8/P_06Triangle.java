package homeworkwk_8;

import java.util.Scanner;

public class P_06Triangle {

    public static void pattern(){

        int i,j,n;

        n = 10;

        for(i=1;i<=n;i++){

            for(j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
