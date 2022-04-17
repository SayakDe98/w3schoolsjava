import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[]args)
    {
        try {
            File obj=new File("Filename.txt");

            if (obj.createNewFile())
                System.out.println("File created:"+obj.getName());
            else{
                System.out.println("File already exists");
            }
        }
        catch (Exception e)
        {
            System.out.println("An error occured!");
            e.getStackTrace();
        }
    }
}
