import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome Armstrong checkpost");
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        boolean isPalindrome = Palindrome(num);
        if(isPalindrome){
            System.out.println(num+" is Palindrome");
        }else{
            System.out.println(num+" is not Palindrome");
        }
    }
    public static boolean Palindrome(int num){
        int original = num;
        int reverse = 0;
        int i =0;
        while(i<num){
            int digit = num%10;
            reverse= reverse*10 +digit;
            num = num/10;
        }
        return reverse==original;
    }
}
