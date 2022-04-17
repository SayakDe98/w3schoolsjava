import java.util.ArrayList;
import java.util.Iterator;
public class iterator
{
    public static void main(String[]args)
    {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(10);
        numbers.add(14);
        numbers.add(3);
        numbers.add(1);

        Iterator<Integer> it=numbers.iterator();
        System.out.println(it.next());//prints out the first item
        System.out.println("The list:");
        while(it.hasNext())//prints out the entire list as we printed the first number so we dont have 8 here
        {
            System.out.println(it.next());
        }
//we can also use remove() function here
        //Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop.
    }
}
