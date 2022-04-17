import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args)
    {
        try{
        FileWriter fw= new FileWriter("Filename.txt");
        fw.write("This is wriiten inside file");
        fw.close();
        System.out.println("Successfully wrote in file");
        }
        catch(Exception e)
        {
            System.out.println("An error occured!");
            e.printStackTrace();
        }

    }
}
