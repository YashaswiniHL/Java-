
import java.io.FileWriter;
import java.io.IOException;

public class Location {
	
	private String city, state, country;
	
	
	//constructor for location class
	public Location(String[] array) {
		this.city = array[6];
		this.state = array[7];
		this.country = array[8];
	}
//getter methods
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public static void writeFile(AirLine object, String name, String array) throws IOException {
		//filewriter writes into a file
                FileWriter fw = new FileWriter(name+"_"+array+"_List.csv");
		fw.write(object.toString());
		fw.close();
	}
	
	}
