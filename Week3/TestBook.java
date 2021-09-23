import java.util.Scanner;

public class TestBook 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int i, n;
        System.out.print("\n Enter the Total Number of Books: ");
        n = input.nextInt();

        Book [] library = new Book[n];

        for (i=0; i<n; i++)
        {
            input.nextLine();

            String book, writer;
            int year;
            double cost;

            System.out.println("\n Enter Book #" + (i+1) + " Details: (Enter 'nil' if the book deets are unknown)");

            System.out.print("Title: ");
            book = input.nextLine();

            if (book.equals("nil"))
            {
                //CALLS DEFAULT CONSTRUCTOR
                library[i] = new Book();
                continue;
            }
                
            System.out.print("Author: ");
            writer = input.nextLine();

            System.out.print("Year of Publication: ");
            year =  input.nextInt();

            System.out.print("Price: ");
            cost = input.nextDouble();

            library[i] = new Book(book, writer, year, cost);
        }

        System.out.println("\n");

        System.out.println(" PRINTING ALL THE BOOKS IN LIBRARY: \n\n");
        for (i=0; i<n; i++) 
        {
            library[i].display();
        }

        System.out.println("\n\n DUPLICATE CHECKING: " + checkDup(library, n));
        
        System.out.println("\n");
        input.close();

    }    

    public static boolean checkDup (Book[] arr, int n) 
    {
        int i, j;
        boolean dup1, dup2, dup3, dup4;

        for (j=0; j<n; j++){
            for (i=j+1; i<n; i++) 
            {
                dup1 = false;
                dup2 = false;
                dup3 = false;
                dup4 = false;
                if ((arr[j].title).equals(arr[i].title) )
                {
                    dup1 = true;
                }
                if ((arr[j].author).equals(arr[i].author) )
                {
                    dup2 = true;
                }
                if (arr[j].yearOfPublication == arr[i].yearOfPublication)
                {
                    dup3 = true;
                }
                if (arr[j].price == arr[i].price) 
                {
                    dup4 = true;
                }

                //Since a book with same name can be written by different authors
                //and the same author can write different books, 
                //and any 2 books can have same price and year of publications,
                //for a book to be duplicate, all the details have to be identical
                if (dup1 && dup2 && dup3 && dup4)
                    return true;
            }
        }
            
        return false;
        
    }
}
