public class maxOcurrunces {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2, 2 };
        int b[] = new int[a.length];
        int c[] = new int[a.length];

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    counter++;
                }
            }
            if (counter == 0) {
                b[index] = a[i];
                index++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            c[i] = count;
        }

        int won = 0;
        int max = 0;
        for (int i = 0; i < b.length; i++) {
            if (max < c[i]) {
                max = c[i];
                won = b[i];
            }
        }

        System.out.println("Canditae Won : " + won);

    }
}
