abstract class abstraction {//we cant create objects to call abstract class's data members and member functions
    public abstract void abstract_method();//abstract method doesnt have a body its body is present in a class which was inherited from the current class

    public void method()
    {
        System.out.println("This is inside an abstract class and is called only by creating objects of inherited class");
    }
    public static void main(String[]args)
    {
        //abstraction a=new abstraction();//this throws error as we cant create objects of abstract class
    }
}


class Inherited extends abstraction {
    public void abstract_method()
    {
        System.out.println("This is the body of abstract_method which was defined as abstract in parent(super) class");
    }
    public static void main(String[] args)
    {
      //  abstraction a=new abstraction();//this throws error as we cant create objects of abstract class
        Inherited i=new Inherited();
        i.abstract_method();
        i.method();//we can call method() function by using object of inherited class Inherited
    }

}
