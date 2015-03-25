import java.util.GregorianCalendar;
import java.util.LinkedList;


public class ImplementacijaInterfejsa {

LinkedList<Valute> valute = new LinkedList<Valute>();
	
	public void dodajKursValuteZaOdredjeniDan(GregorianCalendar datum, String val, double prodajni, double srednji, double kupovni){
		Valute v = new Valute();
		try {
			v.setNaziv(val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!valute.contains(v)){
			valute.add(v);
			try {
				v.setKupovniKurs(kupovni);
				v.setProdajniKurs(prodajni);
				v.setSrednjiKurs(srednji);
				v.setDatum(datum);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			try {
				v.setDatum(datum);
				v.setKupovniKurs(kupovni);
				v.setProdajniKurs(prodajni);
				v.setSrednjiKurs(srednji);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
			
	}
	
	public void izbrisiKursValuteZaOdredjeniDan(GregorianCalendar datum, String val){
		
		Valute v = new Valute();
		try {
			v.setDatum(datum);
			v.setNaziv(val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(valute.contains(v)){
			try {
				v.setKupovniKurs(0);
				v.setProdajniKurs(0);
				v.setSrednjiKurs(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public double[] vratiKursValuteZaOdredjeniDan(GregorianCalendar dan, String val){
		
		Valute v = new Valute();
		double[] kursevi = new double[3];
		try {
			v.setDatum(dan);
			v.setSkraceniNaziv(val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(valute.contains(v)){
			kursevi[0] = v.getKupovniKurs();
			kursevi[1] = v.getProdajniKurs();
			kursevi[2] = v.getSrednjiKurs();
			
		}
		return kursevi;
	
	
	}
}


