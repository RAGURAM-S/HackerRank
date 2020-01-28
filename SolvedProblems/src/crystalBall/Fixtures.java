package crystalBall;

public class Fixtures {
	
	int fixtureID;
	String fixtureName;
	int x1;
	int x2;
	int y1;
	int y2;
	
	Fixtures(int fixtureID, String fixtureName, int x1, int x2, int y1, int y2){
		this.fixtureID = fixtureID;
		this.fixtureName = fixtureName;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public int getFixtureID() {
		return fixtureID;
	}

	public String getFixtureName() {
		return fixtureName;
	}

	public int getX1() {
		return x1;
	}

	public int getX2() {
		return x2;
	}

	public int getY1() {
		return y1;
	}

	public int getY2() {
		return y2;
	}
}
