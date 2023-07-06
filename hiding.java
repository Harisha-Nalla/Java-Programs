public class hiding
{
    public static void m1()
    {
        System.out.println("good");
    }
}

class y extends hiding
{
    public static void m1()
    {
        System.out.println("bye");
    }
}
class x
{
    public static void main(String[] args)
    {
       hiding.m1();
       y.m1();
    }
}


