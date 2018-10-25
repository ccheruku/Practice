import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

// Singleton class 
class Singleton implements Serializable, Cloneable {
	// public instance initialized when loading the class
	private static Singleton instance = null;

	private Singleton() {
		// private constructor
	}

	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();
			return instance;
		}
		return instance;
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class GFG {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		// Reflection
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (Singleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode() + "\n");

		// Serializable
		try {
			Singleton instance3 = Singleton.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance3);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

			Singleton instance4 = (Singleton) in.readObject();
			in.close();

			System.out.println("instance3 hashCode:- " + instance3.hashCode());
			System.out.println("instance4 hashCode:- " + instance4.hashCode() + "\n");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		// CLONE
		try {
			Singleton instance5 = Singleton.getInstance();
			Singleton instance6 = (Singleton) instance5.clone();
			System.out.println("instance5 hashCode:- " + instance5.hashCode());
			System.out.println("instance6 hashCode:- " + instance6.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

