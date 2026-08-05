import java.util.Scanner;
public class ProductofOddnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        System.out.println("The product of odd numbers from 1 to " + n + " is: " + product);
        System.out.println("Develop by Prajwal Chapagain");
        sc.close();
    }
    
}
