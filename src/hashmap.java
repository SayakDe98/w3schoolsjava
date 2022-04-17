import java.util.HashMap;

public class hashmap {
    public static void main(String[]args)
    {
        HashMap<String,String> hm=new HashMap<String, String>();
        hm.put("England","London");
        hm.put("Germany","Berlin");
        hm.put("India","New Delhi");
        hm.put("USA","Washington DC");

        for(String i:hm.keySet())System.out.println(i);
        for(String i:hm.values())System.out.println(i);
        for (String i :hm.keySet())System.out.println("keys:"+i+"Values"+ hm.get(i));
        System.out.println(hm.get("England"));
        hm.remove("England");//remove by key
        hm.remove("Germany","Berlin");//remove by key and value
        for(String i:hm.keySet())System.out.println("Keys"+i+"Values"+hm.get(i));
        hm.put("Germany","Berlin");
        hm.put("Norway","Oslo");
        for(String i:hm.keySet())System.out.println(i);
        System.out.println(hm.size());
        hm.clear();//clears the whole hashmap
        for(String i:hm.keySet())System.out.println(i);
        //we can also do for String(keys) and int(values)

    }
}
