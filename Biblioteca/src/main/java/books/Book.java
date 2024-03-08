package books;

public class Book {
    String title;
    int quantity;
    int initialQuantity;
    int id;
    String genre;
    String[] currentOwners;
    int ownersQuanity;
    String loanDate;
    String returnDate;
    boolean available;

    public Book(String title, int quantity, int id, String genre) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        available = true;
        ownersQuanity = -1;
        initialQuantity = quantity;        
        currentOwners = new String[initialQuantity];
    }    

    public String getGenre() {
        return genre;
    }
    
    public String getBookInfo() {
        String extraInfo = "\n";
        if (ownersQuanity >= 0) {
            for (int index = 0; index <= ownersQuanity; index++) {
                extraInfo = extraInfo + currentOwners[index] + "\n";
            }
        }
        return title + " | " + "Cantidad: " + quantity + " | Id: " + id + extraInfo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } 
    
    public String returnBook() {
        String operationMessage;
        if (quantity == initialQuantity) {
            operationMessage = "No puede regresar un libro que no se presto.";
        }
        else {
            quantity = quantity+1;
            operationMessage = "Libro regresado con exito.";
        }
        updateBookStatus();
        return operationMessage;
    }
    
    public String lendBook(String[] loanInfo) {
        String operationMessage;
        if (available) {
            quantity = quantity-1;
            ownersQuanity = ownersQuanity+1;
            operationMessage = "Libro prestado.";
            updateOwners(loanInfo);
        }
        else {
            operationMessage = "No se pudo prestar.";
        }
        updateBookStatus();
        return operationMessage;
    }
    
    public void updateOwners(String[] loanInfo) {
        currentOwners[ownersQuanity] = loanInfo[0] + " | " + loanInfo[1];
    }    
    
    public void updateBookStatus() {
        if (quantity ==  initialQuantity) {
            available = true;
        }
        else if (quantity < 1) {
            available = false;
        }
        else {
            available = true;
        }
    }
}
