package homeworkwk_8;

public class Floor {

    double width,length; // global variable

    public Floor ( double width, double length){
        this.width = width; // assign the value for width
        this.length = length; // assign the value for length
        if (width<0){
            width = 0;
        }
        if (length<0){
            length = 0;
        }

    }
    public double getArea(){

        return  width*length;
    }
}
// another class in class
class Carpet{
    double cost;
    public Carpet(double cost){
        this.cost = cost;
        if (cost<0){
            cost = 0;
        }
    }
    public double getCost(){

        return cost;
    }
}
// another class in class
class Calculator{
    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
// main class
class Main1 {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }
}
