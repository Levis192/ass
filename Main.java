package adventure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Grid grid = new Grid();
	//Player player = new Player;
	
	Player maincharacter = new Player(4,2);
	Treasure treasure = new Treasure (9,9);
	
	maincharacter.getPositionx();
	treasure.getPositionx();
	
	grid.method(maincharacter, treasure);
	
	
	

	
	
	

	}

}
