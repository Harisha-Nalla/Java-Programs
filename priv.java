public class priv
{
        //private variable and method
        private int num=100;
        private void m1()
        {
            System.out.println("Hello java");
        }
    public static void main(String args[])
    {
        priv p = new priv();
        System.out.println(p.num);//try to access private data member - Compile Time Error
        p.m1();
    }

}
