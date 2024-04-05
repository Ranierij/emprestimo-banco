package sc.senac.banco;

public class Emprestimo {
    public static void main(String[] args) {
        // Valores fornecidos diretamente (em centavos)
        int valorEmprestimo = 100000; // Exemplo: R$ 1000,00 em centavos
        int meses = 12; // Exemplo: 12 meses
        double taxaJurosMensal = 0.02; // 2% ao mês

        // Calcula o valor da parcela usando a fórmula do juros composto
        int valorParcela = calcularParcela(valorEmprestimo, taxaJurosMensal, meses);

        System.out.println("O valor da parcela é: R$ " + (valorParcela / 100) + "," + (valorParcela % 100));
    }

    // Método para calcular o valor da parcela
    public static int calcularParcela(int ve, double tx, int t) {
        double vf = ve * Math.pow((1 + tx), t);
        return (int)(vf / t); // Retorna o valor da parcela em centavos
    }
}
