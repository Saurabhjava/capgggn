Duration :  2hrs


***There is more treasure in books than in all the pirate’s loot on Treasure Island. - Walt Disney***

Book reading is a great habit that we cultivate to enhance our vocabulary skills. In today's online world reading has taken a back seat.

The Just Reading Library is a new venture that has come up with a unique methodology to service its members, and acquire new members on the go. The Just Reading Library is a mobile library that has a member base in tier 2 towns, in order to encourage reading. 

The mobile van with books travels across the town,and those who want to become a member can do so by registering with Just Reading Library, by providing their basic information like name, address etc, and a unique membership code is generated for each of them. An executive enters the data provided by the member into an in house application so that a customer account is created for each member to keep track of the the personal information, address, books borrowed etc.

Build solution for the problem statement



Below are the Classes and methods broadly

Note : Use Parameterized constructors, getter/setters , interfaces whereever required


|----|

|Book|

|LibraryService|

|Customer - Information about a member|

|LibraryHack - main method class|

 

 



    class Book
    {
        int bookIsbnNo;
        String author;
        String publisher;
        float price; 
    }

    class LibraryService
    {
        String libraryName;
        String address
        List<Book>   books;// A library has one or more books
    }

    Methods
        - getBooks() : returns Book list 
        - addBook(Book b)  : add book to the list
        - removeBook(int bookIsbnNo) : remove book from the list based on the given isbn
        - findMaxPrice(String publisher) : get the costly book detail published by the given publisher (use java8 stream)



    class Customer
    {
        String customerName;
        String address;
        List<Book> borrowed;
        

    }



Class LibraryHack
{
   Main method class
}


Broadly the below task  needs to be done

1. Need to initialize 5 books in LibraryService class using  default constructor

2. LibraryHack is the client program, where you have main method.

 Get the User type

    if Usertype == admin then they have 4 choices (using LibraryService class)

        1. view all books
        
        2. addNewBook
        
        3. deleteBook

        4. Get the costly book based on publisher

if Usertype==customer then they have 2 choices

        1- View all books in library class

        2- Get the costly book based on publisher
        
Note : Use getter/setter/constructor/toString/java8 whereever possible
