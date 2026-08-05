import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5, total;
        double percentage;

        System.out.println("Enter marks of 5 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        System.out.println("\nTotal Marks = " + total);
        System.out.printf("Percentage = %.2f%%\n", percentage);

        if (percentage >= 40)
            System.out.println("Result = Pass");
        else
            System.out.println("Result = Fail");
            
            System.out.println("Developed by prajwal chapagain");
            sc.close();
    }
}