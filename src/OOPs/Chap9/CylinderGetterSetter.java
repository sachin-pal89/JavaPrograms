package OOPs.Chap9;
import java.util.*;

class Cylinder
{
     private float radius,height;

     // Setter function to set radius and height of an cylinder
     public void setValues(float radius,float height)
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

public class CylinderGetterSetter {
    public static void main(String[] args)
    {
        // This program is to get radius and height of a cylinder using getter and setter func
        // Also to calculate its surface area and volume
        Scanner sc = new Scanner(System.in);

        Cylinder cy = new Cylinder();

        System.out.println("Enter the radius and height of the cylinder: ");
        cy.setValues(sc.nextFloat(),sc.nextFloat());

        System.out.printf("Cylinder of radius = %.3f && height = %.3f has\nSurface Area: %.4f\nVolume : %.4f\n",cy.getRadius(),cy.getHeight(),cy.areaCylinder(),cy.volumeCylinder());

    }
}
