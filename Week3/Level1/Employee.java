import java.util.*;

public class Employee 
{
    int empid;
    String firstname, lastname;
    double salary = 1000;
    //int count=0;
    //int [] eidArr = new int[20];
    int totalEmployees=0;

    public Employee () {
        empid = 0;
        firstname = null;
        lastname  = null;
        totalEmployees++;
    }

    public Employee (int id, String fn, String ln, double sal) 
    {
        setEmpid(id);
        setFirstname(fn);
        setLastname(ln);
        setSalary(sal);

        totalEmployees++;
    }

    //SET
    public void setEmpid (int id) {
    if (id>0) {
        empid = id;
    }
        else
            System.out.println("\n invalid Employee Id");
    }
    public void setFirstname (String fn) {
        if (fn!=null)
            firstname = String.valueOf(fn);
        else
            System.out.println("\n invalid firstname");
    }
    public void setLastname (String ln) {
        if (ln!=null)
            lastname  = String.valueOf(ln);
        else
            System.out.println("\n invalid lastname");
    }
    public void setSalary (double sal) {
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

    public void display () 
    {
        System.out.println(" Eid: " + empid);
        System.out.println(" Name: " + firstname + " " + lastname);
        System.out.println(" Salary: " + salary);
    }

    public String toString () {
        return String.format(" Name of Employee: %s %s, Employee ID: %d, Salary: %.2f", firstname, lastname, empid, salary);
    }
}