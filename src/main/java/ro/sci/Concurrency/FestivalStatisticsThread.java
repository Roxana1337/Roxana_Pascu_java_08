package ro.sci.Concurrency;

public class FestivalStatisticsThread implements Runnable {

    private final FestivalGate gate;
    private final int counter;

    public FestivalStatisticsThread(FestivalGate gate, int counter) {
        this.gate = gate;
        this.counter = counter;
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total attendees: " + gate);
            System.out.println(gate.gateFULL + " people have full tickets");
            System.out.println(gate.gateFULL_VIP + " have full VIP passes");
            System.out.println(gate.gateFREE_PASS + " have free passes");
            System.out.println(gate.gateONE_DAY + " have one-day passes");
            System.out.println(gate.gateONE_DAY_VIP + " have one-day VIP passes");
        } while (gate.totalTickets < 100);
    }
}
