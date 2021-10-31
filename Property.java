public class Property {
	//private variables
	private String propertyName = "";
	private String city = "";
	private double rentalAmount = 0;
	private String owner = "";
	private Plot plot;
	
	//constructor0 with no arguments
	public Property() {
		this.plot = new Plot();
	}
	
	//constructor1 copy constructor
	public Property(Property prop) {
		this.propertyName = prop.getPropertyName();
		this.city = prop.getCity();
		this.rentalAmount = prop.getRentalAmount();
		this.owner = prop.getOwner();
		this.plot = prop.getPlot();
	}
	
	//constructor2 with 4 arguments
	public Property(String name, String city, double rent, String owner) {
		this.propertyName = name;
		this.city = city;
		this.owner = owner;
		this.rentalAmount = rent;
		this.plot = new Plot();
	}
	
	//constructor3 with 8 arguments
	public Property(String name, String city, double rent, String owner,  int x, int y, int width, int depth) {
		this.propertyName = name;
		this.city = city;
		this.rentalAmount = rent;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	//toString
	public String toString() {
		String text = "";
			
		text += "Property Name: " + this.getPropertyName();
		text += "\n Located in " + this.getCity();
		text += "\n Belonging to: " + this.getOwner();
		text += "\n Rental Amount: " + this.getRentalAmount();
		text += " ";
			
		return text;
	}
	
	//getMethods
	public String getPropertyName() { return this.propertyName; }
	public String getCity() { return this.city; }
	public double getRentalAmount() { return this.rentalAmount; }
	public String getOwner() { return this.owner; }
	public Plot getPlot() { return this.plot; }
	
	//setters
	public void setPropertyName(String N) { this.propertyName = N; }
	public void setCity(String C) { this.city = C; }
	public void setRentalAmount(double R) { this.rentalAmount = R; }
	public void setOwner(String O) { this.owner = O; }
}
