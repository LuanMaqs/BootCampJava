package set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            }else{
                System.out.println("Palvra não encontrada no conjunto!");
            }
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
      }
    
      public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
          System.out.println(palavrasUnicasSet);
        } else {
          System.out.println("O conjunto está vazio!");
        }
      } 
    
}
