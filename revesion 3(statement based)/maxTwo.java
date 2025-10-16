import java.util.Scanner;

public class maxTwo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int first = input.nextInt();
        // System.out.print("enter second number: ");
        // int second = input.nextInt();

        // int max = (first>second) ? first:second;
        // System.out.print("maximum number is: "+max);

        if(first%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}