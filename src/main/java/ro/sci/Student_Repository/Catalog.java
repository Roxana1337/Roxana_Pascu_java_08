package ro.sci.Student_Repository;


import ro.sci.Student_Repository.Exceptions.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Catalog {

    HashMap<String, Student> studentCatalog = new HashMap<>();

    public void addStudent(String firstName, String lastName, String dateOfBirth, String gender, String cnp) {

        if (firstName == null || lastName == null || firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new NameMandatoryException();
        }
        if (!Objects.equals(gender, "M") && !Objects.equals(gender, "F") && !Objects.equals(gender, "m")
                && !Objects.equals(gender, "f")) {
            throw new GenderException();
        }
        DateTimeFormatter sourceFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, sourceFormat);

        if (birthDate.getYear() < 1900 || birthDate.getYear() > LocalDate.now().minusYears(18).getYear()) {
            throw new BirthYearException();
        }
        studentCatalog.put(cnp, new Student(firstName, lastName, dateOfBirth, gender, cnp));
    }

    public void deleteStudentByCNP(String cnp) {
        if (studentCatalog.containsKey(cnp)) {
            studentCatalog.remove(cnp);
        } else
            throw new NoSuchElementException();
    }

    public void listCatalog() {
        if (studentCatalog.isEmpty()) {
            throw new NoSuchElementException("No students to display");
        }
        System.out.println(Arrays.asList(studentCatalog));
    }

    public void listCatalogByLastName() {
        if (studentCatalog.isEmpty()) {
            throw new EmptyCatalogException();
        }
        TreeMap<String, Student> studentCatalogByLastName = new TreeMap<>();
        Set<String> cnpSet = studentCatalog.keySet();
        for (String cnp : cnpSet) {
            Student student = studentCatalog.get(cnp);
            studentCatalogByLastName.put(student.getLastName(), student);
        }

        System.out.println(Arrays.asList(studentCatalogByLastName));
    }
    //TODO birthdate si list by age X

    public void listCatalogByAge() {
        TreeMap<LocalDate, Student> studentCatalogByAge = new TreeMap<>();
        Set<String> cnpSet = studentCatalog.keySet();
        DateTimeFormatter sourceFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (String cnp : cnpSet) {
            LocalDate dateOfBirth = LocalDate.parse(studentCatalog.get(cnp).getDateOfBirth(), sourceFormat);
            Student student = studentCatalog.get(cnp);
            studentCatalogByAge.put(dateOfBirth, student);
        }
        System.out.println(Arrays.asList(studentCatalogByAge));
    }

    public void retrieveStudentsByAge(String ageFromDOB) {
        try {
            int age = Integer.parseInt(ageFromDOB);
            if(age < 0) {
                throw new AgeNumberFormatException("Age must be positive");
            }
            ArrayList<Student> studentByAge = new ArrayList<>();
            Set<String> cnpSet = studentCatalog.keySet();
            DateTimeFormatter sourceFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for(String cnp : cnpSet) {
                LocalDate dateOfBirth = LocalDate.parse(studentCatalog.get(cnp).getDateOfBirth(), sourceFormat);
                int ageOfStudent = Period.between(dateOfBirth, LocalDate.now()).getYears();
                if(ageOfStudent == age) {
                    studentByAge.add(studentCatalog.get(cnp));
                }
            }
            System.out.println(studentByAge);
        }
        catch (NumberFormatException exception) {
            throw new AgeNumberFormatException();
        }

    }

}
