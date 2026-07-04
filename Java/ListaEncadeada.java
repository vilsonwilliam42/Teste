package poo;


public class ListaEncadeada {
    No cabeca;

    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = cabeca;
        cabeca = novo;
    }

    public void adicionarFim(int valor) {
        No novo = new No(valor);
        if (cabeca == null) {
            cabeca = novo;
            return;
        }
        No t = cabeca;
        while (t.proximo != null) t = t.proximo;
        t.proximo = novo;
    }
    public ListaEncadeada clonar(ListaEncadeada lista) {
    	ListaEncadeada clone= new ListaEncadeada();
    	No listaEncadeada=cabeca;
    	
    	while(listaEncadeada!=null) {
    		clone.adicionarFim(listaEncadeada.valor);
    		listaEncadeada=listaEncadeada.proximo;
    		
    	}
    	
		return clone;
    	}

    public void imprimir() {
        No t = cabeca;
        while (t != null) {
            System.out.print(t.valor + " -> ");
            t = t.proximo;
        }
        System.out.println("null");
    }
   
	public ListaEncadeada intercalar(ListaEncadeada outra) {
		ListaEncadeada nova= new ListaEncadeada();
		
		No listaEncadeada=this.cabeca;
		No outraListaEncadeada=outra.cabeca;
		
		while(listaEncadeada != null && outraListaEncadeada !=null) {
			nova.adicionarFim(listaEncadeada.valor);
			nova.adicionarFim(outraListaEncadeada.valor);
			listaEncadeada=listaEncadeada.proximo;
			outraListaEncadeada=outraListaEncadeada.proximo;
			
		}
		return nova;
	}

	public static void main(String[] args) {
		ListaEncadeada lista=new ListaEncadeada();
		lista.adicionarInicio(20);
		lista.adicionarInicio(30);
		lista.adicionarInicio(40);
		lista.adicionarInicio(30);
		
		lista.adicionarFim(23);
		lista.imprimir();
		
		
		ListaEncadeada outra=new ListaEncadeada();
		outra.adicionarInicio(70);
		outra.adicionarInicio(80);
		outra.adicionarInicio(90);
		outra.adicionarInicio(50);
		outra.adicionarInicio(100);
		
		outra.adicionarFim(60);
		outra.imprimir();
		
		
		ListaEncadeada intercalar=lista.intercalar(outra);
		intercalar.imprimir();
		
		ListaEncadeada clone= lista.clonar(lista);
		clone.adicionarFim(20);
		
		clone.imprimir();
		
	}
	
    private static class No {
        int valor;
        No proximo;
        public No(int valor) { this.valor = valor; }
    }

}