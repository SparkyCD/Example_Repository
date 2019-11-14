
public class Driver {
	private ParkingPass pass;
	private int licensePlate;
	private boolean onCampus;
	private int gNumber;
	private String fullName;
	public Driver() {
		
	}
	
	public Driver(ParkingPass pass, int licensePlate, boolean onCampus, int gNumber, String fullName) {
		this.pass = pass;
		this.licensePlate = licensePlate;
		this.onCampus = onCampus;
		this.gNumber = gNumber;
		this.fullName = fullName;
		
	}
}
