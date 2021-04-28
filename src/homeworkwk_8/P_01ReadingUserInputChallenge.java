package homeworkwk_8;

import java.util.Scanner;

public class P_01ReadingUserInputChallenge {

    private double arr;

    public boolean hasNeextInt(){
        double counter;
        Scanner num = new Scanner(System.in); // scanner object
        boolean result = true;
        int i =1;
        while (i <= 10){ // condition
            System.out.println("Enter the number : ");
            counter = num.nextDouble();
            if (counter%1 != 0){

                result = false;
                System.out.println("Invalid number");

                do {
                    System.out.println("Enter the valid number");
                    counter = num.nextDouble();
                }while (counter%1 !=0);
            }
            i++;
        }
        return result;
    }
    // i just know simple java
    public void nextInt(){
        double sum = 0;
        for (int a = 0; a<10; a++){
           // sum = sum = sum+ arr[0];
        }
    }
 // main method
    public static void main(String[] args) {
        P_01ReadingUserInputChallenge obj = new P_01ReadingUserInputChallenge();
        System.out.println(obj.hasNeextInt());

        obj.nextInt();// calling method in main method
    }
}
