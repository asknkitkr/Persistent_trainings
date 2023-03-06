import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        BookDAO dao = new BookDAO();
        ArrayList<Book> books = dao.listBooks();

        System.out.println("List of Books");
        System.out.format("%-5s %-20s %-20s %-10s %s\n", "Id", "Title", "Category", "Author", "Price");
        for (Book book : books) {
            System.out.format("%-5s %-20s %-20s %-10s %s\n",
                    book.getId(), book.getTitle(), book.getCategory(), book.getAuthor(), book.getPrice());
        }
    }
}
