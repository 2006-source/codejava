import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome digit addition platform");
        System.out.print("enter any number : ");
        int num = input.nextInt();
        int sumOfDigit = sumOfDigit(num);
        System.out.println(sumOfDigit);
    }
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num= num/10;
        }
        return sum;
    }
}
