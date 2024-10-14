package ControleDeFluxo;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Notas do aluno
        double nota1 = 4;
        double nota2 = 4;

        // Calcular a média
        double mediaNotas = (nota1 + nota2) / 2.0;
        System.out.println("A média das notas é: " + mediaNotas);

        // Verificar se a média é menor que 6
        if (mediaNotas < 6) {
            System.out.println("Você está em recuperação.");

            double somaRecuperacao = 0;
            int totalNotasRecuperacao = 2;

            // Loop para solicitar até 2 notas de recuperação
            for (int i = 1; i <= totalNotasRecuperacao; i++) {
                System.out.print("Digite a nota de recuperação " + i + ": ");
                double notaRecuperacao = scanner.nextDouble();
                somaRecuperacao += notaRecuperacao;
            }

            // Calcular a nova média
            double mediaRecuperacao = (mediaNotas + somaRecuperacao) / (2 + totalNotasRecuperacao);
            System.out.println("A nova média, incluindo as notas de recuperação, é: " + mediaRecuperacao);

            // Verificar se foi aprovado ou reprovado
            if (mediaRecuperacao >= 6) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.println("Você foi aprovado!");
        }

        scanner.close();
    }
}
