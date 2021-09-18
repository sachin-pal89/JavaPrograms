package Chap13;

class Wishing1 extends Thread{

    // Method run is use to perform certain operation using threads
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Wishing2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Welcome");
            i++;
        }
    }
}

public class CreatingThread {
    public static void main(String[] args)
    {
       Wishing1 w1 = new Wishing1();
       Wishing2 w2 = new Wishing2();

       // This would start the multithreading in the system
       w1.start();
       w2.start();
    }
}
