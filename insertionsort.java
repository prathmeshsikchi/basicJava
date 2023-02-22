public class insertionsort {
    public static void main(String[] args) {
        int a[] = { 43, 32, 21, 2, 1, 5 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }

    }
}
