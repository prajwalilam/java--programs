import java.util.Scanner;
public class Smallernum {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
    
        int smallest = Math.min(num1, num2);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("Develop by Prajwal Chapagain");
        sc.close();
    }
    
}
