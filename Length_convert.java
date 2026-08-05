import java.util.Scanner;
public class Length_convert {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the length in kilometers:");
         double kilometer = scanner.nextDouble();
         double meters = kilometer *1000;
         System.out.println(kilometer + "  is equal to " + meters +" meters");
         System.out.println("Developed by  Prajwal Chapagain");
         scanner.close();

            
        
    }
    
}
