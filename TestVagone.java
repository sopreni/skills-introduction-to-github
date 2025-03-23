public class TestVagone{
  public static void main(String[] args){
	Vagone[] treno = new Vagone[5];
    treno[0] = new Vagone();
    treno[1] = new Vagone();
    treno[3] = new Vagone();
    treno[4] = new Vagone();
    for(int i = 0; i < treno.length; i++) if(treno[i] != null) System.out.println("Classe Carrozza = " + treno[i].classe);	
    Vagone testa = new Vagone();
	//Vagone prima;
	//Vagone seconda = new Vagone();
	//Vagone terza = new Vagone();
 	testa.next = new Vagone();//testa.next = prima;
	//prima = testa.next;
	testa.next.classe = 1;//prima.classe = 1;//
	testa.next.capienza = 80; //prima.capienza = 80; //
	//prima.previous = testa;
	testa.next.next = new Vagone();
	testa.next.next.classe = 2;
	testa.next.next.capienza = 120;
	//testa.next.next.previous = testa.next;
	testa.next.next.next = new Vagone();
	testa.next.next.next.classe = 2;
	testa.next.next.next.capienza = 120;
	
	Vagone contatore = testa;
	while (contatore.next != null) {
		contatore = contatore.next;
		System.out.println("Classe Carrozza = " + contatore.classe + " Capienza Carrozza = " + contatore.capienza);
    } 
  } 
}
	