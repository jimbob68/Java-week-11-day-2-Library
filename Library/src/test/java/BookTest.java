import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    private Book book;


    public BookTest() {

    }

    @Before
    public void before() {
        book = new Book("To Kill A Mockingbird", "Harper Lee", "fiction");
    }

    @Test
    public void canGetTitle() {
        assertEquals("To Kill A Mockingbird", book.title);
    }
    @Test
    public void canGetAuthor() {
        assertEquals("Harper Lee", book.author);
    }
    @Test
    public void canGetGenre() {
        assertEquals("fiction", book.genre);
    }
}