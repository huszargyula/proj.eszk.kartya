package hu.elte.projeszk.server;

/**
 * 
 * @author scherzne
 *
 */
public class PlayerThread extends Thread {
	private Player player;
	private PlayerManagerThread manager;

	public PlayerThread(Player player, PlayerManagerThread manager) {
		super("player-"+player.getId());
		this.player = player;
		this.manager = manager;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
	
}
