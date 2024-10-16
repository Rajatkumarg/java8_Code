package a_java8_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import z_entity.Player;

public class P8 {

	public static void main(String[] args) {
		Player p1 = new Player(25,3,"Kohli");
		Player p2 = new Player(30,2,"Dhoni");
		Player p3 = new Player(35,1,"Sachin");
		Player p4 = new Player(22,4,"Surya");
		Player p5 = new Player(45,5,"Ganguli");
		Player p6 = new Player(45,5,"Harbhajan");
		List<Player> playerList = Arrays.asList(p1, p2, p3, p4, p5, p6);
		System.out.println(playerList);
//		playerList.sort(new Player());//Comparator
//		Collections.sort(playerList);//Comparable
//		Collections.sort(playerList, p1);//Comparator
		
//		Collections.sort(playerList, new Comparator<Player>() {
//			@Override
//			public int compare(Player p1, Player p2) {
//				return p1.getRanking() - p2.getRanking();
//			}
//		});
		
//		Collections.sort(playerList, (player1, player2)->{
//			System.out.println("player1: "+player1);
//			System.out.println("player2: "+player2);
//			return player1.getRanking()-player2.getRanking();
//		});
		
		Collections.sort(playerList, (player1, player2)->{
			return ((Integer)player1.getRanking()).compareTo(player2.getRanking());
		});
		
		System.out.println(playerList);
	}
}
