import java.io.FileWriter;
import java.io.IOException;

public class Write{
    public static void main(String[]args){
      try{
           FileWriter Writer = new FileWriter("data.txt");
           Writer.write("My name is prajwal chapagain.I am 19 years old.I am from Nepal.I am a student of BCA in mechi multiple campus .");
            Writer.close();
       }
        catch(IOException e){
             System.out.println("Error occurs during writing something into file");
        }
    }
}