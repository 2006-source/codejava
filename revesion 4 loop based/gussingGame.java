import java.util.Scanner;

public class gussingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu menu = new menu();
        int guaranteed = menu.run();
        System.out.print("enter any number between 1 to 100 you want to guss: ");
        int number = input.nextInt();
        do{
            if(guaranteed>number){
                System.out.print("Please guss higher: ");
                number = input.nextInt();
            }if(guaranteed<number){
                System.out.print("Please guss lower: ");
                number = input.nextInt();
            }
        }while(guaranteed!=number);
        System.out.println("Finally you guss currect number successfully");
    }
}

class menu{
    public int run(){
    double num = Math.random()*100;
        return ((int)Math.ceil(num));
    }
 }

