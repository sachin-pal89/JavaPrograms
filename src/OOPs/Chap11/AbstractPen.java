package OOPs.Chap11;
import java.util.*;

// This is an abstract class consisting of abstract method()
abstract class Pen
{
      // This is the abstract method of this class
      abstract public void write();

      public void refill()
       {
          System.out.println("This types of pen has a average refill capacity of 10-15ml of ink");
       }
}

// Inheritance of Abstract class to a Concrete class
class FoundationPen extends Pen
{
    // This is defining of abstract methods of the parent abstract class
    @Override
    public void write()
    {
        System.out.println("This types of pen are very smooth for writing");
    }

    // This method is FoundationPen's class own method
    public void price(int n)
    {
        System.out.printf("The average cost of foundation pen is: %d rupees\n",n);
    }

}

public class AbstractPen {
    public static void main(String[] args)
    {
        // This program is to set an abstract class and use it with its child class
        Scanner sc = new Scanner(System.in);

        FoundationPen fp = new FoundationPen();  // One cannot create an object of abstract class

        System.out.println("Enter the average cost of foundation pen:");
        int price = sc.nextInt();

        System.out.println("Detail about foundation pen is: ");
        fp.write();
        fp.refill();
        fp.price(price);

    }
}
