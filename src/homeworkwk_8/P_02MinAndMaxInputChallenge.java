package homeworkwk_8;

import java.util.Scanner;

public class P_02MinAndMaxInputChallenge {
    public void minmax() {
        int number;
        int i = 1, n = 0;
        int minnumber;
        int maxnumber = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        number = num.nextInt();
        minnumber = number;

        while (i > 0) {

            number = num.nextInt();
            if (number >= 0) {
                for (int j = 0; j < i; j++) {
                    if (number < minnumber) {
                        minnumber = number;
                    }
                }
                for (int j = 0; j < i; j++) {
                    if (number > maxnumber) {
                        maxnumber = number;
                    }
                }
            }else{
                    System.out.println("Invalid");
                    System.out.println("min" + minnumber);
                    System.out.println("max" + maxnumber);
                    System.out.println("total" + (i + 1));
                    break;
                }

                i++;

        }
    }

    public static void main(String[] args) {
        P_02MinAndMaxInputChallenge obj = new P_02MinAndMaxInputChallenge();
        obj.minmax();

    }

}

