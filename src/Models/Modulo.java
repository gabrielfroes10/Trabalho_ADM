package Models;

import java.util.HashMap;
import java.util.Random;

public class Modulo {
    private String nome;
    private String tipo;
    private int id;
    private Random generator = new Random();
    private HashMap<Integer, String> idMap = new HashMap<>();

    public Modulo(String nome, String tipo) {
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
        this.id = generateId();
    }

    public int generateId() {
        int id = generator.nextInt(1000);
        while (idMap.containsKey(id)) {
            id = generator.nextInt(1000);
        }
        idMap.put(id, getNome());
        return id;
    }

    @Override
    public String toString() {
        return "Módulo\n" +
                "Nome: " + nome +
                "\nTipo: " + tipo +
                "\nID: " + id;
    }
}
