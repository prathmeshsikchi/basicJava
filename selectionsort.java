import java.io.*;

public class selectionsort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int len = Integer.parseInt(br.readLine());

        int a[] = new int[len];

        System.out.println("Enter numbers : ");
        for (int i = 0; i < len; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }

            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }

        System.out.println("Sorted Array is : ");
        for (int i = 0; i < len; i++) {
            System.out.print("\t" + a[i]);
        }

    }
}
