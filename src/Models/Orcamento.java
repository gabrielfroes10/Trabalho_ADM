package Models;

public class Orcamento {
    private double custoMateriais;
    private double custoMaoDeObra;

    public Orcamento(double custoMateriais, double custoMaoDeObra){
        setCustoMaoDeObra(custoMaoDeObra);
        setCustoMateriais(custoMateriais);
    }

    public double getCustoMateriais() {
        return custoMateriais;
    }

    public void setCustoMateriais(double custoMateriais) {
        this.custoMateriais = custoMateriais;
    }

    public double getCustoMaoDeObra() {
        return custoMaoDeObra;
    }

    public void setCustoMaoDeObra(double custoMaoDeObra) {
        this.custoMaoDeObra = custoMaoDeObra;
    }

    @Override
    public String toString() {
        return "Orcamento" +
                "Custo Materiais=" + custoMateriais +
                ", Custo Mão De Obra=" + custoMaoDeObra
                ;
    }
}
