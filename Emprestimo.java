package sc.senac.banco;

public class Emprestimo {
    public static void main(String[] args) {
        // Valores fornecidos diretamente
        double valorEmprestimo = 1000.0; // Exemplo: R$ 1000,00
        int meses = 12; // Exemplo: 12 meses
        double taxaJurosMensal = 0.02; // 2% ao mês

        // Calcula o valor da parcela usando a fórmula do juros composto
        double valorParcela = calcularParcela(valorEmprestimo, taxaJurosMensal, meses);

        System.out.println("O valor da parcela é: R$ " + valorParcela);
    }

    // Método para calcular o valor da parcela
    public static double calcularParcela(double ve, double tx, int t) {
        double vf = ve * Math.pow((1 + tx), t);
        return vf / t; // Retorna o valor da parcela
    }
}
