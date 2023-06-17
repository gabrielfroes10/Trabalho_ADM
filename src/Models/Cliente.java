package Models;

public class Cliente {
    private String nome;
    private String contato;
    private int cpf;
    private Endereco endereco;

    public Cliente(String nome, String contato, int cpf) {
        setNome(nome);
        setContato(contato);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nContato: " + contato + "\nCPF: " + cpf + "\nEndereço:\n" + endereco.toString();
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }
}
