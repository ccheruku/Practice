import java.util.ArrayList;
import java.util.List;

public class Weather {
	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	}

	private final Season season;
	private static final List<Weather> listWeather = new ArrayList<Weather>();

	private Weather(Season season) {
		this.season = season;
	}

	public Season getSeason() {
		return season;
	}

	static {
		for (Season season : Season.values()) {
			listWeather.add(new Weather(season));
		}
	}

	public static ArrayList<Weather> getWeatherList() {
		return (ArrayList<Weather>) listWeather;
	}

	public String toString() {
		return season.toString();
	} // takes advantage of toString() method of Season.

	public static void main(String[] args) {
		Weather weather = new Weather(Weather.Season.FALL);
		System.out.println(weather.getWeatherList());
	}
}