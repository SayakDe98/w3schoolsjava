
public class concurrencyproblemsinthreadandhowtoresolvethem extends Thread{
    public static int amount=0;
    public static void main(String[]args)
    {
        concurrencyproblemsinthreadandhowtoresolvethem thread=new concurrencyproblemsinthreadandhowtoresolvethem();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }//we dont know which thread will run first
    public void run()
    {
        amount++;
    }
}

//how to resolve it we will see in next file
