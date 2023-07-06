public class overriding
{
        public void m1()
        {
            System.out.println("hii");
        }
    }
    class sub extends overriding
    {
        public void m1()
        {
            System.out.println("bye");
        }
    }
    class maria
    {
        public static void main(String[] args)
        {
            overriding o = new overriding();
            o.m1();
            sub s = new sub();
            s.m1();
            overriding o1 = new sub();//parent can hold child objects
            o1.m1();
        }
}
