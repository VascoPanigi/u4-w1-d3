package es2.entities;

public class Call {
    private int duration;
    private int numberCalled;
    private Call[] callHistory;

    public Call(int duration, int numberCalled) {
        this.duration = duration;
        this.numberCalled = numberCalled;
        this.callHistory = new Call[5];
    }

    public void createRegister(Call c1, Call c2, Call c3, Call c4, Call c5) {
        callHistory[0] = c1;
        callHistory[1] = c2;
        callHistory[2] = c3;
        callHistory[3] = c4;
        callHistory[4] = c5;
    }

    public int getNumberCalled() {
        return numberCalled;
    }

    public void setNumberCalled(int numberCalled) {
        this.numberCalled = numberCalled;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Call[] getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(Call[] callHistory) {
        this.callHistory = callHistory;
    }
}
