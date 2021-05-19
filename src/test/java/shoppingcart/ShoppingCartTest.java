package shoppingcart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() throws Exception {
        shoppingCart = new ShoppingCart();
        shoppingCart.addBook(new Book("title1", "author1", 200));
        shoppingCart.addBook(new Book("title2", "author2", 100));
    }

    @After
    public void tearDown() throws Exception {
        shoppingCart = null;
    }

    @Test
    public void testGetTotalSum() {
        assertNotNull(shoppingCart.getBooks());
        assertEquals(300, shoppingCart.getTotalSum());
    }

    @Test
    public void testGetTotalNrBooks() {
        assertEquals(2, shoppingCart.getTotalNrBooks());
    }

    @Test
    public void testNrAparitiiAutori() {
        Map<String, Integer> result = shoppingCart.nrAparitiiAutori();

        assertEquals(Integer.valueOf(1), result.get("author1"));
        assertEquals(Integer.valueOf(1), result.get("author2"));
    }

    @Test
    public void testRetriveBooksForAuthor() {
        List<Book> result = shoppingCart.retriveBooksForAuthor("author1");

        assertEquals(1, result.size());
        assertTrue(result.contains(new Book("title1", "author1", 200)));
        assertEquals("author1", result.get(0).getAuthorName());
    }
}