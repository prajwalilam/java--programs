import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in fahrenheit is: " + fahrenheit);
        System.out.println("Developed by  Prajwal Chapagain");
        scanner.close();
    }
    
}
