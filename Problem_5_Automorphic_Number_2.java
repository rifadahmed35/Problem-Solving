import java.util.Scanner;

public class Problem_5_Automorphic_Number_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        System.out.println("The Automorphic number between " +num1 + " and " +num2 + " are: ");
        int i, temp, square, lastDigit, count;

        for (i = num1; i <= num2; i++) {
            temp = i;
            count = 0;
            square = temp*temp;
            for (; temp != 0; temp = temp / 10) {
                count++;
            }
                lastDigit = (int) (square % (Math.pow(10, count)));
                if (lastDigit == i) {
                    System.out.print(i +", ");
            }
        }
    }
}
