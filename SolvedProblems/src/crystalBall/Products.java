package crystalBall;

public class Products{
	int productID;
	String productName;
	int fixtureID;
	
	Products(int productID, String productName, int fixtureID){
		this.productID = productID;
		this.productName = productName;
		this.fixtureID = fixtureID;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getFixtureID() {
		return fixtureID;
	}
	
}
