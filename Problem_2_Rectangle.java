class Shape{
    double area(){
        return 0;
    }
}
public class Problem_2_Rectangle extends Shape {
    double length;
    double width;

    Problem_2_Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        System.out.print("Area for Rectangle:");
        return length*width;
    }
}
