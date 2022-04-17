public class wrapperclasses {
    public static void main(String[]args)
    {
        //as we are using wrapper classes means we are creating objects
        Integer myInt=12;
        Double myDouble=2.3333;
        Character myChar='f';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println("Anther way:");
        //using methods associated with wrapper classes
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        String s=myInt.toString();//converts the object myInt to String
        System.out.println("length of String:"+s.length());
    }
}
