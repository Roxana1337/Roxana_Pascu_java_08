package ro.sci.IO_Homework;

import java.time.Duration;

import static ro.sci.IO_Homework.Main.durationToString;

public class Contestant implements Comparable<Contestant> {
    String athleteName;
    Duration finalTime;
    String time;
    Duration penalties;

    public Contestant(String athleteName, Duration finalTime, String time, Duration penalties) {
        this.athleteName = athleteName;
        this.finalTime = finalTime;
        this.time = time;
        this.penalties = penalties;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public Duration getFinalTime() {
        return finalTime;
    }

    public String getTime() {
        return time;
    }

    public Duration getPenalties() {
        return penalties;
    }

    @Override
    public int compareTo(Contestant otherContestant) {
        return getFinalTime().compareTo(otherContestant.getFinalTime());
    }

    @Override
    public String toString() {
        return getAthleteName() + " " + durationToString(getFinalTime()) + " (" + getTime() + " + " + durationToString(getPenalties()) + ")";
    }

}