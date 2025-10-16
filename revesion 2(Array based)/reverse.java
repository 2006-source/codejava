import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Array = Utility();
        int[] reverse = reverse(Array);
        int i=0;
        while(i<reverse.length){
            System.out.println(reverse[i]+" ");
            i++;
        }
    }
    public static int[] Utility(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i=0;
        while(i<size){
            System.out.print("enter element "+(i+1)+": ");
            nums[i]= input.nextInt();
            i++;
        }
        return nums;
    }
    public static int[] reverse(int[] Array){
        int i = 0;
        while(i<Array.length/2){
            int swap= Array[i];
            Array[i]=Array[(Array.length)-(i+1)];
            Array[(Array.length)-(i+1)]=swap;
            i++;
        }
        return Array;
    }
}
