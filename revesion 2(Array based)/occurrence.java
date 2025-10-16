import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = ArrayUtility();
        System.out.print("enter any element you want to count : ");
        int count = input.nextInt();
        int occ = occ(count,array);
        System.out.println("occurrence of "+count+" is : "+occ);
    }
    public static int[] ArrayUtility(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Array element "+(i+1)+"is : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static int occ(int count,int[] array){
        int occ = 0;
        int i = 0;
        while(i<array.length){
            if(count==array[i]){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
