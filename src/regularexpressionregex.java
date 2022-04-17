import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regularexpressionregex {
    public static void main(String[]args)
    {
        Pattern pattern=Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);//we are searchin w3schools,Pattern.compile() is used to find the pattern,first parameter is the thing to be seached and second parameter is optional
        Matcher matcher=pattern.matcher("Visit W3Schools!");//searches a pattern for string
        boolean matchFound=matcher.find();//find keyword returns true if pattern is matched else returns false
        if(matchFound)System.out.println("Match found");
        else System.out.println("Match not found");
    }
}
