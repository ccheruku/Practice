import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn {

	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("./script.js"));

		Invocable invocable = (Invocable) engine;

		Object result = invocable.invokeFunction("fun1", "Peter Parker");
		System.out.println(result);
		System.out.println(result.getClass());

	}

}
