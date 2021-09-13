package OOPs.Chap8;
import java.util.*;

class Employee
{
    int Salary;
    String name;

    int getSalary(int Salary)
    {
        this.Salary = Salary;
        return Salary;
    }

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = "Mr."+name;
    }

}

public class EmployeeOOPs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.println("Enter your name: ");
        e.setName(sc.nextLine());

        System.out.println("Enter your salary: ");
        int n = sc.nextInt();

        System.out.printf("%s your salary is %d",e.getName(),e.getSalary(n));

    }
}
