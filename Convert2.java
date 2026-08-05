import java.util.Scanner;
public class Convert2 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter total seconds");
        int seconds = Sc.nextInt();
        int hours  = seconds/3600;
        int minutes = (seconds%3600)/60;
        int remainingSeconds = seconds % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + remainingSeconds);
        System.out.println("Developed by Prajwal Chapagain");
        Sc.close();
    }
    
}
