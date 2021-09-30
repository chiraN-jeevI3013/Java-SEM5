public class Course 
{
    String courseName = new String();
    String courseInstructor = new String();
    int noofHours;
    int noofCredits;
    
    //STATIC VARIABLE
    static int noofStudentsEnrolled=0;

    public Course ()
    {
        courseName = null;
        courseInstructor = null;
        noofHours = noofCredits = 0;

        noofStudentsEnrolled++;
    }

    public Course (String cn, String ci, int hours, int creds)
    {
        setCourseName(cn);
        setCourseInstructor(ci);
        setHours(hours);
        setCredits(creds);

        noofStudentsEnrolled++;
    }

    //SET METHODS
    public void setCourseName (String cn)
    {
        if (cn != null)
            courseName = String.valueOf(cn);
    }
    public void setCourseInstructor (String ci)
    {
        if (ci != null)
            courseInstructor = String.valueOf(ci);
    }
    public void setHours (int hours)
    {
        if (hours>0)
            noofHours = hours;
    }
    public void setCredits (int creds)
    {
        if (creds>0)
            noofCredits = creds;
    }

    //GET METHODS
    public String getCourseName ()
    {
        return courseName;
    }
    public String getCourseInstructor ()
    {
        return courseInstructor;
    }
    public int getHours ()
    {
        return noofHours;
    }
    public int getCredits ()
    {
        return noofCredits;
    }

    //TO-STRING DISPLAY INFO
    public String toString ()
    {
        return String.format(" Course-Name: %s, Course-Instructor: %s, Duration: %d hours, Credits: %d", courseName, courseInstructor, noofHours, noofCredits);
    }

    //STATIC METHODS:
    public static void enroll (int n)
    {
        if (n>0)
            noofStudentsEnrolled += n;

        System.out.println("\n Total No. of Students Enrolled = " + noofStudentsEnrolled);
    }

    public static void drop (int n)
    {
        if (n<noofStudentsEnrolled)
            noofStudentsEnrolled -= n;

        System.out.println("\n Total No. of Students Enrolled = " + noofStudentsEnrolled);
    }
}
