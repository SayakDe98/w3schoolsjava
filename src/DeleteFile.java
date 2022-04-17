import java.io.File;
public class DeleteFile {
public static void main(String[]args)
{
    File f=new File("Filename.txt");
    if(f.delete())System.out.println("File "+f.getName()+" was deleted");
    else System.out.println("Unable to delete file");
}
}
