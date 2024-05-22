package es2.entities;

import java.util.Random;

public class Sim {
    private int telephoneNumber;
    private int credit;
    private Call[] register;

    public Sim(int telephoneNumber, Call[] register) {
        Random random = new Random();
        this.telephoneNumber = telephoneNumber;
        this.credit = random.nextInt(1, 10);
        this.register = register;
    }

    public void getSimData() {
        System.out.println("Your number is: " + this.telephoneNumber);
        System.out.println("The available credit in your SIM is: " + this.credit);

        for (Call call : this.register) {
            System.out.println("Number called: " + call.getNumberCalled() + ", Duration: " + call.getDuration());
        }

    }

}
