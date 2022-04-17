public class constructors2 {
    int age;
    String name;
    constructors2(int age, String name)
    {
        //this->age=age;//we cannot use this pointer here even if we had given parameter as age instead of age1
        //age=age;//gives age=0;
        //name=name;//gives name=null
       // age=age1;//this is valid way of declaring
        //name=name1;//this is valid way of declaring
        this.age=age;//this.variable name is used here instead of this->pointer
        this.name=name;//this is alternative of this->pointer
    }
    public static void main(String[] args)
    {

        constructors2 obj=new constructors2(23,"Sayak");
        System.out.println(obj.name+" "+obj.age);
    }
}
