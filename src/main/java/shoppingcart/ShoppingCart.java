package shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class that contains a list of the books that the client wants to purchase
 */
public class ShoppingCart {
    private List<Book> books;

    /**
     * The constructor
     */
    public ShoppingCart() {
        books = new ArrayList<>();
    }

    /**
     * Method that adds an item in the list
     *
     * @param book the book that will be added
     */
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Method that calculcates the total price of the books in the shopping cart
     *
     * @return the total price
     */
    public int getTotalSum() {
        int totalPrice = 0;
        for (Book book : books) {
            totalPrice = totalPrice + book.getPrice();
        }

        return totalPrice;
    }

    /**
     * Method that displays the total nr of books in cart
     *
     * @return list size
     */
    public int getTotalNrBooks() {
        return books.size();
    }

    public void clearCart() {
        books.clear();
    }

    public List<Book> getBooks() {
        return books;
    }

    /**
     * Method that returns all the authors and the number of times they appear in the cart book list
     * @return a map with author name and nr of appearance
     */
    public Map<String, Integer> nrAparitiiAutori() {
        //afisare nr aparitii al autorilor in shoppint cart
        Map<String, Integer> aparitiiAutori = new HashMap<>();

        for (Book book : books) {

            //verific daca numele autorului se afla in map
            if (aparitiiAutori.containsKey(book.getAuthorName())) {
                int nrApartii = aparitiiAutori.get(book.getAuthorName());
                aparitiiAutori.put(book.getAuthorName(), nrApartii + 1);
            } else {
                aparitiiAutori.put(book.getAuthorName(), 1);
            }
        }
        return aparitiiAutori;
    }

    /**
     * Method that displays a list of books where the @param numeAutor appears
     * @param numeAutor the author name
     * @return a list of books where the @param numeAutor appears
     */
    public List<Book> retriveBooksForAuthor(String numeAutor) {
        List<Book> booksWithAnAuthor = new ArrayList<>();

        for (Book book: books){
            if (book.getAuthorName().equals(numeAutor)) {
                booksWithAnAuthor.add(book);
            }
        }

        return booksWithAnAuthor;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "books=" + books +
                '}';
    }
}
