import java.lang.*;
public class harisha {
    public void m1() throws ArithmeticException
    {
        int x=10;
        if(x%0==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("hi");
        harisha t1=new harisha();
        t1.m1();
    }

}
