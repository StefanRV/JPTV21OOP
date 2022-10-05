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
public class App {
    public void run(){

        Books books1 = createBook("Evg On");
        Books books2= createBook("Anna Karenina");
        Books books3 = createBook("12 Stuljev");
        Books books4 = createBook("1984");
        Books books5 = createBook("Help I'am tired");
        books1.addAuthor(createAuthor("Aleks","Pushkin"));
        books2.addAuthor(createAuthor("Lev","Tolstoi"));
        books3.addAuthor(createAuthor("Ilja","Ilf"));
        books3.addAuthor(createAuthor("Evg","Petrov"));
        books4.addAuthor(createAuthor("George","Oruell"));
        books5.addAuthor(createAuthor("Stefan","Robalko"));
        Books[] bookar = new Books[5];
        bookar[0] = books1;
        bookar[1] = books2;
        bookar[2] = books3;
        bookar[3] = books4;
        bookar[4] = books5;
        for (int i = 0; i < bookar.length; i++){
            System.out.println(bookar[i]);
        }
        
        
    }
    private Books createBook(String caption){
        Books book = new Books();
        book.setCaption(caption);
        
        return book;
    }
    private Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
}
