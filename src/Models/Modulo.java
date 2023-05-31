package Models;

import java.util.HashMap;
import java.util.Random;

public class Modulo {
    private String nome;
    private String tipo;
    private int id;
    Random generator = new Random();
    HashMap<Integer, String> idmap = new HashMap<>();
    public Modulo(String nome, String tipo){
        setTipo(tipo);
        setNome(nome);
        setId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = generateID();
    }

    public int generateID(){
       int id= generator.nextInt(1000);
      while(idmap.containsKey(id)){
          id=generator.nextInt(1000);
      }
      idmap.put(id,getNome());
      return id;
    }

    @Override
    public String toString() {
        return "Modulo" +
                "Nome='" + nome + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Id =" + id
                ;
    }
}
