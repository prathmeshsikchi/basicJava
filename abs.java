import javax.crypto.interfaces.PBEKey;

public class abs {
    public static void main(String[] args) {
        Z bh = new Z();
        bh.abcd();
    }
}

interface a {
    public void abcd();
}

interface b {
    public void xyz();
}

class Z implements a,b {
    public void abcd() {
        System.out.println("abcd method");
    }

    public void xyz() {
        System.out.println("xyz method");
    }
}