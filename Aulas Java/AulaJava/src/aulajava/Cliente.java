package aulajava;

public class Cliente {
    private String cpf;
    private int Idade;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }

    public Cliente(String Nome, int Idade)
    {
        this.cpf = Nome;
        this.Idade = Idade;
    }
}
