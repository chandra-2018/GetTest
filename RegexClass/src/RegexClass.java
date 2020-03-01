import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("java*eveloper","JavaDeveloper"));
		System.out.println(Pattern.matches("f*java*or", "javafor"));
		
		Pattern pattern=Pattern.compile("good");
		Matcher m=pattern.matcher("good is good");
		
		while (m.find()) {
			System.out.println( " PATTERN FOUND FROM " +m.start() +"to"+(m.end()-1));
		}
		
	}

}
