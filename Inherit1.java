public class Inherit1 {
    private int age,salary;
    private String name,address,phone;
    public void setMemberDetail(int age,int salary,String name,String address,String phone){
        this.age=age;
        this.salary = salary;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void printMemberDetail(){
        System.out.println("Age :"+ age);
        System.out.println("Salary :"+ salary);
        System.out.println("Name: " + name);
        System.out.println("address: "+ address);
        System.out.println("Phone no:" + phone);
    }


    
}
