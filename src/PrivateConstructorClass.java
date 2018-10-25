public class PrivateConstructorClass {

	private PrivateConstructorClass() {
		checkPerMission();
		// you own code go below
	}

	void checkPerMission() {
		Class self = sun.reflect.Reflection.getClass(1);
		Class caller = sun.reflect.Reflection.getCallerClass(3);
		if (self != caller) {
			throw new java.lang.IllegalAccessError();
		}
	}
}