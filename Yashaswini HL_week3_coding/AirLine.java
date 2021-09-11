public class AirLine {
	//variable declaration
	private String airline_name, freq_flyer, alliance_name, website;
	private Designator des;
	private Location local;
	
	public AirLine(String[] array)
	{
		this.airline_name = array[0];
		this.freq_flyer = array[4];
		this.alliance_name = array[5];
		this.website = array[9];
		this.des = new Designator(array);
		this.local = new Location(array);
	}
	
	public String getAirLineName()
	{
		return airline_name;
	}
	public String getFreqFlyer()
	{
		return freq_flyer;
	}
	public String getAllianceName() 
	{
		return alliance_name;
	}
	public String getWebsite()
	{
		return website;
	}
	
	public String toString() 
	{
		return getAirLineName()+","+des.getIATA()+","+des.getICAO()+
				","+des.getAirCallSign()+","+getFreqFlyer()+","+
				getAllianceName()+","+local.getCity()+","+
				local.getState()+","+local.getCountry()+","+getWebsite()+"\n";
	}
}
