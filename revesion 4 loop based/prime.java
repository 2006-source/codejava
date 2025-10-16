import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        if(isprime){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
    public static boolean isprime(int num){
        if(num<2){
            return false;
        }
        for (int i = 2; i <num-1; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
