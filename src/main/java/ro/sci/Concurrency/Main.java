package ro.sci.Concurrency;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Thread> threadList = new ArrayList<>();
        Random rnd = new Random();
        int counter = rnd.nextInt(100000) + 100;

        FestivalGate gate = new FestivalGate();

        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate, counter);
        Thread t1 = new Thread(statsThread);
        t1.start();
        for (int i = 0; i < 100; i++) {
            Thread.sleep(250);
            threadList.add(new Thread(new FestivalAttendeeThread(TicketType.randomTicket(), gate)));
            threadList.get(i).start();
        }
    }
}
