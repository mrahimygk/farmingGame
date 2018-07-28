import player.*;
import util.*;
class Main {
	public static void main(String[] args){
		
		Player player = new Player("ali");
		System.out.println("player is " + player);

		crop.Crop turnipCrop = new crop.Turnip();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();

		harvest.Turnip turnip = (harvest.Turnip) turnipCrop.harvest();
		player.putToInventory(turnip);
		System.out.println("added to player inv " + player);

		Pair<Energy, Health> consumedData = turnip.consume();
		System.out.println(consumedData.toString());
		player.removeFromInventory(turnip);
		System.out.println("removed from inv . player is " + player);
		player.devour(consumedData);	
		System.out.println("consumed , player is " + player);	

		harvest.Turnip t = new harvest.Turnip(2);
		player.putToInventory(t);
		harvest.Turnip t2 = new harvest.Turnip(2);
		player.putToInventory(t2);
		System.out.println("mock inv add, player is " + player);	
		
	}
}