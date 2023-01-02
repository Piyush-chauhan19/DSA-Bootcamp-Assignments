import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 operands :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operation you wanna perform (+,-,*,/) : ");
        String operation = sc.next();
        if (operation.equals("+")){
            int num = num1+num2;
            System.out.println("The sum is : "+num);
        } else if (operation.equals("-")) {
            int num = num1 - num2;
            System.out.println("The differnce is : "+num);
        } else if (operation.equals("*")) {
            int num = num1*num2;
            System.out.println("The product is : "+num);
        } else if (operation.equals("/")) {
            float num = num1/num2;
            System.out.println("The division is : "+num);
        }else {
            System.out.println("Invalid operation!!!");
        }
    }
}
