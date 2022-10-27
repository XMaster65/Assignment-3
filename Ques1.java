import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int num3 = sc.nextInt();
        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Product: " + product);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
    }
}
