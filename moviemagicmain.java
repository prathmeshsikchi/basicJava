import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class moviemagicmain {
    public static void main(String[] args) throws IOException {
        MovieMagic m = new MovieMagic();
        m.display();
    }
}

class MovieMagic {
    int year;
    String title;
    float rating;

    MovieMagic() {
        year = 0;
        title = "";
        rating = 0;
    }

    void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Year : ");
        year = Integer.parseInt(br.readLine());
        System.out.println("Enter Moview Title : ");
        title = br.readLine();
        System.out.println("Enter Rating : ");
        rating = Float.parseFloat(br.readLine());
    }

    void display() throws IOException {
        accept();
        System.out.println("Year : ");
        System.out.println("Title : ");
        System.out.println("Rating : ");
        String message = "";
        if (rating >= 0.0 && rating <= 2.0) {
            message = "flop";
        } else if (rating >= 2.1 && rating <= 3.4) {
            message = "Semi-hit";
        } else if (rating >= 3.5 && rating <= 4.5) {
            message = "hit";
        } else if (rating >= 4.5 && rating <= 5.0) {
            message = "super-hit";
        }
        System.out.println(message);

    }
}