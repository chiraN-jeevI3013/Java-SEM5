public class Librarymember 
{
    int accno;
    String accName = new String();
    double deposit;
    int noofbooks;

    static int totalBooksInLib=0;
    static final float fine = 1.50f;
    int dueDays = 20;
    int x=100;  //for default accNo

    public Librarymember ()
    {
        accno = x++;
        accName = null;
        deposit = 0;
        noofbooks = 0;
    }

    public Librarymember (int an, String name, double d, int books)
    {
        accno = an;
        accName = name;
        deposit = d;
        issueBooks(books);
    }

    public void issueBooks (int val)
    {
        noofbooks += val;
        totalBooksInLib += val;
    }

    public void returnBooks (int val)
    {
        if (noofbooks<val)
            System.out.println(" Returned book count is greater");
        else 
        {
            noofbooks -= val;
            totalBooksInLib -= val;

            System.out.println(" " + val + " books returned! \t Remaining Books issued to Account = " + noofbooks);
        }
        
    }

    public float calculateFine (int noofDays)
    {
        if (noofDays>dueDays)
            return ( (noofDays-dueDays)*fine );
        else
        {
            System.out.println("\n No need to Pay any Fine! ");
            return 0;
        }
    }
}
