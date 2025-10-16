import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter student score : ");
        int score = input.nextInt();
        String categorie = score>80 ? "high":score>50&&score<80 ? "modirate":score<50 ? "Low":"invalid";
        System.out.println(categorie);
    }
} 
