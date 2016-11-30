package ss.week2.hotel;

public class Safe {

	private Password password;
	public boolean setActive;
	public boolean setOpen;
	public boolean isActive;
	public boolean isOpen;
	
	
	public Safe() {
		isActive = false;
		isOpen = false;
		password = new Password();
	}
	
	public Safe(boolean setActive, boolean setOpen) {
		isActive = setActive;
		isOpen = setOpen;
		password = new Password();
	}
	
	public static void main(String[]args) {
		Safe pvsafe = new Safe();
		pvsafe.open(null);
	}
	
	//@ requires password != null;
	//@ ensures ((getPassword().testWord(password)) || \old(isActive()));
	public void activate(String password) {
		assert password != null;
		if (true == ((getPassword().testWord(password)) || (isActive()))) {
			assert true == (getPassword().testWord(password)) || (isActive());
			isActive = true;
		}else{
			assert false == (getPassword().testWord(password)) || (isActive());
			isActive = false;
		}
	}
	
	//@ ensures false == isActive();
	//@ ensures false == isOpen();
	public void deactivate() {
		isActive = false;
		isOpen = false;
		assert false == isActive();
		assert false == isOpen();
	}
	
	//@ requires password != null;
	//@ ensures ((getPassword().testWord(password)) && (\old(isActive())) || \old(isOpen()));
	public void open(String password) {
		assert password != null;
		if (((getPassword().testWord(password)) && (isActive()) || (isOpen()))) {
			assert true == ((getPassword().testWord(password)) && (isActive()) || (isOpen()));
			isOpen = true;
		}else{
			assert false == ((getPassword().testWord(password)) && (isActive()) || (isOpen()));
			isOpen = false;
		}
	}
	
	//@ ensures false == isOpen();
	public void close() {
		isOpen = false;
		assert false == isOpen();
	}
	
	//@ pure
	public boolean isActive() {
		return isActive;
	}
	
	//@ pure
	public boolean isOpen() {
		return isOpen;
	}
	
	//@ pure
	public Password getPassword() {
		return password;
	}
}








