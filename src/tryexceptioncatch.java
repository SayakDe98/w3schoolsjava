public class tryexceptioncatch {
    public static void main(String[]args)
    {
        try
        {
            int [] arr={1,2,3};
            System.out.println(arr[10]);

        }
        catch(Exception e)
        {
            System.out.println("We can't print arr[10] beause arr[10] doesn't exist");
        }

        //the finally keyword can be used to execute a block of code regardless of any error
        finally {
            System.out.println("The 'try-catch' block is finished");
        }
    }
}
