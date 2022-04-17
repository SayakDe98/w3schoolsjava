public class constructors{//it is not mandatory to write
    int age;//by default data members and member functions are public
    int x=9;
    constructors()//constructors have same name as that of class they dont have return type,they are used to initialize class attributes
    {
        age=0;
    }
    constructors(int y)
    {
        x=y;//we don't need to use this pointer we can write x=x
        System.out.println(x);
    }
    void method1()
    {
        //System.out.println("this is a method");
    }
    void method()
    {
        System.out.println("x="+x);
    }
    public static void main(String []args)//to show java is oop we write main inside class,static so that we can call this method without creating objects,jvm calls main method without creating object so declare static,if we make this priavte we cant access outside class,string args[] is used to take command line arguments
    {
        constructors obj=new constructors();
        System.out.println(obj.age);
        obj.method1();
        int x=10;
        constructors obj2=new constructors(x);
        obj.method();
        //obj.x;//we get error use local variable
    }
}


