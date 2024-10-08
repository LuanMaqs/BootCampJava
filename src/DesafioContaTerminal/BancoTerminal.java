package DesafioContaTerminal;

public class BancoTerminal {
    public static void main(String[] agrs){
        double saldo = 25;
        double valorSolicitado = 18;
        
        

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado, agora seu saldo é de: " + saldo);
        }else {
            System.out.println("Saldo insuficiente. Seu saldo atual é de: " + saldo);
        }

        saldo = 15;
        valorSolicitado = 22;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado");
        }else {
            System.out.println("Saldo insuficiente. Seu saldo atual é de: " + saldo);
        }

    }
}
