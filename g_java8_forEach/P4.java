package g_java8_forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class P4 {
	static int sum;
	public static void main(String[] args) {
		BiConsumer<Integer, String> biconsumer = (k,v)->System.out.println(k+" "+v);
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Patna");
		map.put(1, "Buxar");
		map.put(2, "Koran Sarai");
		map.forEach(biconsumer);
		biconsumer.accept(3, "Dumraon");
	}

}
