public class inh {
    public static void main(String[] args) {
        second z = new second();

        System.out.println(z.c);
        System.out.println(z.a);
        System.out.println(z.b);

        z.print_one();
        z.print_two();
    }
}

class first {
    int a = 10;
    int b = 20;

    void print_one() {
        System.out.println("Class First");
    }

}

class second extends first {
    int c = 30;

    void print_two() {
        System.out.println("Class Second");
    }
}
