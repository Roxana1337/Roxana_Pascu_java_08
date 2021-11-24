package ro.sci.Concurrency;

public class FestivalAttendeeThread implements Runnable {
    TicketType ticketType;
    FestivalGate gate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {
        gate.addTicket(ticketType);
    }
}
