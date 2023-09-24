public class Motor {

	private int width;
	private int weight;
	private String fuel;
	private int kg;
	private String name;
	private String erzeuger;
	private int Leistung;

	public Motor(String fuel, int kg, String name, String erzeuger, int leistung) {
		this.fuel = fuel;
		this.kg = kg;
		this.name = name;
		this.erzeuger = erzeuger;
		Leistung = leistung;
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

	public int getWeight() {
		return this.weight;
	}

	/**
	 * 
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFuel() {
		return this.fuel;
	}

	/**
	 * 
	 * @param fuel
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getKg() {
		return this.kg;
	}

	/**
	 * 
	 * @param kg
	 */
	public void setKg(int kg) {
		this.kg = kg;
	}

	/**
	 * 
	 * @param zustand
	 */
	public void zustand(String zustand) {
		// TODO - implement Motor.zustand
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param benutzt
	 */
	public void inbenutzung(int benutzt) {
		// TODO - implement Motor.inbenutzung
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getErzeuger() {
		return erzeuger;
	}

	public void setErzeuger(String erzeuger) {
		this.erzeuger = erzeuger;
	}

	public int getLeistung() {
		return Leistung;
	}
}