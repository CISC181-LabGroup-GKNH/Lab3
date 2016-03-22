package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game extends Table{
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	Game(UUID gameID, UUID tableID, ArrayList<Player> players) {
		super();
		GameID = gameID;
		TableID = tableID;
		this.players = players;
	}

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	public void AddPlayerToGame(Table table, Player player){
		Player.addAll(table.players);
	}
	
	
}
