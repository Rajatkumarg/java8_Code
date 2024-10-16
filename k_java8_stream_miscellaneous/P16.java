package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import z_entity.Employee;
import z_entity.Player;

public class P16 {
		public static void main(String[] args) {
			List<Player> playerList = Arrays.asList(new Player(10,"Name4"),
					new Player(15,"Name3"), 
					new Player(5,"Name5"),
					new Player(20,"Name2"),
					new Player(21,"Name1"));
//			long no = playerList.stream().count();
			long no = playerList.stream().collect(Collectors.counting());
			System.out.println(no);
		}
}
