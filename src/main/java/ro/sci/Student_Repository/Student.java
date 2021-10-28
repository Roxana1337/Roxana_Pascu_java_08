package ro.sci.Student_Repository;

public class Student {

    String firstName;
    String lastName;
    String dateOfBirth;
    String gender;
    String cnp;

    public Student(String firstName, String lastName, String dateOfBirth, String gender, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cnp = cnp;
    }


    @Override
    public String toString() {
        return "Student name: " + firstName + " " + lastName + ", " + "date of birth: " + dateOfBirth +
                ", " + "Gender: " + gender + ", " + "ID: " + cnp;
    }

    public String getCnp() {
        return cnp;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
