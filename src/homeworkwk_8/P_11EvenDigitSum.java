package homeworkwk_8;

import java.util.Scanner;

// problem in result
public class P_11EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int i = 0, sum = 0, temp, n = 0;

        if (number >= 0) {
            temp = number;

            while (temp > 0) {
                temp = temp / 10;
                n = n + 1;
            }
            int digit[] = new int[n];
            temp = number;

            while (temp > 0) {
                digit[i] = temp % 10;
                if (digit[i] % 2 == 0) {
                    sum = sum + digit[i];
                }
                temp = temp/10;
                i++;
            }
            return sum;
        } else {
            return -1;

    }

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number for sum of digit ="+ "\t");
        int number = sc.nextInt();
        if ( number>=0){
            System.out.println("Sum of even digit = "+"\t"+ getEvenDigitSum(number));

        }else {
            System.out.println(getEvenDigitSum(number));
        }
    }
}
