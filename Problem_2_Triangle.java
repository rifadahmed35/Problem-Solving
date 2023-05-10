public class Problem_2_Triangle extends Shape{
    double height;
    double base;

    Problem_2_Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        System.out.print("Area for Triangle:");
        return 0.5*base*height;
    }
}
