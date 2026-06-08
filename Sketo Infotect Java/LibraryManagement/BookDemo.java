package LibraryManagement;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        int BookId, count = 0;
        String BookName;
        String AuthorName;
        int Price;
        int operation;

        Scanner sc = new Scanner(System.in);

        Book book[] = new Book[100];

        while (true) {
            System.out.println("1. ADD BOOK :");          
            System.out.println("2. UPDATE BOOK :");
            System.out.println("3. DELETE BOOK :");
            System.out.println("4. SEARCH BOOK :");       
            System.out.println("5. GET ALL BOOKS :");      
            System.out.println("6. EXIT");
            System.out.println(" ");
            System.out.println("Enter the choice");

            operation = sc.nextInt();
            sc.nextLine(); 

            switch (operation) {
                case 1:
                    System.out.println("ADD BOOK");
                    System.out.println("Enter number of Book enter :");
                    int a = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < a; i++) {
                        System.out.println("Enter the BookId :");
                        BookId = sc.nextInt();
                        sc.nextLine(); 

                        System.out.println("Enter the BookName :");
                        BookName = sc.nextLine();

                        System.out.println("Enter the AuthorName :");
                        AuthorName = sc.nextLine();

                        System.out.println("Enter the Price of the book :");
                        Price = sc.nextInt();
                        sc.nextLine(); 

                        book[count] = new Book(BookId, BookName, AuthorName, Price);
                        count++;
                    }
                    System.out.println("Add book successfully");
                    break;

                case 2:
                    System.out.println("UPDATE BOOK");
                    System.out.println("Enter the BookId for update :");
                    BookId = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < count; i++) {
                        if (book[i] != null && book[i].getBookId() == BookId) {
                            System.out.println("Enter the Book Name for the update :");
                            BookName = sc.nextLine();
                            book[i].setBookName(BookName);

                            System.out.println("Enter the book Author name for the update :");
                            AuthorName = sc.nextLine();
                            book[i].setAuthorName(AuthorName);

                            System.out.println("Enter the book price for the update :");
                            Price = sc.nextInt();
                            sc.nextLine(); 
                            book[i].setPrice(Price);
                        }
                    }
                    System.out.println("Update book successfully");
                    break;

                case 3:
                    System.out.println("DELETE BOOK");
                    System.out.println("Enter the BookId for delete :");
                    BookId = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < count; i++) {
                        if (book[i] != null && book[i].getBookId() == BookId) {
                            book[i] = null;
                        }
                    }
                    System.out.println("Delete book successfully");
                    break;

                case 4:
                    System.out.println("SEARCH BOOK");
                    System.out.println("Enter the BookId for search :");
                    BookId = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < count; i++) {
                        if (book[i] != null && book[i].getBookId() == BookId) {
                            System.out.println(book[i]);
                        }
                    }
                    System.out.println("Search completed successfully");
                    break;

                case 5:
                    System.out.println("All Information about Book");

                    for (int i = 0; i < count; i++) {
                        System.out.println(book[i]);
                    }
                    System.out.println("All books are :");
                    break;

                case 6:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Entered choice is invalid so kindly enter right choice...");
                    break;
            }
        }
    }
}

class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private int price;

    public Book(int bookId, String bookName, String authorName, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}
