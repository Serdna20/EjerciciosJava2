package books;

public class Book {
    String title;
    int quantity;
    int initialQuantity;
    int id;
    String genre;
    String loanDate;
    String returnDate;
    boolean available;

    public Book(String title, int quantity, int id, String genre) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        available = true;
        initialQuantity = quantity;
    }    

    public String getGenre() {
        return genre;
    }

    public String getBookInfo() {
        return title+" | "+"Cantidad:"+quantity;
    }
    
    
}
