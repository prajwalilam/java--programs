import java.util.Scanner;

class Student {
    int id;
    String name;
}

public class ArrayofStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        System.out.println("Enter student details:");
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].id = sc.nextInt();
            s[i].name = sc.next();
        }

        System.out.println("ID\tName");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].id + "\t" + s[i].name);
        }

        sc.close();
    }
}