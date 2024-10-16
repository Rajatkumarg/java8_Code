package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import z_entity.Employee;
import z_entity.Player;

public class P14 {
		public static void main(String[] args) {
			List<Player> playerList = Arrays.asList(new Player(10,"Name4"),
					new Player(15,"Name3"), 
					new Player(5,"Name5"),
					new Player(20,"Name2"),
					new Player(21,"Name1"));
//			playerList.sort((p1,p2)->p2.getRanking()-p1.getRanking()); //List.of() -> error
//			playerList.stream().limit(3).forEach(System.out::println);
//			playerList.stream().sorted((p1,p2)->p2.getRanking()-p1.getRanking()).limit(3).forEach(System.out::println);
			LinkedList<Player> list = playerList.stream().sorted((p1,p2)->p2.getRanking()-p1.getRanking()).limit(3).collect(Collectors.toCollection(LinkedList::new));
			System.out.println(list);
		}
}
