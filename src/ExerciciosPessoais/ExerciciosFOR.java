package ExerciciosPessoais;

import java.util.Scanner;

public class ExerciciosFOR {
    //Imprimir numeros de 1 a 10
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        int soma = 0;
        for(int i = 0; i <= 100; i++){
            soma += i;
        }

        System.out.println(soma);

        for(int x = 1; x <= 20; x++) {
            if(x % 2 == 0) { 
                System.out.println(x);
            }
    }
    Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt(); // Lê o número informado pelo usuário

        // Imprime a tabuada do número
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Calcula o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + resultado); // Exibe a linha da tabuada
        }

        scanner.close();
 }

}