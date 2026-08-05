import java.util.Scanner;

public class AreaBetweenConcentricCircles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter outer radius and inner radius:");
        double R = sc.nextDouble();
        double r = sc.nextDouble();

        double area = Math.PI * (R * R - r * r);

        System.out.println("Area between two concentric circles = " + area);
        System.out.println("Developed by Prajwal Chapagain");
        sc.close();
    }
}