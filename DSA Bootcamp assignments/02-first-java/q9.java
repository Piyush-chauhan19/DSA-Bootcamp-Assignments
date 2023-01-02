import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers to be checked");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        armstrongChecker(num1, num2);
    }

    public static void armstrongChecker(int a , int b){
        if (armstrong(a)){
            System.out.println(a + " is armstrong number");
        } else if (armstrong(b)) {
            System.out.println(b + " is armstrong number");
        }else {
            System.out.println("None of them is armstrong number");
        }
    }

    public static boolean armstrong(int num){
        int sum = 0;
        int og = num;
        while (num > 0){
            int digit = num%10;
            sum += Math.pow(digit,3);
            num = (int) num/10;
        }
        return sum == og;
    }
}
