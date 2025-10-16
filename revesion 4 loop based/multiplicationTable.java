import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = input.nextInt();
        MultiplicationTable(num);
    }
    public static void MultiplicationTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+num+"="+i*num);
        }
    }
}
