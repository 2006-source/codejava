import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Utility();
        int max = max(array);
        System.out.println( "max is: "+max);
        int min = min(array);
        System.out.println( "max is: "+min);
    }
    public static int[] Utility(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("element no. "+(i+1)+" : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static int max(int[] array){
        int max = array[0];
        int i=1;
        while(i<array.length){
            if(max<array[i]){
                max=array[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] array){
        int min = array[0];
        int i = 0;
        while(i<array.length){
            if(min>array[i]){
                min = array[i];
            }
            i++;
        }
        return min;
    }
}
