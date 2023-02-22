import java.io.*;

public class series1 {
    public static void main(String[] args) throws IOException {
        int n, x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n : ");
        n = Integer.parseInt(br.readLine());
        System.out.println("Enter x : ");
        x = Integer.parseInt(br.readLine());

        int b = 1;
        float sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= ((2 * i + 1) / (b - Math.pow(x, 2 * i - 2)));
            } else {
                sum += ((2 * i + 1) / (b + Math.pow(x, 2 * i - 2)));
            }
            b += 3;
        }

        System.out.println(sum);
    }
}
