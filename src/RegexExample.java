import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        //Define regular expression pattern
        String regex = "\\bcat\\b";

        //Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        //Input String
        String input = "The cat sat on the mat";

        //Matcher for input string
        Matcher matcher = pattern.matcher(input);

        //Check if the pattern matches
        boolean found = matcher.find();

        if (found) {
            System.out.println("Match found!!");
        } else {
            System.out.println("No match found.");
        }

        matcher.reset();
        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }
    }
}
