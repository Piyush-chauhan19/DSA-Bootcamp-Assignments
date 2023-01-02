import javax.swing.plaf.SeparatorUI;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the principle amount:");
        int p = sc.nextInt();
        System.out.println("Please enter the interest rate:");
        int r = sc.nextInt();
        System.out.println("Please enter the time period of loan:");
        int t = sc.nextInt();
        float a = (p*r*t)/100;
        float b = p +a;
        System.out.println("Your Interest will be : " +a);
        System.out.println("Total amount to be paid by you is : " +b);


    }
}
