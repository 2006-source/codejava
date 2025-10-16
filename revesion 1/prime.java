import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome prime number checker! ");
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        boolean isPrime = prime(num);
        if(isPrime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
    public static boolean prime(int num){
        if(num==1||num==2){
            return true;
        }
        int i=2;
        while(i<num){
            if(num%i!=0){
                return false;
            }
            i++;
        }
        return true;
    }
}
