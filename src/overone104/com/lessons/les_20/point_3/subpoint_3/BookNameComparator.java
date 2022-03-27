package overone104.com.lessons.les_20.point_3.subpoint_3;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        return book.getName().compareTo(t1.getName());
    }
}
