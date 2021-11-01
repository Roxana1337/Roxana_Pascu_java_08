package ro.sci.Student_Repository.Exceptions;

public class AgeNumberFormatException extends RuntimeException{
    public AgeNumberFormatException() {
        super("Age must be a number");
    }

    public AgeNumberFormatException(String s) {
        super(s);
    }
}
