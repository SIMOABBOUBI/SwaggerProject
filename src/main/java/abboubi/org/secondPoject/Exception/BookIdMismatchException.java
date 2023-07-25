package abboubi.org.secondPoject.Exception;

public class BookIdMismatchException extends RuntimeException{
    public BookIdMismatchException(){
        super("Book id mismatch");
    }
}
