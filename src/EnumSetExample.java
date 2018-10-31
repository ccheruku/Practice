
// Java program to illustrate working of EnumSet and 
// its functions. 
import java.util.EnumSet;

enum Gfg1 {
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};

public class EnumSetExample {
	public static void main(String[] args) {
		// Creating a set
		EnumSet<Gfg1> set1, set2, set3, set4;

		// Adding elements
		set1 = EnumSet.of(Gfg1.QUIZ, Gfg1.CONTRIBUTE, Gfg1.LEARN, Gfg1.CODE);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(Gfg1.class);
		set4 = EnumSet.range(Gfg1.CODE, Gfg1.CONTRIBUTE);
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4);
	}
}