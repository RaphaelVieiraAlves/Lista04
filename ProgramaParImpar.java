import java.util.Scanner;

public class ProgramaParImpar {
	public static void main(String args[]) {
		
        Scanner in = new Scanner(System.in);
        PilhaT pilha1 = new PilhaT(10);
        PilhaT pilha2 = new PilhaT(10);
        
    	for(int i=0; i < 10; i++) {
			System.out.println("Digite o número: ");
			int numero = in.nextInt();
			
			if(numero % 2 == 0)
				pilha1.push(numero);
			else
				pilha2.push(numero);
    	}
    	
    	System.out.println("DESEMPILHANDO...");
    	
    	System.out.println("PILHA PAR");
    	
    	int tamanhoPilha1 = pilha1.size();
    	int tamanhoPilha2 = pilha2.size();
    	
    	for(int i=0; i < tamanhoPilha1; i++) {
    		System.out.println("Removendo valor: " + pilha1.top());
    		pilha1.pop();
    	}
    	
    	System.out.println("");
    	
    	System.out.println("PILHA IMPAR");
    	
    	for(int i=0; i < tamanhoPilha2; i++) {
    		System.out.println("Removendo valor: " + pilha2.top());
    		pilha2.pop();
    	}
    }
}
