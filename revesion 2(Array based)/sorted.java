import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        int[] array = Utility();
        boolean isSort = sortedArray(array);
        if(isSort){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is unsorted");
        }
    }
    public static int[] Utility(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i =0 ;
        while(i<size){
            System.out.print("element "+(i+1)+" is : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static boolean sortedArray(int[] array){
        int i =1;
        while(i<array.length){
            if(array[i-1]>array[i]){
                 return false;
            }
            i++;
        }
        return true;
    }
}
