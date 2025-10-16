import java.util.Scanner;

public class monthOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter month number: ");
        int num = input.nextInt();
        String month = num==1? "january":num==2? "fabruary":num==3? "March"
                     :num==4? "April":num==5?"May":num==6?"June":num==7?"July"
                     :num==8?"August":num==9?"Septumber":num==10?"Octuber"
                     :num==11?"November":num==12?"December":"invalid";
        System.out.println(month);
    }
}
