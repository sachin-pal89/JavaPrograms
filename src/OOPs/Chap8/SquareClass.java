package OOPs.Chap8;
import java.util.*;

class Square
{
    float sideLength,area,perimeter;

    //Side length of square
    void length(float sideLength)
    {
        this.sideLength = sideLength;
    }

    //Area of a square
    float setArea()
    {
        this.area = (float) Math.pow(sideLength,2);
        return area;
    }

    //Perimeter of a square
    float setPerimeter()
    {
        this.perimeter =  (sideLength*4);
        return perimeter;
    }

}

public class SquareClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Square sq = new Square();

        System.out.println("Enter the length of the sides of square: ");
        sq.length(sc.nextFloat());

        System.out.printf("Square of side length %.4f has\nArea: %.3f\nPerimeter: %.3f\n",sq.sideLength,sq.setArea(),sq.setPerimeter());

    }
}
