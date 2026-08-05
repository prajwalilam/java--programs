class Member {
    private String name;
    private String address;
    private int age;
    private long phone;
    private int salary;

    public Member(String name, String address, int age, long phone, int salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    public void setMembersDetails(String name, String address, int age, long phone, int salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    public void printMemberDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Address : " + address);
        System.out.println("Phone : " + phone);
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, String address, int age, long phone, int salary, String specialization) {
        super(name, address, age, phone, salary);
        this.specialization = specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void printSpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, String address, int age, long phone, int salary, String department) {
        super(name, address, age, phone, salary);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printDepartment() {
        System.out.println("Department: " + department);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Member obj = new Member("Prajwal", "Jhapa", 19, 9844624004L, 200000);
        obj.printMemberDetails();

        Employee emp = new Employee("Prajwal", "Jhapa", 19, 9844624004L, 200000, "Software");
        emp.printSpecialization();

        Manager mgr = new Manager("Prajwal", "Jhapa", 19, 9844624004L, 200000, "IT");
        mgr.printDepartment();
    }
}
