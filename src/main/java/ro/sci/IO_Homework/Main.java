package ro.sci.IO_Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contestant> contestants = new ArrayList<>();
        ArrayList<Contestant> finalScoreTable = new ArrayList<>();


        Path fileIn = new File("src/main/resources/tableScore.csv").toPath();
        try (BufferedReader reader = Files.newBufferedReader(fileIn)) {
            String line;
            while ((line = reader.readLine()) != null) {
                getContestantFromCsvLine(line).ifPresent(contestants::add);
            }
            Collections.sort(contestants);
            System.out.println("Winner - " + contestants.get(0));
            System.out.println("Runner-up - " + contestants.get(1));
            System.out.println("Third place - " + contestants.get(2));
        } catch (IOException x) {
            System.err.println("IOException: " + x);
        }
    }

    public static Optional<Contestant> getContestantFromCsvLine(String line) {
        String[] tokens = line.split(",");
        if (tokens.length != 7) {
            return Optional.empty();
        }
        String hits = tokens[4] + tokens[5] + tokens[6];
        Duration penalties = penalties(hits);

        return Optional.of(new Contestant(tokens[1], finalTime(tokens[3], penalties), tokens[3], penalties));
    }

    public static Duration finalTime(String time, Duration penalties) {
        int minutes = Integer.parseInt(time.substring(0, time.indexOf(':'))) * 60;
        int seconds = Integer.parseInt(time.substring(3));

        return Duration.ofSeconds(minutes + seconds).plus(penalties);

    }

    public static Duration penalties(String hits) {
        int count = 0;
        if (hits.contains("o")) {
            for (int i = 0; i < hits.length(); i++) {
                if (hits.charAt(i) == 'o') {
                    count++;
                }
            }
        }
        return Duration.ofSeconds(count * 10L);

    }


    public static String durationToString(Duration ceva) {
        return DateTimeFormatter.ISO_LOCAL_TIME.format(ceva
                .addTo(LocalTime.of(0, 0))).substring(3);
    }
}