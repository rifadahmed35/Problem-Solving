public class Problem_2_Test {
    public static void main(String[] args) {
        //Shape s =new Shape();
        //Problem_2_Rectangle r = new Problem_2_Rectangle(10,20);
        //Problem_2_Triangle t = new Problem_2_Triangle(10,20);

        // Instead here we can also use Run time Polymorphism / Dynamic method:

        //Shape s1 =new Shape();
        //Shape s2 = new Problem_2_Rectangle(10,20);
        //Shape s3 = new Problem_2_Triangle(10,20);

        //However, since we are creating many reference variable (s1 , s2, s3) , more than 100 for instance, in super class,
        //We can use here array. With the help of array, we can create many variables for a same data type.
        Shape [] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Problem_2_Rectangle(10,20);
        s[2] = new Problem_2_Triangle(10,20);

        //System.out.println(s[0].area());
        //System.out.println(s[1].area());
        //System.out.println(s[2].area());

        //Then we can use for loop to get output in more easy way.
        for(int i =0; i<3; i++){
            System.out.println(s[i].area());
        }
    }
}
