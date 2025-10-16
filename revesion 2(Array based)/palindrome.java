import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Utility();
        boolean ispalindrome = palindrome(arr);
        if(ispalindrome){
            System.out.print("array is palindrome");
        }else{
            System.out.print("array is not palindrome");
        }
    }
    public static int[] Utility(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static boolean palindrome(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i]!=arr[(arr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
