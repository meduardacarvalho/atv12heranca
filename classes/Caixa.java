package classes;

public class Caixa {
    private int identificador;
    private String conteudo;
    private double peso;
    private double altura;
    public Caixa(int identificador, String conteudo, double peso, double altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso > 0){
            this.peso = peso;
        }else {
            System.out.println("peso deve ser numero real maior que 0");
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura > 0){
            this.altura = altura;
        }else {
            System.out.println("altura deve ser numero real maior que 0");
        }
       
    }

  
    public void exibiretiqueta() {
        System.out.println("Caixa [identificador=" + identificador + ", conteudo=" + conteudo + ", peso=" + peso
        + " kg, altura=" + altura + " cm]");
    }
      
}
