package Chap13;

class MyNewThread1 extends Thread{

    public MyNewThread1(String name)
    {
        super(name);
    }

    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("I am thread "+ this.getName());
            i++;
        }
    }
}

class MyNewThread2 extends Thread{

    public MyNewThread2(String name)
    {
        super(name);
    }

    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("I am thread "+ this.getName());
            i++;
        }
    }
}
public class ThreadMethod {
    public static void main(String[] args)
    {
        MyNewThread1 t1 = new MyNewThread1("Sachin1");
        MyNewThread2 t2 = new MyNewThread2("Sachin2");

        t1.start();

        // This .join() method can throw exception thus we  catch it using try and catch
        try
        {
            t1.join();  // This method ensure that t2 should start only after the execution of t1 thread is completed
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        t2.start();
    }
}
