import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a palindrome: ");
        String str = sc.next();
        String ans = palindromeChecker(str);
        System.out.println(ans);
    }
    public static String palindromeChecker(String str){
        for (int i =0; i<= (str.length()/2);i++){
            if (str.charAt(i) != str.charAt(str.length() - i-1)){
                return str + " is not a palindrome";
            }
        }
        return str + " is a palindrome";
    }
}
