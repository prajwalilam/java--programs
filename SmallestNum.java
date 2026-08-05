import java.util.Scanner;
public class SmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int smallest= Math.min(Math.min(num1, num2), Math.min(num3, num4));
        System.out.println("The smallest number is: " + smallest);
        System.out.println("Develop by Prajwal Chapagain");
        sc.close();
    }
    
}
