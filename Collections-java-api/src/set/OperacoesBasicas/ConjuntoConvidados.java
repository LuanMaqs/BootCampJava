package set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> ConvidadoSet;

    public ConjuntoConvidados() {
        this.ConvidadoSet = new HashSet<>();
    }

    public void adicionarConvidao(String nome, int codigoConvite){
        ConvidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : ConvidadoSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        ConvidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return ConvidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(ConvidadoSet);
    }
}
