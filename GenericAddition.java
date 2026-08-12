import java.util.Scanner;
public class GenericAddition<T extends Number>{
    private T a;
    private T b;

 GenericAddition(T a, T b){
    this.a=a;
    this.b=b;
 }
 double add(){
    return a.doubleValue()+b.doubleValue();
 }
 public static void main(String[]  args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      Integer x = sc.nextInt();
      System.out.println("Enter  Second number");
      Integer y = sc.nextInt();
      GenericAddition<Integer>obj=new GenericAddition<Integer>(x, y);
      System.out.println("Sum  ="+ obj.add());
    }
}
    

