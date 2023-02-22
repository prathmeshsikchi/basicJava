class B {
    B ob() {
        return this;
    }

    void msg() {
        System.out.println("null");
    }
}

class obj {
    public static void main(String[] args) {
        System.out.println(new B());
        System.out.println(new B());
    }
}