package homeworkwk_8;

public class P_16Point {

    int x,y;

    public P_16Point(){

    }

    public P_16Point(int x, int y){

        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x){
        this.x=x;

    }
    public void setY(int y){
        this.y=y;

    }
    public double distance(){

        double dist=0;
        dist=Math.sqrt((0-x)*(0-x)+(0-y)*(0-y));
        return dist;
    }
    public double distance(int x, int y){
        this.x=x;
        this.y=y;

        double dist =0;
        dist=Math.sqrt((6-x)*(6-x)+(5-y)*(5-y));
        return dist;
    }
    public double distance(double a, double b){
        double x1=a;
        double x2=b;

        double dist=0;
        dist=Math.sqrt((x1-x)*(x1-x)+(x2-y)*(x2-y));
        return dist;
    }

    public static void main(String[] args) {

        P_16Point first = new P_16Point(6,5);
        P_16Point second = new P_16Point(3,1);
        System.out.println("Distance (0,0)= " + first.distance());
        System.out.println("Distance (second)= " + first.distance(3,1));
        System.out.println("Distance (2,2)= " + first.distance(2,2));
        P_16Point point =new P_16Point();
        System.out.println("Distance()= " +point.distance());

    }
}
