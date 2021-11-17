package ro.sci.Java_8;

import java.time.Month;

public class People implements Comparable<People> {
    String surname;
    String name;
    Month month;

    public People(String surname, String name, Month month) {
        this.surname = surname;
        this.name = name;
        this.month = month;

    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Month getMonth() {
        return month;
    }

    @Override
    public int compareTo(People otherPerson) {
        return getName().compareTo(otherPerson.getName());
    }

    public String toString() {
        return getSurname() + ", " + getName();
    }
}
