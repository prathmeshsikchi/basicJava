import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jobs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter How Many jobs are there : ");
        int jobs = Integer.parseInt(br.readLine());
        int start_time[] = new int[jobs];
        int end_time[] = new int[jobs];
        int profit[] = new int[jobs];
        int index[][] = new int[jobs][jobs];

        for (int i = 0; i < jobs; i++) {
            start_time[i] = Integer.parseInt(br.readLine());
            end_time[i] = Integer.parseInt(br.readLine());
            profit[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < jobs; i++) {
            for (int j = i + 1; j < jobs; j++) {
                int temp = 0;
                if (start_time[j] < start_time[i]) {
                    temp = start_time[i];
                    start_time[i] = start_time[j];
                    start_time[j] = temp;

                    temp = end_time[i];
                    end_time[i] = end_time[j];
                    end_time[j] = temp;

                    temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;
                }
            }
        }

        int total_profitm = 0;

        for (int i = 0; i < jobs; i++) {
            total_profitm += profit[i];
        }
        int available_jobs = jobs;
        int compare_list[][] = new int[jobs][2];
        int pointer = 0;
        int total_profit = 0;
        int counter = 0;

        for (int i = 0; i < jobs; i++) {
            counter = 0;
            available_jobs = jobs;
            total_profit = total_profitm;
            total_profit -= profit[i];
            pointer = i;
            available_jobs--;
            index[i][counter] = pointer;
            counter++;

            for (int j = i + 1; j < jobs; j++) {
                if (start_time[j] > end_time[pointer]) {
                    pointer = j;
                    available_jobs--;
                    total_profit -= profit[j];
                    index[i][counter] = pointer;
                    counter++;
                }
            }
            compare_list[i][0] = total_profit;
            compare_list[i][1] = available_jobs;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < jobs; i++) {
            System.out.println(compare_list[i][0] + "\t" + compare_list[i][1]);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < jobs; i++) {
            System.out.println(start_time[i] + "\t" + end_time[i] + "\t" + profit[i]);
        }

        int min_profit = compare_list[0][0];
        int avj = 0;
        int totp = 0;

        int z = 0;

        for (int i = 0; i < jobs; i++) {
            if (min_profit > compare_list[i][0]) {
                min_profit = compare_list[i][0];
                avj = compare_list[i][1];
                totp = compare_list[i][0];
                z = i;
            }
        }

        for (int i = 0; i < jobs; i++) {
            System.out.print("\t" + index[z][i]);
        }

        System.out.println("Jobs Remaing : " + avj);
        System.out.println("Cost remaing : " + totp);

    }
}
