package es2;

import es2.entities.Call;
import es2.entities.Sim;

public class Main {
    public static void main(String[] args) {
        Call call1 = new Call(20, 3454323);
        Call call2 = new Call(30, 3454323);
        Call call3 = new Call(40, 3454323);
        Call call4 = new Call(50, 3454323);
        Call call5 = new Call(60, 3454323);

        call1.createRegister(call1, call2, call3, call4, call5);


        Sim sim1 = new Sim(78951125, call1.getCallHistory());

        sim1.getSimData();
    }
}
