import java.util.Scanner;

public class AnaliseNotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados90 = 0;
        int alunosReprovados = 0;
        int totalAlunos = 0;
        double somaNotas = 0;
        double maiorNota = Integer.MIN_VALUE;
        double menorNota = Integer.MAX_VALUE;

        while (true) {
            // solicita a nota final e a quantidade de faltas do aluno
            System.out.print("Digite a nota final (ou um número negativo para sair): ");
            double nota = scanner.nextDouble();

            // verifica se o usuário deseja sair do programa
            if (nota < 0) {
                break;
            }

            System.out.print("Digite o total de faltas: ");
            int faltas = scanner.nextInt();

            // atualiza as estatísticas
            totalAlunos++;
            somaNotas += nota;

            // verifica as condições e atualiza as contagens
            if (nota >= 90) {
                alunosAprovados90++;
            } else if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            // atualiza a maior e menor nota
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        // calcula a média de notas da turma
        double mediaNotas = totalAlunos > 0 ? somaNotas / totalAlunos : 0;

        // exibe os resultados
        System.out.println("Quantidade de alunos com nota >= 90: " + alunosAprovados90);
        System.out.println("Quantidade de alunos reprovados por nota ou falta: " + alunosReprovados);
        System.out.println("Maior nota: " + (maiorNota != Integer.MIN_VALUE ? maiorNota : "N/A"));
        System.out.println("Menor nota: " + (menorNota != Integer.MAX_VALUE ? menorNota : "N/A"));
        System.out.println("Média de notas da turma: " + mediaNotas);

        scanner.close();
    }
}