public class inheritance {
    public static void m1()
    {
        System.out.println("parent property");
    }
}
        class child extends inheritance
        {
            public static void m2()
            {
                System.out.println("child property");
            }
        }
        class test {
                public static void main(String [] args)
                {
                    inheritance p1 = new inheritance();
                    p1.m1();
                    child c1 = new child ();
                    c1.m2();
                    c1.m1();
                }
            }

