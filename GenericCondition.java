import  java.util.Scanner;
public class GenericCondition<X extends Number> {
    private X p;
    private X q;
    private X r;
    GenericCondition(X p,X q, X r){
        this.p=p;
        this.q=q;
        this.r=r;
    }
    Integer Display(){
        if (p.doubleValue() > q.doubleValue() && q.doubleValue() > r.doubleValue()) {
            return p.intValue();
        } else if (r.doubleValue() > q.doubleValue() && q.doubleValue() < p.doubleValue()) {
           return r.intValue();
        } else if (q.doubleValue() > p.doubleValue() && q.doubleValue() > r.doubleValue()) {
            return q.intValue();
            
        }else {
           return null;
        }
    }
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);

        System.out.println("WE are going to find the largst number among three:");
        System.out.println("Enter the value of p");
        Integer x=Sc.nextInt();
        System.out.println("Enter the value of q");
        Integer y = Sc.nextInt();
        System.out.println("Enter the value of r");
        Integer z = Sc.nextInt();
        GenericCondition<Integer>obj=new GenericCondition<Integer>(x, y, z);
        System.out.println("The largest element is "+ obj.Display());
        if(x==y && y==z){
            System.out.println(" Because all numbers are equal");
        }
    }

    
}
