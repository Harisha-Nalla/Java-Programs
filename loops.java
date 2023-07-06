import java.util.*;
public class loops {
    public static void main(String[] args)
    {
        int x []=new int [5];
        int i,j;
        Scanner h=new Scanner(System.in);
        System.out.println("enter array length");
        int n=h.nextInt();
        System.out.println("enter element in zero position");
        x[0]=h.nextInt();
        System.out.println("enter element in first position");
        x[1]=h.nextInt();
        System.out.println("enter element in second position");
        x[2]=h.nextInt();
        System.out.println("enter element in third position");
        x[3]=h.nextInt();
        System.out.println("enter element in fourth position");
        x[4]=h.nextInt();
        for(i=0;i<=(n-1);i++)
        {
            System.out.println(x[i]);
        }
        h.close();
    }
}
