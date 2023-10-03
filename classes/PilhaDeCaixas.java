package classes;

import java.util.Stack;

public class PilhaDeCaixas {
    private double alturaMaxima;
    private Stack<Caixa> pilha;

    public PilhaDeCaixas(double alturaMaxima) {
        setAlturaMaxima(alturaMaxima);
        this.pilha = new Stack<>();
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        if (alturaMaxima > 0) {
            this.alturaMaxima = alturaMaxima;
        } else {
            System.err.println("Altura máxima inválida. Digite um valor maior que 0.");
        }
    }

    public boolean empilhar(Caixa caixa) {
        double alturaAtual = calcularAlturaAtual();
        double pesoAtual = calcularPesoAtual();

        if (alturaAtual + caixa.getAltura() <= alturaMaxima && pesoAtual + caixa.getPeso() <= calcularPesoMaximoSuportado()) {
            pilha.push(caixa);
            return true;
        } else {
            System.err.println("Não é possível empilhar a caixa devido à altura ou peso máximo atingido.");
            return false;
        }
    }

    public Caixa desempilhar() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        } else {
            System.err.println("A pilha está vazia. Não há mais caixas para desempilhar.");
            return null;
        }
    }

    public double calcularAlturaAtual() {
        double alturaAtual = 0;
        for (Caixa caixa : pilha) {
            alturaAtual += caixa.getAltura();
        }
        return alturaAtual;
    }

    public double calcularPesoAtual() {
        double pesoAtual = 0;
        for (Caixa caixa : pilha) {
            pesoAtual += caixa.getPeso();
        }
        return pesoAtual;
    }

    public double calcularPesoMaximoSuportado() {
        double pesoMaximoSuportado = Double.MAX_VALUE; 

        for (Caixa caixa : pilha) {
            if (caixa instanceof CaixaFragil) {
                double pesoCaixaFragil = ((CaixaFragil) caixa).getPesomax();
                if (pesoCaixaFragil < pesoMaximoSuportado) {
                    pesoMaximoSuportado = pesoCaixaFragil;
                }
            }
        }

        return pesoMaximoSuportado;
    }

    public void exibirDados() {
        System.out.println("Altura atual da pilha: " + calcularAlturaAtual() + " cm");
        System.out.println("Peso total atual da pilha: " + calcularPesoAtual() + " kg");
        System.out.println("Caixas empilhadas:");
        for (Caixa caixa : pilha) {
            caixa.exibiretiqueta();
        }
    }
}






