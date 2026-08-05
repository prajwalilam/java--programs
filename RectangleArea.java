import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("Developed by  Prajwal Chapagain");
        scanner.close();
    }
}
