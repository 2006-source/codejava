import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome prime number checker! ");
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        int reverse = reversedigit(num);
        System.out.println(reverse);
    }
    public static int reversedigit(int num){
        int reverse =0;
        int i=0;
        while(i<num){
            reverse = reverse*10+num%10;
            num = num/10;
            //i++;
        }
        return reverse;
    }
}
