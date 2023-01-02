import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.println("Enter the number you want multiplication table for:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i =1; i <= 10;i++){
            int product = num*i;
            System.out.println(num + " into " + i + " = " + product);
        }
    }
}
