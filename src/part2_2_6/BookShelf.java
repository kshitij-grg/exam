package part2_2_6;

import java.util.List;

public class BookShelf<String> {
    private List<String> books;

    public void addBook(String book) {
        books.add(book);
    }

    public String removeBook() {
        return books.remove(books.size() - 1);
    }
}
