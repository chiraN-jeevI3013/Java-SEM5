import java.util.Scanner;

public class TestEmp 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        final int MAX = 10;

        int n;
        System.out.println("\n Enter 999 in Employee id to quit input intake\n");

        int eid, i=0, x, j;
        double sal, intRate, bonusCash;
        String fname = new String(), lname = new String();

        Employee [] list = new Employee[MAX];
        
        while (true)
        {
            System.out.println("\n Enter Employee Details: ");
        
            System.out.print("Employee ID : ");
            eid = input.nextInt();
            input.nextLine();
            
            if (eid==999)
                break;

            System.out.print("First Name  : ");
            fname = input.nextLine();
            
            System.out.print("Last Name   : ");
            lname = input.nextLine();

            System.out.print("Salary      : ");
            sal = input.nextDouble();
        
            list[i] = new Employee(eid, fname, lname, sal);
            i++;
        }

        System.out.println("\n\n Running Default Employee constructor: ");
        Employee e1 = new Employee();
        System.out.println(e1.toString());

        //INVOKING STATIC METHOD
        if (i>0)
            Employee.display(list, (i));

        System.out.print("\n Enter any Employee id : ");
        x = input.nextInt();
        System.out.print(" Name of Employee = ");
        //ACCESSING STATIC VARIABLE
        for (j=0; j<i; j++)
        {
            if (list[j].empid == x){
                //ACCESSING INSTANCE VARIABLE
                System.out.println(" " + list[j].firstname + " " + list[j].lastname + " ");
            }
        }

        System.out.println("\n The current BonusRate = " + Employee.bonusrate);
        System.out.print(" Do You want to change it? (y/n): ");
        char c = input.next().charAt(0);
        if (c=='y')
        {
            System.out.print(" Enter new BonusRate: ");
            float br = input.nextFloat();

            //ACCESSING INSTANCE METHOD
            System.out.println("\n Old Bonus Amount for Employee ID " + list[0].empid + " = " + list[0].calculateBonus() );

            //ACCESSING STATIC METHOD
            Employee.modifyBonusRate(br);

            System.out.println("\n New BonusRate = " + Employee.bonusrate + "\n");

            //ACCESSING INSTANCE METHOD
            System.out.println(" New Bonus Amount for Employee ID " + list[0].empid + " = " + list[0].calculateBonus());
        }
            
        
    }    
}
