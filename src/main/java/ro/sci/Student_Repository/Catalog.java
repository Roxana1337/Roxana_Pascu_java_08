package ro.sci.Student_Repository;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.*;

public class Catalog {

    HashMap<String, Student> studentCatalog = new HashMap<>();
    TreeMap<String, Student> studentCatalogByLastName = new TreeMap<>();
    HashMap<String, Student> studentCatalogByBirthDate = new HashMap<>();

    public void addStudent(String firstName, String lastName, String dateOfBirth, String gender, String cnp) {
        Student student = new Student(firstName, lastName, dateOfBirth, gender, cnp);
        if (firstName == null || lastName == null || firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException ("First and last name are mandatory");
        }
        if (!Objects.equals(gender, "M") && !Objects.equals(gender, "F") && !Objects.equals(gender, "m")
                && !Objects.equals(gender, "f")) {
            throw new IllegalArgumentException("Gender must be m or f (case insensitive)");
        }
        studentCatalog.put(cnp, student);
        studentCatalogByLastName.put(lastName, student);
        studentCatalogByBirthDate.put(dateOfBirth, student);
    }

    public void deleteStudentByCNP(String cnp) {
            if (studentCatalog.containsKey(cnp)) {
                studentCatalog.remove(cnp);
                studentCatalogByLastName.remove(cnp);
                studentCatalogByBirthDate.remove(cnp);
            } else
                throw new NoSuchElementException("ID number not valid");
        }

    public void listCatalog() {
        if(studentCatalog.isEmpty()) {
            throw new NoSuchElementException("No students to display");
        }
        System.out.println(Arrays.asList(studentCatalog));
    }

    public void listCatalogByLastName() {
        if (studentCatalogByLastName.isEmpty()) {
            throw new NoSuchElementException("No students to display");
        }
        System.out.println(Arrays.asList(studentCatalogByLastName));
    }


//    public void dateOfBirthNumber() {
//        int studentBirthDay = Integer.parseInt(Student.getDateOfBirth
//
//    }
}
