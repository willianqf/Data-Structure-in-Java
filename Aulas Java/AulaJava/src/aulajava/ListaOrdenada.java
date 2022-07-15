package aulajava;

public class ListaOrdenada<TIPO>{
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int Tamanho;

    public Elemento<TIPO> getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento<TIPO> getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return Tamanho;
    }
    public void setTamanho(int tamanho) {
        Tamanho = tamanho;
    }

    ////////////////////////////////////////////////////////////////////
    // Construtor
    public ListaOrdenada()
    {
        this.Tamanho = 0;
    }
    ////////////////// ADICIONAR ELEMENTO<TIPO>S /////////////////////////////
    public void Add(TIPO valor)
    {
        Elemento<TIPO> novo = new Elemento<TIPO>(valor);
        if(this.primeiro == null && this.ultimo == null)
        {
            this.primeiro = novo;
            this.ultimo = novo;
        }
        else
        {
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
        this.Tamanho++;
    }
    /////////////////// PEGAR ELEMENTO<TIPO>S ////////////////////////////////
    public Elemento<TIPO> Pegar(int valor)
    {
        Elemento<TIPO> inicio = primeiro;
        for(int x = 0; x < valor; x++)
        {
            if(inicio.getProximo() != null)
            {
                inicio = inicio.getProximo();
            }
        }
        return inicio;
    }
    ///////////////// REMOVER ELEMENTO<TIPO>S PELO INDICE ////////////////////
    public void Remover(int valor)
    {
        int x;
        Elemento<TIPO> Atual = primeiro;
        Elemento<TIPO> Antecessor = null;
        for(x = 0; x < valor; x++)
        {
            Antecessor = Atual;
            Atual = Atual.getProximo();
        }
        if(x == 0)
        {
            primeiro = Atual.getProximo();
        }else{
            Antecessor.setProximo(Atual.getProximo());
            Atual = null;
        }
        this.Tamanho--;
        Elemento<TIPO> ultimo = this.Pegar(this.Tamanho - 1);
        this.ultimo = ultimo;
    }
}
