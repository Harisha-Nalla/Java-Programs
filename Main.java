public class Main {
    public static void main(String[] args)
    {
        char ch='H';
        if(ch>='0'&&ch<='9')
        {
            System.out.println(ch+"is digit");
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println(ch+"is upper case");
        }
        else if(ch>='a'&&ch<='z')
        {
            System.out.println(ch+"is lower case");
        }
        else if(ch==' ')
        {
            System.out.println(ch+"is empty");
        }
        else
            System.out.println(ch+"is special symbol");
    }
}