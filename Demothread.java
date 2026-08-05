 class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            
         System.out.println("I am here,from thread class:"+ i);
        }
    }
    
}
public class Demothread{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new MyThread();
        Thread t3= new Thread();
        t1.start();
        t2.start();
        t3.start();

    }
}
