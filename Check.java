import java.util.Scanner;

public class Check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("The number is positive.");
        } else if(n < 0){
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println("Develop by prajwal chapagain");
        sc.close();

    }
    
}
