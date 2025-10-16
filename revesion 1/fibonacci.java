import java.util.Scanner;

public class fibonacci {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome prime number checker! ");
        System.out.print("Enter any number: ");
        int num = input.nextInt();
       
        fibonacci(num);
        //System.out.print("0 1 "+fibonacci);
    }
    public static void fibonacci(int num){
        System.out.print("0 1 ");
        int first =0;
        int second = 1;
        int i=0;
        while(i<=num-3){
            int third = first+second;
            System.out.print(third +" ");
            first=second;
            second=third;
            i++;
        }
    }
}
