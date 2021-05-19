package shoppingcart;

import java.util.Objects;

/**
 * Class that contains the book scheleton
 */
public class Book {
    private String title;
    private String authorName;
    private int price;

    /**
     * Constror
     * @param title contains the book title
     * @param authorName contains the book author
     * @param price contains the book price
     */
    public Book(String title, String authorName, int price) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}
