package homeworkwk_8;

public class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height<0){
            height = 0;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height; // logic for area
    }
}
// main class
class main1 {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }

}
