import java.util.Scanner;

class passwordChecker{
    int password=1234;
    int balance;
    int conformPassword;
    // menu
    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println(">> Please enter your choice <<");
        System.out.println("1. New User");
        System.out.println("2. Old User");
        int choice = input.nextInt();
        if(choice==1){
            signup();
        }else if(choice==2){
            signin();
        }else{
            int validchoice;
            do{
                System.out.print("Please enter valid choice:");
                validchoice = input.nextInt();
            }while(choice!=1||choice!=2);
        }
    }
//signup
    public void signup(){
          Scanner input = new Scanner(System.in);
          System.out.print("Please enter your password:");
          int currentPassword = input.nextInt();
          int reenterpass=conformPassword;

          do{
            System.out.println("please conform your password");
            reenterpass = input.nextInt();
          }while(currentPassword!=reenterpass);
          System.out.println("you succesfully complete signup process!");
          AccountDetails();
    }
//signin
    public void signin(){
        Scanner input = new Scanner(System.in);
         int pass;
         do{
            System.out.print("Please enter correct password:");
            pass = input.nextInt();
         }while(pass!=password||pass!=conformPassword);
         AccountDetails();
    }

// AcountDetails
    public void AccountDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your choice");
        System.out.println("1. Check bank balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. Exit");
        System.out.println("5. Back");
        int choi = input.nextInt();

        if(choi==1){
            Bankbalance();
        }else if(choi==2){
            WithDrawMoney();
        }else if(choi==3){
            DepositMoney();
        }else if(choi==4){
            return;
        }else if(choi==5){
            menu();
        }
        else{
            int invalid;
            do{
                System.out.print("enter valid choice: ");
                invalid = input.nextInt();
            }while(invalid>4||invalid<1);
        }
    }
    public void Bankbalance(){
        System.out.println(balance);
        AccountDetails();
    }
    public void WithDrawMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount for your withdrawl:");
        int amount = input.nextInt();
        if(amount>balance){
            System.out.println("Insufficient withdrawl");
        }else if(amount<=balance){
            System.out.println(balance);
            System.out.println("withdrawl successfully.....");
        }
        balance=balance-amount;
        AccountDetails();
    }
    public void DepositMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter amount for deposit: ");
        int amount = input.nextInt();
        balance = balance+amount;
        AccountDetails();
    }
}
    public class testing{
    public static void main(String[] args) {
        passwordChecker checker = new passwordChecker();
        checker.menu();
    }
}
