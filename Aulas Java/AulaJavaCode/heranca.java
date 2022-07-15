import newpaths.newpath;  // IMPORTA CLASSES DE UM DETERMINAD DIRETÓRIO

public class heranca extends newpath{ // Extends - Herda elementos de determinada class
    private String Nome;
    private String CPF;
    public heranca(String Valor, String Nome, String CPF){
        super(Valor); ///super passa valores dos construtores na classe PAI
        this.Nome = Nome;
        this.CPF = CPF;
    }

    @Override
    public void info(){
        System.out.printf("\nNome: %s\nCPF: %s", this.Nome, this.CPF);
    }
    /*
    public String info2(){
        return super.PegarValor();
    }
    */
}
