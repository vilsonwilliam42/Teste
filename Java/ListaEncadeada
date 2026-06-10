public class ListaEncadeada {
	
	No inicio;
	int tamanho;
	
	public ListaEncadeada() {
		this.inicio = null;
		this.tamanho = 0;
	}
	public void removerInicio() {
	
		if(inicio==null) return;
		
		inicio=inicio.proximo;
	}
	
	public void adicionarInicio(int valor) {
		No novo = new No(valor);
		novo.proximo = inicio;
		inicio = novo;
		tamanho++;
	}
	public void adcionaFim(int valor){
		No novo=new No(valor);
		if(inicio==null) {
			inicio=novo;
		}else {
			
		}
	}
	public void removerFim() {
	No aux=inicio.proximo;
		if(aux==null) {
			
			
		}else if(auxnull) {
			
		}
		
		
		
	}
	public void imprimir() {
		No aux = inicio;
		while(aux!=null) {
			System.out.print(aux.valor+" ");
			aux = aux.proximo;			
		}
		System.out.println();
	}
	

	
	private class No{
		int valor;
		No proximo;
		No(int valor){
			this.valor = valor;
			this.proximo = null;
		}
	}
}
