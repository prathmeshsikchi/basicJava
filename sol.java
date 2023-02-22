import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
//}{
// ([)]()[][()()]
class Parser {
    static String isBalanced(String s) {
        int counter = 0;
        int a = s.length();
        for (int i = 0; i < a; i++) {
            char c = s.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                counter++;
            } else if (c == '}' || c == ']' || c == ')') {
                counter--;
                if (counter < 0) {
                    return "false";
                }
            }
        }
        if (counter == 0)
            return "true";
        else
            return "false";
    }

}

class sol {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
