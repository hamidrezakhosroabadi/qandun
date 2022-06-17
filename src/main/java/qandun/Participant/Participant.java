package qandun.Participant;

import qandun.Hash.Hash;

public class Participant {

    public final int id;
    public final String name;
    public final String ip;
    public final int port;

    public Participant(String name, String ip, int port) throws Exception {

        byte[] hashBytes = Hash.getSHA(ip);
        this.id = Hash.getFirstByte(hashBytes);
        this.name = name;
        this.ip = ip;
        this.port = port;
        
    }

}
