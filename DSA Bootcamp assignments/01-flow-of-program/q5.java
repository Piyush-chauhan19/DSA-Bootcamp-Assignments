import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        System.out.println("Type numbers to add (Enter x to find the sum:");
        int ans = sumofnumbers();
        System.out.println(ans);
    }
    public static int sumofnumbers(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            String num = sc.next();
            if (num.equals("x")){
                return sum;
            }else {
                sum += Integer.parseInt(num);
            }
        }
    }
}
