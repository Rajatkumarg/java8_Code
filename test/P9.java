package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import z_entity.Constant;

public class P9 {
	
//	public static final List<String> list = Arrays.asList("A","B");
	public static void main(String[] args) {
		String str = "{\"status\":\"success\",\"message\":\"Transaction was successful\",\"data\":null}";
		System.out.println(str);
		System.out.println(Constant.list);
		System.out.println(Constant.list);
		
		str = "";
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.get());
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		optional = Optional.of("Abc");
		System.out.println(optional.get());
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
	}
}
