package decoratorpattern;

public class Shade {
	//shade of color of photo
	private int shade;

	public int getShade() {
		return shade;
	}

	public Shade(int shade) {
		super();
		this.shade = shade;
	}

	public void setShade(int shade) {
		this.shade = shade;
	}

	@Override
	public String toString() {
		return "Shade [shade=" + shade + "]";
	}
}
