import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome GCD ");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        int gcd = Gcd(first,second);
        System.out.print("gcd is : "+gcd);
    }
    public static int Gcd(int first, int second){
        int least = least(first,second);
        int i=2;
        while(i<=least){
            if(first%i==0 && second%i==0){
                return i;
            }
            i++;
        }
        return 0;
    }
    public static int least(int first,int second){
        if(first<second){
            return first;
        }
        return second;
    }
}
