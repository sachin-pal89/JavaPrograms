package OOPs.Chap11;

// Creating TVRemote Interface
interface TvRemote
{
    // Method of TvRemote interface
     void changingChannel();
     void switchOnAndSwitchOff();
}

// Creating a SmartTVRemote which will be a child interface of TvRemote Interface
interface SmartTvRemote extends TvRemote
{
    //Methods of SmartTvRemote
    void mute();
    void changingColor();
    void operateWithOtherDevice();
}

// Creating a class which will implement the interfaces
class TV implements SmartTvRemote
{
    // Defining method of both TvRemote and SmartTvRemote Interface
    public void changingChannel(){ System.out.println("* Channel is changed by button on remote consisting of digits on it");}

    public void switchOnAndSwitchOff(){ System.out.println("* To switch On and Off we make use of Power button");}

    public void mute() { System.out.println("* To mute the sound we make use of button with symbol of cut on speaker");}

    public void changingColor() { System.out.println("* One can change color of tv by going to setting and selecting color option");}

    public void operateWithOtherDevice() { System.out.println("* We can operate our Tv with other device like smartphones");}

}

public class TvForInterfaceInheritance {
    public static void main(String[] args)
    {
         TV t = new TV();

         System.out.print("\nSome information on how to use Tv Remote is as mention below:\n\n");
         t.changingChannel();
         t.switchOnAndSwitchOff();
         t.mute();
         t.changingColor();
         t.operateWithOtherDevice();

    }
}
