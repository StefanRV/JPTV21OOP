/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myoopproba;

import java.util.Arrays;
import myclasses.Author;
import myclasses.Books;

/**
 *
 * @author pupil
 */
public class MyOOPproba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author author = new Author();
        author.setFirstname("Po");
        author.setLastname("Mogite");
        Author author2 = new Author();
        author2.setFirstname("Aleks");
        author2.setLastname("Puskin");
        Books book = new Books();
        book.setCaption("War and World");
        Author[] authors = new Author[1];
        authors[0] = author;
        book.setAuthors(authors);
        System.out.println(book);
    }
    
}
