package ro.sci.PhoneApp;

public class Main {

    public static void main(String[] args) {

        Phone phone = new SamsungGalaxy6();
        phone.addContact("1", "Popescu", "Ionel", "0749485264");

        phone.addContact("2", "Stanescu", "Gigel", "0756359826");

        phone.listContacts();


        // send a message to the first contact from the previous listed

        // max number of characters - 100

        phone.sendMessage("0749485264", "This is a message");

        phone.listMessages("0749485264");
//
//
        // send a message to the second contact from the previous listed

        phone.call("0756359826");

        phone.viewHistory();
    }
}