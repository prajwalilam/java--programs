import java.util.Scanner;
public class Vehicle{
    private String brand;
    private String model;
    Vehicle(){}
    Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
   
}
  class Car extends Vehicle{
    private  String Fuel_Type;
    private double price;
    Car(){}
    Car(String Fuel_Type,double price){
        this.Fuel_Type=Fuel_Type;
        this.price=price;
    }
    class ElectricCar extends Car {
        private String battery_Capacity;
        ElectricCar(String battery_Capacity){
         this.battery_Capacity=battery_Capacity;
        }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand:");
    }
    
}























public class OOPsProgram {

    
}
