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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void lendBook() {
        quantity = quantity-1;
        updateBookStatus();
    }
    
    public void returnBook() {
        if (quantity+1 <= initialQuantity) {
            quantity = quantity+1;
            updateBookStatus();
        }        
    }
    
    public void updateBookStatus() {
        available = false;
        if (quantity>0) {
            available = true;
        }
    }
    
    
    
    
}
