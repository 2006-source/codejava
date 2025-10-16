import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome Armstrong checkpost");
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        boolean armstrong = Armstrong(num);
        if(armstrong){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
    
    public static boolean Armstrong(int num){
        int original = num;
        int size = size(num);
        System.out.println(size);
        int fact = 0;
        int i =0;
        while(i<num){
           int digit = num%10;
           fact += (int)Math.pow(digit,size);
           num=num/10;
        }
        return fact == original;
    }

    public static int size(int num){
        int count =0;
        //int fact = 0;
        //int i = num;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
