public class TestAuto{
  public static void main(String[] args){
    Automobile a = new Automobile();
	Motore m = new Motore();
	Motore m1 = new Motore();
	//a.ilMotore = new Motore();
	//inizializzo attributi di a 
	a.marca = "Fiat";
	a.modello = "500";
	a.targa = "DE567HU";
	a.velocitaMassima = 160;
	
	// inizializzo attributi di m
	m.numGiri = 3600;
	m.cilindrata = 1200;
	
	// realizzo il link fra a e m
	a.ilMotore = m;
	m.cilindrata = 1600;
	System.out.println("Auto di targa " + a.targa + " e cilindrata " + a.ilMotore.cilindrata);
  }
}
	
	