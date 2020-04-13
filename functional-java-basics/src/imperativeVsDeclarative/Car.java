package imperativeVsDeclarative;

public class Car {
	private String carNumber;
	private String ownerName;
	public Car(String carNumber, String ownerName) {
		this.carNumber = carNumber;
		this.ownerName = ownerName;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
