package telran.hotcities.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class SomeCitiesNotFoundException extends Exception {
    public SomeCitiesNotFoundException(String msg) {
        super(msg);
    }


}