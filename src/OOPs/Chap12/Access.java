package OOPs.Chap12;

class A
{
    void i(){System.out.println("Hi");};
    protected void j(){ System.out.println("Hi");}
}

public class Access {
    public static void main(String[] args)
    {
        System.out.println("In main: ");
        A obj = new A();
        obj.j();
        obj.i();
    }
}
