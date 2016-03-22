package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Player {

	private UUID PlayerID;
	private String PlayerName;
	private int PlayerPosition;
	
	public Player(String strPlayerName)
	{
		PlayerID = UUID.randomUUID();
		this.PlayerName = strPlayerName;
		
	}
	
	public Player(String strPlayerName, int position){
		this(strPlayerName);
		this.PlayerPosition = position;
	}

	public UUID getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getPlayerPosition() {
		return PlayerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		PlayerPosition = playerPosition;
	}

	public static void addAll(ArrayList<Player> players) {
		for(int i = 0; i < 5; i++){
			Player.addAll(players);
		}
		
	}
	
	
	
}
