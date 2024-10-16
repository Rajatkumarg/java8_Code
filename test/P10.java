package test;

import java.util.regex.Pattern;

public class P10 {
	boolean isDone = true;

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	public static void main(String[] args) {
		boolean b = Pattern.matches(".b", "ab");
		b = Pattern.matches(".b", "abs");
		b = Pattern.matches("..b", "asb");
		
		b = Pattern.matches("[abc]", "a");//character a, b, or c
		
		b = Pattern.matches("[^abc]", "4");//Any character except a, b, or c
		
		b = Pattern.matches("[a-zA-Z]", "f");//a through z or A through Z, inclusive (range)
		System.out.println(b);
	}
}
