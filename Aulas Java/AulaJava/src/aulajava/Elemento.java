package aulajava;

public class Elemento<TIPO> {
    private TIPO Valor;
    private Elemento<TIPO> proximo;

    public TIPO getValor() {
        return Valor;
    }
    public void setValor(TIPO valor) {
        Valor = valor;
    }
    public Elemento<TIPO> getProximo() {
        return proximo;
    }
    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }

    ////////////////////////////////////////////////
    // Construtor
    public Elemento(TIPO valor){
        this.Valor = valor;
    }

}
