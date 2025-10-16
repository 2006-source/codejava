import java.util.Scanner;

public class deleteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Utility();
        System.out.print("enter your element you want to delete: ");
        int num= input.nextInt();
        int[] sort = sort(num,arr);
        int i=0;
       while(i<sort.length){
        System.out.println(sort[i]+" ");
        i++;
       }
    }
    public static int[] Utility(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i =0;
        while(i<size){
            System.out.print("elment "+(i+1)+": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static int[] sort(int num,int[] arr){
        int occ = occ(num,arr);
        int[] newArray = new int[arr.length-occ];
        int i =0;
        int j=0;
        while(i<arr.length){
            if(num!=arr[i]){
                newArray[j]=arr[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
    public static int occ(int num,int[] arr){
        int count = 0;
        int i =0;
        while(i<arr.length){
            if(arr[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }
}
