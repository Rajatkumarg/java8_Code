package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test3 {
public static void main(String[] args) {

	List<String> l1 = new ArrayList<>();
	l1.add("A");
	l1.add("B");
	l1.add("C");
	l1.add("D");
	l1.add("B");
	Set<String> set = new HashSet<String>();
	AtomicInteger i = new AtomicInteger(0);
//	l1.forEach(s->set.add(s));
	l1.stream().map(s->{ set.add(s);return "A";}).collect(Collectors.toList());
	System.out.println(set.size());
}
}
