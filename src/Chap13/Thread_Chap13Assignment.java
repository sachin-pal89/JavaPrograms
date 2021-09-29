package Chap13;

class Wish extends Thread{

    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Thanks extends Thread{

    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Welcome");
            i++;
        }

       try
       {
           Thread.sleep(220);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
}

public class Thread_Chap13Assignment {
    public static void main(String[] args)
    {
          Wish w = new Wish();
          Thanks t = new Thanks();

          w.start();
          t.start();
    }
}
