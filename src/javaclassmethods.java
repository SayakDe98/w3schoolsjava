public class javaclassmethods {

    static void staticmethod(int value)
    {
        System.out.println("Static function can be accessed without objects");
        System.out.println("Value of parameter in staticmethod :"+value);
    }

    public void publicmethod(String s)
    {
        System.out.println("Public method can be accessed only using objects");
        System.out.println("Value of parameter in publicmethod :"+s);
    }

    public static void main(String [] args)
    {
        int value=0;
        String s1="string parameter";
        staticmethod(value);//can be accessed without objects
        //publicmethod();//throws error cant be called or accessed without creating objects
        javaclassmethods obj1=new javaclassmethods();//object created of class javaclassmethods
        obj1.staticmethod(value);
        obj1.publicmethod(s1);
    }
}

class Second//in c++ after a class we need to put semicolon here we dont
{
    //this is another class
    public static void main(String[] args) {//we have created another main function in java which is not possible in c++
        //staticmethod();//we cannot access static method of another class if we dont make object of previous class where it is defined
        javaclassmethods obj2 = new javaclassmethods();
        obj2.staticmethod(1);
        obj2.publicmethod("Check");
    }
}