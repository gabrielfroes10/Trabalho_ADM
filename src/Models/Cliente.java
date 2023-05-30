package Models;

public class Cliente {
    private String nome;
    private String contato;
    private int CPF;
    private Endereco endereco;

    public Cliente(String nome, String contato, int CPF) {
        setNome(nome);
        setContato(contato);
        setCPF(CPF);
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
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }
    public void getEndereco(){
        endereco.toString();
    }
    public void setCPF(int cpf){
        this.CPF=cpf;
    }
    public int getCPF(){
        return this.CPF;
    }
}
