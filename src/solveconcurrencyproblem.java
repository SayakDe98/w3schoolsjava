public class solveconcurrencyproblem extends Thread{
    public static int amount=0;
    public static void main(String[]args)
    {
        solveconcurrencyproblem thread=new solveconcurrencyproblem();
        while(thread.isAlive())System.out.println("Wait!");//this solves concurrency porblem of thread
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
}
