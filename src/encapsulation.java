public class encapsulation {
    private String name;
    public void get_name(String name)
    {
        this.name=name;
    }

    public String set_name()
    {
        return name;
    }

    public static void main(String [] args)
    {
        encapsulation e=new encapsulation();
        //e.name;//gives error since name is private
        e.get_name("Sayak");
       System.out.println(e.set_name());
    }
}
