package l_java8_codingQue;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class P8 {
	public static void main(String[] args) {
		//ArithmeticException (e.g., division by zero)
		List<Integer> numbers = List.of(10, 5, 0, 2);
		List<Integer> divides100 =  numbers.stream().map(i->{
			try {
				return 100/i;
			}catch(ArithmeticException e) {
//				throw e;
				throw new MyDivisionExc("Division by zero detected!",e);
			}
		}).collect(Collectors.toList());
		System.out.println(divides100);
		
		//You need to parse JSON strings into objects. 
		//The parseJson method can throw both JsonParseException and IOException.
		
		List<String> jsonStrings = List.of("{\"name\":\"John\"}","invalid-json", "{\"age\":30}");
		ObjectMapper objectMapper = new ObjectMapper();
//		String s = jsonStrings.get(0);
		List<MyData> list =  jsonStrings.stream().map(json->{
		try {
			return objectMapper.readValue(json, MyData.class);
		}catch(JsonProcessingException  e) {
			System.out.println(e);
			return null;
		}
	}).collect(Collectors.toList());
		System.out.println(list);
	}
}
class MyDivisionExc extends RuntimeException{
	public MyDivisionExc(String msg, Exception e) {
		super(msg,e);
	}
}
class MyData{
	public int age;
	public String name;
	@Override
	public String toString() {
		return "name is "+name+" age is "+age;
	}
}
