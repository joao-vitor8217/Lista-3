import java.util.Scanner;

public class VerificarStatusAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // solicita a matrícula do aluno
            System.out.print("Digite a matrícula do aluno (ou um número negativo para sair): ");
            int matricula = scanner.nextInt();

            // verifica se o usuário deseja sair do programa
            if (matricula < 0) {
                break;
            }

            // solicita as três notas do aluno
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            // calcula a média das notas
            double media = (nota1 + nota2 + nota3) / 3;

            // verifica o status do aluno e exibe a mensagem correspondente
            if (media >= 70) {
                System.out.println("Aluno aprovado! Média: " + media);
            } else if (media >= 60) {
                System.out.println("Aluno em recuperação. Média: " + media);
            } else {
                System.out.println("Aluno reprovado. Média: " + media);
            }
        }

        scanner.close();
    }
}