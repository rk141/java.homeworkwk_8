package homeworkwk_8;

import java.util.Scanner;

public class P_07FirstAndLastDigit {

    public static void sumFirstAndLastDigit(){

        int rem, num, rev = 0, firstd, lastd, sum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();

        lastd = num % 10;

        if(num>=0) {

            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            firstd = rev % 10;
            sum = firstd + lastd;

            System.out.println("Sum of first and last digits:" + sum);
        }else
        System.out.println("-1");
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit();
    }
}
