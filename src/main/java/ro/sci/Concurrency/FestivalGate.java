package ro.sci.Concurrency;

public class FestivalGate {
    int gateFULL;
    int gateFULL_VIP;
    int gateFREE_PASS;
    int gateONE_DAY;
    int gateONE_DAY_VIP;
    int totalTickets;


    public synchronized void addTicket(TicketType ticketType) {
        switch (ticketType) {
            case FULL:
                gateFULL++;
                totalTickets++;
                break;
            case ONE_DAY:
                gateONE_DAY++;
                totalTickets++;
                break;
            case FULL_VIP:
                gateFULL_VIP++;
                totalTickets++;
                break;
            case FREE_PASS:
                gateFREE_PASS++;
                totalTickets++;
                break;
            case ONE_DAY_VIP:
                gateONE_DAY_VIP++;
                totalTickets++;
                break;
        }
    }
    public String toString() {

        return String.valueOf(totalTickets);
    }
}
