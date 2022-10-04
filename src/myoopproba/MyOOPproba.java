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
        Books book2 = new Books();
        Books book3 = new Books();
        Books book4 = new Books();
        Books book5 = new Books();
        Books bookar[] = new Books[5];
        bookar[0] = book;
        bookar[1] = book2;
        bookar[2] = book3;
        bookar[3] = book4;
        bookar[4] = book5;
        book.setCaption("War and World");
        book2.setCaption("Evgeniy Onegin");
        book3.setCaption("Сказка о рыбаке и рыбке");
        book4.setCaption("Anna Karenina");
        book5.setCaption("Капитанская дочка");
        Author[] authors = new Author[1];
        Author[] authors2 = new Author[1];
        authors[0] = author;
        authors2[0] = author2;
        book.setAuthors(authors);
        book2.setAuthors(authors2);
        book3.setAuthors(authors2);
        book4.setAuthors(authors);
        book5.setAuthors(authors);
        for (int i = 0; i < bookar.length; i++){
            System.out.println(bookar[i]);
        }
        
        
        
        
    }
    
}
