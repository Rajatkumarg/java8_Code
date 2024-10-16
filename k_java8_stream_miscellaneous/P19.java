package k_java8_stream_miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import z_entity.Employee;
import z_entity.Player;

public class P19 {
		public static void main(String[] args) {
			List<Player> playerList = Arrays.asList(new Player(10,"Name4","Patna"),
					new Player(15,"Name3","Patna"), 
					new Player(5,"Name4","Patna"),
					new Player(20,"Name3","Karnataka"),
					new Player(21,"Name1","Karnataka"));
			Map<String,List<Player>> players =  playerList.stream().collect(Collectors.groupingBy(Player::getName));
			players.entrySet().forEach(entry->System.out.println(entry.getKey()+"  "+entry.getValue()+" "+entry.getValue().size()));
			
			Map<Boolean,List<Player>> playerss =  playerList.stream().collect(Collectors.partitioningBy(p->p.getRanking()>15));
			playerss.entrySet().forEach(entry->System.out.println(entry.getKey()+"  "+entry.getValue()));
			
			Map<String, Player> map = playerList.stream().collect(Collectors.toMap(p->(p.getName()+p.getAddress()), p->p, (k1,k2)->k2));
			System.out.println(map);
			
			List<Player> pl;
			Collection<Player> pll = map.values();
			pl=new ArrayList<>(pll);
		}
}
