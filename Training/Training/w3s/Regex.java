package w3s;
import java.util.regex.*;




public class Regex {

	public static void main(String[] args) {
		
		
		String string = "Gute Menschen lernen java";
		Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(string);
		
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("Found");
		}else System.out.println("Not Found");
		
	}

}
