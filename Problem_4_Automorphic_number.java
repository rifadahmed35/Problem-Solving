import java.util.Scanner;

public class Problem_4_Automorphic_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        //reading a number from the user
        num = input.nextInt();
        int count = 0;
        //determines the square of the given number
        int square = num * num;
        //copying the variable num into temp
        int temp = num;
        //iterate over the variable num until the condition become false
        while (temp > 0) {
            count++;
            //removes last digit of the variable num
            temp = temp/10;
        }
        //determines the last digit of the variable square
        int lastDigit = (int) (square%(Math.pow(10,count)));
        //compare num with last digit of the variable square
        // 25 = 625
        if(num==lastDigit){
            System.out.println(num + " is an automorphic number");
        }else {
            System.out.println(num + " is not an automorphic number");
        }
    }
}
