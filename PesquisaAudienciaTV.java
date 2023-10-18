import java.util.Scanner;

public class PesquisaAudienciaTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoasAssistindo = 0;
        int[] totalPorCanal = new int[13]; 

        while (true) {
            // solicita o numero do canal e o numero de pessoas assistindo
            System.out.print("Digite o número do canal (2, 4, 5, 7, 12) ou 0 para encerrar: ");
            int canal = scanner.nextInt();

            // verifica se o usuário deseja encerrar o programa
            if (canal == 0) {
                break;
            }

            // verifica se o canal inserido é válido
            if (canal >= 2 && canal <= 12) {
                System.out.print("Digite o número de pessoas assistindo: ");
                int pessoasAssistindo = scanner.nextInt();

                // atualiza os totais de audiência para o canal atual
                totalPorCanal[canal] += pessoasAssistindo;
                totalPessoasAssistindo += pessoasAssistindo;
            } else {
                System.out.println("Canal inválido. Por favor, insira um número de canal válido.");
            }
        }

        // calcula e exibe o percentual de audiência para cada canal
        System.out.println("Relatório de Audiência:");
        for (int i = 2; i <= 12; i++) {
            if (totalPorCanal[i] > 0) {
                double percentualAudiencia = ((double) totalPorCanal[i] / totalPessoasAssistindo) * 100;
                System.out.printf("Canal %d: %.2f%% de audiência\n", i, percentualAudiencia);
            }
        }

        scanner.close();
    }
}