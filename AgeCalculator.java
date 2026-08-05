import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Present Date (Year Month Day):");
        int py = sc.nextInt();
        int pm = sc.nextInt();
        int pd = sc.nextInt();

        System.out.println("Enter Birth Date (Year Month Day):");
        int by = sc.nextInt();
        int bm = sc.nextInt();
        int bd = sc.nextInt();

        LocalDate presentDate = LocalDate.of(py, pm, pd);
        LocalDate birthDate = LocalDate.of(by, bm, bd);

        Period age = Period.between(birthDate, presentDate);

        System.out.println("\nAge:");
        System.out.println("Years  = " + age.getYears());
        System.out.println("Months = " + age.getMonths());
        System.out.println("Days   = " + age.getDays());
        System.out.println("Developed by Prajwal Chapagain");

        sc.close();
    }
}
