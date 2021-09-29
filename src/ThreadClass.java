
class A extends Thread
{
    public void run()
    {
        int i=0;
        while(i<100) {
            System.out.println("Hi, Good Morning");
            i++;
        }
    }
}

public class ThreadClass {
    public static void main(String[] args)
    {
        A obj = new A();
        obj.start();

        int i=0;
        while(i<100) {
            System.out.println("It's Main ");
            i++;
        }
    }
}
