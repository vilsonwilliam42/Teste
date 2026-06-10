public class Merge {
    public static void merge(int vet[]){
        int inicio=0;
        int fim=vet.length-1;
        
        
        int aux[]=new int[vet.length];
        mergeSort(vet,aux,inicio,fim);
    }
    private static void mergeSort(int vet[],int aux[],int inicio,int fim){
        int meio=(inicio+fim)/2;
        if(inicio<fim){
            mergeSort(vet,aux,inicio, meio);
            mergeSort(vet,aux, meio+1,fim);
             intercalar(vet, aux, inicio, meio, fim);


        }

    }
    private static void intercalar(int vet[],int aux[],int inicio,int meio,int fim){
        for(int i=inicio;i<=fim;i++){
            aux[i]=vet[i];

        }
        int esquerda=inicio;
        int direita=meio+1;
        for(int i=inicio;i<=fim;i++){
            if(esquerda>meio){
                vet[i]=aux[direita++];
            }
            else if(direita>fim){
                vet[i]=aux[esquerda++];
            }
            else if(aux[esquerda]<aux[direita]){
                vet[i]=aux[esquerda++];
            }
            else{
                vet[i]=aux[direita++];
            }

        }
    }

}
