package praticas_aula_4;

public class VetorNaoOrdenado {
    private int capacidade;
    private int ultimaPosicao;
    private int[] valores;

    public VetorNaoOrdenado(int capacidade){
        this.capacidade = capacidade;
        this.ultimaPosicao = -1;
        this.valores = new int[capacidade];
    }

    public int[] getValores(){
        return this.valores;
    }

    public void inserir(int valor){
        if(this.ultimaPosicao == this.capacidade - 1){
            System.out.println("O vetor está cheio");
        } else {
            this.ultimaPosicao += 1;
            this.valores[this.ultimaPosicao] = valor;
        }
    }

    public void imprimir(){
        if(this.ultimaPosicao == -1){
            System.out.println("O vetor está vazio");
        } else {
            for(int i = 0; i < this.ultimaPosicao + 1; i++){
                System.out.println(i + "-" + this.valores[i]);
            }
        }
    }

    public int pesquisar(int valor){
        for(int i = 0; i < this.ultimaPosicao + 1; i++){
            if(valor == this.valores[i]){
                return i;
            }
        }
        return -1;
    }

    public int excluir(int valor){
        int posicao = pesquisar(valor);
        if(posicao == -1){
            return -1;
        } else {
            for(int i = posicao; i < this.ultimaPosicao; i++){
                this.valores[i] = this.valores[i + 1];
            }
            this.ultimaPosicao -= 1;
            return 0;
        }
    }

    public static void main(String[] args) {
        VetorNaoOrdenado vetor = new VetorNaoOrdenado(5);
        vetor.inserir(3);
        vetor.inserir(2);
        vetor.inserir(5);
        vetor.imprimir();
//        System.out.println("valor pesquisado: " + vetor.pesquisar(1));
        vetor.excluir(2);
        vetor.imprimir();
    }
}
