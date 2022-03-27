package overone104.com.lessons.les_20.point_3.subpoint_3;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book book, Book bookTwo) {
        return bookTwo.getYear() - book.getYear();
    }
}
