import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair p = new Pair(elemento, prioridade);
		fila.add(p);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		String aux = "";
		int maior = -564455154;
		for(int i=0; i<this.fila.size(); i++){

		}
	}

}
