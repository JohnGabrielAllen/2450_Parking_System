package parkingSystem;


/**
 * This class represents a generic user for the ParkingSystem program.
 * The notable parameter is accessLevel which governs the authority level of the user.
 * With 0 being no special access
 * @author SpencerJPeck
 */
public class User {
	//==================================
	//= FIELDS
	//==================================

	/**
	 * Tracks the User's unique ID
	 * (Currently Unused)
	 */
	private String userID;
	/**
	 * The mailing address of the User
	 */
	private String address;
	/**
	 * The First Name of the User
	 */
	private String fname;
	/**
	 * The Last Name of the User
	 */
	private String lname;
	/**
	 * The Preferred Phone Number of the User
	 */
	private String phoneNum;
	/**
	 * The List of Cars registered to the User
	 */
	//private Array<Car> cars;
	/**
	 * The level of access of the User
	 * With 0 being a standard paying customer
	 */
	private int accessLevel;
	
	
	//==================================
	//= GETTERS AND SETTERS
	//==================================
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}
	public String getUserID() {
		return userID;
	}
	public String getFname() {
		return fname;
	}

	//==================================
	//= CONSTRUCTERS
	//==================================

	public User(String address, String fname, String lname, String phoneNum, int accessLevel) {
		this.address = address;
		this.fname = fname;
		this.lname = lname;
		this.phoneNum = phoneNum;
		this.accessLevel = accessLevel;
	}

	//==================================
	//= METHODS
	//==================================
	
}
