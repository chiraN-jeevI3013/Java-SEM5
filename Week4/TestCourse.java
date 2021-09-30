import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class TestCourse 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int i, n;
        System.out.print("\n Enter Courses Entry (000 for No Details):  ");
        n = input.nextInt();
        

        Course cList [] = new Course[n]; 

        for (i=0; i<n; i++)
        {
            input.nextLine();

            String cn = new String();
            String ci = new String();
            int hours, creds;

            System.out.print("\nCourse Name: ");
            cn = input.nextLine();
            if (cn.equals("000") == true)
            {
                cList[i] = new Course();
                continue;
            }
            

            System.out.print("Course Instructor: ");
            ci = input.nextLine();
            

            System.out.print("Duration: ");
            hours = input.nextInt();

            System.out.print("Credits: ");
            creds = input.nextInt();

            cList[i] = new Course(cn, ci, hours, creds);
        }

        enrollForCourse();
        dropFromCourse();
        displayCourses(cList, n);

        input.close();
    }    

    public static void enrollForCourse ()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Total No. of Students Enrolled = " + Course.noofStudentsEnrolled);
        
        System.out.print(" Do you want to Initiate Enrollment? (y/n): ");
        char c = input.next().charAt(0);
        if (c=='y')
        {
            System.out.print(" Enter No of Students: ");
            int num = input.nextInt();
            Course.enroll(num);
        }
        
    }

    public static void dropFromCourse ()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Total No. of Students Enrolled = " + Course.noofStudentsEnrolled);
        
        System.out.print(" Do you want to Initiate Dropout? (y/n): ");
        char c = input.next().charAt(0);
        if (c=='y')
        {
            System.out.print(" Enter No of Students: ");
            int num = input.nextInt();
            Course.drop(num);
        }
        
    }

    public static void displayCourses (Course cList[], int n)
    {
        int i;
        String res = new String();
        
        System.out.println("\n LIST OF ALL COURSES & ITS DETAILS \n");
        for (i=0; i<n; i++)
        {
            res = cList[i].toString();
            System.out.println(res);
        }
    
        System.out.println();
    }


}
