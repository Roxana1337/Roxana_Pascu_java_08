package ro.sci.Student_Repository.Exceptions;

public class CNPException extends RuntimeException {
    public CNPException() {
        super("ID number not valid");
    }
}
