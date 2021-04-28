package homeworkwk_8;

public class P_13SharedDigit {

    public static boolean hasSharedDigit(int a, int b){
        int i =0;
        int a1[ ]= new int[2];
        int b1[] = new int[2];
        if(a>=10 && a<=99 &&  b>=10 && b<=99){

            while (a>0 && b>0){
                a1[i] = a%10;
                a=a/10;
                b1[i] = b%10;
                b = b/10;
                i++;
            }
            if (a1[0]==b1[0] || a1[0]==b1[1] || a1[1] == b1[0] ||a1[1] == b1[1]){
                return true;
            }
        }else
            return false;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,-15));

    }
}
