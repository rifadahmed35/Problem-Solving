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
public class Problem_2_Polymorphism_TriangleArea extends Shape1{
    double base, height;
    Problem_2_Polymorphism_TriangleArea (double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        System.out.print("Area of the Triangle is = ");
        return 0.5*base*height;
    }

    public static void main(String[] args) {
        //Since we are creating many reference variable (s1 , s2, s3) , more than 100 for instance, in super class,
        //We can use here array. With the help of array, we can create many variables for a same data type.

        Shape1 s[] = new Shape1[3];

        s[0] = new Shape1();
        s[1] = new Rectangle(10,20);
        s[2] = new Problem_2_Polymorphism_TriangleArea(10,20);

        for (int i = 0; i<3; i++){
            System.out.println(s[i].area());
        }
    }
}
