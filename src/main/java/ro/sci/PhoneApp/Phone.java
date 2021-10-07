package ro.sci.PhoneApp;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Phone {

    ArrayList<Contacts> agenda = new ArrayList<>();
    HashMap<String, List<String>> messagesList = new HashMap<>();
    ArrayList<String> callHistory = new ArrayList<>();
    int battery = 100;
    String color;
    String material;

    public abstract void setColor(String color);
    public abstract void setMaterial(String material);
    public abstract String getColor();
    public abstract String getMaterial();



    public void addContact(String contactOrderNumber, String firstName, String lastName, String phoneNumber) {
        Contacts contact = new Contacts(contactOrderNumber, firstName, lastName, phoneNumber);
        agenda.add(contact);
    }

    public void listContacts() {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i).toString());
        }
    }

    public void sendMessage(String phoneNumber, String messageContent) {

        if (messageContent.length() < 500) {
            if (messagesList.containsKey(phoneNumber)) {
                messagesList.get(phoneNumber).add(messageContent);
                System.out.println("Remaining battery: " + battery);
                battery--;
                System.out.println(battery);
            } else {
                ArrayList<String> newList = new ArrayList<>();
                newList.add(messageContent);
                messagesList.put(phoneNumber, newList);
                battery--;
            }
        } else {
            System.out.println("Message character limit exceeded");
        }
    }



    public void listMessages(String phoneNumber) {

        System.out.println(messagesList.get(phoneNumber));
    }

    public void call(String phoneNumber) {

        callHistory.add(phoneNumber);
        battery -= 2;
        System.out.println("Remaining battery: " + battery);

    }

    public void viewHistory() {

        System.out.println(callHistory);
    }
}
