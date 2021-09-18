package Chap13;

class InterfacesThread implements Runnable{

    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class InterfacesThread2 implements Runnable{

    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Welcome");
            i++;
        }
    }
}

public class ThreadingUsingInterfaces {
    public static void main(String[] args)
    {
        InterfacesThread in = new InterfacesThread();  // We created the object of class that implement interface Runnable
        Thread t = new Thread(in);   // Here in order to start multithreading we require method of thread class

        InterfacesThread2 in2 = new InterfacesThread2();
        Thread t2 = new Thread(in2);

        t.start();
        t2.start();
    }
}
