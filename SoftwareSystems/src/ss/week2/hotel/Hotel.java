package ss.week2.hotel;

public class Hotel {
	
	public String hotelName;
	public String f;
	public String g;
	public Password password;
	public Room room1;
	public Room room2;
	
	//@ public invariant room1 != null;
	//@ public invariant room2 != null;
	//@ public invariant password != null;
	public Hotel(String hotelName) {
		password = new Password();
		room1 = new Room(1);
		room2 = new Room(2);
		this.hotelName = hotelName;
		
	}

	//@ requires password != null;
	//@ requires guestName != null;
	//@ ensures this.password.testWord(password) == false || getFreeRoom() == null || getRoom(guestName) != null;
	public Room checkIn(String password, String guestName) {
		if (this.password.testWord(password) == false || getFreeRoom() == null || getRoom(guestName) != null) {
			return null;
		}else{
			Room room = getFreeRoom();
			new Guest(guestName).checkin(room);
			return room;
		}
	}
	
	//@ requires guestName != null;
	public void checkOut(String guestName) {
		if (getRoom(guestName) != null) {
			getRoom(guestName).getSafe().deactivate();
			getRoom(guestName).getGuest().checkout();
		}
	}
	
	//@ ensures \result == room1 || \result == null || \result == room2;
	//@ ensures \result == null || \result.getGuest() == null;
	public Room getFreeRoom() {
		if (room1.getGuest() != null && room2.getGuest() != null){
			return null;
		}else if (room1.getGuest() == null) {
			return room1;
		}else{
			return room2;
		}
	}
	
	//@ ensures \result == room1 || \result == null || \result == room2;
	//@ ensures \result == null || \result.getGuest() == null;
	public Room getRoom(String guestname) {
		if ((room1.getGuest() == null || room1.getGuest().getName() != guestname) && (room2.getGuest() == null || room2.getGuest().getName() != guestname)) {
			return null;
		}else if (room1.getGuest().getName() == null) {
			return room2;
		}else{
			return room1;
		}
	}
	
	//@ pure;
	public Password getPassword() {
		return password;
	}
	
	//@ pure;
	public String getHotelName() {
		return hotelName;
	}
	
	//@ pure;
	public String toString() {
		if (room1.getGuest() == null) {
			g = "nobody";
		}else{
			g = ("Guest in room 1: " + room1.getGuest().getName());
		}
		if (room2.getGuest() == null) {
			f = "nobody";
		}else{
			f = ("Guest in room 2: " + room2.getGuest().getName());
		}
		return (g + "Safe status: " + room1.getSafe().isActive() + f + "Safe status: " + room2.getSafe().isActive());
	}
}
