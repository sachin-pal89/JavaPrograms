package Chap13;

class MyThread extends Thread{

    public MyThread(String name)
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

public class ThreadPriorities {
    public static void main(String[] args)
    {
        MyThread t1 = new MyThread("Sachin1");
        MyThread t2 = new MyThread("Sachin2");
        MyThread t3 = new MyThread("Sachin3");
        MyThread t4 = new MyThread("Sachin4");

        // Giving t4 maximum priority among threads
        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
