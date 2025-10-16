import java.util.Scanner;

public class multiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome multiplication Table");
        System.out.print("enter any number you want to print table: ");
        int num = input.nextInt();
        multiplicationTable(num);
    }
    public static void multiplicationTable(int num){
        for (int index = 1; index < 11; index++) {
            int mul = num*index;
            System.out.println(num+"x"+index+"="+mul);   
        }
    }
}