import java.util.ArrayList;

public class Hangar {

	private int height;
	private int width;
	private int length;
	private int id;
	private String farbe;
	private int zustand;
	private int arbeiter;

	private ArrayList<Flugzeug> flugzeugslist= new ArrayList<Flugzeug>();

	public Hangar(int height, int width, int length, int id, String farbe, int zustand, int arbeiter,Flugzeug flugzeug) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.id = id;
		this.farbe = farbe;
		this.zustand = zustand;
		this.arbeiter = arbeiter;
		this.flugzeugslist.add(flugzeug);
	}

	public int getHeight() {
		return this.height;
	}

	/**
	 * 
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	/**
	 * 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return this.length;
	}

	/**
	 * 
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getFarbe() {
		return this.farbe;
	}

	/**
	 * 
	 * @param farbe
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getZustand() {
		return this.zustand;
	}

	/**
	 * 
	 * @param zustand
	 */
	public void setZustand(int zustand) {
		this.zustand = zustand;
	}

	public int getArbeiter() {
		return this.arbeiter;
	}

	/**
	 * 
	 * @param arbeiter
	 */
	public void setArbeiter(int arbeiter) {
		this.arbeiter = arbeiter;
	}

	public ArrayList<Flugzeug> getFlugzeugslist() {
		return flugzeugslist;
	}

	public void setFlugzeugslist(ArrayList<Flugzeug> flugzeugslist) {
		this.flugzeugslist = flugzeugslist;
	}

	public void setFlugzeugslist (Flugzeug flugzeug) {
		this.flugzeugslist.add(flugzeug);
	}
}