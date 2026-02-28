package parkingSystem;

import java.util.ArrayList;

public class ParkingLot {
	private ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
	
	//Constructors
	ParkingLot(ArrayList<ParkingSpot> parkingSpots){
		parkingSpots = this.parkingSpots;
		return;
	}
	ParkingLot(){}
	
	//Methods
	public ArrayList<ParkingSpot> getParkingSpots() { return parkingSpots; }
	
	public void addParkingSpot(ParkingSpot spot){ parkingSpots.add(spot); }
	
	//Removes the last parking spot to be added
	public void removeParkingSpot() {
		if(parkingSpots.size() < 1) {
			throw new IllegalArgumentException("Cannot remove parking spot from an empty list!");
		}
		else {
			parkingSpots.remove(parkingSpots.size() - 1);
		}
	}
	
	//Removes the parking spot specified
	public void removeParkingSpot(ParkingSpot spot) {
		parkingSpots.remove(spot);
	}
	
}