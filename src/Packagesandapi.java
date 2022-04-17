import java.util.Scanner;//used to import Scanner class from java.util package
public class Packagesandapi {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name;
        name=sc.nextLine();//inputs a whole sentence from user
        System.out.println("User name is : "+name);
    }
}
