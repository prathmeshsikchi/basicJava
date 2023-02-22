class Dog {
    Dog() {
    }

    Dog(int z) {
        a = z;
    }

    int a = 10;
    float b = 20.4f;
    String c = "Welcome";

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class cls {
    public static void main(String[] args) {
        Dog z = new Dog(50);
        System.out.println(z.a);
    }
}
