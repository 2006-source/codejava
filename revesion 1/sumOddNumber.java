import java.util.Scanner;

public class sumOddNumber {
    public static void main(String[] args) {
        System.out.println("welcome odd addition platform");
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number you want to add until : ");
        int num = input.nextInt();
        int add = add(num);
        System.out.println("addition of odd number: "+add);
    }
    public static int add(int num){
        int sum=0;
        for (int index = 0; index <= num; index++) {
            if(index%2!=0){
                sum=sum+index;
            }
        }
        return sum;
    }
}
