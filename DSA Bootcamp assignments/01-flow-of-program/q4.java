import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for hcf and lcm");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int factor = hcf(num1,num2);
        int multiple = lcm(num1, num2);
        System.out.println(factor);
        System.out.println(multiple);
    }
    public static int hcf(int a, int b){
        int gcd = 1;
        for (int i =1; i<=a && i<=b;i++){
            if (a%i == 0 && b%i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int lcm(int a, int b){
        int num = (int) a*b/hcf(a, b);
        return num;
    }
}
