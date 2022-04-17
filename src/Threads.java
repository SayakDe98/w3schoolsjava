public class Threads extends Thread{

        public void run()
        {
            System.out.println("This code is running inside thread");
        }

}
/*Another way:
public class Threads implements Runnable{
    public void run()
    {
        System.out.println("This code is running inside thread");
    }
}

//we can also create an object of thread if our class extends Thread
public class Threads extends Thread
{
    public static void main(String[]args)
    {
        Threads thread=new Threads();
        thread.start();
        System.out.println("This code is outside thread");
    }
        public void run()
        {
            System.out.println("This code is inside thread");
        }

}

//if we do implements from Runnable interface then:
public class Threads implements Runnable
{
    public static void main(String[]args)
    {
        Threads thread=new Threads();
        Thread th=new Thread(thread);
        th.start();
        System.out.println("This code is outside thread");
    }
        public void run()
        {
            System.out.println("This code is inside thread");
        }

}
 */
