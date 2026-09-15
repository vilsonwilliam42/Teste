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
	public void limpar() {
		No atual=cabeca;
		while(atual!=null) {
			atual=atual.proximo;
			atual=null;
			
			
		}
		
		 cabeca=null;
		 int tamanho=0;
	}
	public int removerTodos(int valor) {
		int removidos=0;
		No anterior=cabeca;
		No atual=cabeca.proximo;
		
		while(anterior!=null) {
			atual=atual.proximo;
			if(valor==atual.valor) {
				anterior.proximo= atual.proximo;
				
				
				removidos++;
				
				
			}
			
		}
		
		return removidos;
	}
	public  void duplicados(int valor) {
		int dupla=0;
		
		No nova=cabeca;
		while(nova!=null ) {
			if(nova.valor==valor) {
				dupla++;
				
			}
			nova=nova.proximo;
		}
		
		if(dupla>1) {
			System.out.println(valor+" está dublicado");

			
		}else System.out.println(valor+" Não está dublicado");
	}
		public int contarRecursivo(int valor) {
			return contarRecursivo(valor,cabeca);
			
		

	}
	private int contarRecursivo(int valor,No lista) {
		if(lista==null)return 0;
		return (lista.valor== valor ? 1: 0)+contarRecursivo(valor,lista.proximo);
	}
	public int removerInicio() {
        if (cabeca == null) {
            throw new RuntimeException("Lista vazia");
        }

        int valor = cabeca.valor;
        cabeca= cabeca.proximo;

        return valor;
    }
	public boolean estaVazia() {
        return cabeca == null;
    }
	
	public void noComum(ListaEncadeada outra) {
		int count=1;
		No listaMain=this.cabeca;
		No outraLista=outra.cabeca;
		
		while(listaMain!=null && outraLista!=null) {
			if(listaMain==outraLista) {
				count++;
			}
			listaMain=listaMain.proximo;
			outraLista=outraLista.proximo;
			

		}
		if(count>=1) {
			System.out.println(" Sim,esta lista possui nós");
			
			
		}else System.out.println("Não, está lista não possui nós");
		
		
	}
	public ListaEncadeada clonePar(No lista) {
		ListaEncadeada clone=new ListaEncadeada();
		int indice=0;
		No aux=cabeca;
		while(aux!=null) {
			if(indice%2==0) {
				clone.adicionarFim(aux.valor);
			}
			indice++;
			aux=aux.proximo;
		}
		
		return clone;
		
	}
	public int removeTodos(int valor) {
		int contador=0;
		while(cabeca!=null && cabeca.valor==valor) {
			cabeca=cabeca.proximo;
			contador++;
		}
		if(cabeca==null) return contador;
		No aux=cabeca;
		while(aux.proximo.valor==valor) {
		if(aux.proximo.valor==valor) {
			contador++;
			aux.proximo=aux.proximo.proximo;
		}else {
				aux=aux.proximo;
			}
			
		}
		return contador;
		
	}
	public ListaEncadeada removeDuplicadas() {
		ListaEncadeada lista2=new ListaEncadeada();
		No aux=cabeca;
		while(aux!=null) {
			
			lista2.adicionarFim(aux.valor);
			if(aux.valor==aux.proximo.valor) {
				aux=aux.proximo.proximo;
			}
			aux=aux.proximo;
			}
		return lista2;
	}

public boolean contem(int valor)	{
	No aux=cabeca;
	while(aux!=null) {
		if(aux.proximo.valor==aux.valor)return true;
		aux=aux.proximo;
	}
	return false;
	
	
}
	

	public static void main(String[] args) {
		ListaEncadeada lista=new ListaEncadeada();
		lista.adicionarInicio(20);
		lista.adicionarInicio(30);
		lista.adicionarInicio(40);
		lista.adicionarInicio(30);
		
		lista.adicionarFim(23);
		lista.duplicados(20);
		lista.imprimir();
		
		
		ListaEncadeada outra=new ListaEncadeada();
		outra.adicionarInicio(20);
		outra.adicionarInicio(10);
		outra.adicionarInicio(90);
	
		
		outra.adicionarFim(60);
		//outra.removerTodos(10);
		//outra.limpar();
		
		lista.noComum(outra);
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
