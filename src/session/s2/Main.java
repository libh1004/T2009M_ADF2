package session.s2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DemoGeneric<String> dg = new DemoGeneric();
        dg.sendMessage("hello");
        dg.sendMessage(123);
        dg.name = "hello";
        DemoGeneric<Integer> dg2 = new DemoGeneric<>();
        dg2.name = 12;
        ArrayList<String> str = new ArrayList<>();

        ArrayList ar = new ArrayList();
    }
}
