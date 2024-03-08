package com.mycompany.biblioteca;
import books.Book;
public class Biblioteca {
    
    static String searchByGenre(Book[] array, String genre) {
        String booksFound = "";
        for (Book i : array) {
            if (i.getGenre().equals(genre)) {
                booksFound = booksFound + i.getBookInfo() + "\n";
            }
        }
        return booksFound;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 5, 0, "Fantasia");;
        Book book2 = new Book("El abogado del marciano", 2, 1, "Ficcion");
        Book book3 = new Book("Cronica de una muerte anunciada", 3, 2, "Novela");
        Book book4 = new Book("Guerra y paz", 3, 3, "Novela");        
        Book[] books = {book1, book2, book3, book4};
        System.out.println(searchByGenre(books, "Novela"));
    }
}
