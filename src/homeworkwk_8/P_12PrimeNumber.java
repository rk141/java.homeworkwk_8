package homeworkwk_8;

import java.util.Scanner;

public class P_12PrimeNumber {

    public static void prime(){

        int temp;
        boolean isPrime=true;

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter any number:");

        //capture the input in an integer
        int num=scan.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }

    public static void main(String[] args) {

        prime();
    }


}
