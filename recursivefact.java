public class recursivefact {

    static int fact(int a, int mul) {
        if (a > 0) {
            mul *= a;
            fact(a - 1, mul);
        }
        System.out.println(mul);
        return mul;
    }

    public static void main(String[] args) {
        int a = 20, mul = 1;
        int cal = fact(a, mul);

        System.out.println(cal);

    }

}
