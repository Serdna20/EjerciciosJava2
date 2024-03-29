package com.mycompany.biblioteca;
import books.Book;
import java.util.Scanner;
public class Biblioteca {
    
    static String searchByGenre(Book[] array, String genre) {
        String booksFound = "";
        for (Book i : array) {
            if (i.getGenre().equals(genre)) {
                booksFound = booksFound + i.getBookInfo();
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
        byte menuAction;
        boolean wantsToExit = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("¡Bienvenido a la biblioteca!\n¿Que accion desea realizar?\n1. Buscar libro por genero.\n2. Sacar libro\n3. Regresar libro.\n4. Salir.");
            menuAction = scanner.nextByte();
            switch (menuAction) {
                case 1:
                    System.out.println("Ingrese el genero del libro:");
                    System.out.println(searchByGenre(books, scanner.next()));
                    break;
                case 2:
                    String[] userInfo = new String[2];
                    System.out.println("Ingrese su nombre:");
                    userInfo[0] = scanner.next();
                    System.out.println("Ingrese su codigo");
                    userInfo[1] = scanner.next();
                    System.out.println("Ingrese la id del libro a sacar:");
                    System.out.println(books[scanner.nextByte()].lendBook(userInfo));                    
                    break;
                case 3:
                    System.out.println("Ingrese la id del libro a regresar:");
                    System.out.println(books[scanner.nextByte()].returnBook());
                    break;
                case 4:
                    wantsToExit = true;
                    break;
                default:
                    break;                        
            }
        } while(wantsToExit==false);
    }
}
