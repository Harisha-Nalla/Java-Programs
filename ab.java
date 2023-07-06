abstract class hari
{
    abstract void m1();

    }
   public class ab extends hari
    {
        void m1()
        {
            System.out.println("Good Morning");
        }
        public static void main(String [] args)
        {
            ab k = new ab();
            k.m1();
        }
    }

