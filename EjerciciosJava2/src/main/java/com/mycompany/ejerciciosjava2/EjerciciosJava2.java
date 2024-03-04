package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
import books.Book;

public class EjerciciosJava2 {
    
    static Book[] pushBookArray(Book[] array, Book element) {
        final int arrayLength = array.length;
        final Book[] newArray = new Book[arrayLength+1]; 
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[arrayLength] = element;
        return newArray;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean onMenu = true;
        int menuAction;
        Book[] bookList = new Book[1];
        // bookList[0] = new Book("", 0, 0, "", "", "");
        
        System.out.println("Bienvenido a la aplicación de prestamos de libro:");
        do {
            System.out.println("Ingrese una acción a realizar: ");
            System.out.println("1. Prestamo de libro.");
            System.out.println("2. Devolución de libro.");
            System.out.println("3. Busqueda de libro.");
            System.out.println("4. Ingresar nuevo libro.");
            System.out.println("5. Administrar base de datos.");
            System.out.println("6. Actualizar libro.");
            System.out.println("7. Imprimir libros actuales.");
            System.out.println("8. Salir.");
            menuAction = scanner.nextInt();
            switch (menuAction) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    bookList = pushBookArray(bookList, new Book("", 0, bookList.length+1, "", "", ""));
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de libros:");
                    int quantityOfBooks = scanner.nextInt();
                    bookList = new Book[quantityOfBooks];
                    for (int index=0; index < quantityOfBooks; index++) {
                        bookList[index] = new Book("", 0, index, "", "", "");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el id del libro:");
                    int bookIndex = scanner.nextInt();
                    System.out.println("Ingrese el titulo del libro:");
                    scanner.next();
                    bookList[bookIndex].setTitle(scanner.next());
                    System.out.println("Ingrese la cantidad del libro:");
                    bookList[bookIndex].setQuantity(scanner.nextInt());                    
                    System.out.println("Ingrese el genero del libro:");                    
                    scanner.next();
                    bookList[bookIndex].setGenre(scanner.next());
                    System.out.println("Fecha de retorno del libro:");
                    scanner.next();
                    bookList[bookIndex].setReturnDate(scanner.next());
                    System.out.println("Fecha de prestamo del libro:");
                    scanner.next();
                    bookList[bookIndex].setLoanDate(scanner.next());
                    break;
                case 7:
                    for (int index=0; index < bookList.length; index++) {
                        final Book book = bookList[index];
                        final String bookData = "Id: "+book.getId()+" Titulo: "+book.getTitle()+" Genero: "+book.getGenre()+" Cantidad: "+book.getQuantity()+"";
                        System.out.println(bookData);
                        System.out.println("Prestamo: "+book.getLoanDate()+" Devolucion: "+book.getReturnDate());
                    }
                    break;
                case 8:
                    onMenu=false;
                    System.out.println("Hasta luego!");
                    break;
                default:
                    break;
            }
        } while(onMenu==true);
        scanner.close();
    }
}
