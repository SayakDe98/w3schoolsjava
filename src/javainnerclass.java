class Outerclass//in java we can create class within another class
{
    int x=1;
    public class Innerclass//if we declare this private we wont be able to call them evn by creating objects
    {//if we declare Innerclass as static then we can call the member function of this class without object creation
        int y=2;
        public int Innerclass_method()
        {
            return y;
        }
    }
}
public class javainnerclass {
    public static void main(String[]args)
    {
        Outerclass oc=new Outerclass();
        Outerclass.Innerclass ic= oc.new Innerclass();//creating object for Innerclass
        System.out.println(ic.y+oc.x);
        System.out.println(ic.Innerclass_method());
    }
}
