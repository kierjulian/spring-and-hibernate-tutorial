package ph.edu.up.mvc.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private Map<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private List<String> operatingSystems;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("Germany", "Germany");
		countryOptions.put("France", "France");
		countryOptions.put("India", "India");
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
