import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jobs2d {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter How Many jobs are there : ");
        int jobs = Integer.parseInt(br.readLine());
        int jobsinfo[][] = new int[jobs][3];
        int index[][] = new int[jobs][jobs];
        int counter = 0;

        for (int i = 0; i < jobs; i++) {
            jobsinfo[i][0] = Integer.parseInt(br.readLine());
            jobsinfo[i][1] = Integer.parseInt(br.readLine());
            jobsinfo[i][2] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < jobs; i++) {
            for (int j = i + 1; j < jobs; j++) {
                int temp = 0;
                if (jobsinfo[j][0] < jobsinfo[i][0]) {
                    temp = jobsinfo[i][0];
                    jobsinfo[i][0] = jobsinfo[j][0];
                    jobsinfo[j][0] = temp;

                    temp = jobsinfo[i][1];
                    jobsinfo[i][1] = jobsinfo[j][1];
                    jobsinfo[j][1] = temp;

                    temp = jobsinfo[i][2];
                    jobsinfo[i][2] = jobsinfo[j][2];
                    jobsinfo[j][2] = temp;
                }
            }
        }

        int total_profitm = 0;

        for (int i = 0; i < jobs; i++) {
            total_profitm += jobsinfo[i][2];
        }
        int available_jobs = jobs;
        int compare_list[][] = new int[jobs][2];
        int pointer = 0;
        int total_profit = 0;

        for (int i = 0; i < jobs; i++) {
            counter = 0;
            available_jobs = jobs;
            total_profit = total_profitm;
            total_profit -= jobsinfo[i][2];
            pointer = i;
            available_jobs--;
            index[i][counter] = pointer;
            counter++;

            for (int j = i + 1; j < jobs; j++) {
                if (jobsinfo[j][0] > jobsinfo[pointer][1]) {
                    pointer = j;
                    available_jobs--;
                    total_profit -= jobsinfo[j][2];
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
            System.out.println(jobsinfo[i][0] + "\t" + jobsinfo[i][1] + "\t" + jobsinfo[i][2]);
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
