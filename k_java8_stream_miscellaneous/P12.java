package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import z_entity.Employee;
import z_entity.Player;

public class P12 {
		public static void main(String[] args) {
			List<Player> playerList = List.of(new Player(10), new Player(15), new Player(5));
			System.out.println(playerList.stream().mapToInt(Player::getAge).average().getAsDouble());
		}
}
