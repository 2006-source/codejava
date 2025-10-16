import java.util.Scanner;
public class sumAndAve{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ArrayUtility = ArrayUtility();
        int sum = sum(ArrayUtility);
        System.out.println("sum is : "+sum);
        int ave = ave(ArrayUtility);
        System.out.println("average  is : "+ave);
    }
    public static int[] ArrayUtility(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter size of an array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i<size) {
            System.out.print("enter element number "+(i+1)+" :");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static int sum(int[] ArrayUtility ){
        int sum = 0;
        int i = 0;
        while(i<ArrayUtility.length){
            sum += ArrayUtility[i];
            i++;
        }
        return sum;
    }
    public static int ave(int[] ArrayUtility ){
        int average =1;
        int ave = 0;
        int i = 0;
        while(i<ArrayUtility.length){
            ave = (ave+ArrayUtility[i]);
            i++;
           // return ave;
        }
        average = ave/ArrayUtility.length;
        return average;
    }
}