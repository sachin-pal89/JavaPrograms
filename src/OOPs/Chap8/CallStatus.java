package OOPs.Chap8;
import java.util.*;

class CellPhone
{
    void Status1()
    {
        System.out.println("Ringing.......");
    }

    void Status2()
    {
        System.out.println("Vibrating.........");
    }

}

public class CallStatus {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        CellPhone cp = new CellPhone();
        System.out.println("Call Status: ");
        cp.Status1();
        cp.Status2();

    }
}
