package classes;

public class Main {
    public static void main(String[] args) {
        
        Caixa caixa1 = new Caixa(90, "Livros", 5.0, 20.0);
        Caixa caixa2 = new Caixa(10, "Garrafas de Plastico", 3.0, 15.0);
        Caixa caixa3 = new CaixaFragil(35, "Vidros", 2.0, 10.0, 2.0);

       
        caixa1.exibiretiqueta();
        caixa2.exibiretiqueta();
        caixa3.exibiretiqueta();

        PilhaDeCaixas pilha = new PilhaDeCaixas(40.0); 
        
        pilha.empilhar(caixa1); 
        pilha.empilhar(caixa2); 
        pilha.empilhar(caixa3); 

        
        Caixa caixa4 = new CaixaFragil(4, "Cristais", 3.0, 8.0, 1.0);
        pilha.empilhar(caixa4); 
        
        System.out.println("Altura atual da pilha: " + pilha.calcularAlturaAtual() + " cm");
        System.out.println("Peso total atual da pilha: " + pilha.calcularPesoAtual() + " kg");
        pilha.exibirDados();

        Caixa caixaDesempilhada = pilha.desempilhar(); 
        System.out.println("Caixa desempilhada: " + caixaDesempilhada.getConteudo());

        
        System.out.println("Altura atual da pilha: " + pilha.calcularAlturaAtual() + " cm");
        System.out.println("Peso total atual da pilha: " + pilha.calcularPesoAtual() + " kg");
        pilha.exibirDados();
    }
}

