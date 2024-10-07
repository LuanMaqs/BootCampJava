package SintaxeBasica;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "Luan";
        String segundoNome = "Marques";
        
        System.out.println(nomeCompleto(nome, segundoNome));
    }
    public static String nomeCompleto(String nome, String segundoNome){
        return "Teste de mesa para verificação de retorno de concat" + ": " + nome.concat(" ").concat(segundoNome);
    }

    
}
