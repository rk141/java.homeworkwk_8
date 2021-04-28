package homeworkwk_8;

public class P_09Fibonacci {

    public void fib(){

         int n = 8; int t1 = 1; int t2 = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1);

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    public static void main (String args[])
    {
        P_09Fibonacci obj = new P_09Fibonacci();
        obj.fib();
    }



}
