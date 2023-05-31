package Models;

public class Endereco {
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Cep;
    private int Numero;

    public Endereco(String rua, String Bairro, String cidade, String CEP, int numero){
        setBairro(Bairro);
        setCep(CEP);
        setRua(rua);
        setCidade(cidade);
        setNumero(numero);
    }
    @Override
    public String toString() {
        return "Rua: "+GetRua()+"\n Bairro: "+getBairro()+"\n Numero: "+getNumero()+"\nCidade: "+getCidade()+"\n CEP: "+getCep();
    }
    public String GetRua(){
        return this.Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getCep() {
        return Cep;
    }

    public int getNumero() {
        return Numero;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }
}
