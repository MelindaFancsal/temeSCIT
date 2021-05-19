package shoppingcart;

import java.util.List;
import java.util.Map;

public class SchoppingCartMain {

    /*
    Am un cos unde pot adauga/sterge carti. Vreau sa afisez suma totala a cartilor pe care doresc sa le achizitionez.
    Cerinte pt shoppingCart:
    - adaugare carte
    - stergere carte
    -afisare pret total
    -afisare nr total de carti
    -posibilitatea de stergere a tuturor cartilor din cos
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addBook(new Book("nume1", "Ana", 200));
        cart.addBook(new Book("Intro in Java", "Ana", 300));
        cart.addBook(new Book("Intro in Java2", "Anisor", 300));

        List<Book> result = cart.retriveBooksForAuthor("author1");
        if (result == null || result.size() == 0) {
            System.out.println("Nu s a gasit nici un autor in lista de carti din ShoppingCart");
        } else {
            for (Book book : result) {
                System.out.println(book);
            }
        }


        //afisare nr aparitii autori
        Map<String, Integer> resultMap = cart.nrAparitiiAutori();
        for(Map.Entry<String, Integer> item: resultMap.entrySet()) {
            System.out.println(item.getKey() + "  " + item.getValue());
        }

    }
}
