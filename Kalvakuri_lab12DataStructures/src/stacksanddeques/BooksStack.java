/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class BooksStack {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        AStack<Book> book = new AStack<>();
        AStack<Book> book1 = new AStack<>();
        Scanner myScanner = new Scanner(new File("books.txt"));
        while (myScanner.hasNext()) {
            String title = myScanner.nextLine();
            String author = myScanner.nextLine();
            Book newbook = new Book(title, author);
            book.push(newbook);
            book1.push(newbook);
        }
        int size = book.size();
        System.out.println("All books in the stack from top to bottom\n"
                + "-------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(book.pop() + "\n-------------------------------------");
        }
        System.out.println("\n\nStack after removing book with name Fantastic Beasts: The Crimes of Grindelwald\n"
                + "-------------------------------------");
        AStack<Book> book3 = new AStack<>();
        for (int i = 0; i < size; i++) {
            if (book1.peek().getTitle().contains("Fantastic Beasts: The Crimes of Grindelwald")) {
                book1.pop();
            } else {
                book3.push(book1.pop());
            }
        }
        AStack<Book> book4 = new AStack<>();
        size = book3.size();
        for(int i=0; i<size; i++){
           book4.push(book3.pop()); 
        }   
        for (int i = 0; i < size; i++) {
            System.out.println(book4.pop() + "\n-------------------------------------");
            
        }
    }
}
