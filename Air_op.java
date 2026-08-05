import java.util.Scanner;
public class Air_op {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    System.out.println("Sum =  "+ (num1 + num2));
    System.out.println("Difference =  "+ (num1 - num2));
    System.out.println("Product =  "+ (num1 * num2));
    System.out.println("Developed by Prajwal Chapagain");
    scanner.close();
  }
}
