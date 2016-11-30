package ss.week3.pw;

public class StrongChecker implements Checker {
	
	public boolean acceptable(String suggestion) {
		if (suggestion.contains(" ") || suggestion.length() < 7 || isChar(suggestion)  {
			return false;
		}else{
			return true;}
		}
	}


