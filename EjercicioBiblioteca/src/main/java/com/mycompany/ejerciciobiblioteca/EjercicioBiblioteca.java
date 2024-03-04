package com.mycompany.ejerciciobiblioteca;
import books.Book;
public class EjercicioBiblioteca {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 5, 25, "Fantasia");
        Book book2 = new Book("El nombre del viento", 1, 28, "Fantasia");

        // Presto el libro
        book1.lendBook();
        book1.lendBook();
        book1.lendBook();
        book1.lendBook();
        book1.lendBook();
        System.out.println("Libro 1: "+book1.isAvailable()+ " Libro 2: "+book2.isAvailable());
        book1.returnBook();
        book1.returnBook();
        book1.returnBook();
        book1.returnBook();
        book1.returnBook();
        book1.returnBook();
        book1.returnBook();
        book1.returnBook();
        System.out.println("Libro1: "+book1.getQuantity());
    }
}
