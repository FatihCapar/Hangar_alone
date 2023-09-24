
import java.util.ArrayList;

public class Flugzeug {

	private int height;
	private int width;
	private int lenght;
	private int id;
	private String farbe;
	private int sitzplatz;
	private String motor;

	private ArrayList<Motor> motorListe= new ArrayList<Motor>();


	public Flugzeug(String farbe, int sitzplatz, int id, Motor motor) {
		this.farbe = farbe;
		this.sitzplatz = sitzplatz;
		this.id = id;
		this.motorListe.add(motor);
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

	public int getLenght() {
		return this.lenght;
	}

	/**
	 * 
	 * @param lenght
	 */
	public void setLenght(int lenght) {
		this.lenght = lenght;
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

	public int getSitzplatz() {
		return this.sitzplatz;
	}

	/**
	 * 
	 * @param sitzplatz
	 */
	public void setSitzplatz(int sitzplatz) {
		this.sitzplatz = sitzplatz;
	}

	public String getMotor() {
		return this.motor;
	}

	/**
	 * 
	 * @param motor
	 */
	public void setMotor(String motor) {
		this.motor = motor;
	}

	/**
	 * 
	 * @param driven
	 */
	public void drive(int driven) {
		// TODO - implement Flugzeug.drive
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param land
	 */
	public void landing(int land) {
		// TODO - implement Flugzeug.landing
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param flew
	 */
	public void fly(int flew) {
		// TODO - implement Flugzeug.fly
		throw new UnsupportedOperationException();
	}

	public ArrayList<Motor> getMotorListe() {
		return motorListe;
	}

	public void setMotorListe(ArrayList<Motor> motorListe) {
		this.motorListe = motorListe;


	}
	public void setMotorList (Motor motor) {
		this.motorListe.add(motor);
	}
	public int getLeistung(){
		int Leistung = 0;
		//for (Motor m1;motorListe){}
		for (int  i=0;i<motorListe.size();i++){
			Leistung += motorListe.get(i).getLeistung();
		}
		return Leistung;
	}
}