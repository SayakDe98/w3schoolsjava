public class throwkeyword {
    static void age(int age)
    {
        if(age<18)
            throw new ArithmeticException("You are not 18 years old");//throw is used to generate custom error
        else System.out.println("You are old enough!");

    }

    public static void main(String[]args)
    {
        age(15);//if we do age(18)we get You are old enough!
    }
}
