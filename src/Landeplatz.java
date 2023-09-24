import java.util.ArrayList;

public class Landeplatz {

	private int height;
	private int width;
	private int length;
	private String zustand;
	private int id;
	private int arbeiter;
	private String material;
	private ArrayList<Hangar> Hangarliste= new ArrayList<Hangar>();

	public Landeplatz(int height, int width, int length, String zustand, int id, int arbeiter, String material, Hangar hangar) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.zustand = zustand;
		this.id = id;
		this.arbeiter = arbeiter;
		this.material = material;
		Hangarliste.add(hangar);
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

	public String getZustand() {
		return this.zustand;
	}

	/**
	 * 
	 * @param zustand
	 */
	public void setZustand(String zustand) {
		this.zustand = zustand;
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

	public String getMaterial() {
		return this.material;
	}

	/**
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	public ArrayList<Hangar> getHangarlist() {
		return Hangarliste;
	}
	///Wenn wir eine Arraylist erstellen wollen, müssen wir hier den setter ändern
	///urpsrüngliche Form :
	///public void setHangarlist(ArrayList<Hangar> hangarlist) {
	///	Hangarlist = hangarlist;
	///}
	/// richtige Form:
	public void setHangarlist (Hangar hangar) {
		this.Hangarliste.add(hangar);
	}
}