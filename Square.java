import java.util.Scanner;
public class Square {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int square = num * num;
        System.out.println("The square of " + num + " is " + square);
        System.out.println("Developed by  Prajwal Chapagain");
       scanner.close();
    }
}
