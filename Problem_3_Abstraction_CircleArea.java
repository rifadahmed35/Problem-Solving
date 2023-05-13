abstract class Shape2{
    double value1, value2;
    Shape2(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    abstract void area();
}
class Rectangle2 extends Shape2{
    //value1, value2
    Rectangle2 (double value1, double value2){
        super(value1, value2);
    }

    @Override
    void area() {
        double result = value1*value2;
        System.out.print("Triangle area = " +result);
        System.out.println();
    }
}
class Triangle2 extends Shape2{
    //value1, value2
    Triangle2 (double value1, double value2){
        super(value1, value2);
    }

    @Override
    void area() {
        double result = 0.5*value1*value2;
        System.out.print("Triangle area = " +result);
        System.out.println();
    }

}
public class Problem_3_Abstraction_CircleArea extends Shape2 {
    //value1, value2
    //Area = 3.1416 * r * r
    Problem_3_Abstraction_CircleArea (double r){
        super(r, r);
    }
    @Override
    void area() {
        double result = Math.PI * value1 * value2;  //Or, 3.1416*r*r
        System.out.print("Circle area = " +result);
    }

    public static void main(String[] args) {
        Shape2 s;
        s = new Rectangle2(10,20);
        s.area();
        s = new Triangle2(10,20);
        s.area();
        s= new Problem_3_Abstraction_CircleArea(5);
        s.area();
    }
}
