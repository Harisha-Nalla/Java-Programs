public class overloading
{
         public void m1()
         {
             System.out.println("hi");
         }
         public void m1(int i)
         {
             System.out.println("int");
         }
         public void m1(double d)
         {
             System.out.println("double");
         }
         public void m1(String s)
         {
             System.out.println("String");
         }
         public void m1(float f)
         {
             System.out.println("float");
         }
         public static void main(String[] args)
         {
             overloading o1=new overloading();
             o1.m1("harisha");
         }
}
