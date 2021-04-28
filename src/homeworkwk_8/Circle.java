package homeworkwk_8;

public class Circle {

    double radius;
    Circle(double radius){
        this.radius = radius; // assign the value for radius
        if (radius<0){
            radius = 0;
        }
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area;
        area = radius*radius*Math.PI; // logic for area
        return area;
    }
}

