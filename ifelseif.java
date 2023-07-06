public class ifelseif
{
   public static void main(String [] args)
    {
        int marks =78;
        if(marks>=80 && marks<=100)
        {
            System.out.println("honour");
        }
        else if(marks>=60 && marks<=79)
        {
            System.out.println("first division");
        }
        else if(marks>=50 && marks<=59)
        {
            System.out.println("second division");
        }
        else if(marks>=40 && marks<=49)
        {
            System.out.println("third division");
        }
        else if(marks>=0 && marks<=39)
        {
            System.out.println("fail");
        }
    }
}
