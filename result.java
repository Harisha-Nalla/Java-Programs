interface result {
    public void add(int a, int b);
}
class t{
    public static void main(String[]args)
    {
        result r=(a,b)-> System.out.println(a+b);
        r.add(10,20);
        r.add(100,200);
    }
}
