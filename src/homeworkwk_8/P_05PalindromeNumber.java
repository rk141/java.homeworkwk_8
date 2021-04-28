package homeworkwk_8;

import java.util.Scanner;

public class P_05PalindromeNumber {

    public boolean isPalindrome( int num){

    int temp = num, reverse=0,reminder;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num =sc.nextInt();
        temp = num;
    while (temp !=0){
        reminder = temp%10;
        reverse = reverse*10+reminder;
        temp = temp/10;

    }
        if ( num==reverse){
            System.out.println(num+  " is palindrome number: ");
        }else{
            System.out.println(num+  " is not palindrome number: ");
        }
        return false;
    }

    public static void main(String[] args) {
       P_05PalindromeNumber obj = new P_05PalindromeNumber();
        obj.isPalindrome(0);
    }
}
