import java.util.Scanner;

public class TestLibmem 
{
    public static void main(String[] args) 
    {
        Scanner input =  new Scanner(System.in);
        int i, n;

        System.out.print("\n Enter Library Members Count: ");
        n = input.nextInt();

        Librarymember memberz[] = new Librarymember[10];

        System.out.printf("\n Enter %d Member Details (000 when Acc Deets are unknown) \n", n);

        for (i=0; i<n; i++)
        {
            int an, books;
            String name;
            double d;

            System.out.print("\n Account Number: ");
            an = input.nextInt();
            if (an == 000)
            {
                //default constructor
                memberz[i] = new Librarymember();
                continue;
            }
            input.nextLine();
            System.out.print(" Member Name : ");
            name = input.nextLine();

            System.out.print(" Deposit Amount : ");
            d = input.nextDouble();

            System.out.print(" Books issued : ");
            books = input.nextInt();

            memberz[i] = new Librarymember(an, name, d, books);
        }

        System.out.print("\n Do you want to return any books? (y/n): ");
        char c = input.next().charAt(0);
        if (c=='y')
        {
            System.out.print(" Account No: ");
            int an = input.nextInt();
            System.out.print(" Number of Books Returning: ");
            int retBook = input.nextInt();

            for (i=0; i<n; i++)
            {
                if (memberz[i].accno == an)
                {
                    memberz[i].returnBooks(retBook);
                }
            }
        }

        System.out.print("\n Do you want to check Fine Amount? (y/n): ");
        c = input.next().charAt(0);
        if (c=='y')
        {
            System.out.print(" Account No: ");
            int an = input.nextInt();
            System.out.print(" Enter Total Days from Initial Issued Date : ");
            int days = input.nextInt();
            for (i=0; i<n; i++)
            {
                if (memberz[i].accno == an)
                {
                    float fineAmt = memberz[i].calculateFine(days);
                    if (fineAmt > 0)
                        System.out.println(" Fine Amount = " + fineAmt);
                }
            }
        }

    }    
}
