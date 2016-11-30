package ss.week1;

public class Password {
	
	public static final String INITIAL = "INITIAL";
	private String Password;
	
	public Password() {
		Password = INITIAL;
	}
	
	public boolean acceptable(String suggestion) {
		if (suggestion.contains(" ") || suggestion.length() < 7) {
			return false;
		}else{
			return true;}
		}
	
	public boolean setWord(String oldpass, String newpass) {
		if (oldpass == this.Password && acceptable(newpass)) {
			this.Password = newpass;
			return true;
		}else{
			return false;}
		}
	
	public boolean testWord(String test) {
		if (this.Password.equals(test)) {
			return true;
		}else{
			return false;}
		}
	}


