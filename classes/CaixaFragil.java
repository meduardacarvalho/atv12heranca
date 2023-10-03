package classes;


public class CaixaFragil extends Caixa{
    private double pesomax;

    public CaixaFragil(int identificador, String conteudo, double peso, double altura, double pesomax) {
        super(identificador, conteudo, peso, altura); // Chama o construtor da classe base (Caixa)
        setPesomax(pesomax);
    }

    public double getPesomax() {
        return pesomax;
    }

    public void setPesomax(double pesomax) {
       if (pesomax > 0) {
this.pesomax = pesomax;
       } else {
        System.out.println("incorreto. digite um peso maximo valido");
       }
    }
    public void ExibirPesoMax() {
        System.out.println("CaixaFragil [pesomax=" + pesomax + "]");
    }

    
}
