interface Parent//interface is like abstraction
{
    public void First();//we dont need to write abstract keyword or interface keyword here,here also method inside interface has no body
}
//we cannot create constructors inside interfaces

class Child implements Parent//implements is used for interface instead of extends which is used in abstract class
{
    public void First()
    {
        System.out.println("This is First() method");
    }
}
public class interfaces {
public static void main(String[] args)
{
   Child c=new Child();//like abstract class we have to create object of implemented class to call members of Parent interface
    c.First();
}

}
