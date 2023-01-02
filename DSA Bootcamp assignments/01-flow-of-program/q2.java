import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers you want to add");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num2+num1;
        System.out.println("sum of numbers is " + num3);
    }
}
