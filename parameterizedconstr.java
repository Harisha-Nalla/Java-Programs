public class parameterizedconstr
{
    String name;
    int rollno;
    parameterizedconstr (String x,int y)
    {
        this.name =x;
        this.rollno = y;
    }
    public static void main(String [] args)
    {
        parameterizedconstr p = new parameterizedconstr("hari", 205);
        System.out.println(p.name);
        System.out.println(p.rollno);
    }
}

