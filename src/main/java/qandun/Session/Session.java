package qandun.Session;

import qandun.Participant.Participant;

public class Session {

    private Participant[] participants;

    public Session(Participant[] participants) {

        this.participants = new Participant[(int) (Math.pow(2, 8) - 1)];

    }

    public Participant[] getParticipants() {

        return participants;

    }

    public void setParticipant(Participant participant) {

        this.participants[participant.id] = participant;

    }

    public Participant getParticipant(int id) {

        return participants[id];

    }

    public void removeParticipant(int id) {

        participants[id] = null;

    }

}
