package constructor;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House myhouse = new House("Green House");
		myhouse.livingRoom();
		
		House yourHouse = new House();
		
		House theirHouse = new House("Downstreet", 30);
	}

}
