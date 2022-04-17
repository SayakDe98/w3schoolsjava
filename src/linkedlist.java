import java.util.Collection;
import java.util.LinkedList;//linkedlist is a container
import java.util.Collections;
public class linkedlist {
    public static void main(String[]args)
    {
        LinkedList<Integer> number=new LinkedList<Integer>();
        number.add(9);
        number.add(20);
        for(int i:number)System.out.println(i);
        System.out.println("\n");
        number.addFirst(12);
        number.addLast(33);
        for(int i:number)System.out.println(i);
        System.out.println("\n");
        Collections.sort(number);
        for(int i:number)System.out.println(i);
        System.out.println("\n");
        number.removeFirst();
        number.removeLast();
        for(int i:number)System.out.println(i);
        System.out.println("\n");
        System.out.println("First number"+number.getFirst()+"\n");
        System.out.println("Last number"+number.getLast()+"\n");
        System.out.println(number.size());


    }
}
