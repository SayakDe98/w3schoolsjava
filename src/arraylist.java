import java.util.ArrayList;//arraylist is a collector
import java.util.Collections;
public class arraylist {
    public static void main(String[]args)
    {
        ArrayList<String> cars=new ArrayList<String>();
        //lets add items to the list
        cars.add("Mazda");
        cars.add("Lamborghini");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Porsche");
        //lets find the first item in the array list
        cars.get(0);
        //lets display the first item
        System.out.println(cars.get(0));
        //lets find out the length of the array list
        System.out.println(cars.size());
        //lets display all the items in array list
        for(int i=0;i<cars.size();i++)System.out.println(cars.get(i));
        //lets delete one item of the list
        cars.remove(0);//deleting the item in 0th position
        //lets check out the items present in array listafter deleting first item
        for(int i=0;i<cars.size();i++)System.out.println(cars.get(i));
        cars.set(0,"Tata");//used to change the first element to Tata
        //lets sort the list
        Collections.sort(cars);
        //now lets print sorted array list
        for(int i=0;i<cars.size();i++)System.out.println(cars.get(i));
        cars.clear();//clears the whole arraylist
        //now lets create a integer arraylist
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(100);
        numbers.add(50);
        Collections.sort(numbers);
        for(int i : numbers)System.out.println(i);//using for each loop to print the arraylist
    }
}
