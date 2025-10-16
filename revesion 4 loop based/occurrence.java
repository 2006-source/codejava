import java.util.Scanner;

class occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number you want to count: ");
        int[] arr = Utilitie();
        int num =  input.nextInt();
        int occ = occ(arr,num);
        System.out.println("occurrence is: "+occ);
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
    public static int occ(int[] arr,int num){
        int digit=0;
        int i = 0;
        while(i<arr.length-1){
            if(num==arr[i]){
                digit++;
            }
            i++;
        }
        return digit;
    }
}
