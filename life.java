public class life
{
    public static void m1()
    {
        System.out.println("Hello Visitors");
    }
}
// Here we can extends any other class
class cycle extends life implements Runnable
{
    public void run()
    {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args)
    {
        cycle c = new cycle();
        c.m1();
        Thread t1 = new Thread(c);
        t1.start();
        System.out.println("Main method executed by main thread");
    }
}
