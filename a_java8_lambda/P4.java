package a_java8_lambda;

@FunctionalInterface
interface DiceRoller{
	int rollDice();
}

public class P4 {

	public static void main(String[] args) {
		DiceRoller obj = ()->{
			double random = Math.random();
			return (int)(random*6)+1;
		};
		System.out.println(obj.rollDice());
	}

}
