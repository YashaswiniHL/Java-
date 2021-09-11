
public class Designator {
	//variable declaration
        private String IATA, ICAO, Call_sign;

//constructor for designator class
	public Designator(String[] array) {
		this.IATA = array[1];
		this.ICAO = array[2];
		this.Call_sign = array[3];
	}
	//getter methods
	public String getIATA() {
		return IATA;
	}

	public String getICAO() {
		return ICAO;
	}

	public String getAirCallSign() {
		return Call_sign;
	}
	
}
