import java.util.*;

public class TestBook 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int i, n;
        System.out.print("\n Enter the Total Number of Books: ");
        n = input.nextInt();

        Book [] objects = new Book[n];

        for (i=0; i<n; i++)
        {
            input.nextLine();

            String book = new String();
            String writer = new String();
            int year;
            double cost;

            System.out.println("\n Enter Book #" + (i+1) + " Details: ");

            System.out.print("Title: ");
            book = input.nextLine();
                
            System.out.print("Author: ");
            writer = input.nextLine();

            System.out.print("Year of Publication: ");
            year =  input.nextInt();

            System.out.print("Price: ");
            cost = input.nextDouble();

            objects[i] = new Book(book, writer, year, cost);
        }

        input.nextLine();
        System.out.print("\n Enter A Book Title to Search for: ");
        String name = input.nextLine();

        //input.nextLine();
        
        Book b = new Book();
        b = search(objects, name, n);

        if (b==null)
            System.out.println("\n Book with title _________ is not found \n");
        else
        {
            b.display();
        }

        input.close();
    }    

    public static Book search (Book lib[], String title, int n)
    {
        int i;
        for (i=0; i<n; i++)
        {
            if ( title.equals(lib[i].title) )
            {
                System.out.println();
                return lib[i];
            }
                
        }

        return null;
    }


}
