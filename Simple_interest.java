import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the principle,rate of  interest and time in years:");
     double principle = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
     double simple_interest = (principle * rate * time) / 100;
     System.out.println(" The simple interest is: " + simple_interest);
     System.out.println("Developed by  Prajwal Chapagain");
     scanner.close();
    }
    
}
