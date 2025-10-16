import java.util.Scanner;

//import javax.swing.text.Utilities;

class FindMaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Utilitie();
        int max = max(arr);
        System.out.println("max is: "+max);
    }
    public static int[] Utilitie(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        //int i=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("enter element"+(i+1)+" :");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static int max(int[] arr){
        int max= arr[0];
        int i = 1;
        while(i<arr.length){
            if(max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
}
