public class inheritance {//if we declare as: final class inheritance then we cant inherit from that class
    protected String brand="Ford";

    public void Honk()
    {
        System.out.println("Peep,Peep!");
    }
}
class Next extends inheritance//in java we dont have multiple inheritance like c++ rest we have here
{
   private String model = "Mustang";
    public static void main(String [] args) {
        Next obj = new Next();
        obj.Honk();
        System.out.println(obj.brand+" "+obj.model);
    }
}
