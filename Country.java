
public class Country {
	public String country;
	public double gdp;
	public String capital;
	
	Country(String country, double gdp, String capital){
		this.country = country;
		this.gdp = gdp;
		this.capital = capital;
	}
	public String getgdp() {
		return country + ":" + gdp;
	}
	public String getCapital() {
		return country + ":" + capital;
	}

}
