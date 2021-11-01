package ro.sci.Student_Repository.Exceptions;

public class EmptyCatalogException extends RuntimeException {
    public EmptyCatalogException() {
        super("No students to display");
    }
}
