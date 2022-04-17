import java.io.File;
public class GetFileInfo {
    public static void main(String []args)
    {
        File f=new File("Filename.txt");
        if(f.exists())
        {
            System.out.println("File name:"+f.getName());
            System.out.println("Absolute Path:"+f.getAbsolutePath());
            System.out.println("Readable:"+f.canRead());
            System.out.println("Writable:"+f.canWrite());
            System.out.println("Length in bytes:"+f.length());
        }
        else {
            System.out.println("File doesn't exists");
        }
    }
}
