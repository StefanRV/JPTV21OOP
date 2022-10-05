/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myoopproba;

import myclasses.Author;
import myclasses.Books;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Author author = new Author();
        author.setFirstname("Po");
        author.setLastname("Mogite");
        Author author2 = new Author();
        author2.setFirstname("Aleks");
        author2.setLastname("Puskin");
        Author authort1 = new Author();
        Author authort2 = new Author();
        Author authort3 = new Author();
        authort1.setFirstname("Ja");
        authort1.setLastname("Stef");
        authort2.setFirstname("An");
        authort2.setLastname("Ro");
        authort3.setFirstname("Bal");
        authort3.setLastname("Ko");
        Books book = new Books();
        Books book2 = new Books();
        Books book3 = new Books();
        Books book4 = new Books();
        Books book5 = new Books();
        Books book6 = new Books();
        book6.setCaption("AAA");
        book6.addAuthor(author);
        book6.addAuthor(author2);
        book6.addAuthor(authort1);
        book6.addAuthor(authort2);
        book6.addAuthor(authort3);
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
        book5.setCaption("Псих помощь");
        
        Author[] authors = new Author[1];
        Author[] authors2 = new Author[1];
        Author[] authors3 = new Author[3];
        authors[0] = author;
        authors2[0] = author2;
        authors3[0] = authort2;
        authors3[1] = authort1;
        authors3[2] = authort3;
        book.setAuthors(authors);
        book2.setAuthors(authors2);
        book3.setAuthors(authors2);
        book4.setAuthors(authors);
        book5.setAuthors(authors3);
        for (int i = 0; i < bookar.length; i++){
            System.out.println(bookar[i]);
        }
        
        System.out.println(book6);
    }
}
