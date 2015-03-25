import java.util.GregorianCalendar;






import interfejsi.Menjacnica;



public class ImplementacijaInterfejsa implements Menjacnica{


	
	public void dodajKursValuteZaOdredjeniDan(GregorianCalendar datum, String val, double prodajni, double srednji, double kupovni){
		
		Valute[] v = new Valute[10];
		Valute v1 = new Valute();
		try {
			v1.setNaziv(val);
			v1.setDatum(datum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<v.length; i++){
			if(v[i].getNaziv().equals(v1.getNaziv()) && v[i].getDatum().equals(v1.getDatum())){
				try {
					v[i].setKupovniKurs(kupovni);
					v[i].setProdajniKurs(prodajni);
					v[i].setSrednjiKurs(srednji);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
	
		
			
	}
	
	public void izbrisiKursValuteZaOdredjeniDan(GregorianCalendar datum, String val){
		
		
		
	}
	
	public double[] vratiKursValuteZaOdredjeniDan(GregorianCalendar dan, String val){
		
		double[] kursevi = new double[3];
		return kursevi;
	
	}
}
