public class PublicVsPrivate {

}

class Book{
    /**
     * by default fields should be set to private to stop accidental tampering etc
     * and instead to change values getter and setter methods should be used see below
     */
    private String title;
    private String author;
    private boolean isBorrowed;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void borrowBook(){
        isBorrowed = true;
    }
    public void returnBook(){
        isBorrowed = false;
    }
    public boolean isBookBorrowed(){
        return isBorrowed;
    }
}

class ViewBookStatus {
    /**
     * Class to show work of getter/setter methods
     * @param args
     */

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "JKR");

        System.out.println(book1.isBookBorrowed());

        book1.borrowBook();

        System.out.println(book1.isBookBorrowed());

        book1.returnBook();

        System.out.println(book1.isBookBorrowed());

    }
}