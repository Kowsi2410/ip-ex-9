/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import java.awt.print.Book;
import java.util.*;
/**
 *
 * @author kowsi
 */
public class book {
     public static void main(String[] args)
    {
        ArrayList <Book>  bk = new ArrayList<>();
        bk.add(new Book("book1","JohnDoe",123456,10.99));
        bk.add(new Book("book2","JaneSmith",987654,05.99));
        bk.add(new Book("book3","Bob Johnson",135790,20.50));
        book.sort(bk,new sortbyprice());
        System.out.println(bk);
        class sortbyprice implements comparator<Book>
        {
            public int compare(book b1,book b2)
            {
                return (int) (b1.price - b2.price);
            }
        }
    }

    public book(String book1, String johnDoe, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String name;
    private String author;
    private int IBSN;
    private double price;

    public book(String name, String author, int IBSN, double price) {
        this.name = name;
        this.author = author;
        this.IBSN = IBSN;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
     public int getIBSN() {
        return IBSN;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIBSN(int IBSN) {
        this.IBSN = IBSN;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "title: " + name + ", author: " + author + ", IBSN: " + IBSN + ", price: " + price;
    }
}
