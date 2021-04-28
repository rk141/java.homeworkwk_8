package homeworkwk_8;

import java.util.Scanner;

public class P_03Vovel {

    void alpha(char ch) {

        if (ch == 'a' || ch ==  'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            System.out.println("Entered character is vowel ");
        }
        else if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')) {

            System.out.println("Entered character is Constant ");
        }else {
            System.out.println("Entered character is not alphabet ");
        }
    }
    public static void main(String[]args){
        P_03Vovel obj=new P_03Vovel();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any character: ");
        char in=sc.next().charAt(0);
        obj.alpha(in);
    }
}
