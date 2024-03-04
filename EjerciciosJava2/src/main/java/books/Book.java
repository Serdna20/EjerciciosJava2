package books;

public class Book {
    String title;
    int quantity;
    int id;
    String genre;
    String returnDate;
    String loanDate;

    public Book(String title, int quantity, int id, String genre, String returnDate, String loanDate) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.returnDate = returnDate;
        this.loanDate = loanDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getGenre() {
        return genre;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getLoanDate() {
        return loanDate;
    }   
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setAmount(int quantity) {
        this.quantity = quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }
    
    
}
