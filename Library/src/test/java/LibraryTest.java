
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;


    public LibraryTest(){
    }

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("To Kill A Mockingbird", "Harper Lee", "fiction");

        }
        @Test
        public void canCountBooks() {
        assertEquals(0, library. bookCount());
        }

        @Test
        public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
        }
        @Test
        public void canAddBookIfSpace(){
        library.addBookIfSpace(book);
        library.addBookIfSpace(book);
        library.addBookIfSpace(book);
        assertEquals(2, library.bookCount());
        }




        }