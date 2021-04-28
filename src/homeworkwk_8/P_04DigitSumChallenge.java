package homeworkwk_8;

import java.util.Scanner;

public class P_04DigitSumChallenge {

    public int sumDigits(int number){

        int rem,sum=0;
        System.out.println("enter the number : ");

        //number = sc.nextInt();
        if(number>=10) {
            while (number > 0) {

                rem = number % 10;
                sum = sum + rem;
                number = number / 10;
                //System.out.println("Sum of digits : " + sum);
            }
        }else if (number>=1 && number<= 9){
            sum = -1;
        }else {
            sum =-1;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int number = sc.nextInt();
        P_04DigitSumChallenge obj = new P_04DigitSumChallenge();
        if(number>=10){
            System.out.println("Sum of digit : "+obj.sumDigits(number));
        }else {
            System.out.println("Invalid number");
        }

    }
}
