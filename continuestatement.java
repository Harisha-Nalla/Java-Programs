import java.util.*;
public class continuestatement {
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
