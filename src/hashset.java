import java.util.HashSet;//hashset is a collector
public class hashset
{
    public static void main(String[]args){
    HashSet<Integer> numbers=new HashSet<Integer>();
    numbers.add(4);
    numbers.add(4);//this wont get added since its already added and hashset takes only unique values
        numbers.add(8);
        numbers.add(9);
        numbers.add(16);

        System.out.println(numbers.size());
        System.out.println("\n");
        for(int i:numbers)System.out.println(i);
        numbers.remove(8);
        System.out.println("after removing 8:");
        for(int i:numbers)System.out.println(i);
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }}
        numbers.clear();

    }
}
