interface  inter {
     void m1();

     void m2();
}
class risha implements inter
{
     public void m1()
    {
        System.out.println("good morning");
    }
     public void m2()
    {
        System.out.println("good night");
    }
}
class tessa
{
    public static void main(String[] args)
    {
        risha h =new risha();
        h.m1();
        h.m2();
    }
}

