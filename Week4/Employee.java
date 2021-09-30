import java.util.*;

public class Employee 
{
    int empid;
    String firstname =  new String();
    String lastname = new String();
    double salary = 1000;
    double bonus;
    
    static int count=0;
    static float bonusrate = 0.5f;

    public Employee () {
        empid = 0;
        firstname = null;
        lastname  = null;
        count++;
    }

    public Employee (int id, String fn, String ln, double sal) 
    {
        setEmpid(id);
        setFirstname(fn);
        setLastname(ln);
        setSalary(sal);

        count++;
    }

    //SET
    public void setEmpid (int id) 
    {
    if (id>0) {
        empid = id;
    }
        else
            System.out.println("\n invalid Employee Id");
    }
    public void setFirstname (String fn) 
    {
        if (fn!=null)
            firstname = String.valueOf(fn);
        else
            System.out.println("\n invalid firstname");
    }
    public void setLastname (String ln) 
    {
        if (ln!=null)
            lastname  = String.valueOf(ln);
        else
            System.out.println("\n invalid lastname");
    }
    public void setSalary (double sal) 
    {
        if (sal>0)
            salary = sal;
        else
            System.out.println("\n invalid salary");
    }

    //GET
    public int getEmpid () {
        return empid;
    }
    public String getFirstname () {
        return firstname;
    }
    public String getLastname () {
        return lastname;
    }
    public double getSalary () {
        return salary;
    }
    public int getTotalEmployeeCount () {
        return count;
    }

    //CALCULATE BONUS
    public double calculateBonus () {
        bonus = (salary*bonusrate)/100;
        return (bonus);
    }

    public String toString () {
        return String.format(" Name of Employee: %s %s, Employee ID: %d, Salary: %.2f, Bonus: %.2f", firstname, lastname, empid, salary, bonus);
    }

    
    
    //MODIFY BONUSRATE
    public static void modifyBonusRate (float val)
    {
        bonusrate = val;
    }

    public static void display (Employee [] list, int c) 
    {
        System.out.println("\n Total Number of Employees = " + Employee.count);
        
        for (int i=0; i<c; i++)
        {
            System.out.println(" Eid: " + list[i].empid);
            System.out.println(" Name: " + list[i].firstname + " " + list[i].lastname);
            System.out.println(" Salary: " + list[i].salary + "\n");
        }
        
    }
}