import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//If country1.getCountryId() < country2.getCountryId():then compare method will return -1
//If country1.getCountryId() > country2.getCountryId():then compare method will return 1
//If country1.getCountryId()==country2.getCountryId():then compare method will return 0

class CountrySortByIdComparator implements Comparator<Country> {

	@Override
	public int compare(Country country1, Country country2) {

		return (country1.getCountryId() < country2.getCountryId()) ? -1
				: (country1.getCountryId() > country2.getCountryId()) ? 1 : 0;
	}

}

public class ComparatorMain {

	public static void main(String[] args) {
		Country indiaCountry = new Country(1, "India");
		Country usaCountry = new Country(3, "USA");
		Country russiaCountry = new Country(4, "Russia");
		Country japanCountry = new Country(2, "Japan");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(usaCountry);
		listOfCountries.add(russiaCountry);
		listOfCountries.add(japanCountry);

		System.out.println("Before Sort by id : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "||" + "Country name: " + country.getCountryName());
		}
		Collections.sort(listOfCountries, new CountrySortByIdComparator());

		System.out.println("After Sort by id: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}

		// Sort by countryName
		Collections.sort(listOfCountries, new Comparator<Country>() {

			@Override
			public int compare(Country o1, Country o2) {
				return o1.getCountryName().compareTo(o2.getCountryName());
			}
		});

		System.out.println("After Sort by name: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}
	}

}