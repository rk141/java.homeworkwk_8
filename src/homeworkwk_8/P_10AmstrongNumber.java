package homeworkwk_8;

import java.util.Scanner;

public class P_10AmstrongNumber {

    public static void ams(){

        int number,tempNum, digit, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        tempNum = number;

        while (tempNum != 0)
        {
            // On each iteration, remainder is powered by the tempNumber of digits n
            digit =tempNum % 10;

            //sum of cubes of each digits is equal to the tempNumber itself
            sum = sum + digit*digit*digit;

            tempNum /= 10;

        }
          //check given tempNumber and digitCubeSum is equal to or not
        if(sum == number)
            System.out.println(number + ": is an Armstrong Number");
        else
            System.out.println(number + ": is not an Armstrong Number");

    }

    public static void main(String[] args) {
        ams();
    }
}
