import java.util.*;
public class breakstatement {
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
            if(n>=50)
                break;
        }
        System.out.println("out of range");
    }
}
