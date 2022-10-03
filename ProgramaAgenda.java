import java.util.Scanner;

public class ProgramaAgenda {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		boolean novaOperacao = true;
		PilhaAgenda pilhaAgenda = new PilhaAgenda(10);
		
		while(novaOperacao) {
			System.out.println(" ");
			System.out.println("PROGRAMA PILHA");
			System.out.println("0: Sair");
			System.out.println("1: Inserir itens");
			System.out.println("2: Remover itens");
			System.out.println("3: Imprimir Tamanho");
			System.out.println("4: Imprimir Item Topo");
			System.out.println("5: Trocar elemento topo com base");
			System.out.println("Entre com a opção desejada:");
			System.out.println(" ");
			int operacao = in.nextInt();
			
			switch(operacao) {
				case 1:
					System.out.println("Digite o nome: ");
					String nome = in.next();
					
					System.out.println("Digite o número: ");
					int numero = in.nextInt();
					
					if(pilhaAgenda.full())
						System.out.println("PILHA CHEIA, redimencionando tamanho da pilha ");
					
					pilhaAgenda.push(nome, numero);
					
					System.out.println("Adicionado com sucesso");
					
					break;
				case 2:
					if(pilhaAgenda.empty())
						System.out.println("Pilha Vazia");
					else
						pilhaAgenda.pop();
					break;
				case 3:
					System.out.println("O tamanho da pilha é: " + pilhaAgenda.size());
					break;
				case 4:
					System.out.println(pilhaAgenda.top());
					break;
				case 5:
					pilhaAgenda.changeTopWithBase();
					break;
				case 0:
					novaOperacao = false;
					break;
				default:
					System.out.println("Opção inválida");
			}
		}
    }
}
