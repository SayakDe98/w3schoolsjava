import java.util.ArrayList;

public class lambda {
    public static void main(String[]args)
    {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(0);
        num.add(90);
        num.add(2);
        num.add(87);
        num.forEach((n)->{System.out.println(n);});//{}is not mandatory if {} is not used then dont give semicolon after Sys...(n)

    }
}
