import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class sameline {
    public static void main(String[] args) throws IOException {
        int a[] = new int[100];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("null");
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

    }
}
