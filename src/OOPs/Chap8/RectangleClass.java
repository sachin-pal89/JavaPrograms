package OOPs.Chap8;
import java.util.*;

class Rectangle
{
    float area,perimeter,length,breadth;

    // To get length
    void getLength(float length,float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    //To get Area
    float setArea()
    {
        this.area = length*breadth;
        return area;
    }

    // To get Perimeter
    float setPerimeter()
    {
        this.perimeter = (length*2) + (breadth*2);
        return perimeter;
    }

}

public class RectangleClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Rectangle rt = new Rectangle();

        System.out.println("Enter the length & breadth of an rectangle: ");
        rt.getLength(sc.nextFloat(),sc.nextFloat());

        System.out.printf("Rectangle of length: %.3f && breadth: %.3f has\nArea: %.4f\nPerimeter: %.4f\n",rt.length,rt.breadth,rt.setArea(),rt.setPerimeter());

    }
}
