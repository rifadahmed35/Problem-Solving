class Box{
    double height;
    double width;
    double depth;
    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    void measurement(){
        double volume = height*width*depth;

        System.out.println("Volume of the boxes = " +volume);
    }
}
public class Problem_1_BoxVolume {
    public static void main(String[] args) {
        Box b1 = new Box(10,10,10);
        b1.measurement();

        Box b2 = new Box(20,30,10);
        b2.measurement();

    }
}
