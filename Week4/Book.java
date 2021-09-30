public class Book 
{
    String title = new String();
    String author = new String();
    int yearOfPublication;
    double price;
    
    public Book () 
    {
        title = null;
        author = null;
        yearOfPublication = 0;
        price = 500.00;
    }

    public Book (String book, String writer, int year, double cost) 
    {
        setTitle ( book);
        setAuthor ( writer);
        setYearOfPublication ( year);
        setPrice ( cost);
    }

    public void setTitle (String book) {
        if (book!=null)
            title = String.valueOf(book);
        else
            title = null;
    }
    public void setAuthor (String writer)
    {
        if (writer!=null)
            author = String.valueOf(writer);
        else
            author = null;
    }
    public void setYearOfPublication (int year) {
        if (year>0)
            yearOfPublication = year;
        else
            yearOfPublication = 0;
    }
    public void setPrice (double cost) {
        if (cost>0)
            price = cost;
        else
            price = 0;
    }


    public void display ()
    {
        System.out.println(" Book Details: ");
        System.out.printf("Title: %s \nAuthor: %s \nYear Of Publication: %d \nPrice: %.2f\n \n", title, author, yearOfPublication, price);
    }


    
}
