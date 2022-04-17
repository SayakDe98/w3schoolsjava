import java.util.Scanner;
public class javauserinput {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int i=sc.nextInt();
        System.out.println("Enter a double");
        double d= sc.nextDouble();
        System.out.println("Enter an float");
        float f=sc.nextFloat();
        System.out.println("Enter a byte");
        byte bt=sc.nextByte();

        System.out.println("Enter a String");
        String s=sc.nextLine();//dont know why but this is not getting executed but works fine when done by commenting out others

        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        System.out.println("Enter a long integer");
        long l=sc.nextLong();
        System.out.println("Enter a short integer");
        short s1=sc.nextShort();
        System.out.println("Enter a boolean");
        boolean b=sc.nextBoolean();//enter true or false
        System.out.println("Integer:"+i);
        System.out.println("Double:"+d);
        System.out.println("Float:"+f);
        System.out.println("Byte:"+bt);
        System.out.println("String:"+s);
        System.out.println("Character:"+c);
        System.out.println("long Integer:"+l);
        System.out.println("short Integer:"+s1);
        System.out.println("Boolean:"+b);
    }
}
