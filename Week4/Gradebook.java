import java.util.Scanner;

public class Gradebook 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        int i, n;
        System.out.print("\n Enter Courses Entry:  ");
        n = input.nextInt();

        Course cList2 [] = new Course[n]; 

        for (i=0; i<n; i++)
        {
            input.nextLine();

            String cn = new String();
            String ci = new String();
            int hours, creds;

            System.out.print("\nCourse Name: ");
            cn = input.nextLine();

            System.out.print("Course Instructor: ");
            ci = input.nextLine();

            System.out.print("Duration: ");
            hours = input.nextInt();

            System.out.print("Credits: ");
            creds = input.nextInt();

            cList2[i] = new Course(cn, ci, hours, creds);
        }

        displayAllCourses(cList2, n);

    }

    public static void displayAllCourses (Course cList2[], int n)
    {
        int i;
        String res = new String();
        
        System.out.println("\n LIST OF ALL COURSES & ITS DETAILS \n");
        for (i=0; i<n; i++)
        {
            res = cList2[i].toString();
            System.out.println(res);
        }
    
        System.out.println();
    }
}
