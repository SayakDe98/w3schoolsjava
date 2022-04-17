interface parent1
{
    public void method1();
}

interface parent2//we cant do multiple inheritance in java like c++ but we cn do multiple interface
{
    public void method2();
}

class childofparent implements parent1,parent2{
    public void method1()
    {
        System.out.println("This is method1");
    }
    public void method2()
    {
        System.out.println("This is method2");
    }
}
public class multipleinterfaces {
    public static void main(String[] args)
    {
        childofparent cp=new childofparent();
        cp.method1();
        cp.method2();
    }
}
