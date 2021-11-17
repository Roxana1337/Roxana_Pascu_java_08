package ro.sci.Java_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<People> people = new ArrayList<>();

        Path fileIn = new File("src/main/resources/in.csv").toPath();
        try (BufferedReader reader = Files.newBufferedReader(fileIn)) {
            String line;
            String month = "9";
            while ((line = reader.readLine()) != null) {
                getPerson(line, month).ifPresent(people::add);
            }
            Collections.sort(people);
            people.stream().map(People::toString).forEach(System.out::println);
        } catch (IOException x) {
            System.err.println("IOException: " + x);
        }
    }

    public static Optional<People> getPerson(String line, String month) {
        String[] tokens = line.split(",");
        if (tokens.length != 3) {
            return Optional.empty();
        }
        if (getMonthFromDateOfBirth(tokens[2]).equals(Month.of(Integer.parseInt(month)))) {
            return Optional.of(new People(tokens[0], tokens[1], getMonthFromDateOfBirth(tokens[2])));
        }
        return Optional.empty();

    }

    private static Month getMonthFromDateOfBirth(String date) {
        String month = date.substring(3, 5);
        return Month.of(Integer.parseInt(month));
    }
}
