import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IUtil {
	public static void main(String[] args) {
		Object i = new ArrayList().iterator();
		System.out.print((i instanceof List) + ",");
		System.out.print((i instanceof Iterator) + ",");
		System.out.print(i instanceof ListIterator);
	}

	public static <T> boolean addAll(Collection<? super T> c, T... elements) {
		boolean result = false;
		for (T element : elements)
			result |= c.add(element);
		return result;
	}
}