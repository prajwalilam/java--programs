import java.util.Scanner;
public class Convert1 {

    public static void main(String[] args){
        Scanner Sc  = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int days = Sc.nextInt();
        int months = days/30;
        System.out.println("Number of months = " + months);
        System.out.println("Number of remaining days=" + days % 30 );
        System.out.println("Developed by Prajwal Chapagain");
        Sc.close();
    }
        
    
}
