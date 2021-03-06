package day_1_hcl;

class Player {
	private int id;
	private String name;
	private int rank;
	
	private static int playerCounter;

	public Player(String name, int rank) {
		
		this.id = ++playerCounter;
		this.name = name;
		this.rank = rank;
	}
	
	public void printPlayer() {
		System.out.println("Player details " + id + " " + name + " " + rank);
	}
	
	//inside static method u dont have this ref.
	//i.e., inside static method we cant access instance var.
	public static int getCounter() {	
		return playerCounter;
	}
}



public class DemoPlayerStatic {
	
	public static void main(String[] args) {
		
		Player player = new Player("sachin", 101);
		Player player1 = new Player("dhoni", 102);
		Player player2 = new Player("kohli", 103);
		System.out.println(player.getCounter());
		System.out.println(player1.getCounter());
		System.out.println(player2.getCounter());
		
	}
}
