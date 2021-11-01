package ro.sci.Student_Repository.Exceptions;

public class NameMandatoryException extends RuntimeException {

    public NameMandatoryException() {
        super("First and last name are mandatory");
    }
}
