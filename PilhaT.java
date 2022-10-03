public class PilhaT {
	private	int	topo;
	private	int	tam;
	private	int[] itens;
	
	public	PilhaT(int n)	{
		itens =	new	int[n];
		tam = n;  
		topo = 0;
	}
	
	public void push(int numero){
		if(full()) {
			tam = tam *2;
			int[] novoVetor = new int[tam];
			System.arraycopy(itens, 0, novoVetor, 0, itens.length);
			itens = novoVetor;
		}
			
		itens[topo]	= numero;  
		topo++;
	}
	
	public int top(){
		return itens[topo-1];
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
		int itemTopo = itens[topo-1];
		int primeiroItem = itens[0];
	
		itens[topo-1] = primeiroItem;
		itens[0] = itemTopo;
	}







}
