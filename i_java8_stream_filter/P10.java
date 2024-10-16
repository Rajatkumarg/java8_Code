package i_java8_stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import z_entity.Player;

public class P10 {

	public static void main(String[] args) {
		List<Integer> nameList= Arrays.asList(5,3,1,2);
		nameList.stream().sorted().forEach(System.out::println);
		
		Player p1 = new Player(2,"Sachin");
		Player p2 = new Player(1,"Dhoni");
		Player p3 = new Player(3,"Kohli");
		List<Player> playerList  = Arrays.asList(p1,p2,p3);
		System.out.println(playerList);
		playerList.stream().sorted((pa,pb)->pa.getRanking()-pb.getRanking()).forEach(System.out::println);
		
	}

}
