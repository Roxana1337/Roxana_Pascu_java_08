package ro.sci.Student_Repository.Exceptions;

public class GenderException extends RuntimeException {
    public GenderException() {
        super("Gender must be m or f (case insensitive)");
    }
}
