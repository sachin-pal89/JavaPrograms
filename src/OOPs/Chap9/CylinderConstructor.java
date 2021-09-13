package OOPs.Chap9;
import java.util.*;

class Cylinder2
{

    private final float radius;
    private final float height;

    // Constructor to set up the values
    Cylinder2(float radius,float height)
    {
        this.radius = radius;
        this.height = height;
    }

    //Getter function to get the value of radius
    public float getRadius()
    {
        return radius;
    }

    //Getter function to get the value of height
    public float getHeight()
    {
        return height;
    }

    //Function to get surface area of cylinder
    public float areaCylinder()
    {
        return (float) ((2*Math.PI*radius*height) + (2*Math.PI*Math.pow(radius,2)));
    }

    // Function to get volume of cylinder
    public float volumeCylinder()
    {
        return (float) (Math.PI*Math.pow(radius,2)*height);
    }
}

public class CylinderConstructor {
    public static void main(String[] args)
    {
        // This program is same as CylinderGetterSetter the only difference is we use constructor for setting up the value
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius and height of a cylinder: ");
        Cylinder2 cy2 = new Cylinder2(sc.nextFloat(),sc.nextFloat());

        System.out.printf("Cylinder of radius = %.3f && height = %.3f has\nSurface Area: %.4f\nVolume: %.4f\n",cy2.getRadius(),cy2.getHeight(),cy2.areaCylinder(),cy2.volumeCylinder());

    }
}
