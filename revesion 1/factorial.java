import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome factorial calculator: ");
        System.out.print("enter any nummber you want to print factorial: ");
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.println("factorial of given number is : "+fact);
    }
    public static int factorial(int num){
        if(num<=1){
            return 1;
        }
        int fac = 1;
        for (int index = 1; index < num+1; index++) {
            fac = fac*index;
        }
        return fac;
    }
}
