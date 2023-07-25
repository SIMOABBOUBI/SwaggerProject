package abboubi.org.secondPoject.Controleur;

import abboubi.org.secondPoject.Entity.Book;
import abboubi.org.secondPoject.Repository.BookRepository;
import abboubi.org.secondPoject.Exception.BookIdMismatchException;
import abboubi.org.secondPoject.Exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class HelloController {
    @Autowired
    private BookRepository bookRepositpry;

    @GetMapping
    public Iterable findAll() {
        return bookRepositpry.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle) {
        return bookRepositpry.findByTitle(bookTitle);
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable Long id) {
        return bookRepositpry.findById(id)
                .orElseThrow(BookNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book book) {
        return bookRepositpry.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookRepositpry.findById(id)
                .orElseThrow(BookNotFoundException::new);
        bookRepositpry.deleteById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
        if (book.getId() != id) {
            throw new BookIdMismatchException();
        }
        bookRepositpry.findById(id)
                    .orElseThrow(BookNotFoundException::new);
            return bookRepositpry.save(book);
        }
    @RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
    public String sayHello() {
        return "Swagger Hello World";
    }
    }

