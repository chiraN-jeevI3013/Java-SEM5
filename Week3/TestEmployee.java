import java.util.Scanner;

public class TestEmployee 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int eid;
        String fname = new String(), lname = new String();
        double sal, intRate, bonusCash;

        System.out.println("\n Enter Employee Details: ");
        
        System.out.print("Employee ID : ");
        eid = input.nextInt();
        input.nextLine();
        
        System.out.print("First Name  : ");
        fname = input.nextLine();
        
        System.out.print("Last Name   : ");
        lname = input.nextLine();

        System.out.print("Salary      : ");
        sal = input.nextDouble();

        System.out.println("\n\n Running Default Employee constructor: ");
        Employee e1 = new Employee();
        e1.display();

        System.out.println("\n\n Running Parameterized Constructor with Entered data:");
        Employee e2 = new Employee(eid, fname, lname, sal);
        e2.display();

        System.out.print("Enter Increment Rate for e2 (in %): ");
        intRate = input.nextDouble();
        bonusCash = e2.calculateBonus(intRate);
        System.out.println(" Bonus for e2 = " + bonusCash + "\n");


        Employee e3 = new Employee();
        e3.setEmpid(99);
        e3.setFirstname("Tom");
        e3.setLastname("Cruise");
        e3.setSalary(8500.56);
        String e3Deets = e3.toString();
        System.out.println("\n\n E3 Details: ");
        System.out.println(e3Deets + "\n");


        input.close();
    }    
}
