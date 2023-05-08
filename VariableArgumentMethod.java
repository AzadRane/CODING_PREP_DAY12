class A 
{
    void display(int... num)
    {
        for(int data:num)
        {
            System.out.println(data);
        }
    }
}




public class VariableArgumentMethod
{


    public static void main(String args[])
    {
        A ob = new A();

        ob.display(10,20,30,40);

        ob.display(20,60);

    }
}