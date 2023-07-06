import java.util.*;
public class usingswitch
{
    public static void main(String[] args)
    {
        Scanner H=new Scanner(System.in);
        System.out.println("enter x value:");
        int x=H.nextInt();
        switch(x)
        {
            case 1:System.out.println("Day"+x+"is sunday");
                break;
            case 2:System.out.println("Day"+x+"is monday");
                break;

            case 3:System.out.println("Day"+x+"is tuesday");
                break;

            case 4:System.out.println("Day"+x+"is wednesday");
                break;

            case 5:System.out.println("Day"+x+"is thursday");
                break;

            case 6:System.out.println("Day"+x+"is friday");
                break;

            case 7:System.out.println("Day"+x+"is saturday");
                break;

            default:System.out.println("invalid");
        }
        H.close();
    }
}
