package constructor;

public class House {
	String houseName = "White House";
	int houseAddress = 0;
	//Constructor-1
	public House() {

	}
	//Constructor-2
	public House(String houseName) {
		this.houseName = houseName;
		System.out.println(houseName);
	}
	//Constructor-3
	public House(String houseName, int houseAddress) {
		this.houseName = houseName;
		this.houseAddress = houseAddress;
		System.out.println(houseName + " " + houseAddress);
	}

	public void livingRoom() {
		System.out.println("Watch TV");
	}

	public void displayHouseName() {
		System.out.println(houseName);
	}

}
