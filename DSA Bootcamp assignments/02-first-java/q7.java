import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        System.out.println("Enter the number till what you need fibonacci series :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        while (num2 <= num){
            System.out.println(num2);
            int temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }
    }
}
