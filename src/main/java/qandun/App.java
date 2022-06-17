package qandun;

import qandun.Participant.Participant;

public class App {
    public static void main(String[] args) {
        try {
            Participant p = new Participant("John", "192.168.256.12", 0);
            System.out.println(p.id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
