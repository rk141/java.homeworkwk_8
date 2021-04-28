package homeworkwk_8;

public class P_15RightTry {

    public void rightTry(){
    int rows = 5;

        for (int x = 1; x <= rows; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("* ");
            }

            System.out.println("");

        }
    }

    public static void main(String[] args) {
        P_15RightTry obj = new P_15RightTry();
        obj.rightTry();
    }
}
