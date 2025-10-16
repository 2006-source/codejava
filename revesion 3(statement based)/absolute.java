import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        int absolut = num>=0?num:-num;
        System.out.print("absolute value of given number is: "+absolut);
    }
}
