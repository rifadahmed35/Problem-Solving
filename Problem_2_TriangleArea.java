import java.lang.reflect.Array;

class Shape1{
    double area(){
        return 0;
    }
}
class Rectangle extends Shape1{
    double length, width;

    Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        System.out.print("Area of the Rectangle is = ");
        return length*width;
    }
}
public class Problem_2_TriangleArea extends Shape1{
    double base, height;
    Problem_2_TriangleArea (double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        System.out.print("Area of the Triangle is = ");
        return 0.5*base*height;
    }

    public static void main(String[] args) {
        Shape1 s[] = new Shape1[3];

        s[0] = new Shape1();
        s[1] = new Rectangle(10,20);
        s[2] = new Problem_2_TriangleArea(10,20);

        for (int i = 0; i<3; i++){
            System.out.println(s[i].area());
        }
    }
}
