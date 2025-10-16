import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.print("enter radus of circle : ");
         Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        double area = Math.PI*Math.pow(r,2);
        System.out.println("area : "+area);
        double cir = 2*Math.PI*r;
        System.out.println("circumference : "+cir);
    }
}
