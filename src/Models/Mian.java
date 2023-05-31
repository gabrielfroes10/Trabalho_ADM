package Models;

public class Mian {
    public static void main(String[] args) {
        Cliente c1= new Cliente("a","123",12344);
        System.out.println(c1.toString());
        Orcamento o1=new Orcamento(100,100);
        System.out.println(o1.toString());

    }


}
