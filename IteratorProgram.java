import java.util.Iterator;
import java.util.ArrayList;
public class IteratorProgram {
    public  static void main(String [] args){
        ArrayList<String>Student=new ArrayList<String>();
        Student.add("Prajwal");
        Student.add("Bishnu");
        Student.add("Aayush");
        Student.add("Pratikshya");
        Iterator<String>Iterator= Student.iterator();
        while(Iterator.hasNext()){
            System.out.println(Iterator.next());
        }
    }
    
}
