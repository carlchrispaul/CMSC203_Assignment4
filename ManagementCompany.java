public class ManagementCompany {
	//private variables
	private int MAX_PROPERTY = 5;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private Property properties[] = new Property [MAX_PROPERTY];
	private Plot plot;
	
	private String name = "";
	private String taxId = "";
	private double managementFee = 0.00;

	//constructor0
	public ManagementCompany() {
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	//constructor1 with 7 arguments
	public ManagementCompany(String mName, String mTaxId, double mFee, int x, int y, int width, int depth) {
		this.name = mName;
		this.taxId = mTaxId;
		this.managementFee = mFee;
		this.plot = new Plot(x, y, width, depth);
	}
	
	//constructor2 with 3 arguments
	public ManagementCompany(String mName, String mTaxId, double mFee) {
		this.name = mName;
		this.taxId = mTaxId;
		this.managementFee = mFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	private int negaIndex = -1;
	//addProperty0 property copy constructor
	public int addProperty(Property prop) {
		int index = negaIndex + 1;
		
		if(index >= this.MAX_PROPERTY)
			return -1;
		
		this.properties[index] = new Property(prop);
		
		negaIndex = index;
		return index;
	}
	
	//addProperty1 with 4 arguments
	public int addProperty(String propertyName, String city, double rent, String ownerName) {
		return addProperty(new Property(propertyName, city, rent, ownerName));
	}
	
	//addProperty2 with 8 arguments
	public int addProperty(String propertyName, String city, double rent, String ownerName, int x, int y, int width, int depth) {
		return addProperty(new Property(propertyName, city, rent, ownerName, x, y, width, depth));
	}
	
	public double totalRent() {
		Property[] p = properties;
		double total = 0;
		
		for(int a = 0; a < p.length; a++) {
			if(p[a] == null) 
				continue;
			
			total += p[a].getRentalAmount();
		}
		
		if(p.length > 0)
			return total;
		else 
			return 0.00;
	}
	
	public String maxRentProp() {
		Property[] p = properties;
		
		return p[maxPropertyIndex()].toString();
	}
	
	private int maxPropertyIndex() {
		Property[] p = properties;
		int index = -1;
		double max = 0;
		
		for(int a = 0; a < p.length; a++) {
			if(p[a] ==null)
				continue;
			
			if(p[a].getRentalAmount() > max) {
				max = p[a].getRentalAmount();
				index = a;
			}
		}
		
		if(max > 0)
			return index;
		else
			return 0;
	}
	
	//was private according to assign doc, but have to turn public for PropertyMgmDriverNoGui
	public String displayPropertyAtIndex(int index) {
		Property[] p = properties;
		
		return p[index].toString();
	}
	
	public int maxRentPropertyIndex() {
		return maxPropertyIndex();
	}
	
	public String toString() {
		Property[] p = properties;
		String text = "";
		
		text += "List of properties for " + this.getName() + ", TaxID: " + this.taxId + "\n\n";
		
		for(int a = 0; a < MAX_PROPERTY; a++) {
			if(p[a] == null) {
				continue;
			}
			
			text += p[a] + "\n";
		}
		
		text += "\nTotal management fee: " + (this.totalRent() * (this.managementFee / 100));
		
		return text;
	}
	
	//getMethods
	public int getMAX_PROPERTY() { return this.MAX_PROPERTY; }
	public Plot getPlot() { return this.plot; }
	public String getName() { return this.name; }
}
