package Chap13;

// Using Thread which has a constructor of type Thread(String name)
class MyThr extends Thread{

    public MyThr(String name)
    {
        super(name);
    }

    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("I am thread");
            i++;
        }
    }
}

// Using Runnable interface which is implemented using constructor Thread(Runnable r, String name)
class InterThr implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("I am from runnable interface ");
            i++;
        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args)
    {
        MyThr t = new MyThr("Sachin");
        t.start();
        System.out.println("The id of thread t is "+ t.getId());
        System.out.println("The name of thread t is "+ t.getName());
        System.out.println("");

        Thread t2 = new Thread(new InterThr(),"Sachin Pal");
        t2.start();
        System.out.println("The id of thread t2 is "+ t2.getId());
        System.out.println("The name of thread t2 is "+ t2.getName());
    }
}
