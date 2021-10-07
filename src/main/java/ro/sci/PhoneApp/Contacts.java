package ro.sci.PhoneApp;

public class Contacts {

    String contactOrderNumber;
    String firstName;
    String lastName;
    String phoneNumber;

    public Contacts(String contactOrderNumber, String firstName, String lastName, String phoneNumber) {
        this.contactOrderNumber = contactOrderNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + phoneNumber;
    }
}
