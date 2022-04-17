public class javamodifiers {
     final String  final_String = "Sayak";

     static int static_variable=10;

     static void static_method()
     {
         System.out.println("This is a static method");
     }

     public void public_method()
     {
         System.out.println("This is a public method");
     }

     public static void main(String [] args)
     {
        javamodifiers jm=new javamodifiers();
        //jm.final_String="Not Sayak";//throws an error
        System.out.println(static_variable);//can be called without using objects
         System.out.println(jm.static_variable);//but we can also call by using objects
         static_method();//can be called without using objects
         //public_method();//throws an error as it is public so needs an object to access it
         jm.public_method();
     }

}
