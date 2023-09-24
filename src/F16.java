import java.util.ArrayList;

public class F16 extends Flugzeug {

	private int id;
	private int numweapons;

	@Override
	public ArrayList<Motor> getMotorListe() {
		return super.getMotorListe();
	}

	public F16(String farbe, int sitzplatz, int id , Motor motor) {
		super(farbe, sitzplatz, id, motor );
	}

	public int getId() {
		// TODO - implement F16.getId
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @param ps
	 */
	public void geschwindigkeit(int ps) {
		// TODO - implement F16.geschwindigkeit
		throw new UnsupportedOperationException();
	}

	public int getNumweapons() {
		return numweapons;
	}

	public void setNumweapons(int numweapons) {
		this.numweapons = numweapons;
	}
}