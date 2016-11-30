package ss.week3.pw;

public class BasicChecker implements Checker {
	
	public static final String INITIAL = "INITIAL";
	
	public boolean acceptable(String suggestion) {
		if (suggestion.contains(" ") || suggestion.length() < 7) {
			return false;
		}else{
			return true;}
		}
	}


