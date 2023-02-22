import java.util.*;
import java.text.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String s = in.readLine();

        int a[] = new int[11];

        if (n == 11 && s.charAt(10) == '7') {
            int index = 0;
            int leng = s.length() - 1;
            for (int i = 0; i < leng; i++) {
                char c = s.charAt(i);
                String ch = c + "";
                int ar = Integer.parseInt(ch);
                int counter = 0;

                for (int j = 0; j < a.length; j++) {
                    if (ar == a[j]) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    a[index] = ar;
                    index++;
                }
            }

            int x = 10;
            int y = index;
            int z = 10 - index;
            int xf = 1;
            int yf = 1;
            int zf = 1;

            for (int i = 1; i <= x; i++) {
                xf *= i;
            }
            for (int i = 1; i <= y; i++) {
                yf *= i;
            }
            for (int i = 1; i <= z; i++) {
                zf *= i;
            }

            int combination = xf / (yf * zf);

            System.out.println(combination);

        } else {
            System.out.println(0);
        }

    }
}