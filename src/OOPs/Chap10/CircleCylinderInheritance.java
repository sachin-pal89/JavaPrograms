package OOPs.Chap10;
import java.util.*;

class Circle
{
    private float radius;

    // Constructor
    public Circle(){ } // It's an empty constructor/ default constructor use to so object by default point it first
    public Circle(float radius)
    {
        this.radius = radius;
    }

    //To get Area of circle
    public float areaCircle()
    {
        return (float) (Math.PI*Math.pow(radius,2));
    }

    public void status()
    {
        System.out.println("Circle Hogaya");
    }

}

class Cylinder extends Circle
{
    private final float height,radius;
    private float radiusCi;

    //Constructor
    public Cylinder(float radiusCi,float radius,float height)
    {
        // Calling Circles parameterized constructor
        super(radiusCi);

        // Setting up values for cylinders dimension
        this.radius = radius;
        this.height = height;
    }

    //Getter functions
    public float getRadius()
    {
        return radius;
    }

    public float getHeight()
    {
        return height;
    }

    //To get Surface Area of cylinder
    public float surfaceCylinder()
    {
        return (float) ((2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2)));
    }

    //To get Volume of cylinder
    public float volumeCylinder()
    {
        return (float) (Math.PI*Math.pow(radius,2)*height);
    }

    // Method overriding
    @Override public void status()
    {
        System.out.println("Dono hogaya");
    }
}

public class CircleCylinderInheritance {
    public static void main(String[] args)
    {
        // This program is to implement inheritance between circle and cylinder class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        float r = sc.nextFloat();

        System.out.println("Enter the radius and height of cylinder: ");
        Cylinder cy = new Cylinder(r,sc.nextFloat(),sc.nextFloat());

        // Result for circle
        System.out.printf("Circle of radius = %.3f has\nArea: %.4f\n",r,cy.areaCircle());

        // Result for Cylinder
        System.out.printf("Cylinder of radius = %.3f & height = %.3f has\nSurface Area: %.4f\nVolume: %.4f\n",cy.getRadius(),cy.getHeight(),cy.surfaceCylinder(),cy.volumeCylinder());

        // Override Method of Circle in Cylinder
        cy.status();
    }
}
