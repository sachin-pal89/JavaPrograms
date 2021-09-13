package OOPs.Chap8;
import java.util.*;

class Circle
{
    float radius,area,circumference;

    //To get radius of circle
    void getRadius(float radius)
    {
        this.radius = radius;
    }

    //Area of circle
    float setArea()
    {
        this.area = (float) (Math.PI * Math.pow(radius,2));
        return area;
    }

    // Circumference of circle
    float setCircumference()
    {
        this.circumference = (float) (2 * Math.PI * radius);
        return circumference;
    }

}

public class CircleClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Circle cr = new Circle();

        System.out.println("Enter the radius of the circle: ");
        cr.getRadius(sc.nextFloat());

        System.out.printf("Circle with radius %.3f has\nArea: %.4f\nCircumference: %.4f\n",cr.radius,cr.setArea(),cr.setCircumference());

    }
}
