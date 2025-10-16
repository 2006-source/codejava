import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome LCM ");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter Second number: ");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.print("lcm is: "+lcm);
    }
    public static int lcm(int first, int second){
        int i =1;
        while(i<=first*second) {
            int fact = first*i;
            if(fact%second==0){
                return fact;
            }
            i++;
        } 
        return 0;
    }
}
