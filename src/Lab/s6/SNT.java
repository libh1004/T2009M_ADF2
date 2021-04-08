package Lab.s6;

public class SNT {
    int n1 = 2;
    int n2 = 2;

    public synchronized void timSNT() {
        for (int i = n1+1; true; i++) {
            if (n1 % i != 0);
            System.out.println(n1+" ");
            break;
        }
        n1+=1;
        n2=n1;

    }





}

