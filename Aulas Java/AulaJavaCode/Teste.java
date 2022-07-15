public class Teste {

    private String valor;
    private int valorincrement;

    public Teste(String valor){
        this.valor = valor;
    }
    public Teste(String valor, int valorincrement){
        this.valor = valor;
        this.valorincrement = valorincrement;
    }

    protected String PegarValor(){
        return valor;
    }
    public void setvalor(String valor){
        this.valor = valor;
    }
    public String getvalor(){
        return this.valor;
    }
}
