package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	
	private UUID TableID;
	protected ArrayList<Player> players = new ArrayList<Player>();
	
	public Table()
	{
		TableID = UUID.randomUUID();
	}
	
	public Table(UUID tableID, ArrayList<Player> players) {
		super();
		TableID = tableID;
		this.players = players;
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

	public Table AddPlayerToTable(Player p)
	{
		players.add(p);
		return this;
	}
	
	
}
