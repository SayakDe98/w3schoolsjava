import java.util.ArrayList;
import java.util.function.Consumer;
public class consumerinlambda {
    public static void main(String[]args)
    {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(0);
        number.add(90);
        number.add(2);
        number.add(87);
        Consumer<Integer> c=(n)->{System.out.println(n);};//Consumer are used to store expressions
        number.forEach(c);
    }
}
