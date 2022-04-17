public class javaclassattributes {
    int x=5,y=10;
    final int z=9;
    public static void main(String[]args)
    {
        javaclassattributes obj = new javaclassattributes();//object created
        System.out.println(obj.x);
        obj.x=10;
        System.out.println(obj.x);
        javaclassattributes obj2 = new javaclassattributes();
        System.out.println(obj2.y);
       // obj.z=10;//gives error
        System.out.println(obj.z);
    }
}
