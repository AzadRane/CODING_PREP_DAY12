package mathss;

public class Maths {

    public int a;
    public int b;
    public String s;

    Maths(int x,int y)
    {
        a=x;
        b=y;
    }

    Maths(String s)
    {
        this.s=s;
    }

    public int add()
    {
        return a+b;
    }

    public int sub()
    {
        return a-b;   
    }

    public int div()
    {
        return a/b;
    }

    public int modulo()
    {
        return a%b;
    }

    public int mult()
    {
        return a*b;
    }

    public void stringtoarray()
    {
        char arr[]=s.toCharArray();
        
        for(char s:arr)
        {
            System.out.print(s+"->");
        }
    }

    public void help()
    {
        System.out.println("*******Menu***********\n1.add()\n2.sub()\n3.div()\n4.mult()\n5.modulo()\n6.stringtoarray\n7.help()");
    }   

}
