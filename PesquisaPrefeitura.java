import java.util.Scanner;

public class PesquisaPrefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        double totalSalarios = 0;
        int totalFilhos = 0;

        while (true) {
            // solicita o salário da pessoa
            System.out.print("Digite o salário (ou um número negativo para encerrar): R$ ");
            double salario = scanner.nextDouble();

            // verifica se a pessoa deseja encerrar o programa
            if (salario < 0) {
                break;
            }

            // solicita o número de filhos da pessoa
            System.out.print("Digite o número de filhos: ");
            int numFilhos = scanner.nextInt();

            // atualiza os totais
            totalPessoas++;
            totalSalarios += salario;
            totalFilhos += numFilhos;
        }

        // calcula a média salarial
        double mediaSalarios = totalSalarios / totalPessoas;

        // calcula a média do número de filhos
        double mediaFilhos = (double) totalFilhos / totalPessoas;

        // exibe os resultados
        System.out.println("Relatório da Pesquisa:");
        System.out.printf("Média Salarial: R$ %.2f\n", mediaSalarios);
        System.out.printf("Média do Número de Filhos: %.2f\n", mediaFilhos);

        scanner.close();
    }
}
