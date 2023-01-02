import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in ruppes: ");
        float ruppes = sc.nextFloat();
        float dollars = (float) (ruppes * 0.012);
        System.out.println("Amount in dollars is : " + dollars);
    }
}
