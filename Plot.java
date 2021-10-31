public class Plot {
	//private variables
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int depth = 0;

	//constructor0 with no arguments
	public Plot() {
		this.width = 1;
		this.depth = 1;
	}
	
	//constructor1 copy constructor
	public Plot(Plot plot) {
		this.x = plot.getX();
		this.y = plot.getY();
		this.width = plot.getWidth();
		this.depth = plot.getDepth();
	}
	
	//constructor2 with 4 arguments
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	//method named overlaps
	public boolean overlaps(Plot plot) {
		boolean result = false;
		int x1 = this.getX(); //left x
		int x2 = plot.getX(); //middle x
		int xW = this.getX() + this.getWidth(); //right x
		int y1 = this.getY(); //up y
		int y2 = plot.getY(); //middle y
		int yD = this.getY() + this.getDepth(); //down y
		
		if(x1 >= x2 || x2 <= xW)
			result = true;
		if(y1 >= y2 || y2 <= yD)
			result = true;
		
		if(result == false)
			return false;
		else
			return true;
	}
	
	//method named encompasses
	public boolean encompasses(Plot plot) {
		boolean result = false;
		int x1 = this.getX(); //left x
		int x2 = plot.getX(); //middle x
		int xW = this.getX() + this.getWidth(); //right x
		int y1 = this.getY(); //up y
		int y2 = plot.getY(); //middle y
		int yD = this.getY() + this.getDepth(); //down y
		int W = this.getWidth();
		int D = this.getDepth();
		
		if(x1 + W > x2) 
			result = true;
		if(y1 + D > y2) 
			result = true;
		if(x1 >= x2 || x2 <= xW) 
			result = true;
		if(y1 >= y2 || y2 <= yD) 
			result = true;
		
		System.out.println("Encompasses: this.X" + x1 + " P.X " +x2);
		
		if(result == false)
			return false;
		else
			return true;
	}
	
	//toString
	public String toString() {
		String text = "";
		
		text += "(X, Y): (" + this.getX() + ", " + this.getY() + ")";
		text += "\nWidth: " + this.getWidth();
		text += "\nDepth: " + this.getDepth();
		
		return text;
	}

	//getMethods
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public int getWidth() { return this.width; }
	public int getDepth() { return this.depth; }
	
	//setters
	public void setX(int X) { this.x = X; }
	public void setY(int Y) { this.y = Y; }
	public void setwidth(int W) { this.width = W; }
	public void setDepth(int D) { this.depth = D; }
}
