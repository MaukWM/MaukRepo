package ss.week1.hotel;

/**
 * Hotel guest with a name and possibly a hotel room.
 * @author Mauk
 * @version 1.0
 */
public class Guest {
	// ------------------ Constructor ----------------
	
	private String guestName;
	private Room room;
	
	/**
     * Creates a Guest with the given name and without Room.
     * @param n name of the new Guest
     */
	public Guest(String n) {
		guestName = n;
	}
	
	// ------------------ Queries --------------------------
	
	/**
	 * Rents a Room to this Guest. This is only possible if this Guest does not already have a Room
	 * and the Room to be assigned is not already rented. Also adapts the Guest-reference of the Room.
	 * @param r Room to be rented to this Guest; may not be null
	 * @return true if checkin succeeded; 
	 * false if this Guest already had a Room, 
	 * or r already had a Guest.
	 */
	public boolean checkin(Room r) {
		
		if (r.getGuest() == null){
			r.setGuest(this);
			room = r;
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Sets the Room of this Guest to null. Also resets the Guest-reference of the (current) Room.
	 * @return true if this action succeeded; false if Guest does not have a Room when this method is called
	 */
	public boolean checkout() {
		if (room == null) {
			return false;
		}else{
			room.setGuest(null);
			room = null;
			return true;
		}
	}
	
	/**
	 * Returns the name of this Guest.
	 * @return The name of this Guest.
	 */
	public String getName() {
		return guestName;
	}
	
	/**
	 * Returns the Room that is rented by this Guest.
	 * @return Room rented by this Guest; null if this Guest does not rent a room
	 */
	public Room getRoom() {
		if (room == null) {
			return null;
		}else{
			return room;
		}
	}
	
	/**
	 * Returns a string representation of the object.
	 */
	public String toString() {
	return ("Guest " + guestName);
	}
}
