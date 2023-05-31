package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Projeto {
    private int id;
    private String descricao;
    private Cliente cliente;
    private Orcamento orcamento;
    private List<Modulo> modulos=new ArrayList<>();

    Random generator = new Random();
    HashMap<Integer, String> idmap = new HashMap<>();

    @Override
    public String toString() {
        return "Projeto" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", cliente=" + cliente +
                ", orcamento=" + orcamento +
                ", modulos=" + modulos
                ;
    }

    public Projeto(String descricao, Cliente cliente, Orcamento orcamento, Modulo modulo) {

        this.descricao = descricao;
        this.cliente=cliente;
        this.orcamento=orcamento;
        modulos.add(modulo);
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = generateId();
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int generateId(){
        int id= generator.nextInt(1000);
        while(idmap.containsKey(id)) {
            id = generator.nextInt(1000);
        }
        return id;
    }
}
