public class noargument {
    String name;
    int rollno;
    noargument ()
    {
       name ="harisha";
       rollno = 1;
    }
    public static void main(String [] args)
    {
        noargument n = new noargument();
        System.out.println(n.name);
       System.out.println(n.rollno);

    }
}
