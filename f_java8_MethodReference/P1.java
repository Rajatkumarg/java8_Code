package f_java8_MethodReference;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import z_entity.Player;

public class P1 {
public static void main(String[] args) {
	Function<String,Integer> obj1 = s->Integer.parseInt(s);
	System.out.println(obj1.apply("1"));
	obj1 = Integer::parseInt;
	System.out.println(obj1.apply("1"));
	
	Function<Player,String> obj2 = p->p.getName();
	System.out.println(obj2.apply(new Player(35,1,"Sachin")));
	obj2 = Player::getName;
	System.out.println(obj2.apply(new Player(35,1,"Dhoni")));
	
	Player p = new Player(35,1,"Kohli");
	Supplier<String> obj3  = ()->p.getName();
	System.out.println(obj3.get());
	obj3 = p::getName;
	System.out.println(obj3.get());
	
	Function<String, String> obj4 = String::toUpperCase;
	System.out.println(obj4.apply("Rajat"));
	
	Supplier<Player> obj5 = Player::new;
	Player p2 = obj5.get();
	p2.setRanking(5);
	System.out.println(p2.getRanking());
	
	Function<Integer, Integer> obj6 = i -> new Integer(i);
	System.out.println(obj6.apply(10));
	obj6 = Integer::new;
	System.out.println(obj6.apply(10));
	
	Function<InputStream,Scanner> obj7 = ps -> new Scanner(ps);
	Scanner kb = obj7.apply(System.in);
	System.out.println(kb);
	obj7 = Scanner::new;
	System.out.println(obj7.apply(System.in));
	
	BiFunction<Integer,String, Player> obj8 = Player::new;
	p2 = obj8.apply(1, "Tendulkar");
	System.out.println(p2);
	
}
}
