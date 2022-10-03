public class PilhaAgenda {
	private	int	topo;
	private	int	tam;
	private	Agenda[] itens;
	
	public	PilhaAgenda(int	n)	{
		itens =	new	Agenda[n];
		tam = n;  
		topo = 0;
	}
	
	public void push(String	nm,	long t){
		if(full()) {
			tam = tam *2;
			Agenda[] novoVetor = new Agenda[tam];
			System.arraycopy(itens, 0, novoVetor, 0, itens.length);
			itens = novoVetor;
		}
			
		itens[topo]	= new Agenda(nm, t);  
		topo++;
	}
	
	public String top(){
		return itens[topo-1].getNome() + " - " + itens[topo-1].getTel();
	}
	
	public void pop(){
		if(!empty())
			topo--;
	}
	
	public int size(){  
		return	topo;
	}
	
	public boolean empty(){  
		return (topo == 0);
	}
	
	public boolean full() {
		return	(topo == tam);
	}
	
	public void changeTopWithBase() {
		Agenda itemTopo = itens[topo-1];
		Agenda primeiroItem = itens[0];
	
		itens[topo-1] = primeiroItem;
		itens[0] = itemTopo;
	}







}
