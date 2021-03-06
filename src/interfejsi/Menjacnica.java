package interfejsi;

import java.util.GregorianCalendar;

public interface Menjacnica {

	public void dodajKursValuteZaOdredjeniDan(GregorianCalendar datum, String valuta, double prodajni, double srednji, double kupovni);
	public void izbrisiKursValuteZaOdredjeniDan(GregorianCalendar datum, String valuta);
	public double[] vratiKursValuteZaOdredjeniDan(GregorianCalendar dan, String valuta);
}
