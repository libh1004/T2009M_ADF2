package session.s2;

public class DemoGeneric<X> {
    X name;

    // khai bao dang generic
    public <E> void sendMessage(E msg){
        System.out.println(msg);
    }
}
