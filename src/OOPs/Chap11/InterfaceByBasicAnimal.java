package OOPs.Chap11;

// Creating a Basic Animal Interface
interface BasicAnimal
{
      // They are the method of interface,and they all are abstract
      void eat();
      void sleep();
}

// Creating a Monkey class
class Monkey
{
    public void bite()
    {
        System.out.println("Biting is done by teeth");
    }

    public void jump()
    {
        System.out.println("Legs are use for jumping");
    }

}

// Creating a Human Class by help of Monkey Class and BasicAnimal Interface
class Human extends Monkey implements BasicAnimal
{
    public void eat()
        {
           System.out.println("Mouth are used for eating food");
        }

    public void sleep()
        {
            System.out.println("Sleeping is important for one's health");
        }
}

public class InterfaceByBasicAnimal {
    public static void main(String[] args)
    {
        Human hu = new Human();

        System.out.println("Some Characteristic of humans are:");
        hu.jump();
        hu.bite();
        hu.eat();
        hu.sleep();

    }
}
