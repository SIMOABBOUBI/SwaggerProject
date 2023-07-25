package abboubi.org.secondPoject.Repository;

import abboubi.org.secondPoject.Entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findByTitle(String title);

}