package ro.sci.Student_Repository.Exceptions;

public class BirthYearException extends RuntimeException {
    public BirthYearException() {
        super("Birth date must be valid between 1900 and current year-18");
    }
}
