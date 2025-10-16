import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter any number you want to print: ");
        int num = input.nextInt();
        FibonacciSeries(num);
    }
    public static void FibonacciSeries(int num){
        System.out.print("0 1 ");
        int first = 0;
        int second = 1;
        while(first+second<num){
            int third = first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }
}
