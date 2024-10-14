package TratamentoDeExcecoes;

import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try{

        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu Sobrenome: ");
        String Sobrenome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Ola me chamo " + nome + " " +  " " + Sobrenome + " Tenho " + idade + " de idade e " + altura + "m de altura" );
        sc.close();
     }catch(Exception e ){
        System.out.println("Os campos altura e idade precisam ser numéricos");
    }
    }
    
}
