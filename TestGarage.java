public class TestGarage{
  public static void main (String[] args){
    Garage g = new Garage();
	g.piani = 4;
	g.indirizzo = "Milano";
	g.auto = new Auto[100];
	Auto a = new Auto();
	a.larghezza = 50;
	a.lunghezza = 120;
	g.auto[0] = a;
  }
}